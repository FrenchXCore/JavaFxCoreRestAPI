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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20039RedelegationEntries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Redelegation contains the list of a particular delegator&#39;s redelegating bonds from a particular source validator to a particular destination validator.
 */
@ApiModel(description = "Redelegation contains the list of a particular delegator's redelegating bonds from a particular source validator to a particular destination validator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class InlineResponse20039Redelegation {
  public static final String SERIALIZED_NAME_DELEGATOR_ADDRESS = "delegator_address";
  @SerializedName(SERIALIZED_NAME_DELEGATOR_ADDRESS)
  private String delegatorAddress;

  public static final String SERIALIZED_NAME_VALIDATOR_SRC_ADDRESS = "validator_src_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_SRC_ADDRESS)
  private String validatorSrcAddress;

  public static final String SERIALIZED_NAME_VALIDATOR_DST_ADDRESS = "validator_dst_address";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_DST_ADDRESS)
  private String validatorDstAddress;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<InlineResponse20039RedelegationEntries> entries = null;


  public InlineResponse20039Redelegation delegatorAddress(String delegatorAddress) {
    
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


  public InlineResponse20039Redelegation validatorSrcAddress(String validatorSrcAddress) {
    
    this.validatorSrcAddress = validatorSrcAddress;
    return this;
  }

   /**
   * validator_src_address is the validator redelegation source operator address.
   * @return validatorSrcAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "validator_src_address is the validator redelegation source operator address.")

  public String getValidatorSrcAddress() {
    return validatorSrcAddress;
  }


  public void setValidatorSrcAddress(String validatorSrcAddress) {
    this.validatorSrcAddress = validatorSrcAddress;
  }


  public InlineResponse20039Redelegation validatorDstAddress(String validatorDstAddress) {
    
    this.validatorDstAddress = validatorDstAddress;
    return this;
  }

   /**
   * validator_dst_address is the validator redelegation destination operator address.
   * @return validatorDstAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "validator_dst_address is the validator redelegation destination operator address.")

  public String getValidatorDstAddress() {
    return validatorDstAddress;
  }


  public void setValidatorDstAddress(String validatorDstAddress) {
    this.validatorDstAddress = validatorDstAddress;
  }


  public InlineResponse20039Redelegation entries(List<InlineResponse20039RedelegationEntries> entries) {
    
    this.entries = entries;
    return this;
  }

  public InlineResponse20039Redelegation addEntriesItem(InlineResponse20039RedelegationEntries entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<InlineResponse20039RedelegationEntries>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * entries are the redelegation entries.
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entries are the redelegation entries.")

  public List<InlineResponse20039RedelegationEntries> getEntries() {
    return entries;
  }


  public void setEntries(List<InlineResponse20039RedelegationEntries> entries) {
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
    InlineResponse20039Redelegation inlineResponse20039Redelegation = (InlineResponse20039Redelegation) o;
    return Objects.equals(this.delegatorAddress, inlineResponse20039Redelegation.delegatorAddress) &&
        Objects.equals(this.validatorSrcAddress, inlineResponse20039Redelegation.validatorSrcAddress) &&
        Objects.equals(this.validatorDstAddress, inlineResponse20039Redelegation.validatorDstAddress) &&
        Objects.equals(this.entries, inlineResponse20039Redelegation.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegatorAddress, validatorSrcAddress, validatorDstAddress, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039Redelegation {\n");
    sb.append("    delegatorAddress: ").append(toIndentedString(delegatorAddress)).append("\n");
    sb.append("    validatorSrcAddress: ").append(toIndentedString(validatorSrcAddress)).append("\n");
    sb.append("    validatorDstAddress: ").append(toIndentedString(validatorDstAddress)).append("\n");
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

