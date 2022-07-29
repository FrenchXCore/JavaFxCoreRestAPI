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
import eu.frenchxcore.model.tendermint.openapi.BlockLastCommit;
import eu.frenchxcore.model.tendermint.openapi.Evidence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Block
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:09.914489900+02:00[Europe/Paris]")
public class Block {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private BlockHeader header;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<String> data = null;

  public static final String SERIALIZED_NAME_EVIDENCE = "evidence";
  @SerializedName(SERIALIZED_NAME_EVIDENCE)
  private List<Evidence> evidence = null;

  public static final String SERIALIZED_NAME_LAST_COMMIT = "last_commit";
  @SerializedName(SERIALIZED_NAME_LAST_COMMIT)
  private BlockLastCommit lastCommit;


  public Block header(BlockHeader header) {
    
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


  public Block data(List<String> data) {
    
    this.data = data;
    return this;
  }

  public Block addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<String>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getData() {
    return data;
  }


  public void setData(List<String> data) {
    this.data = data;
  }


  public Block evidence(List<Evidence> evidence) {
    
    this.evidence = evidence;
    return this;
  }

  public Block addEvidenceItem(Evidence evidenceItem) {
    if (this.evidence == null) {
      this.evidence = new ArrayList<Evidence>();
    }
    this.evidence.add(evidenceItem);
    return this;
  }

   /**
   * Get evidence
   * @return evidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Evidence> getEvidence() {
    return evidence;
  }


  public void setEvidence(List<Evidence> evidence) {
    this.evidence = evidence;
  }


  public Block lastCommit(BlockLastCommit lastCommit) {
    
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlockLastCommit getLastCommit() {
    return lastCommit;
  }


  public void setLastCommit(BlockLastCommit lastCommit) {
    this.lastCommit = lastCommit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Block block = (Block) o;
    return Objects.equals(this.header, block.header) &&
        Objects.equals(this.data, block.data) &&
        Objects.equals(this.evidence, block.evidence) &&
        Objects.equals(this.lastCommit, block.lastCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, data, evidence, lastCommit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Block {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
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

