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
 * Params defines the parameters for the auth module.
 */
@ApiModel(description = "Params defines the parameters for the auth module.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T08:16:25.027082+02:00[Europe/Paris]")
public class CosmosAuthV1beta1Params {
  public static final String SERIALIZED_NAME_MAX_MEMO_CHARACTERS = "max_memo_characters";
  @SerializedName(SERIALIZED_NAME_MAX_MEMO_CHARACTERS)
  private String maxMemoCharacters;

  public static final String SERIALIZED_NAME_TX_SIG_LIMIT = "tx_sig_limit";
  @SerializedName(SERIALIZED_NAME_TX_SIG_LIMIT)
  private String txSigLimit;

  public static final String SERIALIZED_NAME_TX_SIZE_COST_PER_BYTE = "tx_size_cost_per_byte";
  @SerializedName(SERIALIZED_NAME_TX_SIZE_COST_PER_BYTE)
  private String txSizeCostPerByte;

  public static final String SERIALIZED_NAME_SIG_VERIFY_COST_ED25519 = "sig_verify_cost_ed25519";
  @SerializedName(SERIALIZED_NAME_SIG_VERIFY_COST_ED25519)
  private String sigVerifyCostEd25519;

  public static final String SERIALIZED_NAME_SIG_VERIFY_COST_SECP256K1 = "sig_verify_cost_secp256k1";
  @SerializedName(SERIALIZED_NAME_SIG_VERIFY_COST_SECP256K1)
  private String sigVerifyCostSecp256k1;


  public CosmosAuthV1beta1Params maxMemoCharacters(String maxMemoCharacters) {
    
    this.maxMemoCharacters = maxMemoCharacters;
    return this;
  }

   /**
   * Get maxMemoCharacters
   * @return maxMemoCharacters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxMemoCharacters() {
    return maxMemoCharacters;
  }


  public void setMaxMemoCharacters(String maxMemoCharacters) {
    this.maxMemoCharacters = maxMemoCharacters;
  }


  public CosmosAuthV1beta1Params txSigLimit(String txSigLimit) {
    
    this.txSigLimit = txSigLimit;
    return this;
  }

   /**
   * Get txSigLimit
   * @return txSigLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxSigLimit() {
    return txSigLimit;
  }


  public void setTxSigLimit(String txSigLimit) {
    this.txSigLimit = txSigLimit;
  }


  public CosmosAuthV1beta1Params txSizeCostPerByte(String txSizeCostPerByte) {
    
    this.txSizeCostPerByte = txSizeCostPerByte;
    return this;
  }

   /**
   * Get txSizeCostPerByte
   * @return txSizeCostPerByte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxSizeCostPerByte() {
    return txSizeCostPerByte;
  }


  public void setTxSizeCostPerByte(String txSizeCostPerByte) {
    this.txSizeCostPerByte = txSizeCostPerByte;
  }


  public CosmosAuthV1beta1Params sigVerifyCostEd25519(String sigVerifyCostEd25519) {
    
    this.sigVerifyCostEd25519 = sigVerifyCostEd25519;
    return this;
  }

   /**
   * Get sigVerifyCostEd25519
   * @return sigVerifyCostEd25519
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSigVerifyCostEd25519() {
    return sigVerifyCostEd25519;
  }


  public void setSigVerifyCostEd25519(String sigVerifyCostEd25519) {
    this.sigVerifyCostEd25519 = sigVerifyCostEd25519;
  }


  public CosmosAuthV1beta1Params sigVerifyCostSecp256k1(String sigVerifyCostSecp256k1) {
    
    this.sigVerifyCostSecp256k1 = sigVerifyCostSecp256k1;
    return this;
  }

   /**
   * Get sigVerifyCostSecp256k1
   * @return sigVerifyCostSecp256k1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSigVerifyCostSecp256k1() {
    return sigVerifyCostSecp256k1;
  }


  public void setSigVerifyCostSecp256k1(String sigVerifyCostSecp256k1) {
    this.sigVerifyCostSecp256k1 = sigVerifyCostSecp256k1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosAuthV1beta1Params cosmosAuthV1beta1Params = (CosmosAuthV1beta1Params) o;
    return Objects.equals(this.maxMemoCharacters, cosmosAuthV1beta1Params.maxMemoCharacters) &&
        Objects.equals(this.txSigLimit, cosmosAuthV1beta1Params.txSigLimit) &&
        Objects.equals(this.txSizeCostPerByte, cosmosAuthV1beta1Params.txSizeCostPerByte) &&
        Objects.equals(this.sigVerifyCostEd25519, cosmosAuthV1beta1Params.sigVerifyCostEd25519) &&
        Objects.equals(this.sigVerifyCostSecp256k1, cosmosAuthV1beta1Params.sigVerifyCostSecp256k1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxMemoCharacters, txSigLimit, txSizeCostPerByte, sigVerifyCostEd25519, sigVerifyCostSecp256k1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosAuthV1beta1Params {\n");
    sb.append("    maxMemoCharacters: ").append(toIndentedString(maxMemoCharacters)).append("\n");
    sb.append("    txSigLimit: ").append(toIndentedString(txSigLimit)).append("\n");
    sb.append("    txSizeCostPerByte: ").append(toIndentedString(txSizeCostPerByte)).append("\n");
    sb.append("    sigVerifyCostEd25519: ").append(toIndentedString(sigVerifyCostEd25519)).append("\n");
    sb.append("    sigVerifyCostSecp256k1: ").append(toIndentedString(sigVerifyCostSecp256k1)).append("\n");
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

