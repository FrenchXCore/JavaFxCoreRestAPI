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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse2008Params;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryParamsResponse defines the response type for querying x/bank parameters.
 */
@ApiModel(description = "QueryParamsResponse defines the response type for querying x/bank parameters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosBankV1beta1QueryParamsResponse {
  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private InlineResponse2008Params params;


  public CosmosBankV1beta1QueryParamsResponse params(InlineResponse2008Params params) {
    
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse2008Params getParams() {
    return params;
  }


  public void setParams(InlineResponse2008Params params) {
    this.params = params;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosBankV1beta1QueryParamsResponse cosmosBankV1beta1QueryParamsResponse = (CosmosBankV1beta1QueryParamsResponse) o;
    return Objects.equals(this.params, cosmosBankV1beta1QueryParamsResponse.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosBankV1beta1QueryParamsResponse {\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

