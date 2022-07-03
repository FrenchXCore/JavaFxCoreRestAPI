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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20016Pool;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidatorAccumulatedCommission represents accumulated commission for a validator kept as a running counter, can be withdrawn at any time.
 */
@ApiModel(description = "ValidatorAccumulatedCommission represents accumulated commission for a validator kept as a running counter, can be withdrawn at any time.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosDistributionV1beta1ValidatorAccumulatedCommission {
  public static final String SERIALIZED_NAME_COMMISSION = "commission";
  @SerializedName(SERIALIZED_NAME_COMMISSION)
  private List<InlineResponse20016Pool> commission = null;


  public CosmosDistributionV1beta1ValidatorAccumulatedCommission commission(List<InlineResponse20016Pool> commission) {
    
    this.commission = commission;
    return this;
  }

  public CosmosDistributionV1beta1ValidatorAccumulatedCommission addCommissionItem(InlineResponse20016Pool commissionItem) {
    if (this.commission == null) {
      this.commission = new ArrayList<InlineResponse20016Pool>();
    }
    this.commission.add(commissionItem);
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20016Pool> getCommission() {
    return commission;
  }


  public void setCommission(List<InlineResponse20016Pool> commission) {
    this.commission = commission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosDistributionV1beta1ValidatorAccumulatedCommission cosmosDistributionV1beta1ValidatorAccumulatedCommission = (CosmosDistributionV1beta1ValidatorAccumulatedCommission) o;
    return Objects.equals(this.commission, cosmosDistributionV1beta1ValidatorAccumulatedCommission.commission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosDistributionV1beta1ValidatorAccumulatedCommission {\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
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

