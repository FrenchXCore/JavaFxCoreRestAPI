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

/**
 * params defines the parameters of the module.
 */
@ApiModel(description = "params defines the parameters of the module.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class InlineResponse20021Params {
  public static final String SERIALIZED_NAME_COMMUNITY_TAX = "community_tax";
  @SerializedName(SERIALIZED_NAME_COMMUNITY_TAX)
  private String communityTax;

  public static final String SERIALIZED_NAME_BASE_PROPOSER_REWARD = "base_proposer_reward";
  @SerializedName(SERIALIZED_NAME_BASE_PROPOSER_REWARD)
  private String baseProposerReward;

  public static final String SERIALIZED_NAME_BONUS_PROPOSER_REWARD = "bonus_proposer_reward";
  @SerializedName(SERIALIZED_NAME_BONUS_PROPOSER_REWARD)
  private String bonusProposerReward;

  public static final String SERIALIZED_NAME_WITHDRAW_ADDR_ENABLED = "withdraw_addr_enabled";
  @SerializedName(SERIALIZED_NAME_WITHDRAW_ADDR_ENABLED)
  private Boolean withdrawAddrEnabled;


  public InlineResponse20021Params communityTax(String communityTax) {
    
    this.communityTax = communityTax;
    return this;
  }

   /**
   * Get communityTax
   * @return communityTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommunityTax() {
    return communityTax;
  }


  public void setCommunityTax(String communityTax) {
    this.communityTax = communityTax;
  }


  public InlineResponse20021Params baseProposerReward(String baseProposerReward) {
    
    this.baseProposerReward = baseProposerReward;
    return this;
  }

   /**
   * Get baseProposerReward
   * @return baseProposerReward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBaseProposerReward() {
    return baseProposerReward;
  }


  public void setBaseProposerReward(String baseProposerReward) {
    this.baseProposerReward = baseProposerReward;
  }


  public InlineResponse20021Params bonusProposerReward(String bonusProposerReward) {
    
    this.bonusProposerReward = bonusProposerReward;
    return this;
  }

   /**
   * Get bonusProposerReward
   * @return bonusProposerReward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBonusProposerReward() {
    return bonusProposerReward;
  }


  public void setBonusProposerReward(String bonusProposerReward) {
    this.bonusProposerReward = bonusProposerReward;
  }


  public InlineResponse20021Params withdrawAddrEnabled(Boolean withdrawAddrEnabled) {
    
    this.withdrawAddrEnabled = withdrawAddrEnabled;
    return this;
  }

   /**
   * Get withdrawAddrEnabled
   * @return withdrawAddrEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWithdrawAddrEnabled() {
    return withdrawAddrEnabled;
  }


  public void setWithdrawAddrEnabled(Boolean withdrawAddrEnabled) {
    this.withdrawAddrEnabled = withdrawAddrEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021Params inlineResponse20021Params = (InlineResponse20021Params) o;
    return Objects.equals(this.communityTax, inlineResponse20021Params.communityTax) &&
        Objects.equals(this.baseProposerReward, inlineResponse20021Params.baseProposerReward) &&
        Objects.equals(this.bonusProposerReward, inlineResponse20021Params.bonusProposerReward) &&
        Objects.equals(this.withdrawAddrEnabled, inlineResponse20021Params.withdrawAddrEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communityTax, baseProposerReward, bonusProposerReward, withdrawAddrEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021Params {\n");
    sb.append("    communityTax: ").append(toIndentedString(communityTax)).append("\n");
    sb.append("    baseProposerReward: ").append(toIndentedString(baseProposerReward)).append("\n");
    sb.append("    bonusProposerReward: ").append(toIndentedString(bonusProposerReward)).append("\n");
    sb.append("    withdrawAddrEnabled: ").append(toIndentedString(withdrawAddrEnabled)).append("\n");
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

