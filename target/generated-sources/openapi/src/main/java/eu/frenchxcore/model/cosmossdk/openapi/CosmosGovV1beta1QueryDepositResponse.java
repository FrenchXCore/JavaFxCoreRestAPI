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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20029Deposits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryDepositResponse is the response type for the Query/Deposit RPC method.
 */
@ApiModel(description = "QueryDepositResponse is the response type for the Query/Deposit RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosGovV1beta1QueryDepositResponse {
  public static final String SERIALIZED_NAME_DEPOSIT = "deposit";
  @SerializedName(SERIALIZED_NAME_DEPOSIT)
  private InlineResponse20029Deposits deposit;


  public CosmosGovV1beta1QueryDepositResponse deposit(InlineResponse20029Deposits deposit) {
    
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20029Deposits getDeposit() {
    return deposit;
  }


  public void setDeposit(InlineResponse20029Deposits deposit) {
    this.deposit = deposit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1QueryDepositResponse cosmosGovV1beta1QueryDepositResponse = (CosmosGovV1beta1QueryDepositResponse) o;
    return Objects.equals(this.deposit, cosmosGovV1beta1QueryDepositResponse.deposit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deposit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1QueryDepositResponse {\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
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

