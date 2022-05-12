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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecProjectedConfigMap;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecProjectedDownwardAPI;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecProjectedSecret;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecProjectedServiceAccountToken;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Projection that may be projected along with other supported volume types
 */
@ApiModel(description = "Projection that may be projected along with other supported volume types")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecProjectedSources {
  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private ComCoreosMonitoringV1ThanosRulerSpecProjectedConfigMap configMap;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private ComCoreosMonitoringV1ThanosRulerSpecProjectedDownwardAPI downwardAPI;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private ComCoreosMonitoringV1ThanosRulerSpecProjectedSecret secret;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN = "serviceAccountToken";
  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT_TOKEN)
  private ComCoreosMonitoringV1ThanosRulerSpecProjectedServiceAccountToken serviceAccountToken;


  public ComCoreosMonitoringV1ThanosRulerSpecProjectedSources configMap(ComCoreosMonitoringV1ThanosRulerSpecProjectedConfigMap configMap) {
    
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecProjectedConfigMap getConfigMap() {
    return configMap;
  }


  public void setConfigMap(ComCoreosMonitoringV1ThanosRulerSpecProjectedConfigMap configMap) {
    this.configMap = configMap;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecProjectedSources downwardAPI(ComCoreosMonitoringV1ThanosRulerSpecProjectedDownwardAPI downwardAPI) {
    
    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecProjectedDownwardAPI getDownwardAPI() {
    return downwardAPI;
  }


  public void setDownwardAPI(ComCoreosMonitoringV1ThanosRulerSpecProjectedDownwardAPI downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecProjectedSources secret(ComCoreosMonitoringV1ThanosRulerSpecProjectedSecret secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecProjectedSecret getSecret() {
    return secret;
  }


  public void setSecret(ComCoreosMonitoringV1ThanosRulerSpecProjectedSecret secret) {
    this.secret = secret;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecProjectedSources serviceAccountToken(ComCoreosMonitoringV1ThanosRulerSpecProjectedServiceAccountToken serviceAccountToken) {
    
    this.serviceAccountToken = serviceAccountToken;
    return this;
  }

   /**
   * Get serviceAccountToken
   * @return serviceAccountToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecProjectedServiceAccountToken getServiceAccountToken() {
    return serviceAccountToken;
  }


  public void setServiceAccountToken(ComCoreosMonitoringV1ThanosRulerSpecProjectedServiceAccountToken serviceAccountToken) {
    this.serviceAccountToken = serviceAccountToken;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecProjectedSources {\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    serviceAccountToken: ").append(toIndentedString(serviceAccountToken)).append("\n");
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
