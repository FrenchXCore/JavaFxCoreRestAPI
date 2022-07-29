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
 * QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod {
  public static final String SERIALIZED_NAME_DELEGATION_RESPONSES = "delegation_responses";
  @SerializedName(SERIALIZED_NAME_DELEGATION_RESPONSES)
  private List<InlineResponse20038DelegationResponses> delegationResponses = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod delegationResponses(List<InlineResponse20038DelegationResponses> delegationResponses) {
    
    this.delegationResponses = delegationResponses;
    return this;
  }

  public QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod addDelegationResponsesItem(InlineResponse20038DelegationResponses delegationResponsesItem) {
    if (this.delegationResponses == null) {
      this.delegationResponses = new ArrayList<InlineResponse20038DelegationResponses>();
    }
    this.delegationResponses.add(delegationResponsesItem);
    return this;
  }

   /**
   * Get delegationResponses
   * @return delegationResponses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20038DelegationResponses> getDelegationResponses() {
    return delegationResponses;
  }


  public void setDelegationResponses(List<InlineResponse20038DelegationResponses> delegationResponses) {
    this.delegationResponses = delegationResponses;
  }


  public QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod pagination(InlineResponse200Pagination pagination) {
    
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
    QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod queryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod = (QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod) o;
    return Objects.equals(this.delegationResponses, queryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod.delegationResponses) &&
        Objects.equals(this.pagination, queryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegationResponses, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValidatorDelegationsResponseIsResponseTypeForTheQueryValidatorDelegationsRPCMethod {\n");
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

