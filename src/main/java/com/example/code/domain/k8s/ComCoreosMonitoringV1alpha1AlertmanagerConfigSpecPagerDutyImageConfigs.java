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
 * PagerDutyImageConfig attaches images to an incident
 */
@ApiModel(description = "PagerDutyImageConfig attaches images to an incident")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPagerDutyImageConfigs {
  public static final String SERIALIZED_NAME_ALT = "alt";
  @SerializedName(SERIALIZED_NAME_ALT)
  private String alt;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_SRC = "src";
  @SerializedName(SERIALIZED_NAME_SRC)
  private String src;


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPagerDutyImageConfigs alt(String alt) {
    
    this.alt = alt;
    return this;
  }

   /**
   * Alt is the optional alternative text for the image.
   * @return alt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alt is the optional alternative text for the image.")

  public String getAlt() {
    return alt;
  }


  public void setAlt(String alt) {
    this.alt = alt;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPagerDutyImageConfigs href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Optional URL; makes the image a clickable link.
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional URL; makes the image a clickable link.")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPagerDutyImageConfigs src(String src) {
    
    this.src = src;
    return this;
  }

   /**
   * Src of the image being attached to the incident
   * @return src
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Src of the image being attached to the incident")

  public String getSrc() {
    return src;
  }


  public void setSrc(String src) {
    this.src = src;
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
    sb.append("class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecPagerDutyImageConfigs {\n");
    sb.append("    alt: ").append(toIndentedString(alt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
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
