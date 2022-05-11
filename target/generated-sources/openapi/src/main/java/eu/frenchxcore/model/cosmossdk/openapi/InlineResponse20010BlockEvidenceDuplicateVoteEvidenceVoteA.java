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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Vote represents a prevote, precommit, or commit vote from validators for consensus.
 */
@ApiModel(description = "Vote represents a prevote, precommit, or commit vote from validators for consensus.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA {
  /**
   * SignedMsgType is a type of signed message in the consensus.   - SIGNED_MSG_TYPE_PREVOTE: Votes  - SIGNED_MSG_TYPE_PROPOSAL: Proposals
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    UNKNOWN("SIGNED_MSG_TYPE_UNKNOWN"),
    
    PREVOTE("SIGNED_MSG_TYPE_PREVOTE"),
    
    PRECOMMIT("SIGNED_MSG_TYPE_PRECOMMIT"),
    
    PROPOSAL("SIGNED_MSG_TYPE_PROPOSAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.UNKNOWN;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_ROUND = "round";
  @SerializedName(SERIALIZED_NAME_ROUND)
  private Integer round;

  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private BlockID blockId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_VALIDATOR_ADDRESS = "validator_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ADDRESS)
  private byte[] validatorAddress;

  public static final String SERIALIZED_NAME_VALIDATOR_INDEX = "validator_index";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_INDEX)
  private Integer validatorIndex;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private byte[] signature;


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * SignedMsgType is a type of signed message in the consensus.   - SIGNED_MSG_TYPE_PREVOTE: Votes  - SIGNED_MSG_TYPE_PROPOSAL: Proposals
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SignedMsgType is a type of signed message in the consensus.   - SIGNED_MSG_TYPE_PREVOTE: Votes  - SIGNED_MSG_TYPE_PROPOSAL: Proposals")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA height(String height) {
    
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


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA round(Integer round) {
    
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


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA blockId(BlockID blockId) {
    
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


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA timestamp(OffsetDateTime timestamp) {
    
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


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA validatorAddress(byte[] validatorAddress) {
    
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


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA validatorIndex(Integer validatorIndex) {
    
    this.validatorIndex = validatorIndex;
    return this;
  }

   /**
   * Get validatorIndex
   * @return validatorIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getValidatorIndex() {
    return validatorIndex;
  }


  public void setValidatorIndex(Integer validatorIndex) {
    this.validatorIndex = validatorIndex;
  }


  public InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA signature(byte[] signature) {
    
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
    InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA = (InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA) o;
    return Objects.equals(this.type, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.type) &&
        Objects.equals(this.height, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.height) &&
        Objects.equals(this.round, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.round) &&
        Objects.equals(this.blockId, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.blockId) &&
        Objects.equals(this.timestamp, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.timestamp) &&
        Arrays.equals(this.validatorAddress, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.validatorAddress) &&
        Objects.equals(this.validatorIndex, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.validatorIndex) &&
        Arrays.equals(this.signature, inlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, height, round, blockId, timestamp, Arrays.hashCode(validatorAddress), validatorIndex, Arrays.hashCode(signature));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010BlockEvidenceDuplicateVoteEvidenceVoteA {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    validatorAddress: ").append(toIndentedString(validatorAddress)).append("\n");
    sb.append("    validatorIndex: ").append(toIndentedString(validatorIndex)).append("\n");
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

