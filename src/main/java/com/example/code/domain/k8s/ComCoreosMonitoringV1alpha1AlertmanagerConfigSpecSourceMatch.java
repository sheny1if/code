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
 * Matcher defines how to match on alert&#39;s labels.
 */
@ApiModel(description = "Matcher defines how to match on alert's labels.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-03T04:59:34.868Z[Etc/UTC]")
public class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecSourceMatch {
  /**
   * Match operation available with AlertManager &gt;&#x3D; v0.22.0 and takes precedence over Regex (deprecated) if non-empty.
   */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    NOT_EQUAL("!="),
    
    EQUAL("=");
    
//    _("=~"),
    
//    _("!~");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchTypeEnum fromValue(String value) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MatchTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MATCH_TYPE = "matchType";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private MatchTypeEnum matchType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_REGEX = "regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private Boolean regex;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecSourceMatch matchType(MatchTypeEnum matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Match operation available with AlertManager &gt;&#x3D; v0.22.0 and takes precedence over Regex (deprecated) if non-empty.
   * @return matchType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Match operation available with AlertManager >= v0.22.0 and takes precedence over Regex (deprecated) if non-empty.")

  public MatchTypeEnum getMatchType() {
    return matchType;
  }


  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecSourceMatch name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Label to match.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Label to match.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecSourceMatch regex(Boolean regex) {
    
    this.regex = regex;
    return this;
  }

   /**
   * Whether to match on equality (false) or regular-expression (true). Deprecated as of AlertManager &gt;&#x3D; v0.22.0 where a user should use MatchType instead.
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to match on equality (false) or regular-expression (true). Deprecated as of AlertManager >= v0.22.0 where a user should use MatchType instead.")

  public Boolean getRegex() {
    return regex;
  }


  public void setRegex(Boolean regex) {
    this.regex = regex;
  }


  public ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecSourceMatch value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Label value to match.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label value to match.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
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
    sb.append("class ComCoreosMonitoringV1alpha1AlertmanagerConfigSpecSourceMatch {\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

