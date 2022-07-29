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
 * GasInfo defines tx execution gas context.
 */
@ApiModel(description = "GasInfo defines tx execution gas context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class CosmosBaseAbciV1beta1GasInfo {
  public static final String SERIALIZED_NAME_GAS_WANTED = "gas_wanted";
  @SerializedName(SERIALIZED_NAME_GAS_WANTED)
  private String gasWanted;

  public static final String SERIALIZED_NAME_GAS_USED = "gas_used";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;


  public CosmosBaseAbciV1beta1GasInfo gasWanted(String gasWanted) {
    
    this.gasWanted = gasWanted;
    return this;
  }

   /**
   * GasWanted is the maximum units of work we allow this tx to perform.
   * @return gasWanted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GasWanted is the maximum units of work we allow this tx to perform.")

  public String getGasWanted() {
    return gasWanted;
  }


  public void setGasWanted(String gasWanted) {
    this.gasWanted = gasWanted;
  }


  public CosmosBaseAbciV1beta1GasInfo gasUsed(String gasUsed) {
    
    this.gasUsed = gasUsed;
    return this;
  }

   /**
   * GasUsed is the amount of gas actually consumed.
   * @return gasUsed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GasUsed is the amount of gas actually consumed.")

  public String getGasUsed() {
    return gasUsed;
  }


  public void setGasUsed(String gasUsed) {
    this.gasUsed = gasUsed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosBaseAbciV1beta1GasInfo cosmosBaseAbciV1beta1GasInfo = (CosmosBaseAbciV1beta1GasInfo) o;
    return Objects.equals(this.gasWanted, cosmosBaseAbciV1beta1GasInfo.gasWanted) &&
        Objects.equals(this.gasUsed, cosmosBaseAbciV1beta1GasInfo.gasUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gasWanted, gasUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosBaseAbciV1beta1GasInfo {\n");
    sb.append("    gasWanted: ").append(toIndentedString(gasWanted)).append("\n");
    sb.append("    gasUsed: ").append(toIndentedString(gasUsed)).append("\n");
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

