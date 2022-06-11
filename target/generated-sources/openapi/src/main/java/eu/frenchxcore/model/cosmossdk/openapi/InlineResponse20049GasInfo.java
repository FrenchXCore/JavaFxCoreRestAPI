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
 * gas_info is the information about gas used in the simulation.
 */
@ApiModel(description = "gas_info is the information about gas used in the simulation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T08:16:25.027082+02:00[Europe/Paris]")
public class InlineResponse20049GasInfo {
  public static final String SERIALIZED_NAME_GAS_WANTED = "gas_wanted";
  @SerializedName(SERIALIZED_NAME_GAS_WANTED)
  private String gasWanted;

  public static final String SERIALIZED_NAME_GAS_USED = "gas_used";
  @SerializedName(SERIALIZED_NAME_GAS_USED)
  private String gasUsed;


  public InlineResponse20049GasInfo gasWanted(String gasWanted) {
    
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


  public InlineResponse20049GasInfo gasUsed(String gasUsed) {
    
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
    InlineResponse20049GasInfo inlineResponse20049GasInfo = (InlineResponse20049GasInfo) o;
    return Objects.equals(this.gasWanted, inlineResponse20049GasInfo.gasWanted) &&
        Objects.equals(this.gasUsed, inlineResponse20049GasInfo.gasUsed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gasWanted, gasUsed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20049GasInfo {\n");
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

