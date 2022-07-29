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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20049GasInfo;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20049Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SimulateResponse is the response type for the Service.SimulateRPC method.
 */
@ApiModel(description = "SimulateResponse is the response type for the Service.SimulateRPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class CosmosTxV1beta1SimulateResponse {
  public static final String SERIALIZED_NAME_GAS_INFO = "gas_info";
  @SerializedName(SERIALIZED_NAME_GAS_INFO)
  private InlineResponse20049GasInfo gasInfo;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private InlineResponse20049Result result;


  public CosmosTxV1beta1SimulateResponse gasInfo(InlineResponse20049GasInfo gasInfo) {
    
    this.gasInfo = gasInfo;
    return this;
  }

   /**
   * Get gasInfo
   * @return gasInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20049GasInfo getGasInfo() {
    return gasInfo;
  }


  public void setGasInfo(InlineResponse20049GasInfo gasInfo) {
    this.gasInfo = gasInfo;
  }


  public CosmosTxV1beta1SimulateResponse result(InlineResponse20049Result result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20049Result getResult() {
    return result;
  }


  public void setResult(InlineResponse20049Result result) {
    this.result = result;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosTxV1beta1SimulateResponse cosmosTxV1beta1SimulateResponse = (CosmosTxV1beta1SimulateResponse) o;
    return Objects.equals(this.gasInfo, cosmosTxV1beta1SimulateResponse.gasInfo) &&
        Objects.equals(this.result, cosmosTxV1beta1SimulateResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gasInfo, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosTxV1beta1SimulateResponse {\n");
    sb.append("    gasInfo: ").append(toIndentedString(gasInfo)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

