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
 * Specification for the prober to use for probing targets. The prober.URL parameter is required. Targets cannot be probed if left empty.
 */
@ApiModel(description = "Specification for the prober to use for probing targets. The prober.URL parameter is required. Targets cannot be probed if left empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ProbeSpecProber {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PROXY_URL = "proxyUrl";
  @SerializedName(SERIALIZED_NAME_PROXY_URL)
  private String proxyUrl;

  public static final String SERIALIZED_NAME_SCHEME = "scheme";
  @SerializedName(SERIALIZED_NAME_SCHEME)
  private String scheme;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public ComCoreosMonitoringV1ProbeSpecProber path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to collect metrics from. Defaults to &#x60;/probe&#x60;.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to collect metrics from. Defaults to `/probe`.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public ComCoreosMonitoringV1ProbeSpecProber proxyUrl(String proxyUrl) {
    
    this.proxyUrl = proxyUrl;
    return this;
  }

   /**
   * Optional ProxyURL.
   * @return proxyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional ProxyURL.")

  public String getProxyUrl() {
    return proxyUrl;
  }


  public void setProxyUrl(String proxyUrl) {
    this.proxyUrl = proxyUrl;
  }


  public ComCoreosMonitoringV1ProbeSpecProber scheme(String scheme) {
    
    this.scheme = scheme;
    return this;
  }

   /**
   * HTTP scheme to use for scraping. Defaults to &#x60;http&#x60;.
   * @return scheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP scheme to use for scraping. Defaults to `http`.")

  public String getScheme() {
    return scheme;
  }


  public void setScheme(String scheme) {
    this.scheme = scheme;
  }


  public ComCoreosMonitoringV1ProbeSpecProber url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Mandatory URL of the prober.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Mandatory URL of the prober.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
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
    sb.append("class ComCoreosMonitoringV1ProbeSpecProber {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    proxyUrl: ").append(toIndentedString(proxyUrl)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

