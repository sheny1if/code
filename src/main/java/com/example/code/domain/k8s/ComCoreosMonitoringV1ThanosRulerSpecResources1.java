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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Resources defines the resource requirements for single Pods. If not provided, no requests/limits will be set
 */
@ApiModel(description = "Resources defines the resource requirements for single Pods. If not provided, no requests/limits will be set")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecResources1 {
  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private Map<String, Object> limits = null;

  public static final String SERIALIZED_NAME_REQUESTS = "requests";
  @SerializedName(SERIALIZED_NAME_REQUESTS)
  private Map<String, Object> requests = null;


  public ComCoreosMonitoringV1ThanosRulerSpecResources1 limits(Map<String, Object> limits) {
    
    this.limits = limits;
    return this;
  }

  public ComCoreosMonitoringV1ThanosRulerSpecResources1 putLimitsItem(String key, Object limitsItem) {
    if (this.limits == null) {
      this.limits = new HashMap<String, Object>();
    }
    this.limits.put(key, limitsItem);
    return this;
  }

   /**
   * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return limits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")

  public Map<String, Object> getLimits() {
    return limits;
  }


  public void setLimits(Map<String, Object> limits) {
    this.limits = limits;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecResources1 requests(Map<String, Object> requests) {
    
    this.requests = requests;
    return this;
  }

  public ComCoreosMonitoringV1ThanosRulerSpecResources1 putRequestsItem(String key, Object requestsItem) {
    if (this.requests == null) {
      this.requests = new HashMap<String, Object>();
    }
    this.requests.put(key, requestsItem);
    return this;
  }

   /**
   * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
   * @return requests
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/")

  public Map<String, Object> getRequests() {
    return requests;
  }


  public void setRequests(Map<String, Object> requests) {
    this.requests = requests;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecResources1 {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
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

