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
import eu.frenchxcore.model.tendermint.openapi.BlockResultsResponseResultEvents;
import eu.frenchxcore.model.tendermint.openapi.BlockResultsResponseResultTxsResults;
import eu.frenchxcore.model.tendermint.openapi.BlockResultsResponseResultValidatorUpdates;
import eu.frenchxcore.model.tendermint.openapi.ConsensusParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BlockResultsResponseResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:07.698929500+02:00[Europe/Paris]")
public class BlockResultsResponseResult {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_TXS_RESULTS = "txs_results";
  @SerializedName(SERIALIZED_NAME_TXS_RESULTS)
  private List<BlockResultsResponseResultTxsResults> txsResults = null;

  public static final String SERIALIZED_NAME_TOTAL_GAS_USED = "total_gas_used";
  @SerializedName(SERIALIZED_NAME_TOTAL_GAS_USED)
  private String totalGasUsed;

  public static final String SERIALIZED_NAME_BEGIN_BLOCK_EVENTS = "begin_block_events";
  @SerializedName(SERIALIZED_NAME_BEGIN_BLOCK_EVENTS)
  private List<BlockResultsResponseResultEvents> beginBlockEvents = null;

  public static final String SERIALIZED_NAME_END_BLOCK = "end_block";
  @SerializedName(SERIALIZED_NAME_END_BLOCK)
  private List<BlockResultsResponseResultEvents> endBlock = null;

  public static final String SERIALIZED_NAME_VALIDATOR_UPDATES = "validator_updates";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_UPDATES)
  private List<BlockResultsResponseResultValidatorUpdates> validatorUpdates = null;

  public static final String SERIALIZED_NAME_CONSENSUS_PARAMS_UPDATES = "consensus_params_updates";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_PARAMS_UPDATES)
  private ConsensusParams consensusParamsUpdates;


  public BlockResultsResponseResult height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "12", required = true, value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public BlockResultsResponseResult txsResults(List<BlockResultsResponseResultTxsResults> txsResults) {
    
    this.txsResults = txsResults;
    return this;
  }

  public BlockResultsResponseResult addTxsResultsItem(BlockResultsResponseResultTxsResults txsResultsItem) {
    if (this.txsResults == null) {
      this.txsResults = new ArrayList<BlockResultsResponseResultTxsResults>();
    }
    this.txsResults.add(txsResultsItem);
    return this;
  }

   /**
   * Get txsResults
   * @return txsResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BlockResultsResponseResultTxsResults> getTxsResults() {
    return txsResults;
  }


  public void setTxsResults(List<BlockResultsResponseResultTxsResults> txsResults) {
    this.txsResults = txsResults;
  }


  public BlockResultsResponseResult totalGasUsed(String totalGasUsed) {
    
    this.totalGasUsed = totalGasUsed;
    return this;
  }

   /**
   * Get totalGasUsed
   * @return totalGasUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "")

  public String getTotalGasUsed() {
    return totalGasUsed;
  }


  public void setTotalGasUsed(String totalGasUsed) {
    this.totalGasUsed = totalGasUsed;
  }


  public BlockResultsResponseResult beginBlockEvents(List<BlockResultsResponseResultEvents> beginBlockEvents) {
    
    this.beginBlockEvents = beginBlockEvents;
    return this;
  }

  public BlockResultsResponseResult addBeginBlockEventsItem(BlockResultsResponseResultEvents beginBlockEventsItem) {
    if (this.beginBlockEvents == null) {
      this.beginBlockEvents = new ArrayList<BlockResultsResponseResultEvents>();
    }
    this.beginBlockEvents.add(beginBlockEventsItem);
    return this;
  }

   /**
   * Get beginBlockEvents
   * @return beginBlockEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BlockResultsResponseResultEvents> getBeginBlockEvents() {
    return beginBlockEvents;
  }


  public void setBeginBlockEvents(List<BlockResultsResponseResultEvents> beginBlockEvents) {
    this.beginBlockEvents = beginBlockEvents;
  }


  public BlockResultsResponseResult endBlock(List<BlockResultsResponseResultEvents> endBlock) {
    
    this.endBlock = endBlock;
    return this;
  }

  public BlockResultsResponseResult addEndBlockItem(BlockResultsResponseResultEvents endBlockItem) {
    if (this.endBlock == null) {
      this.endBlock = new ArrayList<BlockResultsResponseResultEvents>();
    }
    this.endBlock.add(endBlockItem);
    return this;
  }

   /**
   * Get endBlock
   * @return endBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BlockResultsResponseResultEvents> getEndBlock() {
    return endBlock;
  }


  public void setEndBlock(List<BlockResultsResponseResultEvents> endBlock) {
    this.endBlock = endBlock;
  }


  public BlockResultsResponseResult validatorUpdates(List<BlockResultsResponseResultValidatorUpdates> validatorUpdates) {
    
    this.validatorUpdates = validatorUpdates;
    return this;
  }

  public BlockResultsResponseResult addValidatorUpdatesItem(BlockResultsResponseResultValidatorUpdates validatorUpdatesItem) {
    if (this.validatorUpdates == null) {
      this.validatorUpdates = new ArrayList<BlockResultsResponseResultValidatorUpdates>();
    }
    this.validatorUpdates.add(validatorUpdatesItem);
    return this;
  }

   /**
   * Get validatorUpdates
   * @return validatorUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BlockResultsResponseResultValidatorUpdates> getValidatorUpdates() {
    return validatorUpdates;
  }


  public void setValidatorUpdates(List<BlockResultsResponseResultValidatorUpdates> validatorUpdates) {
    this.validatorUpdates = validatorUpdates;
  }


  public BlockResultsResponseResult consensusParamsUpdates(ConsensusParams consensusParamsUpdates) {
    
    this.consensusParamsUpdates = consensusParamsUpdates;
    return this;
  }

   /**
   * Get consensusParamsUpdates
   * @return consensusParamsUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsensusParams getConsensusParamsUpdates() {
    return consensusParamsUpdates;
  }


  public void setConsensusParamsUpdates(ConsensusParams consensusParamsUpdates) {
    this.consensusParamsUpdates = consensusParamsUpdates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockResultsResponseResult blockResultsResponseResult = (BlockResultsResponseResult) o;
    return Objects.equals(this.height, blockResultsResponseResult.height) &&
        Objects.equals(this.txsResults, blockResultsResponseResult.txsResults) &&
        Objects.equals(this.totalGasUsed, blockResultsResponseResult.totalGasUsed) &&
        Objects.equals(this.beginBlockEvents, blockResultsResponseResult.beginBlockEvents) &&
        Objects.equals(this.endBlock, blockResultsResponseResult.endBlock) &&
        Objects.equals(this.validatorUpdates, blockResultsResponseResult.validatorUpdates) &&
        Objects.equals(this.consensusParamsUpdates, blockResultsResponseResult.consensusParamsUpdates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, txsResults, totalGasUsed, beginBlockEvents, endBlock, validatorUpdates, consensusParamsUpdates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockResultsResponseResult {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    txsResults: ").append(toIndentedString(txsResults)).append("\n");
    sb.append("    totalGasUsed: ").append(toIndentedString(totalGasUsed)).append("\n");
    sb.append("    beginBlockEvents: ").append(toIndentedString(beginBlockEvents)).append("\n");
    sb.append("    endBlock: ").append(toIndentedString(endBlock)).append("\n");
    sb.append("    validatorUpdates: ").append(toIndentedString(validatorUpdates)).append("\n");
    sb.append("    consensusParamsUpdates: ").append(toIndentedString(consensusParamsUpdates)).append("\n");
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

