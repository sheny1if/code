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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecOauth2;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecAuthorization;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecBasicAuth;
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusSpecTlsConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RemoteReadSpec defines the configuration for Prometheus to read back samples from a remote endpoint.
 */
@ApiModel(description = "RemoteReadSpec defines the configuration for Prometheus to read back samples from a remote endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1PrometheusSpecRemoteRead {
  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private ComCoreosMonitoringV1PrometheusSpecAuthorization authorization;

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

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OAUTH2 = "oauth2";
  @SerializedName(SERIALIZED_NAME_OAUTH2)
  private ComCoreosMonitoringV1ProbeSpecOauth2 oauth2;

  public static final String SERIALIZED_NAME_PROXY_URL = "proxyUrl";
  @SerializedName(SERIALIZED_NAME_PROXY_URL)
  private String proxyUrl;

  public static final String SERIALIZED_NAME_READ_RECENT = "readRecent";
  @SerializedName(SERIALIZED_NAME_READ_RECENT)
  private Boolean readRecent;

  public static final String SERIALIZED_NAME_REMOTE_TIMEOUT = "remoteTimeout";
  @SerializedName(SERIALIZED_NAME_REMOTE_TIMEOUT)
  private String remoteTimeout;

  public static final String SERIALIZED_NAME_REQUIRED_MATCHERS = "requiredMatchers";
  @SerializedName(SERIALIZED_NAME_REQUIRED_MATCHERS)
  private Map<String, String> requiredMatchers = null;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private ComCoreosMonitoringV1PrometheusSpecTlsConfig tlsConfig;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead authorization(ComCoreosMonitoringV1PrometheusSpecAuthorization authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecAuthorization getAuthorization() {
    return authorization;
  }


  public void setAuthorization(ComCoreosMonitoringV1PrometheusSpecAuthorization authorization) {
    this.authorization = authorization;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead basicAuth(ComCoreosMonitoringV1PrometheusSpecBasicAuth basicAuth) {
    
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


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead bearerToken(String bearerToken) {
    
    this.bearerToken = bearerToken;
    return this;
  }

   /**
   * Bearer token for remote read.
   * @return bearerToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bearer token for remote read.")

  public String getBearerToken() {
    return bearerToken;
  }


  public void setBearerToken(String bearerToken) {
    this.bearerToken = bearerToken;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead bearerTokenFile(String bearerTokenFile) {
    
    this.bearerTokenFile = bearerTokenFile;
    return this;
  }

   /**
   * File to read bearer token for remote read.
   * @return bearerTokenFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read bearer token for remote read.")

  public String getBearerTokenFile() {
    return bearerTokenFile;
  }


  public void setBearerTokenFile(String bearerTokenFile) {
    this.bearerTokenFile = bearerTokenFile;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead headers(Map<String, String> headers) {
    
    this.headers = headers;
    return this;
  }

  public ComCoreosMonitoringV1PrometheusSpecRemoteRead putHeadersItem(String key, String headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<String, String>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

   /**
   * Custom HTTP headers to be sent along with each remote read request. Be aware that headers that are set by Prometheus itself can&#39;t be overwritten. Only valid in Prometheus versions 2.26.0 and newer.
   * @return headers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom HTTP headers to be sent along with each remote read request. Be aware that headers that are set by Prometheus itself can't be overwritten. Only valid in Prometheus versions 2.26.0 and newer.")

  public Map<String, String> getHeaders() {
    return headers;
  }


  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the remote read queue, it must be unique if specified. The name is used in metrics and logging in order to differentiate read configurations.  Only valid in Prometheus versions 2.15.0 and newer.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the remote read queue, it must be unique if specified. The name is used in metrics and logging in order to differentiate read configurations.  Only valid in Prometheus versions 2.15.0 and newer.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead oauth2(ComCoreosMonitoringV1ProbeSpecOauth2 oauth2) {
    
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


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead proxyUrl(String proxyUrl) {
    
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


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead readRecent(Boolean readRecent) {
    
    this.readRecent = readRecent;
    return this;
  }

   /**
   * Whether reads should be made for queries for time ranges that the local storage should have complete data for.
   * @return readRecent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether reads should be made for queries for time ranges that the local storage should have complete data for.")

  public Boolean getReadRecent() {
    return readRecent;
  }


  public void setReadRecent(Boolean readRecent) {
    this.readRecent = readRecent;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead remoteTimeout(String remoteTimeout) {
    
    this.remoteTimeout = remoteTimeout;
    return this;
  }

   /**
   * Timeout for requests to the remote read endpoint.
   * @return remoteTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout for requests to the remote read endpoint.")

  public String getRemoteTimeout() {
    return remoteTimeout;
  }


  public void setRemoteTimeout(String remoteTimeout) {
    this.remoteTimeout = remoteTimeout;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead requiredMatchers(Map<String, String> requiredMatchers) {
    
    this.requiredMatchers = requiredMatchers;
    return this;
  }

  public ComCoreosMonitoringV1PrometheusSpecRemoteRead putRequiredMatchersItem(String key, String requiredMatchersItem) {
    if (this.requiredMatchers == null) {
      this.requiredMatchers = new HashMap<String, String>();
    }
    this.requiredMatchers.put(key, requiredMatchersItem);
    return this;
  }

   /**
   * An optional list of equality matchers which have to be present in a selector to query the remote read endpoint.
   * @return requiredMatchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional list of equality matchers which have to be present in a selector to query the remote read endpoint.")

  public Map<String, String> getRequiredMatchers() {
    return requiredMatchers;
  }


  public void setRequiredMatchers(Map<String, String> requiredMatchers) {
    this.requiredMatchers = requiredMatchers;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead tlsConfig(ComCoreosMonitoringV1PrometheusSpecTlsConfig tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1PrometheusSpecTlsConfig getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(ComCoreosMonitoringV1PrometheusSpecTlsConfig tlsConfig) {
    this.tlsConfig = tlsConfig;
  }


  public ComCoreosMonitoringV1PrometheusSpecRemoteRead url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the endpoint to query from.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The URL of the endpoint to query from.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
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
    sb.append("class ComCoreosMonitoringV1PrometheusSpecRemoteRead {\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerToken: ").append(toIndentedString(bearerToken)).append("\n");
    sb.append("    bearerTokenFile: ").append(toIndentedString(bearerTokenFile)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
    sb.append("    proxyUrl: ").append(toIndentedString(proxyUrl)).append("\n");
    sb.append("    readRecent: ").append(toIndentedString(readRecent)).append("\n");
    sb.append("    remoteTimeout: ").append(toIndentedString(remoteTimeout)).append("\n");
    sb.append("    requiredMatchers: ").append(toIndentedString(requiredMatchers)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

