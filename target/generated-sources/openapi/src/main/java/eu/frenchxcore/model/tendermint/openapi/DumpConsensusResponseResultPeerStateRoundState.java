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
import eu.frenchxcore.model.tendermint.openapi.DumpConsensusResponseResultPeerStateRoundStateProposalBlockPartsHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DumpConsensusResponseResultPeerStateRoundState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:27.992268300+02:00[Europe/Paris]")
public class DumpConsensusResponseResultPeerStateRoundState {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_ROUND = "round";
  @SerializedName(SERIALIZED_NAME_ROUND)
  private String round;

  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private Integer step;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_PROPOSAL = "proposal";
  @SerializedName(SERIALIZED_NAME_PROPOSAL)
  private Boolean proposal;

  public static final String SERIALIZED_NAME_PROPOSAL_BLOCK_PARTS_HEADER = "proposal_block_parts_header";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_BLOCK_PARTS_HEADER)
  private DumpConsensusResponseResultPeerStateRoundStateProposalBlockPartsHeader proposalBlockPartsHeader;

  public static final String SERIALIZED_NAME_PROPOSAL_POL_ROUND = "proposal_pol_round";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_POL_ROUND)
  private Integer proposalPolRound;

  public static final String SERIALIZED_NAME_PROPOSAL_POL = "proposal_pol";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_POL)
  private String proposalPol;

  public static final String SERIALIZED_NAME_PREVOTES = "prevotes";
  @SerializedName(SERIALIZED_NAME_PREVOTES)
  private String prevotes;

  public static final String SERIALIZED_NAME_PRECOMMITS = "precommits";
  @SerializedName(SERIALIZED_NAME_PRECOMMITS)
  private String precommits;

  public static final String SERIALIZED_NAME_LAST_COMMIT_ROUND = "last_commit_round";
  @SerializedName(SERIALIZED_NAME_LAST_COMMIT_ROUND)
  private Integer lastCommitRound;

  public static final String SERIALIZED_NAME_LAST_COMMIT = "last_commit";
  @SerializedName(SERIALIZED_NAME_LAST_COMMIT)
  private String lastCommit;

  public static final String SERIALIZED_NAME_CATCHUP_COMMIT_ROUND = "catchup_commit_round";
  @SerializedName(SERIALIZED_NAME_CATCHUP_COMMIT_ROUND)
  private Integer catchupCommitRound;

  public static final String SERIALIZED_NAME_CATCHUP_COMMIT = "catchup_commit";
  @SerializedName(SERIALIZED_NAME_CATCHUP_COMMIT)
  private String catchupCommit;


  public DumpConsensusResponseResultPeerStateRoundState height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "1311801", required = true, value = "")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public DumpConsensusResponseResultPeerStateRoundState round(String round) {
    
    this.round = round;
    return this;
  }

   /**
   * Get round
   * @return round
  **/
  @ApiModelProperty(example = "0", required = true, value = "")

  public String getRound() {
    return round;
  }


  public void setRound(String round) {
    this.round = round;
  }


  public DumpConsensusResponseResultPeerStateRoundState step(Integer step) {
    
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @ApiModelProperty(example = "3", required = true, value = "")

  public Integer getStep() {
    return step;
  }


  public void setStep(Integer step) {
    this.step = step;
  }


  public DumpConsensusResponseResultPeerStateRoundState startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(example = "2019-08-05T11:28:49.21730864Z", required = true, value = "")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public DumpConsensusResponseResultPeerStateRoundState proposal(Boolean proposal) {
    
    this.proposal = proposal;
    return this;
  }

   /**
   * Get proposal
   * @return proposal
  **/
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getProposal() {
    return proposal;
  }


  public void setProposal(Boolean proposal) {
    this.proposal = proposal;
  }


  public DumpConsensusResponseResultPeerStateRoundState proposalBlockPartsHeader(DumpConsensusResponseResultPeerStateRoundStateProposalBlockPartsHeader proposalBlockPartsHeader) {
    
    this.proposalBlockPartsHeader = proposalBlockPartsHeader;
    return this;
  }

   /**
   * Get proposalBlockPartsHeader
   * @return proposalBlockPartsHeader
  **/
  @ApiModelProperty(required = true, value = "")

  public DumpConsensusResponseResultPeerStateRoundStateProposalBlockPartsHeader getProposalBlockPartsHeader() {
    return proposalBlockPartsHeader;
  }


  public void setProposalBlockPartsHeader(DumpConsensusResponseResultPeerStateRoundStateProposalBlockPartsHeader proposalBlockPartsHeader) {
    this.proposalBlockPartsHeader = proposalBlockPartsHeader;
  }


  public DumpConsensusResponseResultPeerStateRoundState proposalPolRound(Integer proposalPolRound) {
    
    this.proposalPolRound = proposalPolRound;
    return this;
  }

   /**
   * Get proposalPolRound
   * @return proposalPolRound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1", required = true, value = "")

  public Integer getProposalPolRound() {
    return proposalPolRound;
  }


  public void setProposalPolRound(Integer proposalPolRound) {
    this.proposalPolRound = proposalPolRound;
  }


  public DumpConsensusResponseResultPeerStateRoundState proposalPol(String proposalPol) {
    
    this.proposalPol = proposalPol;
    return this;
  }

   /**
   * Get proposalPol
   * @return proposalPol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "____________________________________________________________________________________________________", required = true, value = "")

  public String getProposalPol() {
    return proposalPol;
  }


  public void setProposalPol(String proposalPol) {
    this.proposalPol = proposalPol;
  }


  public DumpConsensusResponseResultPeerStateRoundState prevotes(String prevotes) {
    
    this.prevotes = prevotes;
    return this;
  }

   /**
   * Get prevotes
   * @return prevotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "___________________x________________________________________________________________________________", required = true, value = "")

  public String getPrevotes() {
    return prevotes;
  }


  public void setPrevotes(String prevotes) {
    this.prevotes = prevotes;
  }


  public DumpConsensusResponseResultPeerStateRoundState precommits(String precommits) {
    
    this.precommits = precommits;
    return this;
  }

   /**
   * Get precommits
   * @return precommits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "____________________________________________________________________________________________________", required = true, value = "")

  public String getPrecommits() {
    return precommits;
  }


  public void setPrecommits(String precommits) {
    this.precommits = precommits;
  }


  public DumpConsensusResponseResultPeerStateRoundState lastCommitRound(Integer lastCommitRound) {
    
    this.lastCommitRound = lastCommitRound;
    return this;
  }

   /**
   * Get lastCommitRound
   * @return lastCommitRound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", required = true, value = "")

  public Integer getLastCommitRound() {
    return lastCommitRound;
  }


  public void setLastCommitRound(Integer lastCommitRound) {
    this.lastCommitRound = lastCommitRound;
  }


  public DumpConsensusResponseResultPeerStateRoundState lastCommit(String lastCommit) {
    
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx", required = true, value = "")

  public String getLastCommit() {
    return lastCommit;
  }


  public void setLastCommit(String lastCommit) {
    this.lastCommit = lastCommit;
  }


  public DumpConsensusResponseResultPeerStateRoundState catchupCommitRound(Integer catchupCommitRound) {
    
    this.catchupCommitRound = catchupCommitRound;
    return this;
  }

   /**
   * Get catchupCommitRound
   * @return catchupCommitRound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1", required = true, value = "")

  public Integer getCatchupCommitRound() {
    return catchupCommitRound;
  }


  public void setCatchupCommitRound(Integer catchupCommitRound) {
    this.catchupCommitRound = catchupCommitRound;
  }


  public DumpConsensusResponseResultPeerStateRoundState catchupCommit(String catchupCommit) {
    
    this.catchupCommit = catchupCommit;
    return this;
  }

   /**
   * Get catchupCommit
   * @return catchupCommit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "____________________________________________________________________________________________________", required = true, value = "")

  public String getCatchupCommit() {
    return catchupCommit;
  }


  public void setCatchupCommit(String catchupCommit) {
    this.catchupCommit = catchupCommit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DumpConsensusResponseResultPeerStateRoundState dumpConsensusResponseResultPeerStateRoundState = (DumpConsensusResponseResultPeerStateRoundState) o;
    return Objects.equals(this.height, dumpConsensusResponseResultPeerStateRoundState.height) &&
        Objects.equals(this.round, dumpConsensusResponseResultPeerStateRoundState.round) &&
        Objects.equals(this.step, dumpConsensusResponseResultPeerStateRoundState.step) &&
        Objects.equals(this.startTime, dumpConsensusResponseResultPeerStateRoundState.startTime) &&
        Objects.equals(this.proposal, dumpConsensusResponseResultPeerStateRoundState.proposal) &&
        Objects.equals(this.proposalBlockPartsHeader, dumpConsensusResponseResultPeerStateRoundState.proposalBlockPartsHeader) &&
        Objects.equals(this.proposalPolRound, dumpConsensusResponseResultPeerStateRoundState.proposalPolRound) &&
        Objects.equals(this.proposalPol, dumpConsensusResponseResultPeerStateRoundState.proposalPol) &&
        Objects.equals(this.prevotes, dumpConsensusResponseResultPeerStateRoundState.prevotes) &&
        Objects.equals(this.precommits, dumpConsensusResponseResultPeerStateRoundState.precommits) &&
        Objects.equals(this.lastCommitRound, dumpConsensusResponseResultPeerStateRoundState.lastCommitRound) &&
        Objects.equals(this.lastCommit, dumpConsensusResponseResultPeerStateRoundState.lastCommit) &&
        Objects.equals(this.catchupCommitRound, dumpConsensusResponseResultPeerStateRoundState.catchupCommitRound) &&
        Objects.equals(this.catchupCommit, dumpConsensusResponseResultPeerStateRoundState.catchupCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, round, step, startTime, proposal, proposalBlockPartsHeader, proposalPolRound, proposalPol, prevotes, precommits, lastCommitRound, lastCommit, catchupCommitRound, catchupCommit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DumpConsensusResponseResultPeerStateRoundState {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    proposal: ").append(toIndentedString(proposal)).append("\n");
    sb.append("    proposalBlockPartsHeader: ").append(toIndentedString(proposalBlockPartsHeader)).append("\n");
    sb.append("    proposalPolRound: ").append(toIndentedString(proposalPolRound)).append("\n");
    sb.append("    proposalPol: ").append(toIndentedString(proposalPol)).append("\n");
    sb.append("    prevotes: ").append(toIndentedString(prevotes)).append("\n");
    sb.append("    precommits: ").append(toIndentedString(precommits)).append("\n");
    sb.append("    lastCommitRound: ").append(toIndentedString(lastCommitRound)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
    sb.append("    catchupCommitRound: ").append(toIndentedString(catchupCommitRound)).append("\n");
    sb.append("    catchupCommit: ").append(toIndentedString(catchupCommit)).append("\n");
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

