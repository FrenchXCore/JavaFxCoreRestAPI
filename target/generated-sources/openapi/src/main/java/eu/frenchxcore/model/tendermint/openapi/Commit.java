/*
 * Tendermint RPC
 * Tendermint supports the following RPC protocols:  * URI over HTTP * JSON-RPC 2.0 over HTTP * JSON-RPC 2.0 over websockets (deprecated)  ## Configuration  RPC can be configured by tuning parameters under `[rpc]` table in the `$TMHOME/config/config.toml` file or by using the `--rpc.X` command-line flags.  Default rpc listen address is `tcp://0.0.0.0:26657`. To set another address, set the `laddr` config parameter to desired value. CORS (Cross-Origin Resource Sharing) can be enabled by setting `cors_allowed_origins`, `cors_allowed_methods`, `cors_allowed_headers` config parameters.  ## Arguments  Arguments which expect strings or byte arrays may be passed as quoted strings, like `\"abc\"` or as `0x`-prefixed strings, like `0x616263`.  ## URI/HTTP  A GET request with arguments encoded as query parameters:      curl localhost:26657/block?height=5  ## JSONRPC/HTTP  JSONRPC requests can be POST'd to the root RPC endpoint via HTTP.      curl --header \"Content-Type: application/json\" --request POST --data '{\"method\": \"block\", \"params\": [\"5\"], \"id\": 1}' localhost:26657  ## JSONRPC/websockets  In Tendermint v0.35 and earlier, JSONRPC requests can be also made via websocket.  The websocket interface is deprecated in Tendermint v0.36, and will be removed in v0.37.  The websocket endpoint is at `/websocket`, e.g. `localhost:26657/websocket`. The RPC methods for event subscription (`subscribe`, `unsubscribe`, and `unsubscribe_all`) are only available via websockets.  Example using https://github.com/hashrocket/ws:      ws ws://localhost:26657/websocket     > { \"jsonrpc\": \"2.0\", \"method\": \"subscribe\", \"params\": [\"tm.event='NewBlock'\"], \"id\": 1 } 
 *
 * The version of the OpenAPI document: Master
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.frenchxcore.model.tendermint.openapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import eu.frenchxcore.model.tendermint.openapi.BlockID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Commit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:21.538516500+02:00[Europe/Paris]")
public class Commit {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

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
  private String timestamp;

  public static final String SERIALIZED_NAME_VALIDATOR_ADDRESS = "validator_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ADDRESS)
  private String validatorAddress;

  public static final String SERIALIZED_NAME_VALIDATOR_INDEX = "validator_index";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_INDEX)
  private Integer validatorIndex;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;


  public Commit type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "2", required = true, value = "")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public Commit height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "1262085", required = true, value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public Commit round(Integer round) {
    
    this.round = round;
    return this;
  }

   /**
   * Get round
   * @return round
  **/
  @ApiModelProperty(example = "0", required = true, value = "")

  public Integer getRound() {
    return round;
  }


  public void setRound(Integer round) {
    this.round = round;
  }


  public Commit blockId(BlockID blockId) {
    
    this.blockId = blockId;
    return this;
  }

   /**
   * Get blockId
   * @return blockId
  **/
  @ApiModelProperty(required = true, value = "")

  public BlockID getBlockId() {
    return blockId;
  }


  public void setBlockId(BlockID blockId) {
    this.blockId = blockId;
  }


  public Commit timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "2019-08-01T11:39:38.867269833Z", required = true, value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public Commit validatorAddress(String validatorAddress) {
    
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * Get validatorAddress
   * @return validatorAddress
  **/
  @ApiModelProperty(example = "000001E443FD237E4B616E2FA69DF4EE3D49A94F", required = true, value = "")

  public String getValidatorAddress() {
    return validatorAddress;
  }


  public void setValidatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
  }


  public Commit validatorIndex(Integer validatorIndex) {
    
    this.validatorIndex = validatorIndex;
    return this;
  }

   /**
   * Get validatorIndex
   * @return validatorIndex
  **/
  @ApiModelProperty(example = "0", required = true, value = "")

  public Integer getValidatorIndex() {
    return validatorIndex;
  }


  public void setValidatorIndex(Integer validatorIndex) {
    this.validatorIndex = validatorIndex;
  }


  public Commit signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(example = "DBchvucTzAUEJnGYpNvMdqLhBAHG4Px8BsOBB3J3mAFCLGeuG7uJqy+nVngKzZdPhPi8RhmE/xcw/M9DOJjEDg==", required = true, value = "")

  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
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
    Commit commit = (Commit) o;
    return Objects.equals(this.type, commit.type) &&
        Objects.equals(this.height, commit.height) &&
        Objects.equals(this.round, commit.round) &&
        Objects.equals(this.blockId, commit.blockId) &&
        Objects.equals(this.timestamp, commit.timestamp) &&
        Objects.equals(this.validatorAddress, commit.validatorAddress) &&
        Objects.equals(this.validatorIndex, commit.validatorIndex) &&
        Objects.equals(this.signature, commit.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, height, round, blockId, timestamp, validatorAddress, validatorIndex, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commit {\n");
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

