package com.example.code.utils;


import com.example.code.common.AppException;
import com.example.code.domain.k8s.DomainGpugroupGpugroupV1AutoScalerSpec;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.apis.ExtensionsV1beta1Api;
import io.kubernetes.client.openapi.apis.NetworkingV1Api;
import io.kubernetes.client.openapi.auth.ApiKeyAuth;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;
import io.kubernetes.client.util.Yaml;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

@Slf4j
@Component
public class K8sHandleTools {

    @Value("${k8s.token}")
    private String k8sToken;

    /*
     * 加载yaml配置文件
     *
     * @param path
     * @throws IOException
     */
    public static Object loadYaml(String path) throws IOException {
        Reader reader = new FileReader(path);
        return Yaml.load(reader);
    }

    public ApiClient getApiClient(String k8sConfig) {
        try {
            String kubeConfigPath = ResourceUtils.getURL(k8sConfig).getPath();
            ApiClient client =
                    ClientBuilder.kubeconfig(KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath))).build();
//            Configuration.setDefaultApiClient(client);
//            ApiClient defaultClient = Configuration.getDefaultApiClient();
//            ApiKeyAuth BearerToken = (ApiKeyAuth) defaultClient.getAuthentication("BearerToken");
            ApiKeyAuth BearerToken = (ApiKeyAuth) client.getAuthentications().get("BearerToken");
            BearerToken.setApiKey(k8sToken);

