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
import org.joda.time.DateTime;

/**
 * PersistentVolumeClaimCondition contails details about state of pvc
 */
@ApiModel(description = "PersistentVolumeClaimCondition contails details about state of pvc")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions {
  public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";
  @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
  private DateTime lastProbeTime;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private DateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions lastProbeTime(DateTime lastProbeTime) {
    
    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Last time we probed the condition.
   * @return lastProbeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time we probed the condition.")

  public DateTime getLastProbeTime() {
    return lastProbeTime;
  }


  public void setLastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions lastTransitionTime(DateTime lastTransitionTime) {
    
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")

  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Human-readable message indicating details about last transition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Unique, this should be a short, machine understandable string that gives the reason for condition&#39;s last transition. If it reports \&quot;ResizeStarted\&quot; that means the underlying persistent volume is being resized.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique, this should be a short, machine understandable string that gives the reason for condition's last transition. If it reports \"ResizeStarted\" that means the underlying persistent volume is being resized.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * PersistentVolumeClaimConditionType is a valid value of PersistentVolumeClaimCondition.Type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "PersistentVolumeClaimConditionType is a valid value of PersistentVolumeClaimCondition.Type")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecStorageVolumeClaimTemplateStatusConditions {\n");
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

