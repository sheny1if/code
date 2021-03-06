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
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecDaysOfMonth;
import com.example.code.domain.k8s.ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimeInterval describes intervals of time
 */
@ApiModel(description = "TimeInterval describes intervals of time")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals {
  public static final String SERIALIZED_NAME_DAYS_OF_MONTH = "daysOfMonth";
  @SerializedName(SERIALIZED_NAME_DAYS_OF_MONTH)
  private List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecDaysOfMonth> daysOfMonth = null;

  public static final String SERIALIZED_NAME_MONTHS = "months";
  @SerializedName(SERIALIZED_NAME_MONTHS)
  private List<String> months = null;

  public static final String SERIALIZED_NAME_TIMES = "times";
  @SerializedName(SERIALIZED_NAME_TIMES)
  private List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimes> times = null;

  public static final String SERIALIZED_NAME_WEEKDAYS = "weekdays";
  @SerializedName(SERIALIZED_NAME_WEEKDAYS)
  private List<String> weekdays = null;

  public static final String SERIALIZED_NAME_YEARS = "years";
  @SerializedName(SERIALIZED_NAME_YEARS)
  private List<String> years = null;


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals daysOfMonth(List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecDaysOfMonth> daysOfMonth) {
    
    this.daysOfMonth = daysOfMonth;
    return this;
  }

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals addDaysOfMonthItem(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecDaysOfMonth daysOfMonthItem) {
    if (this.daysOfMonth == null) {
      this.daysOfMonth = new ArrayList<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecDaysOfMonth>();
    }
    this.daysOfMonth.add(daysOfMonthItem);
    return this;
  }

   /**
   * DaysOfMonth is a list of DayOfMonthRange
   * @return daysOfMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DaysOfMonth is a list of DayOfMonthRange")

  public List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecDaysOfMonth> getDaysOfMonth() {
    return daysOfMonth;
  }


  public void setDaysOfMonth(List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecDaysOfMonth> daysOfMonth) {
    this.daysOfMonth = daysOfMonth;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals months(List<String> months) {
    
    this.months = months;
    return this;
  }

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals addMonthsItem(String monthsItem) {
    if (this.months == null) {
      this.months = new ArrayList<String>();
    }
    this.months.add(monthsItem);
    return this;
  }

   /**
   * Months is a list of MonthRange
   * @return months
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Months is a list of MonthRange")

  public List<String> getMonths() {
    return months;
  }


  public void setMonths(List<String> months) {
    this.months = months;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals times(List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimes> times) {
    
    this.times = times;
    return this;
  }

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals addTimesItem(ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimes timesItem) {
    if (this.times == null) {
      this.times = new ArrayList<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimes>();
    }
    this.times.add(timesItem);
    return this;
  }

   /**
   * Times is a list of TimeRange
   * @return times
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Times is a list of TimeRange")

  public List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimes> getTimes() {
    return times;
  }


  public void setTimes(List<ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimes> times) {
    this.times = times;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals weekdays(List<String> weekdays) {
    
    this.weekdays = weekdays;
    return this;
  }

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals addWeekdaysItem(String weekdaysItem) {
    if (this.weekdays == null) {
      this.weekdays = new ArrayList<String>();
    }
    this.weekdays.add(weekdaysItem);
    return this;
  }

   /**
   * Weekdays is a list of WeekdayRange
   * @return weekdays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Weekdays is a list of WeekdayRange")

  public List<String> getWeekdays() {
    return weekdays;
  }


  public void setWeekdays(List<String> weekdays) {
    this.weekdays = weekdays;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals years(List<String> years) {
    
    this.years = years;
    return this;
  }

  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals addYearsItem(String yearsItem) {
    if (this.years == null) {
      this.years = new ArrayList<String>();
    }
    this.years.add(yearsItem);
    return this;
  }

   /**
   * Years is a list of YearRange
   * @return years
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Years is a list of YearRange")

  public List<String> getYears() {
    return years;
  }


  public void setYears(List<String> years) {
    this.years = years;
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
    sb.append("class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecTimeIntervals {\n");
    sb.append("    daysOfMonth: ").append(toIndentedString(daysOfMonth)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    times: ").append(toIndentedString(times)).append("\n");
    sb.append("    weekdays: ").append(toIndentedString(weekdays)).append("\n");
    sb.append("    years: ").append(toIndentedString(years)).append("\n");
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

