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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20050TxResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BroadcastTxResponse is the response type for the Service.BroadcastTx method.
 */
@ApiModel(description = "BroadcastTxResponse is the response type for the Service.BroadcastTx method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosTxV1beta1BroadcastTxResponse {
  public static final String SERIALIZED_NAME_TX_RESPONSE = "tx_response";
  @SerializedName(SERIALIZED_NAME_TX_RESPONSE)
  private InlineResponse20050TxResponse txResponse;


  public CosmosTxV1beta1BroadcastTxResponse txResponse(InlineResponse20050TxResponse txResponse) {
    
    this.txResponse = txResponse;
    return this;
  }

   /**
   * Get txResponse
   * @return txResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20050TxResponse getTxResponse() {
    return txResponse;
  }


  public void setTxResponse(InlineResponse20050TxResponse txResponse) {
    this.txResponse = txResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosTxV1beta1BroadcastTxResponse cosmosTxV1beta1BroadcastTxResponse = (CosmosTxV1beta1BroadcastTxResponse) o;
    return Objects.equals(this.txResponse, cosmosTxV1beta1BroadcastTxResponse.txResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosTxV1beta1BroadcastTxResponse {\n");
    sb.append("    txResponse: ").append(toIndentedString(txResponse)).append("\n");
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

