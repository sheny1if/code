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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecMetricRelabelings;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecTargetsIngressNamespaceSelector;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecTargetsIngressSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ingress defines the Ingress objects to probe and the relabeling configuration. If &#x60;staticConfig&#x60; is also defined, &#x60;staticConfig&#x60; takes precedence.
 */
@ApiModel(description = "ingress defines the Ingress objects to probe and the relabeling configuration. If `staticConfig` is also defined, `staticConfig` takes precedence.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ProbeSpecTargetsIngress {
  public static final String SERIALIZED_NAME_NAMESPACE_SELECTOR = "namespaceSelector";
  @SerializedName(SERIALIZED_NAME_NAMESPACE_SELECTOR)
  private ComCoreosMonitoringV1ProbeSpecTargetsIngressNamespaceSelector namespaceSelector;

  public static final String SERIALIZED_NAME_RELABELING_CONFIGS = "relabelingConfigs";
  @SerializedName(SERIALIZED_NAME_RELABELING_CONFIGS)
  private List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> relabelingConfigs = null;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private ComCoreosMonitoringV1ProbeSpecTargetsIngressSelector selector;


  public ComCoreosMonitoringV1ProbeSpecTargetsIngress namespaceSelector(ComCoreosMonitoringV1ProbeSpecTargetsIngressNamespaceSelector namespaceSelector) {
    
    this.namespaceSelector = namespaceSelector;
    return this;
  }

   /**
   * Get namespaceSelector
   * @return namespaceSelector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecTargetsIngressNamespaceSelector getNamespaceSelector() {
    return namespaceSelector;
  }


  public void setNamespaceSelector(ComCoreosMonitoringV1ProbeSpecTargetsIngressNamespaceSelector namespaceSelector) {
    this.namespaceSelector = namespaceSelector;
  }


  public ComCoreosMonitoringV1ProbeSpecTargetsIngress relabelingConfigs(List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> relabelingConfigs) {
    
    this.relabelingConfigs = relabelingConfigs;
    return this;
  }

  public ComCoreosMonitoringV1ProbeSpecTargetsIngress addRelabelingConfigsItem(ComCoreosMonitoringV1ProbeSpecMetricRelabelings relabelingConfigsItem) {
    if (this.relabelingConfigs == null) {
      this.relabelingConfigs = new ArrayList<ComCoreosMonitoringV1ProbeSpecMetricRelabelings>();
    }
    this.relabelingConfigs.add(relabelingConfigsItem);
    return this;
  }

   /**
   * RelabelConfigs to apply to the label set of the target before it gets scraped. The original ingress address is available via the &#x60;__tmp_prometheus_ingress_address&#x60; label. It can be used to customize the probed URL. The original scrape job&#39;s name is available via the &#x60;__tmp_prometheus_job_name&#x60; label. More info: https://prometheus.io/docs/prometheus/latest/configuration/configuration/#relabel_config
   * @return relabelingConfigs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RelabelConfigs to apply to the label set of the target before it gets scraped. The original ingress address is available via the `__tmp_prometheus_ingress_address` label. It can be used to customize the probed URL. The original scrape job's name is available via the `__tmp_prometheus_job_name` label. More info: https://prometheus.io/docs/prometheus/latest/configuration/configuration/#relabel_config")

  public List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> getRelabelingConfigs() {
    return relabelingConfigs;
  }


  public void setRelabelingConfigs(List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> relabelingConfigs) {
    this.relabelingConfigs = relabelingConfigs;
  }


  public ComCoreosMonitoringV1ProbeSpecTargetsIngress selector(ComCoreosMonitoringV1ProbeSpecTargetsIngressSelector selector) {
    
    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecTargetsIngressSelector getSelector() {
    return selector;
  }


  public void setSelector(ComCoreosMonitoringV1ProbeSpecTargetsIngressSelector selector) {
    this.selector = selector;
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
    sb.append("class ComCoreosMonitoringV1ProbeSpecTargetsIngress {\n");
    sb.append("    namespaceSelector: ").append(toIndentedString(namespaceSelector)).append("\n");
    sb.append("    relabelingConfigs: ").append(toIndentedString(relabelingConfigs)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
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

