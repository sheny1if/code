package com.example.code.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.code.utils.K8sHandleTools;
import com.example.code.utils.ResultUtil;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yifshen
 * @description testController
 * @since 2022/5/1 18:32
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class testController {
    @Autowired
    private Environment env;
    @Autowired
    private K8sHandleTools k8sHandleTools;


    @RequestMapping("/testProfile")
    public String hello(){
        return env.getProperty("logDir");
    }


    @RequestMapping("/k8s")
    public JSONObject connectK8s(String namespace, String podName){

        V1PodList v1PodList =  k8sHandleTools.getNamesapcePod(k8sHandleTools.getApiClient(env.getProperty("k8s.config")),"default");
        for(V1Pod v1Pod: v1PodList.getItems()){
            log.info(v1Pod.toString());
        }
        return ResultUtil.success("connect k8s success"+env.getProperty("k8s.config"));
    }


}
