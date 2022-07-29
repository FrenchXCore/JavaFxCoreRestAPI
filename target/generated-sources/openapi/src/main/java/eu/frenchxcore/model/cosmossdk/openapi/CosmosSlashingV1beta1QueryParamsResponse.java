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
import eu.frenchxcore.model.cosmossdk.openapi.QueryParamsResponseIsTheResponseTypeForTheQueryParamsRPCMethodParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CosmosSlashingV1beta1QueryParamsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:17.959489600+02:00[Europe/Paris]")
public class CosmosSlashingV1beta1QueryParamsResponse {
  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private QueryParamsResponseIsTheResponseTypeForTheQueryParamsRPCMethodParams params;


  public CosmosSlashingV1beta1QueryParamsResponse params(QueryParamsResponseIsTheResponseTypeForTheQueryParamsRPCMethodParams params) {
    
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QueryParamsResponseIsTheResponseTypeForTheQueryParamsRPCMethodParams getParams() {
    return params;
  }


  public void setParams(QueryParamsResponseIsTheResponseTypeForTheQueryParamsRPCMethodParams params) {
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
    CosmosSlashingV1beta1QueryParamsResponse cosmosSlashingV1beta1QueryParamsResponse = (CosmosSlashingV1beta1QueryParamsResponse) o;
    return Objects.equals(this.params, cosmosSlashingV1beta1QueryParamsResponse.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosSlashingV1beta1QueryParamsResponse {\n");
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

