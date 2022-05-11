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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TendermintTypesValidatorSet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class TendermintTypesValidatorSet {
  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators> validators = null;

  public static final String SERIALIZED_NAME_PROPOSER = "proposer";
  @SerializedName(SERIALIZED_NAME_PROPOSER)
  private InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators proposer;

  public static final String SERIALIZED_NAME_TOTAL_VOTING_POWER = "total_voting_power";
  @SerializedName(SERIALIZED_NAME_TOTAL_VOTING_POWER)
  private String totalVotingPower;


  public TendermintTypesValidatorSet validators(List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators> validators) {
    
    this.validators = validators;
    return this;
  }

  public TendermintTypesValidatorSet addValidatorsItem(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators> getValidators() {
    return validators;
  }


  public void setValidators(List<InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators> validators) {
    this.validators = validators;
  }


  public TendermintTypesValidatorSet proposer(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators proposer) {
    
    this.proposer = proposer;
    return this;
  }

   /**
   * Get proposer
   * @return proposer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators getProposer() {
    return proposer;
  }


  public void setProposer(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSetValidators proposer) {
    this.proposer = proposer;
  }


  public TendermintTypesValidatorSet totalVotingPower(String totalVotingPower) {
    
    this.totalVotingPower = totalVotingPower;
    return this;
  }

   /**
   * Get totalVotingPower
   * @return totalVotingPower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalVotingPower() {
    return totalVotingPower;
  }


  public void setTotalVotingPower(String totalVotingPower) {
    this.totalVotingPower = totalVotingPower;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintTypesValidatorSet tendermintTypesValidatorSet = (TendermintTypesValidatorSet) o;
    return Objects.equals(this.validators, tendermintTypesValidatorSet.validators) &&
        Objects.equals(this.proposer, tendermintTypesValidatorSet.proposer) &&
        Objects.equals(this.totalVotingPower, tendermintTypesValidatorSet.totalVotingPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validators, proposer, totalVotingPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintTypesValidatorSet {\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    proposer: ").append(toIndentedString(proposer)).append("\n");
    sb.append("    totalVotingPower: ").append(toIndentedString(totalVotingPower)).append("\n");
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

