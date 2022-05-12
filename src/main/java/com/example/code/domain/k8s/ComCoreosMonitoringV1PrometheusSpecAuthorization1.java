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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecAuthorizationCredentials;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Authorization section for remote write
 */
@ApiModel(description = "Authorization section for remote write")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1PrometheusSpecAuthorization1 {
  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private ComCoreosMonitoringV1ProbeSpecAuthorizationCredentials credentials;

  public static final String SERIALIZED_NAME_CREDENTIALS_FILE = "credentialsFile";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS_FILE)
  private String credentialsFile;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ComCoreosMonitoringV1PrometheusSpecAuthorization1 credentials(ComCoreosMonitoringV1ProbeSpecAuthorizationCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecAuthorizationCredentials getCredentials() {
    return credentials;
  }


  public void setCredentials(ComCoreosMonitoringV1ProbeSpecAuthorizationCredentials credentials) {
    this.credentials = credentials;
  }


  public ComCoreosMonitoringV1PrometheusSpecAuthorization1 credentialsFile(String credentialsFile) {
    
    this.credentialsFile = credentialsFile;
    return this;
  }

   /**
   * File to read a secret from, mutually exclusive with Credentials (from SafeAuthorization)
   * @return credentialsFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File to read a secret from, mutually exclusive with Credentials (from SafeAuthorization)")

  public String getCredentialsFile() {
    return credentialsFile;
  }


  public void setCredentialsFile(String credentialsFile) {
    this.credentialsFile = credentialsFile;
  }


  public ComCoreosMonitoringV1PrometheusSpecAuthorization1 type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Set the authentication type. Defaults to Bearer, Basic will cause an error
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set the authentication type. Defaults to Bearer, Basic will cause an error")

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
    sb.append("class ComCoreosMonitoringV1PrometheusSpecAuthorization1 {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    credentialsFile: ").append(toIndentedString(credentialsFile)).append("\n");
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

