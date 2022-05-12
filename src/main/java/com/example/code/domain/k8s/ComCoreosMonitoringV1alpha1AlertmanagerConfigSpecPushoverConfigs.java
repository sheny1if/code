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
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecToken;
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUserKey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PushoverConfig configures notifications via Pushover. See https://prometheus.io/docs/alerting/latest/configuration/#pushover_config
 */
@ApiModel(description = "PushoverConfig configures notifications via Pushover. See https://prometheus.io/docs/alerting/latest/configuration/#pushover_config")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs {
  public static final String SERIALIZED_NAME_EXPIRE = "expire";
  @SerializedName(SERIALIZED_NAME_EXPIRE)
  private String expire;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private Boolean html;

  public static final String SERIALIZED_NAME_HTTP_CONFIG = "httpConfig";
  @SerializedName(SERIALIZED_NAME_HTTP_CONFIG)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig httpConfig;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_RETRY = "retry";
  @SerializedName(SERIALIZED_NAME_RETRY)
  private String retry;

  public static final String SERIALIZED_NAME_SEND_RESOLVED = "sendResolved";
  @SerializedName(SERIALIZED_NAME_SEND_RESOLVED)
  private Boolean sendResolved;

  public static final String SERIALIZED_NAME_SOUND = "sound";
  @SerializedName(SERIALIZED_NAME_SOUND)
  private String sound;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecToken token;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_TITLE = "urlTitle";
  @SerializedName(SERIALIZED_NAME_URL_TITLE)
  private String urlTitle;

  public static final String SERIALIZED_NAME_USER_KEY = "userKey";
  @SerializedName(SERIALIZED_NAME_USER_KEY)
  private ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUserKey userKey;


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs expire(String expire) {
    
    this.expire = expire;
    return this;
  }

   /**
   * How long your notification will continue to be retried for, unless the user acknowledges the notification.
   * @return expire
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How long your notification will continue to be retried for, unless the user acknowledges the notification.")

  public String getExpire() {
    return expire;
  }


  public void setExpire(String expire) {
    this.expire = expire;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs html(Boolean html) {
    
    this.html = html;
    return this;
  }

   /**
   * Whether notification message is HTML or plain text.
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether notification message is HTML or plain text.")

  public Boolean getHtml() {
    return html;
  }


  public void setHtml(Boolean html) {
    this.html = html;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs httpConfig(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecHttpConfig httpConfig) {
    
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


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Notification message.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notification message.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs priority(String priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Priority, see https://pushover.net/api#priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority, see https://pushover.net/api#priority")

  public String getPriority() {
    return priority;
  }


  public void setPriority(String priority) {
    this.priority = priority;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs retry(String retry) {
    
    this.retry = retry;
    return this;
  }

   /**
   * How often the Pushover servers will send the same notification to the user. Must be at least 30 seconds.
   * @return retry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How often the Pushover servers will send the same notification to the user. Must be at least 30 seconds.")

  public String getRetry() {
    return retry;
  }


  public void setRetry(String retry) {
    this.retry = retry;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs sendResolved(Boolean sendResolved) {
    
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


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs sound(String sound) {
    
    this.sound = sound;
    return this;
  }

   /**
   * The name of one of the sounds supported by device clients to override the user&#39;s default sound choice
   * @return sound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of one of the sounds supported by device clients to override the user's default sound choice")

  public String getSound() {
    return sound;
  }


  public void setSound(String sound) {
    this.sound = sound;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Notification title.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notification title.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs token(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecToken token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecToken getToken() {
    return token;
  }


  public void setToken(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecToken token) {
    this.token = token;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * A supplementary URL shown alongside the message.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A supplementary URL shown alongside the message.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs urlTitle(String urlTitle) {
    
    this.urlTitle = urlTitle;
    return this;
  }

   /**
   * A title for supplementary URL, otherwise just the URL is shown
   * @return urlTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A title for supplementary URL, otherwise just the URL is shown")

  public String getUrlTitle() {
    return urlTitle;
  }


  public void setUrlTitle(String urlTitle) {
    this.urlTitle = urlTitle;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs userKey(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUserKey userKey) {
    
    this.userKey = userKey;
    return this;
  }

   /**
   * Get userKey
   * @return userKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUserKey getUserKey() {
    return userKey;
  }


  public void setUserKey(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecUserKey userKey) {
    this.userKey = userKey;
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
    sb.append("class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPushoverConfigs {\n");
    sb.append("    expire: ").append(toIndentedString(expire)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    httpConfig: ").append(toIndentedString(httpConfig)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    sendResolved: ").append(toIndentedString(sendResolved)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlTitle: ").append(toIndentedString(urlTitle)).append("\n");
    sb.append("    userKey: ").append(toIndentedString(userKey)).append("\n");
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

