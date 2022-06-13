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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20027Proposals;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryProposalsResponse is the response type for the Query/Proposals RPC method.
 */
@ApiModel(description = "QueryProposalsResponse is the response type for the Query/Proposals RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-12T09:18:01.385767300+02:00[Europe/Paris]")
public class CosmosGovV1beta1QueryProposalsResponse {
  public static final String SERIALIZED_NAME_PROPOSALS = "proposals";
  @SerializedName(SERIALIZED_NAME_PROPOSALS)
  private List<InlineResponse20027Proposals> proposals = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public CosmosGovV1beta1QueryProposalsResponse proposals(List<InlineResponse20027Proposals> proposals) {
    
    this.proposals = proposals;
    return this;
  }

  public CosmosGovV1beta1QueryProposalsResponse addProposalsItem(InlineResponse20027Proposals proposalsItem) {
    if (this.proposals == null) {
      this.proposals = new ArrayList<InlineResponse20027Proposals>();
    }
    this.proposals.add(proposalsItem);
    return this;
  }

   /**
   * Get proposals
   * @return proposals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20027Proposals> getProposals() {
    return proposals;
  }


  public void setProposals(List<InlineResponse20027Proposals> proposals) {
    this.proposals = proposals;
  }


  public CosmosGovV1beta1QueryProposalsResponse pagination(InlineResponse200Pagination pagination) {
    
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
    CosmosGovV1beta1QueryProposalsResponse cosmosGovV1beta1QueryProposalsResponse = (CosmosGovV1beta1QueryProposalsResponse) o;
    return Objects.equals(this.proposals, cosmosGovV1beta1QueryProposalsResponse.proposals) &&
        Objects.equals(this.pagination, cosmosGovV1beta1QueryProposalsResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposals, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1QueryProposalsResponse {\n");
    sb.append("    proposals: ").append(toIndentedString(proposals)).append("\n");
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

