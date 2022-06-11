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
import eu.frenchxcore.model.cosmossdk.openapi.ValSigningInfoIsTheSigningInfoOfRequestedValConsAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CosmosSlashingV1beta1QuerySigningInfoResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T08:16:25.027082+02:00[Europe/Paris]")
public class CosmosSlashingV1beta1QuerySigningInfoResponse {
  public static final String SERIALIZED_NAME_VAL_SIGNING_INFO = "val_signing_info";
  @SerializedName(SERIALIZED_NAME_VAL_SIGNING_INFO)
  private ValSigningInfoIsTheSigningInfoOfRequestedValConsAddress valSigningInfo;


  public CosmosSlashingV1beta1QuerySigningInfoResponse valSigningInfo(ValSigningInfoIsTheSigningInfoOfRequestedValConsAddress valSigningInfo) {
    
    this.valSigningInfo = valSigningInfo;
    return this;
  }

   /**
   * Get valSigningInfo
   * @return valSigningInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ValSigningInfoIsTheSigningInfoOfRequestedValConsAddress getValSigningInfo() {
    return valSigningInfo;
  }


  public void setValSigningInfo(ValSigningInfoIsTheSigningInfoOfRequestedValConsAddress valSigningInfo) {
    this.valSigningInfo = valSigningInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosSlashingV1beta1QuerySigningInfoResponse cosmosSlashingV1beta1QuerySigningInfoResponse = (CosmosSlashingV1beta1QuerySigningInfoResponse) o;
    return Objects.equals(this.valSigningInfo, cosmosSlashingV1beta1QuerySigningInfoResponse.valSigningInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valSigningInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosSlashingV1beta1QuerySigningInfoResponse {\n");
    sb.append("    valSigningInfo: ").append(toIndentedString(valSigningInfo)).append("\n");
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

