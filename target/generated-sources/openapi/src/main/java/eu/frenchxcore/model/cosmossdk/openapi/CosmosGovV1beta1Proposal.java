/*
 * Cosmos SDK - gRPC Gateway docs
 * A REST interface for state queries
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package eu.frenchxcore.model.cosmossdk.openapi;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20027FinalTallyResult;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse2003Balances;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Accounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Proposal defines the core field members of a governance proposal.
 */
@ApiModel(description = "Proposal defines the core field members of a governance proposal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosGovV1beta1Proposal {
  public static final String SERIALIZED_NAME_PROPOSAL_ID = "proposal_id";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_ID)
  private String proposalId;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private InlineResponse200Accounts content;

  /**
   * ProposalStatus enumerates the valid statuses of a proposal.   - PROPOSAL_STATUS_UNSPECIFIED: PROPOSAL_STATUS_UNSPECIFIED defines the default propopsal status.  - PROPOSAL_STATUS_DEPOSIT_PERIOD: PROPOSAL_STATUS_DEPOSIT_PERIOD defines a proposal status during the deposit period.  - PROPOSAL_STATUS_VOTING_PERIOD: PROPOSAL_STATUS_VOTING_PERIOD defines a proposal status during the voting period.  - PROPOSAL_STATUS_PASSED: PROPOSAL_STATUS_PASSED defines a proposal status of a proposal that has passed.  - PROPOSAL_STATUS_REJECTED: PROPOSAL_STATUS_REJECTED defines a proposal status of a proposal that has been rejected.  - PROPOSAL_STATUS_FAILED: PROPOSAL_STATUS_FAILED defines a proposal status of a proposal that has failed.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNSPECIFIED("PROPOSAL_STATUS_UNSPECIFIED"),
    
    DEPOSIT_PERIOD("PROPOSAL_STATUS_DEPOSIT_PERIOD"),
    
    VOTING_PERIOD("PROPOSAL_STATUS_VOTING_PERIOD"),
    
    PASSED("PROPOSAL_STATUS_PASSED"),
    
    REJECTED("PROPOSAL_STATUS_REJECTED"),
    
    FAILED("PROPOSAL_STATUS_FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.UNSPECIFIED;

  public static final String SERIALIZED_NAME_FINAL_TALLY_RESULT = "final_tally_result";
  @SerializedName(SERIALIZED_NAME_FINAL_TALLY_RESULT)
  private InlineResponse20027FinalTallyResult finalTallyResult;

  public static final String SERIALIZED_NAME_SUBMIT_TIME = "submit_time";
  @SerializedName(SERIALIZED_NAME_SUBMIT_TIME)
  private OffsetDateTime submitTime;

  public static final String SERIALIZED_NAME_DEPOSIT_END_TIME = "deposit_end_time";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_END_TIME)
  private OffsetDateTime depositEndTime;

  public static final String SERIALIZED_NAME_TOTAL_DEPOSIT = "total_deposit";
  @SerializedName(SERIALIZED_NAME_TOTAL_DEPOSIT)
  private List<InlineResponse2003Balances> totalDeposit = null;

  public static final String SERIALIZED_NAME_VOTING_START_TIME = "voting_start_time";
  @SerializedName(SERIALIZED_NAME_VOTING_START_TIME)
  private OffsetDateTime votingStartTime;

  public static final String SERIALIZED_NAME_VOTING_END_TIME = "voting_end_time";
  @SerializedName(SERIALIZED_NAME_VOTING_END_TIME)
  private OffsetDateTime votingEndTime;


  public CosmosGovV1beta1Proposal proposalId(String proposalId) {
    
    this.proposalId = proposalId;
    return this;
  }

   /**
   * Get proposalId
   * @return proposalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProposalId() {
    return proposalId;
  }


  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }


  public CosmosGovV1beta1Proposal content(InlineResponse200Accounts content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200Accounts getContent() {
    return content;
  }


  public void setContent(InlineResponse200Accounts content) {
    this.content = content;
  }


  public CosmosGovV1beta1Proposal status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * ProposalStatus enumerates the valid statuses of a proposal.   - PROPOSAL_STATUS_UNSPECIFIED: PROPOSAL_STATUS_UNSPECIFIED defines the default propopsal status.  - PROPOSAL_STATUS_DEPOSIT_PERIOD: PROPOSAL_STATUS_DEPOSIT_PERIOD defines a proposal status during the deposit period.  - PROPOSAL_STATUS_VOTING_PERIOD: PROPOSAL_STATUS_VOTING_PERIOD defines a proposal status during the voting period.  - PROPOSAL_STATUS_PASSED: PROPOSAL_STATUS_PASSED defines a proposal status of a proposal that has passed.  - PROPOSAL_STATUS_REJECTED: PROPOSAL_STATUS_REJECTED defines a proposal status of a proposal that has been rejected.  - PROPOSAL_STATUS_FAILED: PROPOSAL_STATUS_FAILED defines a proposal status of a proposal that has failed.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ProposalStatus enumerates the valid statuses of a proposal.   - PROPOSAL_STATUS_UNSPECIFIED: PROPOSAL_STATUS_UNSPECIFIED defines the default propopsal status.  - PROPOSAL_STATUS_DEPOSIT_PERIOD: PROPOSAL_STATUS_DEPOSIT_PERIOD defines a proposal status during the deposit period.  - PROPOSAL_STATUS_VOTING_PERIOD: PROPOSAL_STATUS_VOTING_PERIOD defines a proposal status during the voting period.  - PROPOSAL_STATUS_PASSED: PROPOSAL_STATUS_PASSED defines a proposal status of a proposal that has passed.  - PROPOSAL_STATUS_REJECTED: PROPOSAL_STATUS_REJECTED defines a proposal status of a proposal that has been rejected.  - PROPOSAL_STATUS_FAILED: PROPOSAL_STATUS_FAILED defines a proposal status of a proposal that has failed.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public CosmosGovV1beta1Proposal finalTallyResult(InlineResponse20027FinalTallyResult finalTallyResult) {
    
    this.finalTallyResult = finalTallyResult;
    return this;
  }

   /**
   * Get finalTallyResult
   * @return finalTallyResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20027FinalTallyResult getFinalTallyResult() {
    return finalTallyResult;
  }


  public void setFinalTallyResult(InlineResponse20027FinalTallyResult finalTallyResult) {
    this.finalTallyResult = finalTallyResult;
  }


  public CosmosGovV1beta1Proposal submitTime(OffsetDateTime submitTime) {
    
    this.submitTime = submitTime;
    return this;
  }

   /**
   * Get submitTime
   * @return submitTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getSubmitTime() {
    return submitTime;
  }


  public void setSubmitTime(OffsetDateTime submitTime) {
    this.submitTime = submitTime;
  }


  public CosmosGovV1beta1Proposal depositEndTime(OffsetDateTime depositEndTime) {
    
    this.depositEndTime = depositEndTime;
    return this;
  }

   /**
   * Get depositEndTime
   * @return depositEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDepositEndTime() {
    return depositEndTime;
  }


  public void setDepositEndTime(OffsetDateTime depositEndTime) {
    this.depositEndTime = depositEndTime;
  }


  public CosmosGovV1beta1Proposal totalDeposit(List<InlineResponse2003Balances> totalDeposit) {
    
    this.totalDeposit = totalDeposit;
    return this;
  }

  public CosmosGovV1beta1Proposal addTotalDepositItem(InlineResponse2003Balances totalDepositItem) {
    if (this.totalDeposit == null) {
      this.totalDeposit = new ArrayList<InlineResponse2003Balances>();
    }
    this.totalDeposit.add(totalDepositItem);
    return this;
  }

   /**
   * Get totalDeposit
   * @return totalDeposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse2003Balances> getTotalDeposit() {
    return totalDeposit;
  }


  public void setTotalDeposit(List<InlineResponse2003Balances> totalDeposit) {
    this.totalDeposit = totalDeposit;
  }


  public CosmosGovV1beta1Proposal votingStartTime(OffsetDateTime votingStartTime) {
    
    this.votingStartTime = votingStartTime;
    return this;
  }

   /**
   * Get votingStartTime
   * @return votingStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getVotingStartTime() {
    return votingStartTime;
  }


  public void setVotingStartTime(OffsetDateTime votingStartTime) {
    this.votingStartTime = votingStartTime;
  }


  public CosmosGovV1beta1Proposal votingEndTime(OffsetDateTime votingEndTime) {
    
    this.votingEndTime = votingEndTime;
    return this;
  }

   /**
   * Get votingEndTime
   * @return votingEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getVotingEndTime() {
    return votingEndTime;
  }


  public void setVotingEndTime(OffsetDateTime votingEndTime) {
    this.votingEndTime = votingEndTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1Proposal cosmosGovV1beta1Proposal = (CosmosGovV1beta1Proposal) o;
    return Objects.equals(this.proposalId, cosmosGovV1beta1Proposal.proposalId) &&
        Objects.equals(this.content, cosmosGovV1beta1Proposal.content) &&
        Objects.equals(this.status, cosmosGovV1beta1Proposal.status) &&
        Objects.equals(this.finalTallyResult, cosmosGovV1beta1Proposal.finalTallyResult) &&
        Objects.equals(this.submitTime, cosmosGovV1beta1Proposal.submitTime) &&
        Objects.equals(this.depositEndTime, cosmosGovV1beta1Proposal.depositEndTime) &&
        Objects.equals(this.totalDeposit, cosmosGovV1beta1Proposal.totalDeposit) &&
        Objects.equals(this.votingStartTime, cosmosGovV1beta1Proposal.votingStartTime) &&
        Objects.equals(this.votingEndTime, cosmosGovV1beta1Proposal.votingEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposalId, content, status, finalTallyResult, submitTime, depositEndTime, totalDeposit, votingStartTime, votingEndTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1Proposal {\n");
    sb.append("    proposalId: ").append(toIndentedString(proposalId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    finalTallyResult: ").append(toIndentedString(finalTallyResult)).append("\n");
    sb.append("    submitTime: ").append(toIndentedString(submitTime)).append("\n");
    sb.append("    depositEndTime: ").append(toIndentedString(depositEndTime)).append("\n");
    sb.append("    totalDeposit: ").append(toIndentedString(totalDeposit)).append("\n");
    sb.append("    votingStartTime: ").append(toIndentedString(votingStartTime)).append("\n");
    sb.append("    votingEndTime: ").append(toIndentedString(votingEndTime)).append("\n");
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

