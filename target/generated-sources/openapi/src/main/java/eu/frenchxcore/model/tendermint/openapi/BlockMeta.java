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
import eu.frenchxcore.model.tendermint.openapi.BlockHeader;
import eu.frenchxcore.model.tendermint.openapi.BlockID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BlockMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-12T09:17:53.421768900+02:00[Europe/Paris]")
public class BlockMeta {
  public static final String SERIALIZED_NAME_BLOCK_ID = "block_id";
  @SerializedName(SERIALIZED_NAME_BLOCK_ID)
  private BlockID blockId;

  public static final String SERIALIZED_NAME_BLOCK_SIZE = "block_size";
  @SerializedName(SERIALIZED_NAME_BLOCK_SIZE)
  private Integer blockSize;

  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private BlockHeader header;

  public static final String SERIALIZED_NAME_NUM_TXS = "num_txs";
  @SerializedName(SERIALIZED_NAME_NUM_TXS)
  private String numTxs;


  public BlockMeta blockId(BlockID blockId) {
    
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


  public BlockMeta blockSize(Integer blockSize) {
    
    this.blockSize = blockSize;
    return this;
  }

   /**
   * Get blockSize
   * @return blockSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000000", value = "")

  public Integer getBlockSize() {
    return blockSize;
  }


  public void setBlockSize(Integer blockSize) {
    this.blockSize = blockSize;
  }


  public BlockMeta header(BlockHeader header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockHeader getHeader() {
    return header;
  }


  public void setHeader(BlockHeader header) {
    this.header = header;
  }


  public BlockMeta numTxs(String numTxs) {
    
    this.numTxs = numTxs;
    return this;
  }

   /**
   * Get numTxs
   * @return numTxs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "54", value = "")

  public String getNumTxs() {
    return numTxs;
  }


  public void setNumTxs(String numTxs) {
    this.numTxs = numTxs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockMeta blockMeta = (BlockMeta) o;
    return Objects.equals(this.blockId, blockMeta.blockId) &&
        Objects.equals(this.blockSize, blockMeta.blockSize) &&
        Objects.equals(this.header, blockMeta.header) &&
        Objects.equals(this.numTxs, blockMeta.numTxs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockId, blockSize, header, numTxs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockMeta {\n");
    sb.append("    blockId: ").append(toIndentedString(blockId)).append("\n");
    sb.append("    blockSize: ").append(toIndentedString(blockSize)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    numTxs: ").append(toIndentedString(numTxs)).append("\n");
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

