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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MetadataConfig configures the sending of series metadata to the remote storage.
 */
@ApiModel(description = "MetadataConfig configures the sending of series metadata to the remote storage.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1PrometheusSpecMetadataConfig {
  public static final String SERIALIZED_NAME_SEND = "send";
  @SerializedName(SERIALIZED_NAME_SEND)
  private Boolean send;

  public static final String SERIALIZED_NAME_SEND_INTERVAL = "sendInterval";
  @SerializedName(SERIALIZED_NAME_SEND_INTERVAL)
  private String sendInterval;


  public ComCoreosMonitoringV1PrometheusSpecMetadataConfig send(Boolean send) {
    
    this.send = send;
    return this;
  }

   /**
   * Whether metric metadata is sent to the remote storage or not.
   * @return send
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether metric metadata is sent to the remote storage or not.")

  public Boolean getSend() {
    return send;
  }


  public void setSend(Boolean send) {
    this.send = send;
  }


  public ComCoreosMonitoringV1PrometheusSpecMetadataConfig sendInterval(String sendInterval) {
    
    this.sendInterval = sendInterval;
    return this;
  }

   /**
   * How frequently metric metadata is sent to the remote storage.
   * @return sendInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How frequently metric metadata is sent to the remote storage.")

  public String getSendInterval() {
    return sendInterval;
  }


  public void setSendInterval(String sendInterval) {
    this.sendInterval = sendInterval;
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
    sb.append("class ComCoreosMonitoringV1PrometheusSpecMetadataConfig {\n");
    sb.append("    send: ").append(toIndentedString(send)).append("\n");
    sb.append("    sendInterval: ").append(toIndentedString(sendInterval)).append("\n");
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
