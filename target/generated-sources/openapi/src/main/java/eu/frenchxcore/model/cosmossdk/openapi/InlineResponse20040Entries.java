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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * UnbondingDelegationEntry defines an unbonding object with relevant metadata.
 */
@ApiModel(description = "UnbondingDelegationEntry defines an unbonding object with relevant metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class InlineResponse20040Entries {
  public static final String SERIALIZED_NAME_CREATION_HEIGHT = "creation_height";
  @SerializedName(SERIALIZED_NAME_CREATION_HEIGHT)
  private String creationHeight;

  public static final String SERIALIZED_NAME_COMPLETION_TIME = "completion_time";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TIME)
  private OffsetDateTime completionTime;

  public static final String SERIALIZED_NAME_INITIAL_BALANCE = "initial_balance";
  @SerializedName(SERIALIZED_NAME_INITIAL_BALANCE)
  private String initialBalance;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private String balance;


  public InlineResponse20040Entries creationHeight(String creationHeight) {
    
    this.creationHeight = creationHeight;
    return this;
  }

   /**
   * creation_height is the height which the unbonding took place.
   * @return creationHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "creation_height is the height which the unbonding took place.")

  public String getCreationHeight() {
    return creationHeight;
  }


  public void setCreationHeight(String creationHeight) {
    this.creationHeight = creationHeight;
  }


  public InlineResponse20040Entries completionTime(OffsetDateTime completionTime) {
    
    this.completionTime = completionTime;
    return this;
  }

   /**
   * completion_time is the unix time for unbonding completion.
   * @return completionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "completion_time is the unix time for unbonding completion.")

  public OffsetDateTime getCompletionTime() {
    return completionTime;
  }


  public void setCompletionTime(OffsetDateTime completionTime) {
    this.completionTime = completionTime;
  }


  public InlineResponse20040Entries initialBalance(String initialBalance) {
    
    this.initialBalance = initialBalance;
    return this;
  }

   /**
   * initial_balance defines the tokens initially scheduled to receive at completion.
   * @return initialBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "initial_balance defines the tokens initially scheduled to receive at completion.")

  public String getInitialBalance() {
    return initialBalance;
  }


  public void setInitialBalance(String initialBalance) {
    this.initialBalance = initialBalance;
  }


  public InlineResponse20040Entries balance(String balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * balance defines the tokens to receive at completion.
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "balance defines the tokens to receive at completion.")

  public String getBalance() {
    return balance;
  }


  public void setBalance(String balance) {
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
    InlineResponse20040Entries inlineResponse20040Entries = (InlineResponse20040Entries) o;
    return Objects.equals(this.creationHeight, inlineResponse20040Entries.creationHeight) &&
        Objects.equals(this.completionTime, inlineResponse20040Entries.completionTime) &&
        Objects.equals(this.initialBalance, inlineResponse20040Entries.initialBalance) &&
        Objects.equals(this.balance, inlineResponse20040Entries.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationHeight, completionTime, initialBalance, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20040Entries {\n");
    sb.append("    creationHeight: ").append(toIndentedString(creationHeight)).append("\n");
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    initialBalance: ").append(toIndentedString(initialBalance)).append("\n");
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

