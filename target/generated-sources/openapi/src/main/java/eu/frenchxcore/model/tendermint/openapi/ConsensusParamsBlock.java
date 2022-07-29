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
 * ConsensusParamsBlock
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:07.698929500+02:00[Europe/Paris]")
public class ConsensusParamsBlock {
  public static final String SERIALIZED_NAME_MAX_BYTES = "max_bytes";
  @SerializedName(SERIALIZED_NAME_MAX_BYTES)
  private String maxBytes;

  public static final String SERIALIZED_NAME_MAX_GAS = "max_gas";
  @SerializedName(SERIALIZED_NAME_MAX_GAS)
  private String maxGas;

  public static final String SERIALIZED_NAME_TIME_IOTA_MS = "time_iota_ms";
  @SerializedName(SERIALIZED_NAME_TIME_IOTA_MS)
  private String timeIotaMs;


  public ConsensusParamsBlock maxBytes(String maxBytes) {
    
    this.maxBytes = maxBytes;
    return this;
  }

   /**
   * Get maxBytes
   * @return maxBytes
  **/
  @ApiModelProperty(example = "22020096", required = true, value = "")

  public String getMaxBytes() {
    return maxBytes;
  }


  public void setMaxBytes(String maxBytes) {
    this.maxBytes = maxBytes;
  }


  public ConsensusParamsBlock maxGas(String maxGas) {
    
    this.maxGas = maxGas;
    return this;
  }

   /**
   * Get maxGas
   * @return maxGas
  **/
  @ApiModelProperty(example = "1000", required = true, value = "")

  public String getMaxGas() {
    return maxGas;
  }


  public void setMaxGas(String maxGas) {
    this.maxGas = maxGas;
  }


  public ConsensusParamsBlock timeIotaMs(String timeIotaMs) {
    
    this.timeIotaMs = timeIotaMs;
    return this;
  }

   /**
   * Get timeIotaMs
   * @return timeIotaMs
  **/
  @ApiModelProperty(example = "1000", required = true, value = "")

  public String getTimeIotaMs() {
    return timeIotaMs;
  }


  public void setTimeIotaMs(String timeIotaMs) {
    this.timeIotaMs = timeIotaMs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsensusParamsBlock consensusParamsBlock = (ConsensusParamsBlock) o;
    return Objects.equals(this.maxBytes, consensusParamsBlock.maxBytes) &&
        Objects.equals(this.maxGas, consensusParamsBlock.maxGas) &&
        Objects.equals(this.timeIotaMs, consensusParamsBlock.timeIotaMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxBytes, maxGas, timeIotaMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsensusParamsBlock {\n");
    sb.append("    maxBytes: ").append(toIndentedString(maxBytes)).append("\n");
    sb.append("    maxGas: ").append(toIndentedString(maxGas)).append("\n");
    sb.append("    timeIotaMs: ").append(toIndentedString(timeIotaMs)).append("\n");
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

