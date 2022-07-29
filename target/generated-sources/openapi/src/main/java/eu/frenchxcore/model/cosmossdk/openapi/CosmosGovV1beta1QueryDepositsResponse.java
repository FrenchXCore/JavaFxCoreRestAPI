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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryDepositsResponse is the response type for the Query/Deposits RPC method.
 */
@ApiModel(description = "QueryDepositsResponse is the response type for the Query/Deposits RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class CosmosGovV1beta1QueryDepositsResponse {
  public static final String SERIALIZED_NAME_DEPOSITS = "deposits";
  @SerializedName(SERIALIZED_NAME_DEPOSITS)
  private List<InlineResponse20029Deposits> deposits = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public CosmosGovV1beta1QueryDepositsResponse deposits(List<InlineResponse20029Deposits> deposits) {
    
    this.deposits = deposits;
    return this;
  }

  public CosmosGovV1beta1QueryDepositsResponse addDepositsItem(InlineResponse20029Deposits depositsItem) {
    if (this.deposits == null) {
      this.deposits = new ArrayList<InlineResponse20029Deposits>();
    }
    this.deposits.add(depositsItem);
    return this;
  }

   /**
   * Get deposits
   * @return deposits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20029Deposits> getDeposits() {
    return deposits;
  }


  public void setDeposits(List<InlineResponse20029Deposits> deposits) {
    this.deposits = deposits;
  }


  public CosmosGovV1beta1QueryDepositsResponse pagination(InlineResponse200Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200Pagination getPagination() {
    return pagination;
  }


  public void setPagination(InlineResponse200Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1QueryDepositsResponse cosmosGovV1beta1QueryDepositsResponse = (CosmosGovV1beta1QueryDepositsResponse) o;
    return Objects.equals(this.deposits, cosmosGovV1beta1QueryDepositsResponse.deposits) &&
        Objects.equals(this.pagination, cosmosGovV1beta1QueryDepositsResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deposits, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1QueryDepositsResponse {\n");
    sb.append("    deposits: ").append(toIndentedString(deposits)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

