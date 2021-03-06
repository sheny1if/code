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
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecAuthorization;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecBasicAuth;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecBearerTokenSecret;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecMetricRelabelings;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecOauth2;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecProber;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecTargets;
import com.example.code.domain.k8s.ComCoreosMonitoringV1ProbeSpecTlsConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specification of desired Ingress selection for target discovery by Prometheus.
 */
@ApiModel(description = "Specification of desired Ingress selection for target discovery by Prometheus.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1ProbeSpec {
  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private ComCoreosMonitoringV1ProbeSpecAuthorization authorization;

  public static final String SERIALIZED_NAME_BASIC_AUTH = "basicAuth";
  @SerializedName(SERIALIZED_NAME_BASIC_AUTH)
  private ComCoreosMonitoringV1ProbeSpecBasicAuth basicAuth;

  public static final String SERIALIZED_NAME_BEARER_TOKEN_SECRET = "bearerTokenSecret";
  @SerializedName(SERIALIZED_NAME_BEARER_TOKEN_SECRET)
  private ComCoreosMonitoringV1ProbeSpecBearerTokenSecret bearerTokenSecret;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_LABEL_LIMIT = "labelLimit";
  @SerializedName(SERIALIZED_NAME_LABEL_LIMIT)
  private Long labelLimit;

  public static final String SERIALIZED_NAME_LABEL_NAME_LENGTH_LIMIT = "labelNameLengthLimit";
  @SerializedName(SERIALIZED_NAME_LABEL_NAME_LENGTH_LIMIT)
  private Long labelNameLengthLimit;

  public static final String SERIALIZED_NAME_LABEL_VALUE_LENGTH_LIMIT = "labelValueLengthLimit";
  @SerializedName(SERIALIZED_NAME_LABEL_VALUE_LENGTH_LIMIT)
  private Long labelValueLengthLimit;

  public static final String SERIALIZED_NAME_METRIC_RELABELINGS = "metricRelabelings";
  @SerializedName(SERIALIZED_NAME_METRIC_RELABELINGS)
  private List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> metricRelabelings = null;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  private String module;

  public static final String SERIALIZED_NAME_OAUTH2 = "oauth2";
  @SerializedName(SERIALIZED_NAME_OAUTH2)
  private ComCoreosMonitoringV1ProbeSpecOauth2 oauth2;

  public static final String SERIALIZED_NAME_PROBER = "prober";
  @SerializedName(SERIALIZED_NAME_PROBER)
  private ComCoreosMonitoringV1ProbeSpecProber prober;

  public static final String SERIALIZED_NAME_SAMPLE_LIMIT = "sampleLimit";
  @SerializedName(SERIALIZED_NAME_SAMPLE_LIMIT)
  private Long sampleLimit;

  public static final String SERIALIZED_NAME_SCRAPE_TIMEOUT = "scrapeTimeout";
  @SerializedName(SERIALIZED_NAME_SCRAPE_TIMEOUT)
  private String scrapeTimeout;

  public static final String SERIALIZED_NAME_TARGET_LIMIT = "targetLimit";
  @SerializedName(SERIALIZED_NAME_TARGET_LIMIT)
  private Long targetLimit;

  public static final String SERIALIZED_NAME_TARGETS = "targets";
  @SerializedName(SERIALIZED_NAME_TARGETS)
  private ComCoreosMonitoringV1ProbeSpecTargets targets;

  public static final String SERIALIZED_NAME_TLS_CONFIG = "tlsConfig";
  @SerializedName(SERIALIZED_NAME_TLS_CONFIG)
  private ComCoreosMonitoringV1ProbeSpecTlsConfig tlsConfig;


  public ComCoreosMonitoringV1ProbeSpec authorization(ComCoreosMonitoringV1ProbeSpecAuthorization authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecAuthorization getAuthorization() {
    return authorization;
  }


  public void setAuthorization(ComCoreosMonitoringV1ProbeSpecAuthorization authorization) {
    this.authorization = authorization;
  }


  public ComCoreosMonitoringV1ProbeSpec basicAuth(ComCoreosMonitoringV1ProbeSpecBasicAuth basicAuth) {
    
    this.basicAuth = basicAuth;
    return this;
  }

   /**
   * Get basicAuth
   * @return basicAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecBasicAuth getBasicAuth() {
    return basicAuth;
  }


  public void setBasicAuth(ComCoreosMonitoringV1ProbeSpecBasicAuth basicAuth) {
    this.basicAuth = basicAuth;
  }


  public ComCoreosMonitoringV1ProbeSpec bearerTokenSecret(ComCoreosMonitoringV1ProbeSpecBearerTokenSecret bearerTokenSecret) {
    
    this.bearerTokenSecret = bearerTokenSecret;
    return this;
  }

   /**
   * Get bearerTokenSecret
   * @return bearerTokenSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecBearerTokenSecret getBearerTokenSecret() {
    return bearerTokenSecret;
  }


  public void setBearerTokenSecret(ComCoreosMonitoringV1ProbeSpecBearerTokenSecret bearerTokenSecret) {
    this.bearerTokenSecret = bearerTokenSecret;
  }


  public ComCoreosMonitoringV1ProbeSpec interval(String interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Interval at which targets are probed using the configured prober. If not specified Prometheus&#39; global scrape interval is used.
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interval at which targets are probed using the configured prober. If not specified Prometheus' global scrape interval is used.")

  public String getInterval() {
    return interval;
  }


  public void setInterval(String interval) {
    this.interval = interval;
  }


  public ComCoreosMonitoringV1ProbeSpec jobName(String jobName) {
    
    this.jobName = jobName;
    return this;
  }

   /**
   * The job name assigned to scraped metrics by default.
   * @return jobName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job name assigned to scraped metrics by default.")

  public String getJobName() {
    return jobName;
  }


  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public ComCoreosMonitoringV1ProbeSpec labelLimit(Long labelLimit) {
    
    this.labelLimit = labelLimit;
    return this;
  }

   /**
   * Per-scrape limit on number of labels that will be accepted for a sample. Only valid in Prometheus versions 2.27.0 and newer.
   * @return labelLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Per-scrape limit on number of labels that will be accepted for a sample. Only valid in Prometheus versions 2.27.0 and newer.")

  public Long getLabelLimit() {
    return labelLimit;
  }


  public void setLabelLimit(Long labelLimit) {
    this.labelLimit = labelLimit;
  }


  public ComCoreosMonitoringV1ProbeSpec labelNameLengthLimit(Long labelNameLengthLimit) {
    
    this.labelNameLengthLimit = labelNameLengthLimit;
    return this;
  }

   /**
   * Per-scrape limit on length of labels name that will be accepted for a sample. Only valid in Prometheus versions 2.27.0 and newer.
   * @return labelNameLengthLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Per-scrape limit on length of labels name that will be accepted for a sample. Only valid in Prometheus versions 2.27.0 and newer.")

  public Long getLabelNameLengthLimit() {
    return labelNameLengthLimit;
  }


  public void setLabelNameLengthLimit(Long labelNameLengthLimit) {
    this.labelNameLengthLimit = labelNameLengthLimit;
  }


  public ComCoreosMonitoringV1ProbeSpec labelValueLengthLimit(Long labelValueLengthLimit) {
    
    this.labelValueLengthLimit = labelValueLengthLimit;
    return this;
  }

   /**
   * Per-scrape limit on length of labels value that will be accepted for a sample. Only valid in Prometheus versions 2.27.0 and newer.
   * @return labelValueLengthLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Per-scrape limit on length of labels value that will be accepted for a sample. Only valid in Prometheus versions 2.27.0 and newer.")

  public Long getLabelValueLengthLimit() {
    return labelValueLengthLimit;
  }


  public void setLabelValueLengthLimit(Long labelValueLengthLimit) {
    this.labelValueLengthLimit = labelValueLengthLimit;
  }


  public ComCoreosMonitoringV1ProbeSpec metricRelabelings(List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> metricRelabelings) {
    
    this.metricRelabelings = metricRelabelings;
    return this;
  }

  public ComCoreosMonitoringV1ProbeSpec addMetricRelabelingsItem(ComCoreosMonitoringV1ProbeSpecMetricRelabelings metricRelabelingsItem) {
    if (this.metricRelabelings == null) {
      this.metricRelabelings = new ArrayList<ComCoreosMonitoringV1ProbeSpecMetricRelabelings>();
    }
    this.metricRelabelings.add(metricRelabelingsItem);
    return this;
  }

   /**
   * MetricRelabelConfigs to apply to samples before ingestion.
   * @return metricRelabelings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MetricRelabelConfigs to apply to samples before ingestion.")

  public List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> getMetricRelabelings() {
    return metricRelabelings;
  }


  public void setMetricRelabelings(List<ComCoreosMonitoringV1ProbeSpecMetricRelabelings> metricRelabelings) {
    this.metricRelabelings = metricRelabelings;
  }


  public ComCoreosMonitoringV1ProbeSpec module(String module) {
    
    this.module = module;
    return this;
  }

   /**
   * The module to use for probing specifying how to probe the target. Example module configuring in the blackbox exporter: https://github.com/prometheus/blackbox_exporter/blob/master/example.yml
   * @return module
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The module to use for probing specifying how to probe the target. Example module configuring in the blackbox exporter: https://github.com/prometheus/blackbox_exporter/blob/master/example.yml")

  public String getModule() {
    return module;
  }


  public void setModule(String module) {
    this.module = module;
  }


  public ComCoreosMonitoringV1ProbeSpec oauth2(ComCoreosMonitoringV1ProbeSpecOauth2 oauth2) {
    
    this.oauth2 = oauth2;
    return this;
  }

   /**
   * Get oauth2
   * @return oauth2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecOauth2 getOauth2() {
    return oauth2;
  }


  public void setOauth2(ComCoreosMonitoringV1ProbeSpecOauth2 oauth2) {
    this.oauth2 = oauth2;
  }


  public ComCoreosMonitoringV1ProbeSpec prober(ComCoreosMonitoringV1ProbeSpecProber prober) {
    
    this.prober = prober;
    return this;
  }

   /**
   * Get prober
   * @return prober
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecProber getProber() {
    return prober;
  }


  public void setProber(ComCoreosMonitoringV1ProbeSpecProber prober) {
    this.prober = prober;
  }


  public ComCoreosMonitoringV1ProbeSpec sampleLimit(Long sampleLimit) {
    
    this.sampleLimit = sampleLimit;
    return this;
  }

   /**
   * SampleLimit defines per-scrape limit on number of scraped samples that will be accepted.
   * @return sampleLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SampleLimit defines per-scrape limit on number of scraped samples that will be accepted.")

  public Long getSampleLimit() {
    return sampleLimit;
  }


  public void setSampleLimit(Long sampleLimit) {
    this.sampleLimit = sampleLimit;
  }


  public ComCoreosMonitoringV1ProbeSpec scrapeTimeout(String scrapeTimeout) {
    
    this.scrapeTimeout = scrapeTimeout;
    return this;
  }

   /**
   * Timeout for scraping metrics from the Prometheus exporter.
   * @return scrapeTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timeout for scraping metrics from the Prometheus exporter.")

  public String getScrapeTimeout() {
    return scrapeTimeout;
  }


  public void setScrapeTimeout(String scrapeTimeout) {
    this.scrapeTimeout = scrapeTimeout;
  }


  public ComCoreosMonitoringV1ProbeSpec targetLimit(Long targetLimit) {
    
    this.targetLimit = targetLimit;
    return this;
  }

   /**
   * TargetLimit defines a limit on the number of scraped targets that will be accepted.
   * @return targetLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TargetLimit defines a limit on the number of scraped targets that will be accepted.")

  public Long getTargetLimit() {
    return targetLimit;
  }


  public void setTargetLimit(Long targetLimit) {
    this.targetLimit = targetLimit;
  }


  public ComCoreosMonitoringV1ProbeSpec targets(ComCoreosMonitoringV1ProbeSpecTargets targets) {
    
    this.targets = targets;
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecTargets getTargets() {
    return targets;
  }


  public void setTargets(ComCoreosMonitoringV1ProbeSpecTargets targets) {
    this.targets = targets;
  }


  public ComCoreosMonitoringV1ProbeSpec tlsConfig(ComCoreosMonitoringV1ProbeSpecTlsConfig tlsConfig) {
    
    this.tlsConfig = tlsConfig;
    return this;
  }

   /**
   * Get tlsConfig
   * @return tlsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComCoreosMonitoringV1ProbeSpecTlsConfig getTlsConfig() {
    return tlsConfig;
  }


  public void setTlsConfig(ComCoreosMonitoringV1ProbeSpecTlsConfig tlsConfig) {
    this.tlsConfig = tlsConfig;
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
    sb.append("class ComCoreosMonitoringV1ProbeSpec {\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    basicAuth: ").append(toIndentedString(basicAuth)).append("\n");
    sb.append("    bearerTokenSecret: ").append(toIndentedString(bearerTokenSecret)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    labelLimit: ").append(toIndentedString(labelLimit)).append("\n");
    sb.append("    labelNameLengthLimit: ").append(toIndentedString(labelNameLengthLimit)).append("\n");
    sb.append("    labelValueLengthLimit: ").append(toIndentedString(labelValueLengthLimit)).append("\n");
    sb.append("    metricRelabelings: ").append(toIndentedString(metricRelabelings)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    oauth2: ").append(toIndentedString(oauth2)).append("\n");
    sb.append("    prober: ").append(toIndentedString(prober)).append("\n");
    sb.append("    sampleLimit: ").append(toIndentedString(sampleLimit)).append("\n");
    sb.append("    scrapeTimeout: ").append(toIndentedString(scrapeTimeout)).append("\n");
    sb.append("    targetLimit: ").append(toIndentedString(targetLimit)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    tlsConfig: ").append(toIndentedString(tlsConfig)).append("\n");
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

