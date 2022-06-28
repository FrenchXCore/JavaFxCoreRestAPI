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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20032Votes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryVoteResponse is the response type for the Query/Vote RPC method.
 */
@ApiModel(description = "QueryVoteResponse is the response type for the Query/Vote RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class CosmosGovV1beta1QueryVoteResponse {
  public static final String SERIALIZED_NAME_VOTE = "vote";
  @SerializedName(SERIALIZED_NAME_VOTE)
  private InlineResponse20032Votes vote;


  public CosmosGovV1beta1QueryVoteResponse vote(InlineResponse20032Votes vote) {
    
    this.vote = vote;
    return this;
  }

   /**
   * Get vote
   * @return vote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20032Votes getVote() {
    return vote;
  }


  public void setVote(InlineResponse20032Votes vote) {
    this.vote = vote;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1QueryVoteResponse cosmosGovV1beta1QueryVoteResponse = (CosmosGovV1beta1QueryVoteResponse) o;
    return Objects.equals(this.vote, cosmosGovV1beta1QueryVoteResponse.vote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1QueryVoteResponse {\n");
    sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
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

