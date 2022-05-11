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
 * ValidatorSlashEvent represents a validator slash event. Height is implicit within the store key. This is needed to calculate appropriate amount of staking tokens for delegations which are withdrawn after a slash has occurred.
 */
@ApiModel(description = "ValidatorSlashEvent represents a validator slash event. Height is implicit within the store key. This is needed to calculate appropriate amount of staking tokens for delegations which are withdrawn after a slash has occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class InlineResponse20023Slashes {
  public static final String SERIALIZED_NAME_VALIDATOR_PERIOD = "validator_period";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_PERIOD)
  private String validatorPeriod;

  public static final String SERIALIZED_NAME_FRACTION = "fraction";
  @SerializedName(SERIALIZED_NAME_FRACTION)
  private String fraction;


  public InlineResponse20023Slashes validatorPeriod(String validatorPeriod) {
    
    this.validatorPeriod = validatorPeriod;
    return this;
  }

   /**
   * Get validatorPeriod
   * @return validatorPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidatorPeriod() {
    return validatorPeriod;
  }


  public void setValidatorPeriod(String validatorPeriod) {
    this.validatorPeriod = validatorPeriod;
  }


  public InlineResponse20023Slashes fraction(String fraction) {
    
    this.fraction = fraction;
    return this;
  }

   /**
   * Get fraction
   * @return fraction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFraction() {
    return fraction;
  }


  public void setFraction(String fraction) {
    this.fraction = fraction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20023Slashes inlineResponse20023Slashes = (InlineResponse20023Slashes) o;
    return Objects.equals(this.validatorPeriod, inlineResponse20023Slashes.validatorPeriod) &&
        Objects.equals(this.fraction, inlineResponse20023Slashes.fraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validatorPeriod, fraction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20023Slashes {\n");
    sb.append("    validatorPeriod: ").append(toIndentedString(validatorPeriod)).append("\n");
    sb.append("    fraction: ").append(toIndentedString(fraction)).append("\n");
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

