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
 * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.
 */
@ApiModel(description = "Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, requests.cpu and requests.memory) are currently supported.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecDownwardAPIResourceFieldRef {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_DIVISOR = "divisor";
  @SerializedName(SERIALIZED_NAME_DIVISOR)
  private Object divisor;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;


  public ComCoreosMonitoringV1ThanosRulerSpecDownwardAPIResourceFieldRef containerName(String containerName) {
    
    this.containerName = containerName;
    return this;
  }

   /**
   * Container name: required for volumes, optional for env vars
   * @return containerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container name: required for volumes, optional for env vars")

  public String getContainerName() {
    return containerName;
  }


  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecDownwardAPIResourceFieldRef divisor(Object divisor) {
    
    this.divisor = divisor;
    return this;
  }

   /**
   * Specifies the output format of the exposed resources, defaults to \&quot;1\&quot;
   * @return divisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the output format of the exposed resources, defaults to \"1\"")

  public Object getDivisor() {
    return divisor;
  }


  public void setDivisor(Object divisor) {
    this.divisor = divisor;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecDownwardAPIResourceFieldRef resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Required: resource to select
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "Required: resource to select")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecDownwardAPIResourceFieldRef {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

