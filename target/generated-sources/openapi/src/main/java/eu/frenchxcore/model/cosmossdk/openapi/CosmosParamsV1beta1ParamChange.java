/*
 * Cosmos SDK - gRPC Gateway docs
 * A REST interface for state queries
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.frenchxcore.model.cosmossdk.openapi;

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
 * ParamChange defines an individual parameter change, for use in ParameterChangeProposal.
 */
@ApiModel(description = "ParamChange defines an individual parameter change, for use in ParameterChangeProposal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class CosmosParamsV1beta1ParamChange {
  public static final String SERIALIZED_NAME_SUBSPACE = "subspace";
  @SerializedName(SERIALIZED_NAME_SUBSPACE)
  private String subspace;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public CosmosParamsV1beta1ParamChange subspace(String subspace) {
    
    this.subspace = subspace;
    return this;
  }

   /**
   * Get subspace
   * @return subspace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubspace() {
    return subspace;
  }


  public void setSubspace(String subspace) {
    this.subspace = subspace;
  }


  public CosmosParamsV1beta1ParamChange key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public CosmosParamsV1beta1ParamChange value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosParamsV1beta1ParamChange cosmosParamsV1beta1ParamChange = (CosmosParamsV1beta1ParamChange) o;
    return Objects.equals(this.subspace, cosmosParamsV1beta1ParamChange.subspace) &&
        Objects.equals(this.key, cosmosParamsV1beta1ParamChange.key) &&
        Objects.equals(this.value, cosmosParamsV1beta1ParamChange.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subspace, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosParamsV1beta1ParamChange {\n");
    sb.append("    subspace: ").append(toIndentedString(subspace)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

