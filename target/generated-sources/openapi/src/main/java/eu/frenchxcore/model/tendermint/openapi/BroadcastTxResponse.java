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
import eu.frenchxcore.model.tendermint.openapi.BroadcastTxResponseResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BroadcastTxResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:27.992268300+02:00[Europe/Paris]")
public class BroadcastTxResponse {
  public static final String SERIALIZED_NAME_JSONRPC = "jsonrpc";
  @SerializedName(SERIALIZED_NAME_JSONRPC)
  private String jsonrpc;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private BroadcastTxResponseResult result;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;


  public BroadcastTxResponse jsonrpc(String jsonrpc) {
    
    this.jsonrpc = jsonrpc;
    return this;
  }

   /**
   * Get jsonrpc
   * @return jsonrpc
  **/
  @ApiModelProperty(example = "2.0", required = true, value = "")

  public String getJsonrpc() {
    return jsonrpc;
  }


  public void setJsonrpc(String jsonrpc) {
    this.jsonrpc = jsonrpc;
  }


  public BroadcastTxResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "0", required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public BroadcastTxResponse result(BroadcastTxResponseResult result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(required = true, value = "")

  public BroadcastTxResponseResult getResult() {
    return result;
  }


  public void setResult(BroadcastTxResponseResult result) {
    this.result = result;
  }


  public BroadcastTxResponse error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(example = "", required = true, value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BroadcastTxResponse broadcastTxResponse = (BroadcastTxResponse) o;
    return Objects.equals(this.jsonrpc, broadcastTxResponse.jsonrpc) &&
        Objects.equals(this.id, broadcastTxResponse.id) &&
        Objects.equals(this.result, broadcastTxResponse.result) &&
        Objects.equals(this.error, broadcastTxResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonrpc, id, result, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BroadcastTxResponse {\n");
    sb.append("    jsonrpc: ").append(toIndentedString(jsonrpc)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

