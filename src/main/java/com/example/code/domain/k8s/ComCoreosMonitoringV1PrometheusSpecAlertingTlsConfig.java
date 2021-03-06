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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecTlsConfigCa;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecTlsConfigCert;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecTlsConfigKeySecret;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TLS Config to use for alertmanager connection.
 */
@ApiModel(description = "TLS Config to use for alertmanager connection.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig {
  public static final String SERIALIZED_NAME_CA = "ca";
  @SerializedName(SERIALIZED_NAME_CA)
  private ComCoreosMonitoringV1ProbeSpecTlsConfigCa ca;

  public static final String SERIALIZED_NAME_CA_FILE = "caFile";
  @SerializedName(SERIALIZED_NAME_CA_FILE)
  private String caFile;

  public static final String SERIALIZED_NAME_CERT = "cert";
  @SerializedName(SERIALIZED_NAME_CERT)
  private ComCoreosMonitoringV1ProbeSpecTlsConfigCert cert;

  public static final String SERIALIZED_NAME_CERT_FILE = "certFile";
  @SerializedName(SERIALIZED_NAME_CERT_FILE)
  private String certFile;

  public static final String SERIALIZED_NAME_INSECURE_SKIP_VERIFY = "insecureSkipVerify";
  @SerializedName(SERIALIZED_NAME_INSECURE_SKIP_VERIFY)
  private Boolean insecureSkipVerify;

  public static final String SERIALIZED_NAME_KEY_FILE = "keyFile";
  @SerializedName(SERIALIZED_NAME_KEY_FILE)
  private String keyFile;

  public static final String SERIALIZED_NAME_KEY_SECRET = "keySecret";
  @SerializedName(SERIALIZED_NAME_KEY_SECRET)
  private ComCoreosMonitoringV1ProbeSpecTlsConfigKeySecret keySecret;

  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig ca(ComCoreosMonitoringV1ProbeSpecTlsConfigCa ca) {
    
    this.ca = ca;
    return this;
  }

   /**
   * Get ca
   * @return ca
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecTlsConfigCa getCa() {
    return ca;
  }


  public void setCa(ComCoreosMonitoringV1ProbeSpecTlsConfigCa ca) {
    this.ca = ca;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig caFile(String caFile) {
    
    this.caFile = caFile;
    return this;
  }

   /**
   * Path to the CA cert in the Prometheus container to use for the targets.
   * @return caFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the CA cert in the Prometheus container to use for the targets.")

  public String getCaFile() {
    return caFile;
  }


  public void setCaFile(String caFile) {
    this.caFile = caFile;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig cert(ComCoreosMonitoringV1ProbeSpecTlsConfigCert cert) {
    
    this.cert = cert;
    return this;
  }

   /**
   * Get cert
   * @return cert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecTlsConfigCert getCert() {
    return cert;
  }


  public void setCert(ComCoreosMonitoringV1ProbeSpecTlsConfigCert cert) {
    this.cert = cert;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig certFile(String certFile) {
    
    this.certFile = certFile;
    return this;
  }

   /**
   * Path to the client cert file in the Prometheus container for the targets.
   * @return certFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the client cert file in the Prometheus container for the targets.")

  public String getCertFile() {
    return certFile;
  }


  public void setCertFile(String certFile) {
    this.certFile = certFile;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig insecureSkipVerify(Boolean insecureSkipVerify) {
    
    this.insecureSkipVerify = insecureSkipVerify;
    return this;
  }

   /**
   * Disable target certificate validation.
   * @return insecureSkipVerify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disable target certificate validation.")

  public Boolean getInsecureSkipVerify() {
    return insecureSkipVerify;
  }


  public void setInsecureSkipVerify(Boolean insecureSkipVerify) {
    this.insecureSkipVerify = insecureSkipVerify;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig keyFile(String keyFile) {
    
    this.keyFile = keyFile;
    return this;
  }

   /**
   * Path to the client key file in the Prometheus container for the targets.
   * @return keyFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the client key file in the Prometheus container for the targets.")

  public String getKeyFile() {
    return keyFile;
  }


  public void setKeyFile(String keyFile) {
    this.keyFile = keyFile;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig keySecret(ComCoreosMonitoringV1ProbeSpecTlsConfigKeySecret keySecret) {
    
    this.keySecret = keySecret;
    return this;
  }

   /**
   * Get keySecret
   * @return keySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecTlsConfigKeySecret getKeySecret() {
    return keySecret;
  }


  public void setKeySecret(ComCoreosMonitoringV1ProbeSpecTlsConfigKeySecret keySecret) {
    this.keySecret = keySecret;
  }


  public ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Used to verify the hostname for the targets.
   * @return serverName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used to verify the hostname for the targets.")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
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
    sb.append("class ComCoreosMonitoringV1PrometheusSpecAlertingTlsConfig {\n");
    sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
    sb.append("    caFile: ").append(toIndentedString(caFile)).append("\n");
    sb.append("    cert: ").append(toIndentedString(cert)).append("\n");
    sb.append("    certFile: ").append(toIndentedString(certFile)).append("\n");
    sb.append("    insecureSkipVerify: ").append(toIndentedString(insecureSkipVerify)).append("\n");
    sb.append("    keyFile: ").append(toIndentedString(keyFile)).append("\n");
    sb.append("    keySecret: ").append(toIndentedString(keySecret)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
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

