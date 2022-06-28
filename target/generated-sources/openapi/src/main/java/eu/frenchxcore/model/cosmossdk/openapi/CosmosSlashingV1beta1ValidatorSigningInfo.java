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
 * ValidatorSigningInfo defines a validator&#39;s signing info for monitoring their liveness activity.
 */
@ApiModel(description = "ValidatorSigningInfo defines a validator's signing info for monitoring their liveness activity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class CosmosSlashingV1beta1ValidatorSigningInfo {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_START_HEIGHT = "start_height";
  @SerializedName(SERIALIZED_NAME_START_HEIGHT)
  private String startHeight;

  public static final String SERIALIZED_NAME_INDEX_OFFSET = "index_offset";
  @SerializedName(SERIALIZED_NAME_INDEX_OFFSET)
  private String indexOffset;

  public static final String SERIALIZED_NAME_JAILED_UNTIL = "jailed_until";
  @SerializedName(SERIALIZED_NAME_JAILED_UNTIL)
  private OffsetDateTime jailedUntil;

  public static final String SERIALIZED_NAME_TOMBSTONED = "tombstoned";
  @SerializedName(SERIALIZED_NAME_TOMBSTONED)
  private Boolean tombstoned;

  public static final String SERIALIZED_NAME_MISSED_BLOCKS_COUNTER = "missed_blocks_counter";
  @SerializedName(SERIALIZED_NAME_MISSED_BLOCKS_COUNTER)
  private String missedBlocksCounter;


  public CosmosSlashingV1beta1ValidatorSigningInfo address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public CosmosSlashingV1beta1ValidatorSigningInfo startHeight(String startHeight) {
    
    this.startHeight = startHeight;
    return this;
  }

   /**
   * Get startHeight
   * @return startHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartHeight() {
    return startHeight;
  }


  public void setStartHeight(String startHeight) {
    this.startHeight = startHeight;
  }


  public CosmosSlashingV1beta1ValidatorSigningInfo indexOffset(String indexOffset) {
    
    this.indexOffset = indexOffset;
    return this;
  }

   /**
   * Index which is incremented each time the validator was a bonded in a block and may have signed a precommit or not. This in conjunction with the &#x60;SignedBlocksWindow&#x60; param determines the index in the &#x60;MissedBlocksBitArray&#x60;.
   * @return indexOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index which is incremented each time the validator was a bonded in a block and may have signed a precommit or not. This in conjunction with the `SignedBlocksWindow` param determines the index in the `MissedBlocksBitArray`.")

  public String getIndexOffset() {
    return indexOffset;
  }


  public void setIndexOffset(String indexOffset) {
    this.indexOffset = indexOffset;
  }


  public CosmosSlashingV1beta1ValidatorSigningInfo jailedUntil(OffsetDateTime jailedUntil) {
    
    this.jailedUntil = jailedUntil;
    return this;
  }

   /**
   * Timestamp until which the validator is jailed due to liveness downtime.
   * @return jailedUntil
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp until which the validator is jailed due to liveness downtime.")

  public OffsetDateTime getJailedUntil() {
    return jailedUntil;
  }


  public void setJailedUntil(OffsetDateTime jailedUntil) {
    this.jailedUntil = jailedUntil;
  }


  public CosmosSlashingV1beta1ValidatorSigningInfo tombstoned(Boolean tombstoned) {
    
    this.tombstoned = tombstoned;
    return this;
  }

   /**
   * Whether or not a validator has been tombstoned (killed out of validator set). It is set once the validator commits an equivocation or for any other configured misbehiavor.
   * @return tombstoned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not a validator has been tombstoned (killed out of validator set). It is set once the validator commits an equivocation or for any other configured misbehiavor.")

  public Boolean getTombstoned() {
    return tombstoned;
  }


  public void setTombstoned(Boolean tombstoned) {
    this.tombstoned = tombstoned;
  }


  public CosmosSlashingV1beta1ValidatorSigningInfo missedBlocksCounter(String missedBlocksCounter) {
    
    this.missedBlocksCounter = missedBlocksCounter;
    return this;
  }

   /**
   * A counter kept to avoid unnecessary array reads. Note that &#x60;Sum(MissedBlocksBitArray)&#x60; always equals &#x60;MissedBlocksCounter&#x60;.
   * @return missedBlocksCounter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A counter kept to avoid unnecessary array reads. Note that `Sum(MissedBlocksBitArray)` always equals `MissedBlocksCounter`.")

  public String getMissedBlocksCounter() {
    return missedBlocksCounter;
  }


  public void setMissedBlocksCounter(String missedBlocksCounter) {
    this.missedBlocksCounter = missedBlocksCounter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosSlashingV1beta1ValidatorSigningInfo cosmosSlashingV1beta1ValidatorSigningInfo = (CosmosSlashingV1beta1ValidatorSigningInfo) o;
    return Objects.equals(this.address, cosmosSlashingV1beta1ValidatorSigningInfo.address) &&
        Objects.equals(this.startHeight, cosmosSlashingV1beta1ValidatorSigningInfo.startHeight) &&
        Objects.equals(this.indexOffset, cosmosSlashingV1beta1ValidatorSigningInfo.indexOffset) &&
        Objects.equals(this.jailedUntil, cosmosSlashingV1beta1ValidatorSigningInfo.jailedUntil) &&
        Objects.equals(this.tombstoned, cosmosSlashingV1beta1ValidatorSigningInfo.tombstoned) &&
        Objects.equals(this.missedBlocksCounter, cosmosSlashingV1beta1ValidatorSigningInfo.missedBlocksCounter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, startHeight, indexOffset, jailedUntil, tombstoned, missedBlocksCounter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosSlashingV1beta1ValidatorSigningInfo {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startHeight: ").append(toIndentedString(startHeight)).append("\n");
    sb.append("    indexOffset: ").append(toIndentedString(indexOffset)).append("\n");
    sb.append("    jailedUntil: ").append(toIndentedString(jailedUntil)).append("\n");
    sb.append("    tombstoned: ").append(toIndentedString(tombstoned)).append("\n");
    sb.append("    missedBlocksCounter: ").append(toIndentedString(missedBlocksCounter)).append("\n");
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

