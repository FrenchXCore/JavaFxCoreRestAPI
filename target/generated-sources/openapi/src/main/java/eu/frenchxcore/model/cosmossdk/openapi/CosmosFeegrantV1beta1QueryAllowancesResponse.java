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
import eu.frenchxcore.model.cosmossdk.openapi.GrantIsStoredInTheKVStoreToRecordAGrantWithFullContext1;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20014Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryAllowancesResponse is the response type for the Query/Allowances RPC method.
 */
@ApiModel(description = "QueryAllowancesResponse is the response type for the Query/Allowances RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class CosmosFeegrantV1beta1QueryAllowancesResponse {
  public static final String SERIALIZED_NAME_ALLOWANCES = "allowances";
  @SerializedName(SERIALIZED_NAME_ALLOWANCES)
  private List<GrantIsStoredInTheKVStoreToRecordAGrantWithFullContext1> allowances = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse20014Pagination pagination;


  public CosmosFeegrantV1beta1QueryAllowancesResponse allowances(List<GrantIsStoredInTheKVStoreToRecordAGrantWithFullContext1> allowances) {
    
    this.allowances = allowances;
    return this;
  }

  public CosmosFeegrantV1beta1QueryAllowancesResponse addAllowancesItem(GrantIsStoredInTheKVStoreToRecordAGrantWithFullContext1 allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<GrantIsStoredInTheKVStoreToRecordAGrantWithFullContext1>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

   /**
   * allowances are allowance&#39;s granted for grantee by granter.
   * @return allowances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "allowances are allowance's granted for grantee by granter.")

  public List<GrantIsStoredInTheKVStoreToRecordAGrantWithFullContext1> getAllowances() {
    return allowances;
  }


  public void setAllowances(List<GrantIsStoredInTheKVStoreToRecordAGrantWithFullContext1> allowances) {
    this.allowances = allowances;
  }


  public CosmosFeegrantV1beta1QueryAllowancesResponse pagination(InlineResponse20014Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20014Pagination getPagination() {
    return pagination;
  }


  public void setPagination(InlineResponse20014Pagination pagination) {
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
    CosmosFeegrantV1beta1QueryAllowancesResponse cosmosFeegrantV1beta1QueryAllowancesResponse = (CosmosFeegrantV1beta1QueryAllowancesResponse) o;
    return Objects.equals(this.allowances, cosmosFeegrantV1beta1QueryAllowancesResponse.allowances) &&
        Objects.equals(this.pagination, cosmosFeegrantV1beta1QueryAllowancesResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowances, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosFeegrantV1beta1QueryAllowancesResponse {\n");
    sb.append("    allowances: ").append(toIndentedString(allowances)).append("\n");
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

