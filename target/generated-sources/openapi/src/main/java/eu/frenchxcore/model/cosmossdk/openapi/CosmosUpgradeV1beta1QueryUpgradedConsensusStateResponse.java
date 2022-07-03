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
 * QueryUpgradedConsensusStateResponse is the response type for the Query/UpgradedConsensusState RPC method.
 */
@ApiModel(description = "QueryUpgradedConsensusStateResponse is the response type for the Query/UpgradedConsensusState RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosUpgradeV1beta1QueryUpgradedConsensusStateResponse {
  public static final String SERIALIZED_NAME_UPGRADED_CONSENSUS_STATE = "upgraded_consensus_state";
  @SerializedName(SERIALIZED_NAME_UPGRADED_CONSENSUS_STATE)
  private byte[] upgradedConsensusState;


  public CosmosUpgradeV1beta1QueryUpgradedConsensusStateResponse upgradedConsensusState(byte[] upgradedConsensusState) {
    
    this.upgradedConsensusState = upgradedConsensusState;
    return this;
  }

   /**
   * Get upgradedConsensusState
   * @return upgradedConsensusState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getUpgradedConsensusState() {
    return upgradedConsensusState;
  }


  public void setUpgradedConsensusState(byte[] upgradedConsensusState) {
    this.upgradedConsensusState = upgradedConsensusState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosUpgradeV1beta1QueryUpgradedConsensusStateResponse cosmosUpgradeV1beta1QueryUpgradedConsensusStateResponse = (CosmosUpgradeV1beta1QueryUpgradedConsensusStateResponse) o;
    return Arrays.equals(this.upgradedConsensusState, cosmosUpgradeV1beta1QueryUpgradedConsensusStateResponse.upgradedConsensusState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(upgradedConsensusState));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosUpgradeV1beta1QueryUpgradedConsensusStateResponse {\n");
    sb.append("    upgradedConsensusState: ").append(toIndentedString(upgradedConsensusState)).append("\n");
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

