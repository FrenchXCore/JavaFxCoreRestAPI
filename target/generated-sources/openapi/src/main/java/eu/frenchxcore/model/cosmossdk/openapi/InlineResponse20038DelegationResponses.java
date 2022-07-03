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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20038Delegation;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse2003Balances;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DelegationResponse is equivalent to Delegation except that it contains a balance in addition to shares which is more suitable for client responses.
 */
@ApiModel(description = "DelegationResponse is equivalent to Delegation except that it contains a balance in addition to shares which is more suitable for client responses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class InlineResponse20038DelegationResponses {
  public static final String SERIALIZED_NAME_DELEGATION = "delegation";
  @SerializedName(SERIALIZED_NAME_DELEGATION)
  private InlineResponse20038Delegation delegation;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private InlineResponse2003Balances balance;


  public InlineResponse20038DelegationResponses delegation(InlineResponse20038Delegation delegation) {
    
    this.delegation = delegation;
    return this;
  }

   /**
   * Get delegation
   * @return delegation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20038Delegation getDelegation() {
    return delegation;
  }


  public void setDelegation(InlineResponse20038Delegation delegation) {
    this.delegation = delegation;
  }


  public InlineResponse20038DelegationResponses balance(InlineResponse2003Balances balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse2003Balances getBalance() {
    return balance;
  }


  public void setBalance(InlineResponse2003Balances balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20038DelegationResponses inlineResponse20038DelegationResponses = (InlineResponse20038DelegationResponses) o;
    return Objects.equals(this.delegation, inlineResponse20038DelegationResponses.delegation) &&
        Objects.equals(this.balance, inlineResponse20038DelegationResponses.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delegation, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20038DelegationResponses {\n");
    sb.append("    delegation: ").append(toIndentedString(delegation)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

