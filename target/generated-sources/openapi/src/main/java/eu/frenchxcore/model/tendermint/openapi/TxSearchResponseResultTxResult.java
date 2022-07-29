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
import eu.frenchxcore.model.tendermint.openapi.Event;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TxSearchResponseResultTxResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:09.914489900+02:00[Europe/Paris]")
public class TxSearchResponseResultTxResult {
  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private String log;

  public static final String SERIALIZED_NAME_GAS_WANTED = "gas_wanted";
  @SerializedName(SERIALIZED_NAME_GAS_WANTED)
  private String gasWanted;

  public static final String SERIALIZED_NAME_GAS_USED = "gas_used";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private Event tags;


  public TxSearchResponseResultTxResult log(String log) {
    
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @ApiModelProperty(example = "[{\"msg_index\":\"0\",\"success\":true,\"log\":\"\"}]", required = true, value = "")

  public String getLog() {
    return log;
  }


  public void setLog(String log) {
    this.log = log;
  }


  public TxSearchResponseResultTxResult gasWanted(String gasWanted) {
    
    this.gasWanted = gasWanted;
    return this;
  }

   /**
   * Get gasWanted
   * @return gasWanted
  **/
  @ApiModelProperty(example = "200000", required = true, value = "")

  public String getGasWanted() {
    return gasWanted;
  }


  public void setGasWanted(String gasWanted) {
    this.gasWanted = gasWanted;
  }


  public TxSearchResponseResultTxResult gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * Get gasUsed
   * @return gasUsed
  **/
  @ApiModelProperty(example = "28596", required = true, value = "")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  public TxSearchResponseResultTxResult tags(Event tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(required = true, value = "")

  public Event getTags() {
    return tags;
  }


  public void setTags(Event tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxSearchResponseResultTxResult txSearchResponseResultTxResult = (TxSearchResponseResultTxResult) o;
    return Objects.equals(this.log, txSearchResponseResultTxResult.log) &&
        Objects.equals(this.gasWanted, txSearchResponseResultTxResult.gasWanted) &&
        Objects.equals(this.gasUsed, txSearchResponseResultTxResult.gasUsed) &&
        Objects.equals(this.tags, txSearchResponseResultTxResult.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(log, gasWanted, gasUsed, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxSearchResponseResultTxResult {\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    gasWanted: ").append(toIndentedString(gasWanted)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

