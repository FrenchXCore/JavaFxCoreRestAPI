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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CommitResponseResultSignedHeaderCommitSignatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:27.992268300+02:00[Europe/Paris]")
public class CommitResponseResultSignedHeaderCommitSignatures {
  public static final String SERIALIZED_NAME_BLOCK_ID_FLAG = "block_id_flag";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID_FLAG)
  private Integer blockIdFlag;

  public static final String SERIALIZED_NAME_VALIDATOR_ADDRESS = "validator_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ADDRESS)
  private String validatorAddress;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature;


  public CommitResponseResultSignedHeaderCommitSignatures blockIdFlag(Integer blockIdFlag) {
    
    this.blockIdFlag = blockIdFlag;
    return this;
  }

   /**
   * Get blockIdFlag
   * @return blockIdFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getBlockIdFlag() {
    return blockIdFlag;
  }


  public void setBlockIdFlag(Integer blockIdFlag) {
    this.blockIdFlag = blockIdFlag;
  }


  public CommitResponseResultSignedHeaderCommitSignatures validatorAddress(String validatorAddress) {
    
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * Get validatorAddress
   * @return validatorAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000001E443FD237E4B616E2FA69DF4EE3D49A94F", value = "")

  public String getValidatorAddress() {
    return validatorAddress;
  }


  public void setValidatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
  }


  public CommitResponseResultSignedHeaderCommitSignatures timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-04-22T17:01:58.376629719Z", value = "")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public CommitResponseResultSignedHeaderCommitSignatures signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "14jaTQXYRt8kbLKEhdHq7AXycrFImiLuZx50uOjs2+Zv+2i7RTG/jnObD07Jo2ubZ8xd7bNBJMqkgtkd0oQHAw==", value = "")

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
    CommitResponseResultSignedHeaderCommitSignatures commitResponseResultSignedHeaderCommitSignatures = (CommitResponseResultSignedHeaderCommitSignatures) o;
    return Objects.equals(this.blockIdFlag, commitResponseResultSignedHeaderCommitSignatures.blockIdFlag) &&
        Objects.equals(this.validatorAddress, commitResponseResultSignedHeaderCommitSignatures.validatorAddress) &&
        Objects.equals(this.timestamp, commitResponseResultSignedHeaderCommitSignatures.timestamp) &&
        Objects.equals(this.signature, commitResponseResultSignedHeaderCommitSignatures.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockIdFlag, validatorAddress, timestamp, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitResponseResultSignedHeaderCommitSignatures {\n");
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

