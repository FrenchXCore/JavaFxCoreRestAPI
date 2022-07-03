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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse2003Balances;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod {
  public static final String SERIALIZED_NAME_SUPPLY = "supply";
  @SerializedName(SERIALIZED_NAME_SUPPLY)
  private List<InlineResponse2003Balances> supply = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod supply(List<InlineResponse2003Balances> supply) {
    
    this.supply = supply;
    return this;
  }

  public QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod addSupplyItem(InlineResponse2003Balances supplyItem) {
    if (this.supply == null) {
      this.supply = new ArrayList<InlineResponse2003Balances>();
    }
    this.supply.add(supplyItem);
    return this;
  }

   /**
   * Get supply
   * @return supply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse2003Balances> getSupply() {
    return supply;
  }


  public void setSupply(List<InlineResponse2003Balances> supply) {
    this.supply = supply;
  }


  public QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod pagination(InlineResponse200Pagination pagination) {
    
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
    QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod queryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod = (QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod) o;
    return Objects.equals(this.supply, queryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod.supply) &&
        Objects.equals(this.pagination, queryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supply, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTotalSupplyResponseIsTheResponseTypeForTheQueryTotalSupplyRPCMethod {\n");
    sb.append("    supply: ").append(toIndentedString(supply)).append("\n");
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

