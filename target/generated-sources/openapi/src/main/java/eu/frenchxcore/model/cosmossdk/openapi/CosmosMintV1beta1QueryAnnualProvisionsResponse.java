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
 * QueryAnnualProvisionsResponse is the response type for the Query/AnnualProvisions RPC method.
 */
@ApiModel(description = "QueryAnnualProvisionsResponse is the response type for the Query/AnnualProvisions RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class CosmosMintV1beta1QueryAnnualProvisionsResponse {
  public static final String SERIALIZED_NAME_ANNUAL_PROVISIONS = "annual_provisions";
  @SerializedName(SERIALIZED_NAME_ANNUAL_PROVISIONS)
  private byte[] annualProvisions;


  public CosmosMintV1beta1QueryAnnualProvisionsResponse annualProvisions(byte[] annualProvisions) {
    
    this.annualProvisions = annualProvisions;
    return this;
  }

   /**
   * annual_provisions is the current minting annual provisions value.
   * @return annualProvisions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "annual_provisions is the current minting annual provisions value.")

  public byte[] getAnnualProvisions() {
    return annualProvisions;
  }


  public void setAnnualProvisions(byte[] annualProvisions) {
    this.annualProvisions = annualProvisions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosMintV1beta1QueryAnnualProvisionsResponse cosmosMintV1beta1QueryAnnualProvisionsResponse = (CosmosMintV1beta1QueryAnnualProvisionsResponse) o;
    return Arrays.equals(this.annualProvisions, cosmosMintV1beta1QueryAnnualProvisionsResponse.annualProvisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(annualProvisions));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosMintV1beta1QueryAnnualProvisionsResponse {\n");
    sb.append("    annualProvisions: ").append(toIndentedString(annualProvisions)).append("\n");
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

