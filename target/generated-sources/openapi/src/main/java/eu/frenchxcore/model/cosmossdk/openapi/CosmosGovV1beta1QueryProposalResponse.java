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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryProposalResponse is the response type for the Query/Proposal RPC method.
 */
@ApiModel(description = "QueryProposalResponse is the response type for the Query/Proposal RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class CosmosGovV1beta1QueryProposalResponse {
  public static final String SERIALIZED_NAME_PROPOSAL = "proposal";
  @SerializedName(SERIALIZED_NAME_PROPOSAL)
  private InlineResponse20027Proposals proposal;


  public CosmosGovV1beta1QueryProposalResponse proposal(InlineResponse20027Proposals proposal) {
    
    this.proposal = proposal;
    return this;
  }

   /**
   * Get proposal
   * @return proposal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20027Proposals getProposal() {
    return proposal;
  }


  public void setProposal(InlineResponse20027Proposals proposal) {
    this.proposal = proposal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1QueryProposalResponse cosmosGovV1beta1QueryProposalResponse = (CosmosGovV1beta1QueryProposalResponse) o;
    return Objects.equals(this.proposal, cosmosGovV1beta1QueryProposalResponse.proposal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1QueryProposalResponse {\n");
    sb.append("    proposal: ").append(toIndentedString(proposal)).append("\n");
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

