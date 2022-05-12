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
 * SlackConfirmationField protect users from destructive actions or particularly distinguished decisions by asking them to confirm their button click one more time. See https://api.slack.com/docs/interactive-message-field-guide#confirmation_fields for more information.
 */
@ApiModel(description = "SlackConfirmationField protect users from destructive actions or particularly distinguished decisions by asking them to confirm their button click one more time. See https://api.slack.com/docs/interactive-message-field-guide#confirmation_fields for more information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecConfirm {
  public static final String SERIALIZED_NAME_DISMISS_TEXT = "dismissText";
  @SerializedName(SERIALIZED_NAME_DISMISS_TEXT)
  private String dismissText;

  public static final String SERIALIZED_NAME_OK_TEXT = "okText";
  @SerializedName(SERIALIZED_NAME_OK_TEXT)
  private String okText;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecConfirm dismissText(String dismissText) {
    
    this.dismissText = dismissText;
    return this;
  }

   /**
   * Get dismissText
   * @return dismissText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDismissText() {
    return dismissText;
  }


  public void setDismissText(String dismissText) {
    this.dismissText = dismissText;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecConfirm okText(String okText) {
    
    this.okText = okText;
    return this;
  }

   /**
   * Get okText
   * @return okText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOkText() {
    return okText;
  }


  public void setOkText(String okText) {
    this.okText = okText;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecConfirm text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @ApiModelProperty(required = true, value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecConfirm title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
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
    sb.append("class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecConfirm {\n");
    sb.append("    dismissText: ").append(toIndentedString(dismissText)).append("\n");
    sb.append("    okText: ").append(toIndentedString(okText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

