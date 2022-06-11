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
import org.threeten.bp.OffsetDateTime;

/**
 * CommitSig is a part of the Vote included in a Commit.
 */
@ApiModel(description = "CommitSig is a part of the Vote included in a Commit.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T23:37:17.045990200+02:00[Europe/Paris]")
public class InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures {
  /**
   * Gets or Sets blockIdFlag
   */
  @JsonAdapter(BlockIdFlagEnum.Adapter.class)
  public enum BlockIdFlagEnum {
    UNKNOWN("BLOCK_ID_FLAG_UNKNOWN"),
    
    ABSENT("BLOCK_ID_FLAG_ABSENT"),
    
    COMMIT("BLOCK_ID_FLAG_COMMIT"),
    
    NIL("BLOCK_ID_FLAG_NIL");

    private String value;

    BlockIdFlagEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BlockIdFlagEnum fromValue(String value) {
      for (BlockIdFlagEnum b : BlockIdFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BlockIdFlagEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BlockIdFlagEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BlockIdFlagEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BlockIdFlagEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BLOCK_ID_FLAG = "block_id_flag";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID_FLAG)
  private BlockIdFlagEnum blockIdFlag = BlockIdFlagEnum.UNKNOWN;

  public static final String SERIALIZED_NAME_VALIDATOR_ADDRESS = "validator_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ADDRESS)
  private byte[] validatorAddress;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private byte[] signature;


  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures blockIdFlag(BlockIdFlagEnum blockIdFlag) {
    
    this.blockIdFlag = blockIdFlag;
    return this;
  }

   /**
   * Get blockIdFlag
   * @return blockIdFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockIdFlagEnum getBlockIdFlag() {
    return blockIdFlag;
  }


  public void setBlockIdFlag(BlockIdFlagEnum blockIdFlag) {
    this.blockIdFlag = blockIdFlag;
  }


  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures validatorAddress(byte[] validatorAddress) {
    
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * Get validatorAddress
   * @return validatorAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getValidatorAddress() {
    return validatorAddress;
  }


  public void setValidatorAddress(byte[] validatorAddress) {
    this.validatorAddress = validatorAddress;
  }


  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures signature(byte[] signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getSignature() {
    return signature;
  }


  public void setSignature(byte[] signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures = (InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures) o;
    return Objects.equals(this.blockIdFlag, inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures.blockIdFlag) &&
        Arrays.equals(this.validatorAddress, inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures.validatorAddress) &&
        Objects.equals(this.timestamp, inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures.timestamp) &&
        Arrays.equals(this.signature, inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockIdFlag, Arrays.hashCode(validatorAddress), timestamp, Arrays.hashCode(signature));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommitSignatures {\n");
    sb.append("    blockIdFlag: ").append(toIndentedString(blockIdFlag)).append("\n");
    sb.append("    validatorAddress: ").append(toIndentedString(validatorAddress)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
