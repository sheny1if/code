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
 * AutoScalerSpec defines the desired state of AutoScaler
 */
@ApiModel(description = "AutoScalerSpec defines the desired state of AutoScaler")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class DomainGpugroupGpugroupV1AutoScalerSpec {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_AUTO_CREATE_SERVICE = "autoCreateService";
  @SerializedName(SERIALIZED_NAME_AUTO_CREATE_SERVICE)
  private Boolean autoCreateService;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_LABELSSELECTOR = "labelsselector";
  @SerializedName(SERIALIZED_NAME_LABELSSELECTOR)
  private Map<String, String> labelsselector = new HashMap<String, String>();

  public static final String SERIALIZED_NAME_PODS_CREATION_TIME_OUT_SECONDS = "podsCreationTimeOutSeconds";
  @SerializedName(SERIALIZED_NAME_PODS_CREATION_TIME_OUT_SECONDS)
  private Integer podsCreationTimeOutSeconds;

  public static final String SERIALIZED_NAME_REPLICAS = "replicas";
  @SerializedName(SERIALIZED_NAME_REPLICAS)
  private Integer replicas;


  public DomainGpugroupGpugroupV1AutoScalerSpec annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public DomainGpugroupGpugroupV1AutoScalerSpec putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public DomainGpugroupGpugroupV1AutoScalerSpec autoCreateService(Boolean autoCreateService) {
    
    this.autoCreateService = autoCreateService;
    return this;
  }

   /**
   * Get autoCreateService
   * @return autoCreateService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoCreateService() {
    return autoCreateService;
  }


  public void setAutoCreateService(Boolean autoCreateService) {
    this.autoCreateService = autoCreateService;
  }


  public DomainGpugroupGpugroupV1AutoScalerSpec image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public DomainGpugroupGpugroupV1AutoScalerSpec labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public DomainGpugroupGpugroupV1AutoScalerSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public DomainGpugroupGpugroupV1AutoScalerSpec labelsselector(Map<String, String> labelsselector) {
    
    this.labelsselector = labelsselector;
    return this;
  }

  public DomainGpugroupGpugroupV1AutoScalerSpec putLabelsselectorItem(String key, String labelsselectorItem) {
    this.labelsselector.put(key, labelsselectorItem);
    return this;
  }

   /**
   * Get labelsselector
   * @return labelsselector
  **/
  @ApiModelProperty(required = true, value = "")

  public Map<String, String> getLabelsselector() {
    return labelsselector;
  }


  public void setLabelsselector(Map<String, String> labelsselector) {
    this.labelsselector = labelsselector;
  }


  public DomainGpugroupGpugroupV1AutoScalerSpec podsCreationTimeOutSeconds(Integer podsCreationTimeOutSeconds) {
    
    this.podsCreationTimeOutSeconds = podsCreationTimeOutSeconds;
    return this;
  }

   /**
   * Get podsCreationTimeOutSeconds
   * @return podsCreationTimeOutSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPodsCreationTimeOutSeconds() {
    return podsCreationTimeOutSeconds;
  }


  public void setPodsCreationTimeOutSeconds(Integer podsCreationTimeOutSeconds) {
    this.podsCreationTimeOutSeconds = podsCreationTimeOutSeconds;
  }


  public DomainGpugroupGpugroupV1AutoScalerSpec replicas(Integer replicas) {
    
    this.replicas = replicas;
    return this;
  }

   /**
   * Get replicas
   * @return replicas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReplicas() {
    return replicas;
  }


  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
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
    sb.append("class DomainGpugroupGpugroupV1AutoScalerSpec {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    autoCreateService: ").append(toIndentedString(autoCreateService)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    labelsselector: ").append(toIndentedString(labelsselector)).append("\n");
    sb.append("    podsCreationTimeOutSeconds: ").append(toIndentedString(podsCreationTimeOutSeconds)).append("\n");
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
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

