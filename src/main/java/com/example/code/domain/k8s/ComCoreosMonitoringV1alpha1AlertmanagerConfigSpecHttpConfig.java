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
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigAuthorization;
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBasicAuth;
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBearerTokenSecret;
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigOauth2;
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigTlsConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HTTP client configuration.
 */
@ApiModel(description = "HTTP client configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig {
  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigAuthorization authorization;

  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_SECRET = "bearerTokenSecret";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_SECRET)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBearerTokenSecret bearerTokenSecret;

  public static final String SERIALIZED_NAME_FOLLOW_REDIRECTS = "followRedirects";
  @SerializedName(SERIALIZED_NAME_FOLLOW_REDIRECTS)
  private Boolean followRedirects;

  public static final String SERIALIZED_NAME_OAUTH2 = "oauth2";
  @SerializedName(SERIALIZED_NAME_OAUTH2)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigOauth2 oauth2;

  public static final String SERIALIZED_NAME_PROXY_U_R_L = "proxyURL";
  @SerializedName(SERIALIZED_NAME_PROXY_U_R_L)
  private String proxyURL;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigTlsConfig tlsConfig;


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig authorization(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigAuthorization authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigAuthorization getAuthorization() {
    return authorization;
  }


  public void setAuthorization(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigAuthorization authorization) {
    this.authorization = authorization;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig basicAuth(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBasicAuth basicAuth) {
    
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBasicAuth getBasicAuth() {
    return basicAuth;
  }


  public void setBasicAuth(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig bearerTokenSecret(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBearerTokenSecret bearerTokenSecret) {
    
    this.bearerTokenSecret = bearerTokenSecret;
    return this;
  }

   /**
   * Get bearerTokenSecret
   * @return bearerTokenSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBearerTokenSecret getBearerTokenSecret() {
    return bearerTokenSecret;
  }


  public void setBearerTokenSecret(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigBearerTokenSecret bearerTokenSecret) {
    this.bearerTokenSecret = bearerTokenSecret;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig followRedirects(Boolean followRedirects) {
    
    this.followRedirects = followRedirects;
    return this;
  }

   /**
   * FollowRedirects specifies whether the client should follow HTTP 3xx redirects.
   * @return followRedirects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FollowRedirects specifies whether the client should follow HTTP 3xx redirects.")

  public Boolean getFollowRedirects() {
    return followRedirects;
  }


  public void setFollowRedirects(Boolean followRedirects) {
    this.followRedirects = followRedirects;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig oauth2(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigOauth2 oauth2) {
    
    this.oauth2 = oauth2;
    return this;
  }

   /**
   * Get oauth2
   * @return oauth2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigOauth2 getOauth2() {
    return oauth2;
  }


  public void setOauth2(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigOauth2 oauth2) {
    this.oauth2 = oauth2;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig proxyURL(String proxyURL) {
    
    this.proxyURL = proxyURL;
    return this;
  }

   /**
   * Optional proxy URL.
   * @return proxyURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional proxy URL.")

  public String getProxyURL() {
    return proxyURL;
  }


  public void setProxyURL(String proxyURL) {
    this.proxyURL = proxyURL;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig tlsConfig(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigTlsConfig tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigTlsConfig getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfigTlsConfig tlsConfig) {
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
    sb.append("class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig {\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerTokenSecret: ").append(toIndentedString(bearerTokenSecret)).append("\n");
    sb.append("    followRedirects: ").append(toIndentedString(followRedirects)).append("\n");
    sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
    sb.append("    proxyURL: ").append(toIndentedString(proxyURL)).append("\n");
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

