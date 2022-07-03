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
import eu.frenchxcore.model.tendermint.openapi.DumpConsensusResponseResultPeers;
import eu.frenchxcore.model.tendermint.openapi.DumpConsensusResponseResultRoundState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DumpConsensusResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:08.580695600+02:00[Europe/Paris]")
public class DumpConsensusResponseResult {
  public static final String SERIALIZED_NAME_ROUND_STATE = "round_state";
  @SerializedName(SERIALIZED_NAME_ROUND_STATE)
  private DumpConsensusResponseResultRoundState roundState;

  public static final String SERIALIZED_NAME_PEERS = "peers";
  @SerializedName(SERIALIZED_NAME_PEERS)
  private List<DumpConsensusResponseResultPeers> peers = new ArrayList<DumpConsensusResponseResultPeers>();


  public DumpConsensusResponseResult roundState(DumpConsensusResponseResultRoundState roundState) {
    
    this.roundState = roundState;
    return this;
  }

   /**
   * Get roundState
   * @return roundState
  **/
  @ApiModelProperty(required = true, value = "")

  public DumpConsensusResponseResultRoundState getRoundState() {
    return roundState;
  }


  public void setRoundState(DumpConsensusResponseResultRoundState roundState) {
    this.roundState = roundState;
  }


  public DumpConsensusResponseResult peers(List<DumpConsensusResponseResultPeers> peers) {
    
    this.peers = peers;
    return this;
  }

  public DumpConsensusResponseResult addPeersItem(DumpConsensusResponseResultPeers peersItem) {
    this.peers.add(peersItem);
    return this;
  }

   /**
   * Get peers
   * @return peers
  **/
  @ApiModelProperty(required = true, value = "")

  public List<DumpConsensusResponseResultPeers> getPeers() {
    return peers;
  }


  public void setPeers(List<DumpConsensusResponseResultPeers> peers) {
    this.peers = peers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DumpConsensusResponseResult dumpConsensusResponseResult = (DumpConsensusResponseResult) o;
    return Objects.equals(this.roundState, dumpConsensusResponseResult.roundState) &&
        Objects.equals(this.peers, dumpConsensusResponseResult.peers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roundState, peers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DumpConsensusResponseResult {\n");
    sb.append("    roundState: ").append(toIndentedString(roundState)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
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

