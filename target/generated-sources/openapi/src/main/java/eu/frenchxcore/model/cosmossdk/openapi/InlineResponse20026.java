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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20026DepositParams;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20026TallyParams;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20026VotingParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryParamsResponse is the response type for the Query/Params RPC method.
 */
@ApiModel(description = "QueryParamsResponse is the response type for the Query/Params RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-12T09:18:01.385767300+02:00[Europe/Paris]")
public class InlineResponse20026 {
  public static final String SERIALIZED_NAME_VOTING_PARAMS = "voting_params";
  @SerializedName(SERIALIZED_NAME_VOTING_PARAMS)
  private InlineResponse20026VotingParams votingParams;

  public static final String SERIALIZED_NAME_DEPOSIT_PARAMS = "deposit_params";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_PARAMS)
  private InlineResponse20026DepositParams depositParams;

  public static final String SERIALIZED_NAME_TALLY_PARAMS = "tally_params";
  @SerializedName(SERIALIZED_NAME_TALLY_PARAMS)
  private InlineResponse20026TallyParams tallyParams;


  public InlineResponse20026 votingParams(InlineResponse20026VotingParams votingParams) {
    
    this.votingParams = votingParams;
    return this;
  }

   /**
   * Get votingParams
   * @return votingParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20026VotingParams getVotingParams() {
    return votingParams;
  }


  public void setVotingParams(InlineResponse20026VotingParams votingParams) {
    this.votingParams = votingParams;
  }


  public InlineResponse20026 depositParams(InlineResponse20026DepositParams depositParams) {
    
    this.depositParams = depositParams;
    return this;
  }

   /**
   * Get depositParams
   * @return depositParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20026DepositParams getDepositParams() {
    return depositParams;
  }


  public void setDepositParams(InlineResponse20026DepositParams depositParams) {
    this.depositParams = depositParams;
  }


  public InlineResponse20026 tallyParams(InlineResponse20026TallyParams tallyParams) {
    
    this.tallyParams = tallyParams;
    return this;
  }

   /**
   * Get tallyParams
   * @return tallyParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20026TallyParams getTallyParams() {
    return tallyParams;
  }


  public void setTallyParams(InlineResponse20026TallyParams tallyParams) {
    this.tallyParams = tallyParams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20026 inlineResponse20026 = (InlineResponse20026) o;
    return Objects.equals(this.votingParams, inlineResponse20026.votingParams) &&
        Objects.equals(this.depositParams, inlineResponse20026.depositParams) &&
        Objects.equals(this.tallyParams, inlineResponse20026.tallyParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(votingParams, depositParams, tallyParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20026 {\n");
    sb.append("    votingParams: ").append(toIndentedString(votingParams)).append("\n");
    sb.append("    depositParams: ").append(toIndentedString(depositParams)).append("\n");
    sb.append("    tallyParams: ").append(toIndentedString(tallyParams)).append("\n");
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

