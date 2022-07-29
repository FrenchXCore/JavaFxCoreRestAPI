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
import eu.frenchxcore.model.tendermint.openapi.BroadcastTxCommitResponseResultDeliverTx;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BroadcastTxCommitResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:09.914489900+02:00[Europe/Paris]")
public class BroadcastTxCommitResponseResult {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_HASH = "hash";
  @SerializedName(SERIALIZED_NAME_HASH)
  private String hash;

  public static final String SERIALIZED_NAME_DELIVER_TX = "deliver_tx";
  @SerializedName(SERIALIZED_NAME_DELIVER_TX)
  private BroadcastTxCommitResponseResultDeliverTx deliverTx;

  public static final String SERIALIZED_NAME_CHECK_TX = "check_tx";
  @SerializedName(SERIALIZED_NAME_CHECK_TX)
  private BroadcastTxCommitResponseResultDeliverTx checkTx;


  public BroadcastTxCommitResponseResult height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "26682", required = true, value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public BroadcastTxCommitResponseResult hash(String hash) {
    
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
  @ApiModelProperty(example = "75CA0F856A4DA078FC4911580360E70CEFB2EBEE", required = true, value = "")

  public String getHash() {
    return hash;
  }


  public void setHash(String hash) {
    this.hash = hash;
  }


  public BroadcastTxCommitResponseResult deliverTx(BroadcastTxCommitResponseResultDeliverTx deliverTx) {
    
    this.deliverTx = deliverTx;
    return this;
  }

   /**
   * Get deliverTx
   * @return deliverTx
  **/
  @ApiModelProperty(required = true, value = "")

  public BroadcastTxCommitResponseResultDeliverTx getDeliverTx() {
    return deliverTx;
  }


  public void setDeliverTx(BroadcastTxCommitResponseResultDeliverTx deliverTx) {
    this.deliverTx = deliverTx;
  }


  public BroadcastTxCommitResponseResult checkTx(BroadcastTxCommitResponseResultDeliverTx checkTx) {
    
    this.checkTx = checkTx;
    return this;
  }

   /**
   * Get checkTx
   * @return checkTx
  **/
  @ApiModelProperty(required = true, value = "")

  public BroadcastTxCommitResponseResultDeliverTx getCheckTx() {
    return checkTx;
  }


  public void setCheckTx(BroadcastTxCommitResponseResultDeliverTx checkTx) {
    this.checkTx = checkTx;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTxCommitResponseResult broadcastTxCommitResponseResult = (BroadcastTxCommitResponseResult) o;
    return Objects.equals(this.height, broadcastTxCommitResponseResult.height) &&
        Objects.equals(this.hash, broadcastTxCommitResponseResult.hash) &&
        Objects.equals(this.deliverTx, broadcastTxCommitResponseResult.deliverTx) &&
        Objects.equals(this.checkTx, broadcastTxCommitResponseResult.checkTx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, hash, deliverTx, checkTx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTxCommitResponseResult {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    deliverTx: ").append(toIndentedString(deliverTx)).append("\n");
    sb.append("    checkTx: ").append(toIndentedString(checkTx)).append("\n");
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

