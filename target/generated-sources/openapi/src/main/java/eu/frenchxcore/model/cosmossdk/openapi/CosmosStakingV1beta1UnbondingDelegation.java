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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20040Entries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UnbondingDelegation stores all of a single delegator&#39;s unbonding bonds for a single validator in an time-ordered list.
 */
@ApiModel(description = "UnbondingDelegation stores all of a single delegator's unbonding bonds for a single validator in an time-ordered list.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class CosmosStakingV1beta1UnbondingDelegation {
  public static final String SERIALIZED_NAME_DELEGATOR_ADDRESS = "delegator_address";
  @SerializedName(SERIALIZED_NAME_DELEGATOR_ADDRESS)
  private String delegatorAddress;

  public static final String SERIALIZED_NAME_VALIDATOR_ADDRESS = "validator_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_ADDRESS)
  private String validatorAddress;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<InlineResponse20040Entries> entries = null;


  public CosmosStakingV1beta1UnbondingDelegation delegatorAddress(String delegatorAddress) {
    
    this.delegatorAddress = delegatorAddress;
    return this;
  }

   /**
   * delegator_address is the bech32-encoded address of the delegator.
   * @return delegatorAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "delegator_address is the bech32-encoded address of the delegator.")

  public String getDelegatorAddress() {
    return delegatorAddress;
  }


  public void setDelegatorAddress(String delegatorAddress) {
    this.delegatorAddress = delegatorAddress;
  }


  public CosmosStakingV1beta1UnbondingDelegation validatorAddress(String validatorAddress) {
    
    this.validatorAddress = validatorAddress;
    return this;
  }

   /**
   * validator_address is the bech32-encoded address of the validator.
   * @return validatorAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "validator_address is the bech32-encoded address of the validator.")

  public String getValidatorAddress() {
    return validatorAddress;
  }


  public void setValidatorAddress(String validatorAddress) {
    this.validatorAddress = validatorAddress;
  }


  public CosmosStakingV1beta1UnbondingDelegation entries(List<InlineResponse20040Entries> entries) {
    
    this.entries = entries;
    return this;
  }

  public CosmosStakingV1beta1UnbondingDelegation addEntriesItem(InlineResponse20040Entries entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<InlineResponse20040Entries>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * entries are the unbonding delegation entries.
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entries are the unbonding delegation entries.")

  public List<InlineResponse20040Entries> getEntries() {
    return entries;
  }


  public void setEntries(List<InlineResponse20040Entries> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosStakingV1beta1UnbondingDelegation cosmosStakingV1beta1UnbondingDelegation = (CosmosStakingV1beta1UnbondingDelegation) o;
    return Objects.equals(this.delegatorAddress, cosmosStakingV1beta1UnbondingDelegation.delegatorAddress) &&
        Objects.equals(this.validatorAddress, cosmosStakingV1beta1UnbondingDelegation.validatorAddress) &&
        Objects.equals(this.entries, cosmosStakingV1beta1UnbondingDelegation.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegatorAddress, validatorAddress, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosStakingV1beta1UnbondingDelegation {\n");
    sb.append("    delegatorAddress: ").append(toIndentedString(delegatorAddress)).append("\n");
    sb.append("    validatorAddress: ").append(toIndentedString(validatorAddress)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

