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
 * commission_rates defines the initial commission rates to be used for creating a validator.
 */
@ApiModel(description = "commission_rates defines the initial commission rates to be used for creating a validator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class InlineResponse20041CommissionCommissionRates {
  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_MAX_RATE = "max_rate";
  @SerializedName(SERIALIZED_NAME_MAX_RATE)
  private String maxRate;

  public static final String SERIALIZED_NAME_MAX_CHANGE_RATE = "max_change_rate";
  @SerializedName(SERIALIZED_NAME_MAX_CHANGE_RATE)
  private String maxChangeRate;


  public InlineResponse20041CommissionCommissionRates rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * rate is the commission rate charged to delegators, as a fraction.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "rate is the commission rate charged to delegators, as a fraction.")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public InlineResponse20041CommissionCommissionRates maxRate(String maxRate) {
    
    this.maxRate = maxRate;
    return this;
  }

   /**
   * max_rate defines the maximum commission rate which validator can ever charge, as a fraction.
   * @return maxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "max_rate defines the maximum commission rate which validator can ever charge, as a fraction.")

  public String getMaxRate() {
    return maxRate;
  }


  public void setMaxRate(String maxRate) {
    this.maxRate = maxRate;
  }


  public InlineResponse20041CommissionCommissionRates maxChangeRate(String maxChangeRate) {
    
    this.maxChangeRate = maxChangeRate;
    return this;
  }

   /**
   * max_change_rate defines the maximum daily increase of the validator commission, as a fraction.
   * @return maxChangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "max_change_rate defines the maximum daily increase of the validator commission, as a fraction.")

  public String getMaxChangeRate() {
    return maxChangeRate;
  }


  public void setMaxChangeRate(String maxChangeRate) {
    this.maxChangeRate = maxChangeRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20041CommissionCommissionRates inlineResponse20041CommissionCommissionRates = (InlineResponse20041CommissionCommissionRates) o;
    return Objects.equals(this.rate, inlineResponse20041CommissionCommissionRates.rate) &&
        Objects.equals(this.maxRate, inlineResponse20041CommissionCommissionRates.maxRate) &&
        Objects.equals(this.maxChangeRate, inlineResponse20041CommissionCommissionRates.maxChangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, maxRate, maxChangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20041CommissionCommissionRates {\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    maxRate: ").append(toIndentedString(maxRate)).append("\n");
    sb.append("    maxChangeRate: ").append(toIndentedString(maxChangeRate)).append("\n");
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

