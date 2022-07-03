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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20041Commission;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20041Description;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Accounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Validator defines a validator, together with the total amount of the Validator&#39;s bond shares and their exchange rate to coins. Slashing results in a decrease in the exchange rate, allowing correct calculation of future undelegations without iterating over delegators. When coins are delegated to this validator, the validator is credited with a delegation whose number of bond shares is based on the amount of coins delegated divided by the current exchange rate. Voting power can be calculated as total bonded shares multiplied by exchange rate.
 */
@ApiModel(description = "Validator defines a validator, together with the total amount of the Validator's bond shares and their exchange rate to coins. Slashing results in a decrease in the exchange rate, allowing correct calculation of future undelegations without iterating over delegators. When coins are delegated to this validator, the validator is credited with a delegation whose number of bond shares is based on the amount of coins delegated divided by the current exchange rate. Voting power can be calculated as total bonded shares multiplied by exchange rate.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class InlineResponse20041Validators {
  public static final String SERIALIZED_NAME_OPERATOR_ADDRESS = "operator_address";
  @SerializedName(SERIALIZED_NAME_OPERATOR_ADDRESS)
  private String operatorAddress;

  public static final String SERIALIZED_NAME_CONSENSUS_PUBKEY = "consensus_pubkey";
  @SerializedName(SERIALIZED_NAME_CONSENSUS_PUBKEY)
  private InlineResponse200Accounts consensusPubkey;

  public static final String SERIALIZED_NAME_JAILED = "jailed";
  @SerializedName(SERIALIZED_NAME_JAILED)
  private Boolean jailed;

  /**
   * status is the validator status (bonded/unbonding/unbonded).
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNSPECIFIED("BOND_STATUS_UNSPECIFIED"),
    
    UNBONDED("BOND_STATUS_UNBONDED"),
    
    UNBONDING("BOND_STATUS_UNBONDING"),
    
    BONDED("BOND_STATUS_BONDED");

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

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private String tokens;

  public static final String SERIALIZED_NAME_DELEGATOR_SHARES = "delegator_shares";
  @SerializedName(SERIALIZED_NAME_DELEGATOR_SHARES)
  private String delegatorShares;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private InlineResponse20041Description description;

  public static final String SERIALIZED_NAME_UNBONDING_HEIGHT = "unbonding_height";
  @SerializedName(SERIALIZED_NAME_UNBONDING_HEIGHT)
  private String unbondingHeight;

  public static final String SERIALIZED_NAME_UNBONDING_TIME = "unbonding_time";
  @SerializedName(SERIALIZED_NAME_UNBONDING_TIME)
  private OffsetDateTime unbondingTime;

  public static final String SERIALIZED_NAME_COMMISSION = "commission";
  @SerializedName(SERIALIZED_NAME_COMMISSION)
  private InlineResponse20041Commission commission;

  public static final String SERIALIZED_NAME_MIN_SELF_DELEGATION = "min_self_delegation";
  @SerializedName(SERIALIZED_NAME_MIN_SELF_DELEGATION)
  private String minSelfDelegation;


  public InlineResponse20041Validators operatorAddress(String operatorAddress) {
    
    this.operatorAddress = operatorAddress;
    return this;
  }

   /**
   * operator_address defines the address of the validator&#39;s operator; bech encoded in JSON.
   * @return operatorAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "operator_address defines the address of the validator's operator; bech encoded in JSON.")

  public String getOperatorAddress() {
    return operatorAddress;
  }


  public void setOperatorAddress(String operatorAddress) {
    this.operatorAddress = operatorAddress;
  }


  public InlineResponse20041Validators consensusPubkey(InlineResponse200Accounts consensusPubkey) {
    
    this.consensusPubkey = consensusPubkey;
    return this;
  }

   /**
   * Get consensusPubkey
   * @return consensusPubkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200Accounts getConsensusPubkey() {
    return consensusPubkey;
  }


  public void setConsensusPubkey(InlineResponse200Accounts consensusPubkey) {
    this.consensusPubkey = consensusPubkey;
  }


  public InlineResponse20041Validators jailed(Boolean jailed) {
    
    this.jailed = jailed;
    return this;
  }

   /**
   * jailed defined whether the validator has been jailed from bonded status or not.
   * @return jailed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "jailed defined whether the validator has been jailed from bonded status or not.")

  public Boolean getJailed() {
    return jailed;
  }


  public void setJailed(Boolean jailed) {
    this.jailed = jailed;
  }


  public InlineResponse20041Validators status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * status is the validator status (bonded/unbonding/unbonded).
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status is the validator status (bonded/unbonding/unbonded).")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public InlineResponse20041Validators tokens(String tokens) {
    
    this.tokens = tokens;
    return this;
  }

   /**
   * tokens define the delegated tokens (incl. self-delegation).
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tokens define the delegated tokens (incl. self-delegation).")

  public String getTokens() {
    return tokens;
  }


  public void setTokens(String tokens) {
    this.tokens = tokens;
  }


  public InlineResponse20041Validators delegatorShares(String delegatorShares) {
    
    this.delegatorShares = delegatorShares;
    return this;
  }

   /**
   * delegator_shares defines total shares issued to a validator&#39;s delegators.
   * @return delegatorShares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "delegator_shares defines total shares issued to a validator's delegators.")

  public String getDelegatorShares() {
    return delegatorShares;
  }


  public void setDelegatorShares(String delegatorShares) {
    this.delegatorShares = delegatorShares;
  }


  public InlineResponse20041Validators description(InlineResponse20041Description description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20041Description getDescription() {
    return description;
  }


  public void setDescription(InlineResponse20041Description description) {
    this.description = description;
  }


  public InlineResponse20041Validators unbondingHeight(String unbondingHeight) {
    
    this.unbondingHeight = unbondingHeight;
    return this;
  }

   /**
   * unbonding_height defines, if unbonding, the height at which this validator has begun unbonding.
   * @return unbondingHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unbonding_height defines, if unbonding, the height at which this validator has begun unbonding.")

  public String getUnbondingHeight() {
    return unbondingHeight;
  }


  public void setUnbondingHeight(String unbondingHeight) {
    this.unbondingHeight = unbondingHeight;
  }


  public InlineResponse20041Validators unbondingTime(OffsetDateTime unbondingTime) {
    
    this.unbondingTime = unbondingTime;
    return this;
  }

   /**
   * unbonding_time defines, if unbonding, the min time for the validator to complete unbonding.
   * @return unbondingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unbonding_time defines, if unbonding, the min time for the validator to complete unbonding.")

  public OffsetDateTime getUnbondingTime() {
    return unbondingTime;
  }


  public void setUnbondingTime(OffsetDateTime unbondingTime) {
    this.unbondingTime = unbondingTime;
  }


  public InlineResponse20041Validators commission(InlineResponse20041Commission commission) {
    
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20041Commission getCommission() {
    return commission;
  }


  public void setCommission(InlineResponse20041Commission commission) {
    this.commission = commission;
  }


  public InlineResponse20041Validators minSelfDelegation(String minSelfDelegation) {
    
    this.minSelfDelegation = minSelfDelegation;
    return this;
  }

   /**
   * min_self_delegation is the validator&#39;s self declared minimum self delegation.
   * @return minSelfDelegation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "min_self_delegation is the validator's self declared minimum self delegation.")

  public String getMinSelfDelegation() {
    return minSelfDelegation;
  }


  public void setMinSelfDelegation(String minSelfDelegation) {
    this.minSelfDelegation = minSelfDelegation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20041Validators inlineResponse20041Validators = (InlineResponse20041Validators) o;
    return Objects.equals(this.operatorAddress, inlineResponse20041Validators.operatorAddress) &&
        Objects.equals(this.consensusPubkey, inlineResponse20041Validators.consensusPubkey) &&
        Objects.equals(this.jailed, inlineResponse20041Validators.jailed) &&
        Objects.equals(this.status, inlineResponse20041Validators.status) &&
        Objects.equals(this.tokens, inlineResponse20041Validators.tokens) &&
        Objects.equals(this.delegatorShares, inlineResponse20041Validators.delegatorShares) &&
        Objects.equals(this.description, inlineResponse20041Validators.description) &&
        Objects.equals(this.unbondingHeight, inlineResponse20041Validators.unbondingHeight) &&
        Objects.equals(this.unbondingTime, inlineResponse20041Validators.unbondingTime) &&
        Objects.equals(this.commission, inlineResponse20041Validators.commission) &&
        Objects.equals(this.minSelfDelegation, inlineResponse20041Validators.minSelfDelegation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorAddress, consensusPubkey, jailed, status, tokens, delegatorShares, description, unbondingHeight, unbondingTime, commission, minSelfDelegation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20041Validators {\n");
    sb.append("    operatorAddress: ").append(toIndentedString(operatorAddress)).append("\n");
    sb.append("    consensusPubkey: ").append(toIndentedString(consensusPubkey)).append("\n");
    sb.append("    jailed: ").append(toIndentedString(jailed)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    delegatorShares: ").append(toIndentedString(delegatorShares)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    unbondingHeight: ").append(toIndentedString(unbondingHeight)).append("\n");
    sb.append("    unbondingTime: ").append(toIndentedString(unbondingTime)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    minSelfDelegation: ").append(toIndentedString(minSelfDelegation)).append("\n");
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

