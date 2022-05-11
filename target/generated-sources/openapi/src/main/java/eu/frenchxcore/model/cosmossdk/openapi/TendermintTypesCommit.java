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
import eu.frenchxcore.model.cosmossdk.openapi.BlockID;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Commit contains the evidence that a block was committed by a set of validators.
 */
@ApiModel(description = "Commit contains the evidence that a block was committed by a set of validators.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class TendermintTypesCommit {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_ROUND = "round";
  @SerializedName(SERIALIZED_NAME_ROUND)
  private Integer round;

  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private BlockID blockId;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures> signatures = null;


  public TendermintTypesCommit height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public TendermintTypesCommit round(Integer round) {
    
    this.round = round;
    return this;
  }

   /**
   * Get round
   * @return round
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRound() {
    return round;
  }


  public void setRound(Integer round) {
    this.round = round;
  }


  public TendermintTypesCommit blockId(BlockID blockId) {
    
    this.blockId = blockId;
    return this;
  }

   /**
   * Get blockId
   * @return blockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockID getBlockId() {
    return blockId;
  }


  public void setBlockId(BlockID blockId) {
    this.blockId = blockId;
  }


  public TendermintTypesCommit signatures(List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures> signatures) {
    
    this.signatures = signatures;
    return this;
  }

  public TendermintTypesCommit addSignaturesItem(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Get signatures
   * @return signatures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures> getSignatures() {
    return signatures;
  }


  public void setSignatures(List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures> signatures) {
    this.signatures = signatures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintTypesCommit tendermintTypesCommit = (TendermintTypesCommit) o;
    return Objects.equals(this.height, tendermintTypesCommit.height) &&
        Objects.equals(this.round, tendermintTypesCommit.round) &&
        Objects.equals(this.blockId, tendermintTypesCommit.blockId) &&
        Objects.equals(this.signatures, tendermintTypesCommit.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, round, blockId, signatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintTypesCommit {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
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

