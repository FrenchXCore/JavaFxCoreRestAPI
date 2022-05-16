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
import eu.frenchxcore.model.cosmossdk.openapi.BasicBlockInfo;
import eu.frenchxcore.model.cosmossdk.openapi.PrevBlockInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Header defines the structure of a Tendermint block header.
 */
@ApiModel(description = "Header defines the structure of a Tendermint block header.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class InlineResponse20043HistHeader {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BasicBlockInfo version;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_LAST_BLOCK_ID = "last_block_id";
  @SerializedName(SERIALIZED_NAME_LAST_BLOCK_ID)
  private PrevBlockInfo lastBlockId;

  public static final String SERIALIZED_NAME_LAST_COMMIT_HASH = "last_commit_hash";
  @SerializedName(SERIALIZED_NAME_LAST_COMMIT_HASH)
  private byte[] lastCommitHash;

  public static final String SERIALIZED_NAME_DATA_HASH = "data_hash";
  @SerializedName(SERIALIZED_NAME_DATA_HASH)
  private byte[] dataHash;

  public static final String SERIALIZED_NAME_VALIDATORS_HASH = "validators_hash";
  @SerializedName(SERIALIZED_NAME_VALIDATORS_HASH)
  private byte[] validatorsHash;

  public static final String SERIALIZED_NAME_NEXT_VALIDATORS_HASH = "next_validators_hash";
  @SerializedName(SERIALIZED_NAME_NEXT_VALIDATORS_HASH)
  private byte[] nextValidatorsHash;

  public static final String SERIALIZED_NAME_CONSENSUS_HASH = "consensus_hash";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_HASH)
  private byte[] consensusHash;

  public static final String SERIALIZED_NAME_APP_HASH = "app_hash";
  @SerializedName(SERIALIZED_NAME_APP_HASH)
  private byte[] appHash;

  public static final String SERIALIZED_NAME_LAST_RESULTS_HASH = "last_results_hash";
  @SerializedName(SERIALIZED_NAME_LAST_RESULTS_HASH)
  private byte[] lastResultsHash;

  public static final String SERIALIZED_NAME_EVIDENCE_HASH = "evidence_hash";
  @SerializedName(SERIALIZED_NAME_EVIDENCE_HASH)
  private byte[] evidenceHash;

  public static final String SERIALIZED_NAME_PROPOSER_ADDRESS = "proposer_address";
  @SerializedName(SERIALIZED_NAME_PROPOSER_ADDRESS)
  private byte[] proposerAddress;


  public InlineResponse20043HistHeader version(BasicBlockInfo version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BasicBlockInfo getVersion() {
    return version;
  }


  public void setVersion(BasicBlockInfo version) {
    this.version = version;
  }


  public InlineResponse20043HistHeader chainId(String chainId) {
    
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChainId() {
    return chainId;
  }


  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public InlineResponse20043HistHeader height(String height) {
    
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


  public InlineResponse20043HistHeader time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public InlineResponse20043HistHeader lastBlockId(PrevBlockInfo lastBlockId) {
    
    this.lastBlockId = lastBlockId;
    return this;
  }

   /**
   * Get lastBlockId
   * @return lastBlockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrevBlockInfo getLastBlockId() {
    return lastBlockId;
  }


  public void setLastBlockId(PrevBlockInfo lastBlockId) {
    this.lastBlockId = lastBlockId;
  }


  public InlineResponse20043HistHeader lastCommitHash(byte[] lastCommitHash) {
    
    this.lastCommitHash = lastCommitHash;
    return this;
  }

   /**
   * Get lastCommitHash
   * @return lastCommitHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getLastCommitHash() {
    return lastCommitHash;
  }


  public void setLastCommitHash(byte[] lastCommitHash) {
    this.lastCommitHash = lastCommitHash;
  }


  public InlineResponse20043HistHeader dataHash(byte[] dataHash) {
    
    this.dataHash = dataHash;
    return this;
  }

   /**
   * Get dataHash
   * @return dataHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getDataHash() {
    return dataHash;
  }


  public void setDataHash(byte[] dataHash) {
    this.dataHash = dataHash;
  }


  public InlineResponse20043HistHeader validatorsHash(byte[] validatorsHash) {
    
    this.validatorsHash = validatorsHash;
    return this;
  }

   /**
   * Get validatorsHash
   * @return validatorsHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getValidatorsHash() {
    return validatorsHash;
  }


  public void setValidatorsHash(byte[] validatorsHash) {
    this.validatorsHash = validatorsHash;
  }


  public InlineResponse20043HistHeader nextValidatorsHash(byte[] nextValidatorsHash) {
    
    this.nextValidatorsHash = nextValidatorsHash;
    return this;
  }

   /**
   * Get nextValidatorsHash
   * @return nextValidatorsHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getNextValidatorsHash() {
    return nextValidatorsHash;
  }


  public void setNextValidatorsHash(byte[] nextValidatorsHash) {
    this.nextValidatorsHash = nextValidatorsHash;
  }


  public InlineResponse20043HistHeader consensusHash(byte[] consensusHash) {
    
    this.consensusHash = consensusHash;
    return this;
  }

   /**
   * Get consensusHash
   * @return consensusHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getConsensusHash() {
    return consensusHash;
  }


  public void setConsensusHash(byte[] consensusHash) {
    this.consensusHash = consensusHash;
  }


  public InlineResponse20043HistHeader appHash(byte[] appHash) {
    
    this.appHash = appHash;
    return this;
  }

   /**
   * Get appHash
   * @return appHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getAppHash() {
    return appHash;
  }


  public void setAppHash(byte[] appHash) {
    this.appHash = appHash;
  }


  public InlineResponse20043HistHeader lastResultsHash(byte[] lastResultsHash) {
    
    this.lastResultsHash = lastResultsHash;
    return this;
  }

   /**
   * Get lastResultsHash
   * @return lastResultsHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getLastResultsHash() {
    return lastResultsHash;
  }


  public void setLastResultsHash(byte[] lastResultsHash) {
    this.lastResultsHash = lastResultsHash;
  }


  public InlineResponse20043HistHeader evidenceHash(byte[] evidenceHash) {
    
    this.evidenceHash = evidenceHash;
    return this;
  }

   /**
   * Get evidenceHash
   * @return evidenceHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getEvidenceHash() {
    return evidenceHash;
  }


  public void setEvidenceHash(byte[] evidenceHash) {
    this.evidenceHash = evidenceHash;
  }


  public InlineResponse20043HistHeader proposerAddress(byte[] proposerAddress) {
    
    this.proposerAddress = proposerAddress;
    return this;
  }

   /**
   * Get proposerAddress
   * @return proposerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getProposerAddress() {
    return proposerAddress;
  }


  public void setProposerAddress(byte[] proposerAddress) {
    this.proposerAddress = proposerAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20043HistHeader inlineResponse20043HistHeader = (InlineResponse20043HistHeader) o;
    return Objects.equals(this.version, inlineResponse20043HistHeader.version) &&
        Objects.equals(this.chainId, inlineResponse20043HistHeader.chainId) &&
        Objects.equals(this.height, inlineResponse20043HistHeader.height) &&
        Objects.equals(this.time, inlineResponse20043HistHeader.time) &&
        Objects.equals(this.lastBlockId, inlineResponse20043HistHeader.lastBlockId) &&
        Arrays.equals(this.lastCommitHash, inlineResponse20043HistHeader.lastCommitHash) &&
        Arrays.equals(this.dataHash, inlineResponse20043HistHeader.dataHash) &&
        Arrays.equals(this.validatorsHash, inlineResponse20043HistHeader.validatorsHash) &&
        Arrays.equals(this.nextValidatorsHash, inlineResponse20043HistHeader.nextValidatorsHash) &&
        Arrays.equals(this.consensusHash, inlineResponse20043HistHeader.consensusHash) &&
        Arrays.equals(this.appHash, inlineResponse20043HistHeader.appHash) &&
        Arrays.equals(this.lastResultsHash, inlineResponse20043HistHeader.lastResultsHash) &&
        Arrays.equals(this.evidenceHash, inlineResponse20043HistHeader.evidenceHash) &&
        Arrays.equals(this.proposerAddress, inlineResponse20043HistHeader.proposerAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, chainId, height, time, lastBlockId, Arrays.hashCode(lastCommitHash), Arrays.hashCode(dataHash), Arrays.hashCode(validatorsHash), Arrays.hashCode(nextValidatorsHash), Arrays.hashCode(consensusHash), Arrays.hashCode(appHash), Arrays.hashCode(lastResultsHash), Arrays.hashCode(evidenceHash), Arrays.hashCode(proposerAddress));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20043HistHeader {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    lastBlockId: ").append(toIndentedString(lastBlockId)).append("\n");
    sb.append("    lastCommitHash: ").append(toIndentedString(lastCommitHash)).append("\n");
    sb.append("    dataHash: ").append(toIndentedString(dataHash)).append("\n");
    sb.append("    validatorsHash: ").append(toIndentedString(validatorsHash)).append("\n");
    sb.append("    nextValidatorsHash: ").append(toIndentedString(nextValidatorsHash)).append("\n");
    sb.append("    consensusHash: ").append(toIndentedString(consensusHash)).append("\n");
    sb.append("    appHash: ").append(toIndentedString(appHash)).append("\n");
    sb.append("    lastResultsHash: ").append(toIndentedString(lastResultsHash)).append("\n");
    sb.append("    evidenceHash: ").append(toIndentedString(evidenceHash)).append("\n");
    sb.append("    proposerAddress: ").append(toIndentedString(proposerAddress)).append("\n");
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

