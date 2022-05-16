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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * voting_params defines the parameters related to voting.
 */
@ApiModel(description = "voting_params defines the parameters related to voting.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class InlineResponse20026VotingParams {
  public static final String SERIALIZED_NAME_VOTING_PERIOD = "voting_period";
  @SerializedName(SERIALIZED_NAME_VOTING_PERIOD)
  private String votingPeriod;


  public InlineResponse20026VotingParams votingPeriod(String votingPeriod) {
    
    this.votingPeriod = votingPeriod;
    return this;
  }

   /**
   * Length of the voting period.
   * @return votingPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Length of the voting period.")

  public String getVotingPeriod() {
    return votingPeriod;
  }


  public void setVotingPeriod(String votingPeriod) {
    this.votingPeriod = votingPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20026VotingParams inlineResponse20026VotingParams = (InlineResponse20026VotingParams) o;
    return Objects.equals(this.votingPeriod, inlineResponse20026VotingParams.votingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(votingPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20026VotingParams {\n");
    sb.append("    votingPeriod: ").append(toIndentedString(votingPeriod)).append("\n");
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

