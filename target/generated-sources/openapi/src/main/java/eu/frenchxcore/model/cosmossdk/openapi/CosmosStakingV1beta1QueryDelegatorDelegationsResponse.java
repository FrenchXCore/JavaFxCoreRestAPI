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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20038DelegationResponses;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryDelegatorDelegationsResponse is response type for the Query/DelegatorDelegations RPC method.
 */
@ApiModel(description = "QueryDelegatorDelegationsResponse is response type for the Query/DelegatorDelegations RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class CosmosStakingV1beta1QueryDelegatorDelegationsResponse {
  public static final String SERIALIZED_NAME_DELEGATION_RESPONSES = "delegation_responses";
  @SerializedName(SERIALIZED_NAME_DELEGATION_RESPONSES)
  private List<InlineResponse20038DelegationResponses> delegationResponses = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public CosmosStakingV1beta1QueryDelegatorDelegationsResponse delegationResponses(List<InlineResponse20038DelegationResponses> delegationResponses) {
    
    this.delegationResponses = delegationResponses;
    return this;
  }

  public CosmosStakingV1beta1QueryDelegatorDelegationsResponse addDelegationResponsesItem(InlineResponse20038DelegationResponses delegationResponsesItem) {
    if (this.delegationResponses == null) {
      this.delegationResponses = new ArrayList<InlineResponse20038DelegationResponses>();
    }
    this.delegationResponses.add(delegationResponsesItem);
    return this;
  }

   /**
   * delegation_responses defines all the delegations&#39; info of a delegator.
   * @return delegationResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "delegation_responses defines all the delegations' info of a delegator.")

  public List<InlineResponse20038DelegationResponses> getDelegationResponses() {
    return delegationResponses;
  }


  public void setDelegationResponses(List<InlineResponse20038DelegationResponses> delegationResponses) {
    this.delegationResponses = delegationResponses;
  }


  public CosmosStakingV1beta1QueryDelegatorDelegationsResponse pagination(InlineResponse200Pagination pagination) {
    
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
    CosmosStakingV1beta1QueryDelegatorDelegationsResponse cosmosStakingV1beta1QueryDelegatorDelegationsResponse = (CosmosStakingV1beta1QueryDelegatorDelegationsResponse) o;
    return Objects.equals(this.delegationResponses, cosmosStakingV1beta1QueryDelegatorDelegationsResponse.delegationResponses) &&
        Objects.equals(this.pagination, cosmosStakingV1beta1QueryDelegatorDelegationsResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegationResponses, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosStakingV1beta1QueryDelegatorDelegationsResponse {\n");
    sb.append("    delegationResponses: ").append(toIndentedString(delegationResponses)).append("\n");
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

