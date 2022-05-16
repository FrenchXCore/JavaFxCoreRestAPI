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
 * Coin defines a token with a denomination and an amount.  NOTE: The amount field is an Int which implements the custom method signatures required by gogoproto.
 */
@ApiModel(description = "Coin defines a token with a denomination and an amount.  NOTE: The amount field is an Int which implements the custom method signatures required by gogoproto.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class CosmosBaseV1beta1Coin {
  public static final String SERIALIZED_NAME_DENOM = "denom";
  @SerializedName(SERIALIZED_NAME_DENOM)
  private String denom;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;


  public CosmosBaseV1beta1Coin denom(String denom) {
    
    this.denom = denom;
    return this;
  }

   /**
   * Get denom
   * @return denom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDenom() {
    return denom;
  }


  public void setDenom(String denom) {
    this.denom = denom;
  }


  public CosmosBaseV1beta1Coin amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosBaseV1beta1Coin cosmosBaseV1beta1Coin = (CosmosBaseV1beta1Coin) o;
    return Objects.equals(this.denom, cosmosBaseV1beta1Coin.denom) &&
        Objects.equals(this.amount, cosmosBaseV1beta1Coin.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denom, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosBaseV1beta1Coin {\n");
    sb.append("    denom: ").append(toIndentedString(denom)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

