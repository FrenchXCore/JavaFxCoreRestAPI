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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryVotesResponse is the response type for the Query/Votes RPC method.
 */
@ApiModel(description = "QueryVotesResponse is the response type for the Query/Votes RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class InlineResponse20032 {
  public static final String SERIALIZED_NAME_VOTES = "votes";
  @SerializedName(SERIALIZED_NAME_VOTES)
  private List<InlineResponse20032Votes> votes = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public InlineResponse20032 votes(List<InlineResponse20032Votes> votes) {
    
    this.votes = votes;
    return this;
  }

  public InlineResponse20032 addVotesItem(InlineResponse20032Votes votesItem) {
    if (this.votes == null) {
      this.votes = new ArrayList<InlineResponse20032Votes>();
    }
    this.votes.add(votesItem);
    return this;
  }

   /**
   * votes defined the queried votes.
   * @return votes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "votes defined the queried votes.")

  public List<InlineResponse20032Votes> getVotes() {
    return votes;
  }


  public void setVotes(List<InlineResponse20032Votes> votes) {
    this.votes = votes;
  }


  public InlineResponse20032 pagination(InlineResponse200Pagination pagination) {
    
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
    InlineResponse20032 inlineResponse20032 = (InlineResponse20032) o;
    return Objects.equals(this.votes, inlineResponse20032.votes) &&
        Objects.equals(this.pagination, inlineResponse20032.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(votes, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20032 {\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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

