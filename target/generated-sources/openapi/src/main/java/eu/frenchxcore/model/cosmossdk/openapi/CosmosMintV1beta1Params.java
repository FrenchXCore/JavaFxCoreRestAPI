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
 * Params holds parameters for the mint module.
 */
@ApiModel(description = "Params holds parameters for the mint module.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class CosmosMintV1beta1Params {
  public static final String SERIALIZED_NAME_MINT_DENOM = "mint_denom";
  @SerializedName(SERIALIZED_NAME_MINT_DENOM)
  private String mintDenom;

  public static final String SERIALIZED_NAME_INFLATION_RATE_CHANGE = "inflation_rate_change";
  @SerializedName(SERIALIZED_NAME_INFLATION_RATE_CHANGE)
  private String inflationRateChange;

  public static final String SERIALIZED_NAME_INFLATION_MAX = "inflation_max";
  @SerializedName(SERIALIZED_NAME_INFLATION_MAX)
  private String inflationMax;

  public static final String SERIALIZED_NAME_INFLATION_MIN = "inflation_min";
  @SerializedName(SERIALIZED_NAME_INFLATION_MIN)
  private String inflationMin;

  public static final String SERIALIZED_NAME_GOAL_BONDED = "goal_bonded";
  @SerializedName(SERIALIZED_NAME_GOAL_BONDED)
  private String goalBonded;

  public static final String SERIALIZED_NAME_BLOCKS_PER_YEAR = "blocks_per_year";
  @SerializedName(SERIALIZED_NAME_BLOCKS_PER_YEAR)
  private String blocksPerYear;


  public CosmosMintV1beta1Params mintDenom(String mintDenom) {
    
    this.mintDenom = mintDenom;
    return this;
  }

   /**
   * Get mintDenom
   * @return mintDenom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMintDenom() {
    return mintDenom;
  }


  public void setMintDenom(String mintDenom) {
    this.mintDenom = mintDenom;
  }


  public CosmosMintV1beta1Params inflationRateChange(String inflationRateChange) {
    
    this.inflationRateChange = inflationRateChange;
    return this;
  }

   /**
   * Get inflationRateChange
   * @return inflationRateChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInflationRateChange() {
    return inflationRateChange;
  }


  public void setInflationRateChange(String inflationRateChange) {
    this.inflationRateChange = inflationRateChange;
  }


  public CosmosMintV1beta1Params inflationMax(String inflationMax) {
    
    this.inflationMax = inflationMax;
    return this;
  }

   /**
   * Get inflationMax
   * @return inflationMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInflationMax() {
    return inflationMax;
  }


  public void setInflationMax(String inflationMax) {
    this.inflationMax = inflationMax;
  }


  public CosmosMintV1beta1Params inflationMin(String inflationMin) {
    
    this.inflationMin = inflationMin;
    return this;
  }

   /**
   * Get inflationMin
   * @return inflationMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInflationMin() {
    return inflationMin;
  }


  public void setInflationMin(String inflationMin) {
    this.inflationMin = inflationMin;
  }


  public CosmosMintV1beta1Params goalBonded(String goalBonded) {
    
    this.goalBonded = goalBonded;
    return this;
  }

   /**
   * Get goalBonded
   * @return goalBonded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGoalBonded() {
    return goalBonded;
  }


  public void setGoalBonded(String goalBonded) {
    this.goalBonded = goalBonded;
  }


  public CosmosMintV1beta1Params blocksPerYear(String blocksPerYear) {
    
    this.blocksPerYear = blocksPerYear;
    return this;
  }

   /**
   * Get blocksPerYear
   * @return blocksPerYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBlocksPerYear() {
    return blocksPerYear;
  }


  public void setBlocksPerYear(String blocksPerYear) {
    this.blocksPerYear = blocksPerYear;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosMintV1beta1Params cosmosMintV1beta1Params = (CosmosMintV1beta1Params) o;
    return Objects.equals(this.mintDenom, cosmosMintV1beta1Params.mintDenom) &&
        Objects.equals(this.inflationRateChange, cosmosMintV1beta1Params.inflationRateChange) &&
        Objects.equals(this.inflationMax, cosmosMintV1beta1Params.inflationMax) &&
        Objects.equals(this.inflationMin, cosmosMintV1beta1Params.inflationMin) &&
        Objects.equals(this.goalBonded, cosmosMintV1beta1Params.goalBonded) &&
        Objects.equals(this.blocksPerYear, cosmosMintV1beta1Params.blocksPerYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mintDenom, inflationRateChange, inflationMax, inflationMin, goalBonded, blocksPerYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosMintV1beta1Params {\n");
    sb.append("    mintDenom: ").append(toIndentedString(mintDenom)).append("\n");
    sb.append("    inflationRateChange: ").append(toIndentedString(inflationRateChange)).append("\n");
    sb.append("    inflationMax: ").append(toIndentedString(inflationMax)).append("\n");
    sb.append("    inflationMin: ").append(toIndentedString(inflationMin)).append("\n");
    sb.append("    goalBonded: ").append(toIndentedString(goalBonded)).append("\n");
    sb.append("    blocksPerYear: ").append(toIndentedString(blocksPerYear)).append("\n");
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

