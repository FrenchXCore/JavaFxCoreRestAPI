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
import eu.frenchxcore.model.tendermint.openapi.Commit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BlockLastCommit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:21.538516500+02:00[Europe/Paris]")
public class BlockLastCommit {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_ROUND = "round";
  @SerializedName(SERIALIZED_NAME_ROUND)
  private Integer round;

  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private BlockID blockId;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<Commit> signatures = null;


  public BlockLastCommit height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public BlockLastCommit round(Integer round) {
    
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


  public BlockLastCommit blockId(BlockID blockId) {
    
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


  public BlockLastCommit signatures(List<Commit> signatures) {
    
    this.signatures = signatures;
    return this;
  }

  public BlockLastCommit addSignaturesItem(Commit signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<Commit>();
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

  public List<Commit> getSignatures() {
    return signatures;
  }


  public void setSignatures(List<Commit> signatures) {
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
    BlockLastCommit blockLastCommit = (BlockLastCommit) o;
    return Objects.equals(this.height, blockLastCommit.height) &&
        Objects.equals(this.round, blockLastCommit.round) &&
        Objects.equals(this.blockId, blockLastCommit.blockId) &&
        Objects.equals(this.signatures, blockLastCommit.signatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, round, blockId, signatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockLastCommit {\n");
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