            return client;
        } catch (IOException e) {
            log.error("读取kubeConfigPath异常", e);
            throw new AppException("500", "读取kubeConfigPath异常");
        } catch (Exception e) {
            log.error("构建K8s-Client异常", e);
            throw new AppException("500", "构建K8s-Client异常");
        }
    }

    public V1Pod deletePod(ApiClient apiClient, String namespace, String podName) {
        // new a CoreV1Api
        CoreV1Api api = new CoreV1Api(apiClient);


        // invokes the CoreV1Api client
        try {
            return api.deleteNamespacedPod(podName, namespace, null, null, null, null, null, null);
        } catch (ApiException e) {
            log.error("deletePod 异常:" + e.getResponseBody(), e);
            throw new AppException("500", e.getMessage());
        }

    }


    public V1PodList getNamesapcePod(ApiClient apiClient, String namespace) {
        // new a CoreV1Api
        CoreV1Api api = new CoreV1Api(apiClient);

        // invokes the CoreV1Api client
        try {
            return api.listNamespacedPod(namespace, null, null, null, null, null, null, null, null, null, null);
        } catch (ApiException e) {
            log.error("获取 NamesapcePod 异常:" + e.getResponseBody(), e);
            throw new AppException("500", e.getMessage());
        }

    }

    /**
     * 获取所有的Pod
     *
     * @return podList
     */
    public V1PodList getAllPodList(ApiClient apiClient) {
        // new a CoreV1Api
        CoreV1Api api = new CoreV1Api(apiClient);

        // invokes the CoreV1Api client
        try {
            return api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null, null);
        } catch (ApiException e) {
            log.error("获取podlist异常:" + e.getResponseBody(), e);
            throw new AppException("500", e.getMessage());
        }

    }

    /**
     * 创建k8s service
     *
     * @param namespace   命名空间
     * @param serviceName 服务名称
     * @param port        服务端口号（和目标pod的端口号一致）
     * @param selector    pod标签选择器
     * @return 创建成功的service对象
     */
    public V1Service createService(ApiClient apiClient, String namespace, String serviceName, Integer port, Map<String, String> selector) {
        //构建service的yaml对象
        V1Service svc = new V1ServiceBuilder()
                .withNewMetadata()
                .withName(serviceName)
                .endMetadata()
                .withNewSpec()
                .addNewPort()
                .withProtocol("TCP")
                .withPort(port)
                .withTargetPort(new IntOrString(port))
                .endPort()
                .withSelector(selector)
                .endSpec()
                .build();

        // Deployment and StatefulSet is defined in apps/v1, so you should use AppsV1Api instead of CoreV1API
        CoreV1Api api = new CoreV1Api(apiClient);
        V1Service v1Service = null;
        try {
            v1Service = api.createNamespacedService(namespace, svc, null, null, null);
        } catch (ApiException e) {
            log.error("创建service异常:" + e.getResponseBody(), e);
            throw new AppException("500", e.getMessage());
        } catch (Exception e) {
            log.error("创建service系统异常:", e);
            throw new AppException("500", e.getMessage());
        }
        return v1Service;
    }

    /**
     * 创建k8s V1Ingress
     *
     * @param namespace   命名空间
     * @param ingressName ingress名称
     * @param annotations ingress注解
     * @param path        匹配的路径
     * @param serviceName 路由到的服务名称
     * @param servicePort 路由到的服务端口
     * @return 创建成功的ingress对象
     */
    public V1Ingress createV1Ingress(ApiClient apiClient, String namespace, String ingressName, Map<String, String> annotations, String path,
                                     String serviceName, Integer servicePort) {
        //构建ingress的yaml对象
        V1Ingress ingress = new V1IngressBuilder()
                .withNewMetadata()
                .withName(ingressName)
                .withAnnotations(annotations)
                .endMetadata()
                .withNewSpec()
                .addNewRule()
                .withHttp(new V1HTTPIngressRuleValueBuilder().addToPaths(new V1HTTPIngressPathBuilder()
                        .withPath(path)
                        .withPathType("Prefix")
                        .withBackend(new V1IngressBackendBuilder()
                                .withService(new V1IngressServiceBackendBuilder()
                                        .withName(serviceName)
                                        .withPort(new V1ServiceBackendPortBuilder()
                                                .withNumber(servicePort).build()).build()).build()).build()).build())
                .endRule()
                .endSpec()
                .build();

        //调用对应的API执行创建ingress的操作
        NetworkingV1Api api = new NetworkingV1Api(apiClient);
        V1Ingress v1Ingress = null;
        try {
            v1Ingress = api.createNamespacedIngress(namespace, ingress, null, null, null);
        } catch (ApiException e) {
            log.error("创建ingress异常:" + e.getResponseBody(), e);
            throw new AppException("500", e.getMessage());
        } catch (Exception e) {
            log.error("创建ingress系统异常:", e);
            throw new AppException("500", e.getMessage());
        }
        return v1Ingress;
    }


    /**
     * 创建k8s ExtensionIngress
     *
     * @param namespace   命名空间
     * @param ingressName ingress名称
     * @param annotations ingress注解
     * @param path        匹配的路径
     * @param serviceName 路由到的服务名称
     * @param servicePort 路由到的服务端口
     * @return 创建成功的ingress对象
     */
    public ExtensionsV1beta1Ingress createExtensionIngress(ApiClient apiClient, String namespace, String ingressName, Map<String, String> annotations, String path,
                                                           String serviceName, Integer servicePort) {
        //构建ingress的yaml对象
        ExtensionsV1beta1Ingress ingress = new ExtensionsV1beta1IngressBuilder()
                .withNewMetadata()
                .withName(ingressName)
                .withAnnotations(annotations)
                .endMetadata()
                .withNewSpec()
                .addNewRule()
                .withHttp(new ExtensionsV1beta1HTTPIngressRuleValueBuilder().addToPaths(new ExtensionsV1beta1HTTPIngressPathBuilder()
                        .withPath(path)
                        .withBackend(new ExtensionsV1beta1IngressBackendBuilder()
                                .withServiceName(serviceName)
                                .withServicePort(new IntOrString(servicePort)).build()).build()).build())
                .endRule()
                .endSpec()
                .build();

        //调用对应的API执行创建ingress的操作
        ExtensionsV1beta1Api api = new ExtensionsV1beta1Api(apiClient);
        ExtensionsV1beta1Ingress extensionsV1beta1Ingress = null;
        try {
            extensionsV1beta1Ingress = api.createNamespacedIngress(namespace, ingress, null, null, null);
        } catch (ApiException e) {
            log.error("创建ingress异常:" + e.getResponseBody(), e);
            throw new AppException("500", e.getMessage());
        } catch (Exception e) {
            log.error("创建ingress系统异常:", e);
            throw new AppException("500", e.getMessage());
        }
        return extensionsV1beta1Ingress;
    }
}
