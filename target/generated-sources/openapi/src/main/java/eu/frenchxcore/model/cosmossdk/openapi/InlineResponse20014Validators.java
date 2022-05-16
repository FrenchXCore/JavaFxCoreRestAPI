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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Accounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Validator is the type for the validator-set.
 */
@ApiModel(description = "Validator is the type for the validator-set.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class InlineResponse20014Validators {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_PUB_KEY = "pub_key";
  @SerializedName(SERIALIZED_NAME_PUB_KEY)
  private InlineResponse200Accounts pubKey;

  public static final String SERIALIZED_NAME_VOTING_POWER = "voting_power";
  @SerializedName(SERIALIZED_NAME_VOTING_POWER)
  private String votingPower;

  public static final String SERIALIZED_NAME_PROPOSER_PRIORITY = "proposer_priority";
  @SerializedName(SERIALIZED_NAME_PROPOSER_PRIORITY)
  private String proposerPriority;


  public InlineResponse20014Validators address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public InlineResponse20014Validators pubKey(InlineResponse200Accounts pubKey) {
    
    this.pubKey = pubKey;
    return this;
  }

   /**
   * Get pubKey
   * @return pubKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200Accounts getPubKey() {
    return pubKey;
  }


  public void setPubKey(InlineResponse200Accounts pubKey) {
    this.pubKey = pubKey;
  }


  public InlineResponse20014Validators votingPower(String votingPower) {
    
    this.votingPower = votingPower;
    return this;
  }

   /**
   * Get votingPower
   * @return votingPower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVotingPower() {
    return votingPower;
  }


  public void setVotingPower(String votingPower) {
    this.votingPower = votingPower;
  }


  public InlineResponse20014Validators proposerPriority(String proposerPriority) {
    
    this.proposerPriority = proposerPriority;
    return this;
  }

   /**
   * Get proposerPriority
   * @return proposerPriority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProposerPriority() {
    return proposerPriority;
  }


  public void setProposerPriority(String proposerPriority) {
    this.proposerPriority = proposerPriority;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014Validators inlineResponse20014Validators = (InlineResponse20014Validators) o;
    return Objects.equals(this.address, inlineResponse20014Validators.address) &&
        Objects.equals(this.pubKey, inlineResponse20014Validators.pubKey) &&
        Objects.equals(this.votingPower, inlineResponse20014Validators.votingPower) &&
        Objects.equals(this.proposerPriority, inlineResponse20014Validators.proposerPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, pubKey, votingPower, proposerPriority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014Validators {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
    sb.append("    votingPower: ").append(toIndentedString(votingPower)).append("\n");
    sb.append("    proposerPriority: ").append(toIndentedString(proposerPriority)).append("\n");
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

