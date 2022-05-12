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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecCsiNodePublishSecretRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
 */
@ApiModel(description = "CSI (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecCsi {
  public static final String SERIALIZED_NAME_DRIVER = "driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF = "nodePublishSecretRef";
  @SerializedName(SERIALIZED_NAME_NODE_PUBLISH_SECRET_REF)
  private ComCoreosMonitoringV1ThanosRulerSpecCsiNodePublishSecretRef nodePublishSecretRef;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_VOLUME_ATTRIBUTES = "volumeAttributes";
  @SerializedName(SERIALIZED_NAME_VOLUME_ATTRIBUTES)
  private Map<String, String> volumeAttributes = null;


  public ComCoreosMonitoringV1ThanosRulerSpecCsi driver(String driver) {
    
    this.driver = driver;
    return this;
  }

   /**
   * Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.
   * @return driver
  **/
  @ApiModelProperty(required = true, value = "Driver is the name of the CSI driver that handles this volume. Consult with your admin for the correct name as registered in the cluster.")

  public String getDriver() {
    return driver;
  }


  public void setDriver(String driver) {
    this.driver = driver;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecCsi fsType(String fsType) {
    
    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.
   * @return fsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Filesystem type to mount. Ex. \"ext4\", \"xfs\", \"ntfs\". If not provided, the empty value is passed to the associated CSI driver which will determine the default filesystem to apply.")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecCsi nodePublishSecretRef(ComCoreosMonitoringV1ThanosRulerSpecCsiNodePublishSecretRef nodePublishSecretRef) {
    
    this.nodePublishSecretRef = nodePublishSecretRef;
    return this;
  }

   /**
   * Get nodePublishSecretRef
   * @return nodePublishSecretRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecCsiNodePublishSecretRef getNodePublishSecretRef() {
    return nodePublishSecretRef;
  }


  public void setNodePublishSecretRef(ComCoreosMonitoringV1ThanosRulerSpecCsiNodePublishSecretRef nodePublishSecretRef) {
    this.nodePublishSecretRef = nodePublishSecretRef;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecCsi readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Specifies a read-only configuration for the volume. Defaults to false (read/write).
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies a read-only configuration for the volume. Defaults to false (read/write).")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public ComCoreosMonitoringV1ThanosRulerSpecCsi volumeAttributes(Map<String, String> volumeAttributes) {
    
    this.volumeAttributes = volumeAttributes;
    return this;
  }

  public ComCoreosMonitoringV1ThanosRulerSpecCsi putVolumeAttributesItem(String key, String volumeAttributesItem) {
    if (this.volumeAttributes == null) {
      this.volumeAttributes = new HashMap<String, String>();
    }
    this.volumeAttributes.put(key, volumeAttributesItem);
    return this;
  }

   /**
   * VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver&#39;s documentation for supported values.
   * @return volumeAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VolumeAttributes stores driver-specific properties that are passed to the CSI driver. Consult your driver's documentation for supported values.")

  public Map<String, String> getVolumeAttributes() {
    return volumeAttributes;
  }


  public void setVolumeAttributes(Map<String, String> volumeAttributes) {
    this.volumeAttributes = volumeAttributes;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecCsi {\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    nodePublishSecretRef: ").append(toIndentedString(nodePublishSecretRef)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    volumeAttributes: ").append(toIndentedString(volumeAttributes)).append("\n");
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
