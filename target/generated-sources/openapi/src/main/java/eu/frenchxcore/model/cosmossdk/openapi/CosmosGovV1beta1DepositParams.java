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
 * DepositParams defines the params for deposits on governance proposals.
 */
@ApiModel(description = "DepositParams defines the params for deposits on governance proposals.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosGovV1beta1DepositParams {
  public static final String SERIALIZED_NAME_MIN_DEPOSIT = "min_deposit";
  @SerializedName(SERIALIZED_NAME_MIN_DEPOSIT)
  private List<InlineResponse2003Balances> minDeposit = null;

  public static final String SERIALIZED_NAME_MAX_DEPOSIT_PERIOD = "max_deposit_period";
  @SerializedName(SERIALIZED_NAME_MAX_DEPOSIT_PERIOD)
  private String maxDepositPeriod;


  public CosmosGovV1beta1DepositParams minDeposit(List<InlineResponse2003Balances> minDeposit) {
    
    this.minDeposit = minDeposit;
    return this;
  }

  public CosmosGovV1beta1DepositParams addMinDepositItem(InlineResponse2003Balances minDepositItem) {
    if (this.minDeposit == null) {
      this.minDeposit = new ArrayList<InlineResponse2003Balances>();
    }
    this.minDeposit.add(minDepositItem);
    return this;
  }

   /**
   * Minimum deposit for a proposal to enter voting period.
   * @return minDeposit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum deposit for a proposal to enter voting period.")

  public List<InlineResponse2003Balances> getMinDeposit() {
    return minDeposit;
  }


  public void setMinDeposit(List<InlineResponse2003Balances> minDeposit) {
    this.minDeposit = minDeposit;
  }


  public CosmosGovV1beta1DepositParams maxDepositPeriod(String maxDepositPeriod) {
    
    this.maxDepositPeriod = maxDepositPeriod;
    return this;
  }

   /**
   * Maximum period for Atom holders to deposit on a proposal. Initial value: 2  months.
   * @return maxDepositPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum period for Atom holders to deposit on a proposal. Initial value: 2  months.")

  public String getMaxDepositPeriod() {
    return maxDepositPeriod;
  }


  public void setMaxDepositPeriod(String maxDepositPeriod) {
    this.maxDepositPeriod = maxDepositPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1DepositParams cosmosGovV1beta1DepositParams = (CosmosGovV1beta1DepositParams) o;
    return Objects.equals(this.minDeposit, cosmosGovV1beta1DepositParams.minDeposit) &&
        Objects.equals(this.maxDepositPeriod, cosmosGovV1beta1DepositParams.maxDepositPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minDeposit, maxDepositPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1DepositParams {\n");
    sb.append("    minDeposit: ").append(toIndentedString(minDeposit)).append("\n");
    sb.append("    maxDepositPeriod: ").append(toIndentedString(maxDepositPeriod)).append("\n");
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

