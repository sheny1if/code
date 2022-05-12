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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermNamespaceSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Required. A pod affinity term, associated with the corresponding weight.
 */
@ApiModel(description = "Required. A pod affinity term, associated with the corresponding weight.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector;

  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermNamespaceSelector namespaceSelector;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces = null;

  public static final String SERIALIZED_NAME_TOPOLOGY_KEY = "topologyKey";
  @SerializedName(SERIALIZED_NAME_TOPOLOGY_KEY)
  private String topologyKey;


  public ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm labelSelector(ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm namespaceSelector(ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermNamespaceSelector namespaceSelector) {
    
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermNamespaceSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTermNamespaceSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm namespaces(List<String> namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

  public ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<String>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \&quot;this pod&#39;s namespace\&quot;
   * @return namespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \"this pod's namespace\"")

  public List<String> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm topologyKey(String topologyKey) {
    
    this.topologyKey = topologyKey;
    return this;
  }

   /**
   * This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.
   * @return topologyKey
  **/
  @ApiModelProperty(required = true, value = "This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed.")

  public String getTopologyKey() {
    return topologyKey;
  }


  public void setTopologyKey(String topologyKey) {
    this.topologyKey = topologyKey;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecAffinityPodAffinityPodAffinityTerm {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    topologyKey: ").append(toIndentedString(topologyKey)).append("\n");
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
