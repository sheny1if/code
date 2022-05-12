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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecMetricRelabelings;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecOauth2;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecAuthorization1;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecBasicAuth;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecMetadataConfig;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecQueueConfig;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecSigv4;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecTlsConfig1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RemoteWriteSpec defines the configuration to write samples from Prometheus to a remote endpoint.
 */
@ApiModel(description = "RemoteWriteSpec defines the configuration to write samples from Prometheus to a remote endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1PrometheusSpecRemoteWrite {
  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private ComCoreosMonitoringV1PrometheusSpecAuthorization1 authorization;

  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private ComCoreosMonitoringV1PrometheusSpecBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN = "bearerToken";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN)
  private String bearerToken;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_FILE = "bearerTokenFile";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_FILE)
  private String bearerTokenFile;

  public static final String SERIALIZED_NAME_HEADERS = "headers";
  @SerializedName(SERIALIZED_NAME_HEADERS)
  private Map<String, String> headers = null;

  public static final String SERIALIZED_NAME_METADATA_CONFIG = "metadataConfig";
  @SerializedName(SERIALIZED_NAME_METADATA_CONFIG)
  private ComCoreosMonitoringV1PrometheusSpecMetadataConfig metadataConfig;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OAUTH2 = "oauth2";
  @SerializedName(SERIALIZED_NAME_OAUTH2)
  private ComCoreosMonitoringV1ProbeSpecOauth2 oauth2;

  public static final String SERIALIZED_NAME_PROXY_URL = "proxyUrl";
  @SerializedName(SERIALIZED_NAME_PROXY_URL)
  private String proxyUrl;

  public static final String SERIALIZED_NAME_QUEUE_CONFIG = "queueConfig";
  @SerializedName(SERIALIZED_NAME_QUEUE_CONFIG)
  private ComCoreosMonitoringV1PrometheusSpecQueueConfig queueConfig;

  public static final String SERIALIZED_NAME_REMOTE_TIMEOUT = "remoteTimeout";
  @SerializedName(SERIALIZED_NAME_REMOTE_TIMEOUT)
  private String remoteTimeout;

  public static final String SERIALIZED_NAME_SEND_EXEMPLARS = "sendExemplars";
  @SerializedName(SERIALIZED_NAME_SEND_EXEMPLARS)
  private Boolean sendExemplars;

  public static final String SERIALIZED_NAME_SIGV4 = "sigv4";
  @SerializedName(SERIALIZED_NAME_SIGV4)
  private ComCoreosMonitoringV1PrometheusSpecSigv4 sigv4;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private ComCoreosMonitoringV1PrometheusSpecTlsConfig1 tlsConfig;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WRITE_RELABEL_CONFIGS = "writeRelabelConfigs";
  @SerializedName(SERIALIZED_NAME_WRITE_RELABEL_CONFIGS)
  private List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> writeRelabelConfigs = null;


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite authorization(ComCoreosMonitoringV1PrometheusSpecAuthorization1 authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecAuthorization1 getAuthorization() {
    return authorization;
  }


  public void setAuthorization(ComCoreosMonitoringV1PrometheusSpecAuthorization1 authorization) {
    this.authorization = authorization;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite basicAuth(ComCoreosMonitoringV1PrometheusSpecBasicAuth basicAuth) {
    
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecBasicAuth getBasicAuth() {
    return basicAuth;
  }


  public void setBasicAuth(ComCoreosMonitoringV1PrometheusSpecBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite bearerToken(String bearerToken) {
    
    this.bearerToken = bearerToken;
    return this;
  }

   /**
   * Bearer token for remote write.
   * @return bearerToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bearer token for remote write.")

  public String getBearerToken() {
    return bearerToken;
  }


  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite bearerTokenFile(String bearerTokenFile) {
    
    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

   /**
   * File to read bearer token for remote write.
   * @return bearerTokenFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read bearer token for remote write.")

  public String getBearerTokenFile() {
    return bearerTokenFile;
  }


  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Custom HTTP headers to be sent along with each remote write request. Be aware that headers that are set by Prometheus itself can&#39;t be overwritten. Only valid in Prometheus versions 2.25.0 and newer.
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom HTTP headers to be sent along with each remote write request. Be aware that headers that are set by Prometheus itself can't be overwritten. Only valid in Prometheus versions 2.25.0 and newer.")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite metadataConfig(ComCoreosMonitoringV1PrometheusSpecMetadataConfig metadataConfig) {
    
    this.metadataConfig = metadataConfig;
    return this;
  }

   /**
   * Get metadataConfig
   * @return metadataConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecMetadataConfig getMetadataConfig() {
    return metadataConfig;
  }


  public void setMetadataConfig(ComCoreosMonitoringV1PrometheusSpecMetadataConfig metadataConfig) {
    this.metadataConfig = metadataConfig;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the remote write queue, it must be unique if specified. The name is used in metrics and logging in order to differentiate queues. Only valid in Prometheus versions 2.15.0 and newer.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the remote write queue, it must be unique if specified. The name is used in metrics and logging in order to differentiate queues. Only valid in Prometheus versions 2.15.0 and newer.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite oauth2(ComCoreosMonitoringV1ProbeSpecOauth2 oauth2) {
    
    this.oauth2 = oauth2;
    return this;
  }

   /**
   * Get oauth2
   * @return oauth2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecOauth2 getOauth2() {
    return oauth2;
  }


  public void setOauth2(ComCoreosMonitoringV1ProbeSpecOauth2 oauth2) {
    this.oauth2 = oauth2;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite proxyUrl(String proxyUrl) {
    
    this.proxyUrl = proxyUrl;
    return this;
  }

   /**
   * Optional ProxyURL.
   * @return proxyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional ProxyURL.")

  public String getProxyUrl() {
    return proxyUrl;
  }


  public void setProxyUrl(String proxyUrl) {
    this.proxyUrl = proxyUrl;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite queueConfig(ComCoreosMonitoringV1PrometheusSpecQueueConfig queueConfig) {
    
    this.queueConfig = queueConfig;
    return this;
  }

   /**
   * Get queueConfig
   * @return queueConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecQueueConfig getQueueConfig() {
    return queueConfig;
  }


  public void setQueueConfig(ComCoreosMonitoringV1PrometheusSpecQueueConfig queueConfig) {
    this.queueConfig = queueConfig;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite remoteTimeout(String remoteTimeout) {
    
    this.remoteTimeout = remoteTimeout;
    return this;
  }

   /**
   * Timeout for requests to the remote write endpoint.
   * @return remoteTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout for requests to the remote write endpoint.")

  public String getRemoteTimeout() {
    return remoteTimeout;
  }


  public void setRemoteTimeout(String remoteTimeout) {
    this.remoteTimeout = remoteTimeout;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite sendExemplars(Boolean sendExemplars) {
    
    this.sendExemplars = sendExemplars;
    return this;
  }

   /**
   * Enables sending of exemplars over remote write. Note that exemplar-storage itself must be enabled using the enableFeature option for exemplars to be scraped in the first place.  Only valid in Prometheus versions 2.27.0 and newer.
   * @return sendExemplars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Enables sending of exemplars over remote write. Note that exemplar-storage itself must be enabled using the enableFeature option for exemplars to be scraped in the first place.  Only valid in Prometheus versions 2.27.0 and newer.")

  public Boolean getSendExemplars() {
    return sendExemplars;
  }


  public void setSendExemplars(Boolean sendExemplars) {
    this.sendExemplars = sendExemplars;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite sigv4(ComCoreosMonitoringV1PrometheusSpecSigv4 sigv4) {
    
    this.sigv4 = sigv4;
    return this;
  }

   /**
   * Get sigv4
   * @return sigv4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecSigv4 getSigv4() {
    return sigv4;
  }


  public void setSigv4(ComCoreosMonitoringV1PrometheusSpecSigv4 sigv4) {
    this.sigv4 = sigv4;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite tlsConfig(ComCoreosMonitoringV1PrometheusSpecTlsConfig1 tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecTlsConfig1 getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(ComCoreosMonitoringV1PrometheusSpecTlsConfig1 tlsConfig) {
    this.tlsConfig = tlsConfig;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the endpoint to send samples to.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL of the endpoint to send samples to.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite writeRelabelConfigs(List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> writeRelabelConfigs) {
    
    this.writeRelabelConfigs = writeRelabelConfigs;
    return this;
  }

  public ComCoreosMonitoringV1PrometheusSpecRemoteWrite addWriteRelabelConfigsItem(ComCoreosMonitoringV1ProbeSpecMetricRelabelings writeRelabelConfigsItem) {
    if (this.writeRelabelConfigs == null) {
      this.writeRelabelConfigs = new ArrayList<ComCoreosMonitoringV1ProbeSpecMetricRelabelings>();
    }
    this.writeRelabelConfigs.add(writeRelabelConfigsItem);
    return this;
  }

   /**
   * The list of remote write relabel configurations.
   * @return writeRelabelConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of remote write relabel configurations.")

  public List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> getWriteRelabelConfigs() {
    return writeRelabelConfigs;
  }


  public void setWriteRelabelConfigs(List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> writeRelabelConfigs) {
    this.writeRelabelConfigs = writeRelabelConfigs;
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
    sb.append("class ComCoreosMonitoringV1PrometheusSpecRemoteWrite {\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    metadataConfig: ").append(toIndentedString(metadataConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
    sb.append("    proxyUrl: ").append(toIndentedString(proxyUrl)).append("\n");
    sb.append("    queueConfig: ").append(toIndentedString(queueConfig)).append("\n");
    sb.append("    remoteTimeout: ").append(toIndentedString(remoteTimeout)).append("\n");
    sb.append("    sendExemplars: ").append(toIndentedString(sendExemplars)).append("\n");
    sb.append("    sigv4: ").append(toIndentedString(sigv4)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    writeRelabelConfigs: ").append(toIndentedString(writeRelabelConfigs)).append("\n");
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
