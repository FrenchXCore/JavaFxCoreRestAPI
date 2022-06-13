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
import eu.frenchxcore.model.tendermint.openapi.ConsensusParams;
import eu.frenchxcore.model.tendermint.openapi.GenesisResponseResultGenesisValidators;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GenesisResponseResultGenesis
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-12T09:17:53.421768900+02:00[Europe/Paris]")
public class GenesisResponseResultGenesis {
  public static final String SERIALIZED_NAME_GENESIS_TIME = "genesis_time";
  @SerializedName(SERIALIZED_NAME_GENESIS_TIME)
  private String genesisTime;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_INITIAL_HEIGHT = "initial_height";
  @SerializedName(SERIALIZED_NAME_INITIAL_HEIGHT)
  private String initialHeight;

  public static final String SERIALIZED_NAME_CONSENSUS_PARAMS = "consensus_params";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_PARAMS)
  private ConsensusParams consensusParams;

  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<GenesisResponseResultGenesisValidators> validators = new ArrayList<GenesisResponseResultGenesisValidators>();

  public static final String SERIALIZED_NAME_APP_HASH = "app_hash";
  @SerializedName(SERIALIZED_NAME_APP_HASH)
  private String appHash;

  public static final String SERIALIZED_NAME_APP_STATE = "app_state";
  @SerializedName(SERIALIZED_NAME_APP_STATE)
  private Object appState;


  public GenesisResponseResultGenesis genesisTime(String genesisTime) {
    
    this.genesisTime = genesisTime;
    return this;
  }

   /**
   * Get genesisTime
   * @return genesisTime
  **/
  @ApiModelProperty(example = "2019-04-22T17:00:00Z", required = true, value = "")

  public String getGenesisTime() {
    return genesisTime;
  }


  public void setGenesisTime(String genesisTime) {
    this.genesisTime = genesisTime;
  }


  public GenesisResponseResultGenesis chainId(String chainId) {
    
    this.chainId = chainId;
    return this;
  }

   /**
   * Get chainId
   * @return chainId
  **/
  @ApiModelProperty(example = "cosmoshub-2", required = true, value = "")

  public String getChainId() {
    return chainId;
  }


  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public GenesisResponseResultGenesis initialHeight(String initialHeight) {
    
    this.initialHeight = initialHeight;
    return this;
  }

   /**
   * Get initialHeight
   * @return initialHeight
  **/
  @ApiModelProperty(example = "2", required = true, value = "")

  public String getInitialHeight() {
    return initialHeight;
  }


  public void setInitialHeight(String initialHeight) {
    this.initialHeight = initialHeight;
  }


  public GenesisResponseResultGenesis consensusParams(ConsensusParams consensusParams) {
    
    this.consensusParams = consensusParams;
    return this;
  }

   /**
   * Get consensusParams
   * @return consensusParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ConsensusParams getConsensusParams() {
    return consensusParams;
  }


  public void setConsensusParams(ConsensusParams consensusParams) {
    this.consensusParams = consensusParams;
  }


  public GenesisResponseResultGenesis validators(List<GenesisResponseResultGenesisValidators> validators) {
    
    this.validators = validators;
    return this;
  }

  public GenesisResponseResultGenesis addValidatorsItem(GenesisResponseResultGenesisValidators validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @ApiModelProperty(required = true, value = "")

  public List<GenesisResponseResultGenesisValidators> getValidators() {
    return validators;
  }


  public void setValidators(List<GenesisResponseResultGenesisValidators> validators) {
    this.validators = validators;
  }


  public GenesisResponseResultGenesis appHash(String appHash) {
    
    this.appHash = appHash;
    return this;
  }

   /**
   * Get appHash
   * @return appHash
  **/
  @ApiModelProperty(example = "", required = true, value = "")

  public String getAppHash() {
    return appHash;
  }


  public void setAppHash(String appHash) {
    this.appHash = appHash;
  }


  public GenesisResponseResultGenesis appState(Object appState) {
    
    this.appState = appState;
    return this;
  }

   /**
   * Get appState
   * @return appState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAppState() {
    return appState;
  }


  public void setAppState(Object appState) {
    this.appState = appState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenesisResponseResultGenesis genesisResponseResultGenesis = (GenesisResponseResultGenesis) o;
    return Objects.equals(this.genesisTime, genesisResponseResultGenesis.genesisTime) &&
        Objects.equals(this.chainId, genesisResponseResultGenesis.chainId) &&
        Objects.equals(this.initialHeight, genesisResponseResultGenesis.initialHeight) &&
        Objects.equals(this.consensusParams, genesisResponseResultGenesis.consensusParams) &&
        Objects.equals(this.validators, genesisResponseResultGenesis.validators) &&
        Objects.equals(this.appHash, genesisResponseResultGenesis.appHash) &&
        Objects.equals(this.appState, genesisResponseResultGenesis.appState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(genesisTime, chainId, initialHeight, consensusParams, validators, appHash, appState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenesisResponseResultGenesis {\n");
    sb.append("    genesisTime: ").append(toIndentedString(genesisTime)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    initialHeight: ").append(toIndentedString(initialHeight)).append("\n");
    sb.append("    consensusParams: ").append(toIndentedString(consensusParams)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    appHash: ").append(toIndentedString(appHash)).append("\n");
    sb.append("    appState: ").append(toIndentedString(appState)).append("\n");
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

