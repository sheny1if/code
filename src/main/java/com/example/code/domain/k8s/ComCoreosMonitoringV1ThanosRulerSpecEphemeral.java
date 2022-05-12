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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ThanosRulerSpecStorageEphemeralVolumeClaimTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Ephemeral represents a volume that is handled by a cluster storage driver. The volume&#39;s lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.   Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the connection between this volume type and PersistentVolumeClaim).   Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.   Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.   A pod can use both types of ephemeral volumes and persistent volumes at the same time.
 */
@ApiModel(description = "Ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.   Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity tracking are needed, c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through a PersistentVolumeClaim (see EphemeralVolumeSource for more information on the connection between this volume type and PersistentVolumeClaim).   Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.   Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.   A pod can use both types of ephemeral volumes and persistent volumes at the same time.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ThanosRulerSpecEphemeral {
  public static final String SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE = "volumeClaimTemplate";
  @SerializedName(SERIALIZED_NAME_VOLUME_CLAIM_TEMPLATE)
  private ComCoreosMonitoringV1ThanosRulerSpecStorageEphemeralVolumeClaimTemplate volumeClaimTemplate;


  public ComCoreosMonitoringV1ThanosRulerSpecEphemeral volumeClaimTemplate(ComCoreosMonitoringV1ThanosRulerSpecStorageEphemeralVolumeClaimTemplate volumeClaimTemplate) {
    
    this.volumeClaimTemplate = volumeClaimTemplate;
    return this;
  }

   /**
   * Get volumeClaimTemplate
   * @return volumeClaimTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ThanosRulerSpecStorageEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
    return volumeClaimTemplate;
  }


  public void setVolumeClaimTemplate(ComCoreosMonitoringV1ThanosRulerSpecStorageEphemeralVolumeClaimTemplate volumeClaimTemplate) {
    this.volumeClaimTemplate = volumeClaimTemplate;
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
    sb.append("class ComCoreosMonitoringV1ThanosRulerSpecEphemeral {\n");
    sb.append("    volumeClaimTemplate: ").append(toIndentedString(volumeClaimTemplate)).append("\n");
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

