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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse2003Balances;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Fee includes the amount of coins paid in fees and the maximum gas to be used by the transaction. The ratio yields an effective \&quot;gasprice\&quot;, which must be above some miminum to be accepted into the mempool.
 */
@ApiModel(description = "Fee includes the amount of coins paid in fees and the maximum gas to be used by the transaction. The ratio yields an effective \"gasprice\", which must be above some miminum to be accepted into the mempool.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosTxV1beta1Fee {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private List<InlineResponse2003Balances> amount = null;

  public static final String SERIALIZED_NAME_GAS_LIMIT = "gas_limit";
  @SerializedName(SERIALIZED_NAME_GAS_LIMIT)
  private String gasLimit;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private String payer;

  public static final String SERIALIZED_NAME_GRANTER = "granter";
  @SerializedName(SERIALIZED_NAME_GRANTER)
  private String granter;


  public CosmosTxV1beta1Fee amount(List<InlineResponse2003Balances> amount) {
    
    this.amount = amount;
    return this;
  }

  public CosmosTxV1beta1Fee addAmountItem(InlineResponse2003Balances amountItem) {
    if (this.amount == null) {
      this.amount = new ArrayList<InlineResponse2003Balances>();
    }
    this.amount.add(amountItem);
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse2003Balances> getAmount() {
    return amount;
  }


  public void setAmount(List<InlineResponse2003Balances> amount) {
    this.amount = amount;
  }


  public CosmosTxV1beta1Fee gasLimit(String gasLimit) {
    
    this.gasLimit = gasLimit;
    return this;
  }

   /**
   * Get gasLimit
   * @return gasLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGasLimit() {
    return gasLimit;
  }


  public void setGasLimit(String gasLimit) {
    this.gasLimit = gasLimit;
  }


  public CosmosTxV1beta1Fee payer(String payer) {
    
    this.payer = payer;
    return this;
  }

   /**
   * if unset, the first signer is responsible for paying the fees. If set, the specified account must pay the fees. the payer must be a tx signer (and thus have signed this field in AuthInfo). setting this field does *not* change the ordering of required signers for the transaction.
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if unset, the first signer is responsible for paying the fees. If set, the specified account must pay the fees. the payer must be a tx signer (and thus have signed this field in AuthInfo). setting this field does *not* change the ordering of required signers for the transaction.")

  public String getPayer() {
    return payer;
  }


  public void setPayer(String payer) {
    this.payer = payer;
  }


  public CosmosTxV1beta1Fee granter(String granter) {
    
    this.granter = granter;
    return this;
  }

   /**
   * Get granter
   * @return granter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGranter() {
    return granter;
  }


  public void setGranter(String granter) {
    this.granter = granter;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosTxV1beta1Fee cosmosTxV1beta1Fee = (CosmosTxV1beta1Fee) o;
    return Objects.equals(this.amount, cosmosTxV1beta1Fee.amount) &&
        Objects.equals(this.gasLimit, cosmosTxV1beta1Fee.gasLimit) &&
        Objects.equals(this.payer, cosmosTxV1beta1Fee.payer) &&
        Objects.equals(this.granter, cosmosTxV1beta1Fee.granter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, gasLimit, payer, granter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosTxV1beta1Fee {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    gasLimit: ").append(toIndentedString(gasLimit)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    granter: ").append(toIndentedString(granter)).append("\n");
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

