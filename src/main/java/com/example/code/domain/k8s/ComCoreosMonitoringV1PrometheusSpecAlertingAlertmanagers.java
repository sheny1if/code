/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.20.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.example.code.domain.k8s;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecAlertingAuthorization;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AlertmanagerEndpoints defines a selection of a single Endpoints object containing alertmanager IPs to fire alerts against.
 */
@ApiModel(description = "AlertmanagerEndpoints defines a selection of a single Endpoints object containing alertmanager IPs to fire alerts against.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private ComCoreosMonitoringV1PrometheusSpecAlertingAuthorization authorization;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PATH_PREFIX = "pathPrefix";
  @SerializedName(SERIALIZED_NAME_PATH_PREFIX)
  private String pathPrefix;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Object port;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private String timeout;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig tlsConfig;


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Version of the Alertmanager API that Prometheus uses to send alerts. It can be \&quot;v1\&quot; or \&quot;v2\&quot;.
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version of the Alertmanager API that Prometheus uses to send alerts. It can be \"v1\" or \"v2\".")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers authorization(ComCoreosMonitoringV1PrometheusSpecAlertingAuthorization authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecAlertingAuthorization getAuthorization() {
    return authorization;
  }


  public void setAuthorization(ComCoreosMonitoringV1PrometheusSpecAlertingAuthorization authorization) {
    this.authorization = authorization;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers bearerTokenFile(String bearerTokenFile) {
    
    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

   /**
   * BearerTokenFile to read from filesystem to use when authenticating to Alertmanager.
   * @return bearerTokenFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BearerTokenFile to read from filesystem to use when authenticating to Alertmanager.")

  public String getBearerTokenFile() {
    return bearerTokenFile;
  }


  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of Endpoints object in Namespace.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Endpoints object in Namespace.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of Endpoints object.
   * @return namespace
  **/
  @ApiModelProperty(required = true, value = "Namespace of Endpoints object.")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers pathPrefix(String pathPrefix) {
    
    this.pathPrefix = pathPrefix;
    return this;
  }

   /**
   * Prefix for the HTTP path alerts are pushed to.
   * @return pathPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prefix for the HTTP path alerts are pushed to.")

  public String getPathPrefix() {
    return pathPrefix;
  }


  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers port(Object port) {
    
    this.port = port;
    return this;
  }

   /**
   * Port the Alertmanager API is exposed on.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Port the Alertmanager API is exposed on.")

  public Object getPort() {
    return port;
  }


  public void setPort(Object port) {
    this.port = port;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * Scheme to use when firing alerts.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scheme to use when firing alerts.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers timeout(String timeout) {
    
    this.timeout = timeout;
    return this;
  }

   /**
   * Timeout is a per-target Alertmanager timeout when pushing alerts.
   * @return timeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout is a per-target Alertmanager timeout when pushing alerts.")

  public String getTimeout() {
    return timeout;
  }


  public void setTimeout(String timeout) {
    this.timeout = timeout;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers tlsConfig(ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig tlsConfig) {
    this.tlsConfig = tlsConfig;
  }


  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComCoreosMonitoringV1PrometheusSpecAlertingAlertmanagers {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

