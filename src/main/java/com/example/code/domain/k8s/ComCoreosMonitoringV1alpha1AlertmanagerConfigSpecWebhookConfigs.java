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
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig;
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUrlSecret;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookConfig configures notifications via a generic receiver supporting the webhook payload. See https://prometheus.io/docs/alerting/latest/configuration/#webhook_config
 */
@ApiModel(description = "WebhookConfig configures notifications via a generic receiver supporting the webhook payload. See https://prometheus.io/docs/alerting/latest/configuration/#webhook_config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecWebhookConfigs {
  public static final String SERIALIZED_NAME_HTTP_CONFIG = "httpConfig";
  @SerializedName(SERIALIZED_NAME_HTTP_CONFIG)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig httpConfig;

  public static final String SERIALIZED_NAME_MAX_ALERTS = "maxAlerts";
  @SerializedName(SERIALIZED_NAME_MAX_ALERTS)
  private Integer maxAlerts;

  public static final String SERIALIZED_NAME_SEND_RESOLVED = "sendResolved";
  @SerializedName(SERIALIZED_NAME_SEND_RESOLVED)
  private Boolean sendResolved;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_SECRET = "urlSecret";
  @SerializedName(SERIALIZED_NAME_URL_SECRET)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUrlSecret urlSecret;


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecWebhookConfigs httpConfig(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig httpConfig) {
    
    this.httpConfig = httpConfig;
    return this;
  }

   /**
   * Get httpConfig
   * @return httpConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig getHttpConfig() {
    return httpConfig;
  }


  public void setHttpConfig(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig httpConfig) {
    this.httpConfig = httpConfig;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecWebhookConfigs maxAlerts(Integer maxAlerts) {
    
    this.maxAlerts = maxAlerts;
    return this;
  }

   /**
   * Maximum number of alerts to be sent per webhook message. When 0, all alerts are included.
   * minimum: 0
   * @return maxAlerts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of alerts to be sent per webhook message. When 0, all alerts are included.")

  public Integer getMaxAlerts() {
    return maxAlerts;
  }


  public void setMaxAlerts(Integer maxAlerts) {
    this.maxAlerts = maxAlerts;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecWebhookConfigs sendResolved(Boolean sendResolved) {
    
    this.sendResolved = sendResolved;
    return this;
  }

   /**
   * Whether or not to notify about resolved alerts.
   * @return sendResolved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not to notify about resolved alerts.")

  public Boolean getSendResolved() {
    return sendResolved;
  }


  public void setSendResolved(Boolean sendResolved) {
    this.sendResolved = sendResolved;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecWebhookConfigs url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL to send HTTP POST requests to. &#x60;urlSecret&#x60; takes precedence over &#x60;url&#x60;. One of &#x60;urlSecret&#x60; and &#x60;url&#x60; should be defined.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to send HTTP POST requests to. `urlSecret` takes precedence over `url`. One of `urlSecret` and `url` should be defined.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecWebhookConfigs urlSecret(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUrlSecret urlSecret) {
    
    this.urlSecret = urlSecret;
    return this;
  }

   /**
   * Get urlSecret
   * @return urlSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUrlSecret getUrlSecret() {
    return urlSecret;
  }


  public void setUrlSecret(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUrlSecret urlSecret) {
    this.urlSecret = urlSecret;
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
    sb.append("class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecWebhookConfigs {\n");
    sb.append("    httpConfig: ").append(toIndentedString(httpConfig)).append("\n");
    sb.append("    maxAlerts: ").append(toIndentedString(maxAlerts)).append("\n");
    sb.append("    sendResolved: ").append(toIndentedString(sendResolved)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlSecret: ").append(toIndentedString(urlSecret)).append("\n");
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

