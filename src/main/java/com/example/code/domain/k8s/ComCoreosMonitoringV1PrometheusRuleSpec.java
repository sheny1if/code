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
import com.example.code.domain.k8s.ComCoreosMonitoringV1PrometheusRuleSpecGroups;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specification of desired alerting rule definitions for Prometheus.
 */
@ApiModel(description = "Specification of desired alerting rule definitions for Prometheus.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1PrometheusRuleSpec {
  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<ComCoreosMonitoringV1PrometheusRuleSpecGroups> groups = null;


  public ComCoreosMonitoringV1PrometheusRuleSpec groups(List<ComCoreosMonitoringV1PrometheusRuleSpecGroups> groups) {
    
    this.groups = groups;
    return this;
  }

  public ComCoreosMonitoringV1PrometheusRuleSpec addGroupsItem(ComCoreosMonitoringV1PrometheusRuleSpecGroups groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<ComCoreosMonitoringV1PrometheusRuleSpecGroups>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Content of Prometheus rule file
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content of Prometheus rule file")

  public List<ComCoreosMonitoringV1PrometheusRuleSpecGroups> getGroups() {
    return groups;
  }


  public void setGroups(List<ComCoreosMonitoringV1PrometheusRuleSpecGroups> groups) {
    this.groups = groups;
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
    sb.append("class ComCoreosMonitoringV1PrometheusRuleSpec {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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
