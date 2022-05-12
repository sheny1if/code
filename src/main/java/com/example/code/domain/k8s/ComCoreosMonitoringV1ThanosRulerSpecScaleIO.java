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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecScaleIOSecretRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
 */
@ApiModel(description = "ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecScaleIO {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_PROTECTION_DOMAIN = "protectionDomain";
  @SerializedName(SERIALIZED_NAME_PROTECTION_DOMAIN)
  private String protectionDomain;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private ComCoreosMonitoringV1ThanosRulerSpecScaleIOSecretRef secretRef;

  public static final String SERIALIZED_NAME_SSL_ENABLED = "sslEnabled";
  @SerializedName(SERIALIZED_NAME_SSL_ENABLED)
  private Boolean sslEnabled;

  public static final String SERIALIZED_NAME_STORAGE_MODE = "storageMode";
  @SerializedName(SERIALIZED_NAME_STORAGE_MODE)
  private String storageMode;

  public static final String SERIALIZED_NAME_STORAGE_POOL = "storagePool";
  @SerializedName(SERIALIZED_NAME_STORAGE_POOL)
  private String storagePool;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private String system;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Default is \&quot;xfs\&quot;.
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Default is \"xfs\".")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO gateway(String gateway) {
    
    this.gateway = gateway;
    return this;
  }

   /**
   * The host address of the ScaleIO API Gateway.
   * @return gateway
  **/
  @ApiModelProperty(required = true, value = "The host address of the ScaleIO API Gateway.")

  public String getGateway() {
    return gateway;
  }


  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO protectionDomain(String protectionDomain) {
    
    this.protectionDomain = protectionDomain;
    return this;
  }

   /**
   * The name of the ScaleIO Protection Domain for the configured storage.
   * @return protectionDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the ScaleIO Protection Domain for the configured storage.")

  public String getProtectionDomain() {
    return protectionDomain;
  }


  public void setProtectionDomain(String protectionDomain) {
    this.protectionDomain = protectionDomain;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO secretRef(ComCoreosMonitoringV1ThanosRulerSpecScaleIOSecretRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @ApiModelProperty(required = true, value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecScaleIOSecretRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(ComCoreosMonitoringV1ThanosRulerSpecScaleIOSecretRef secretRef) {
    this.secretRef = secretRef;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO sslEnabled(Boolean sslEnabled) {
    
    this.sslEnabled = sslEnabled;
    return this;
  }

   /**
   * Flag to enable/disable SSL communication with Gateway, default false
   * @return sslEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag to enable/disable SSL communication with Gateway, default false")

  public Boolean getSslEnabled() {
    return sslEnabled;
  }


  public void setSslEnabled(Boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO storageMode(String storageMode) {
    
    this.storageMode = storageMode;
    return this;
  }

   /**
   * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
   * @return storageMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.")

  public String getStorageMode() {
    return storageMode;
  }


  public void setStorageMode(String storageMode) {
    this.storageMode = storageMode;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO storagePool(String storagePool) {
    
    this.storagePool = storagePool;
    return this;
  }

   /**
   * The ScaleIO Storage Pool associated with the protection domain.
   * @return storagePool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ScaleIO Storage Pool associated with the protection domain.")

  public String getStoragePool() {
    return storagePool;
  }


  public void setStoragePool(String storagePool) {
    this.storagePool = storagePool;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO system(String system) {
    
    this.system = system;
    return this;
  }

   /**
   * The name of the storage system as configured in ScaleIO.
   * @return system
  **/
  @ApiModelProperty(required = true, value = "The name of the storage system as configured in ScaleIO.")

  public String getSystem() {
    return system;
  }


  public void setSystem(String system) {
    this.system = system;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecScaleIO volumeName(String volumeName) {
    
    this.volumeName = volumeName;
    return this;
  }

   /**
   * The name of a volume already created in the ScaleIO system that is associated with this volume source.
   * @return volumeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a volume already created in the ScaleIO system that is associated with this volume source.")

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecScaleIO {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    protectionDomain: ").append(toIndentedString(protectionDomain)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
    sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
    sb.append("    storageMode: ").append(toIndentedString(storageMode)).append("\n");
    sb.append("    storagePool: ").append(toIndentedString(storagePool)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

