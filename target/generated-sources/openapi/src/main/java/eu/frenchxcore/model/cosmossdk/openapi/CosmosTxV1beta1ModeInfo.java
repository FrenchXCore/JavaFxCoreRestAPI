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
import eu.frenchxcore.model.cosmossdk.openapi.CosmosTxV1beta1ModeInfoMulti;
import eu.frenchxcore.model.cosmossdk.openapi.SingleRepresentsASingleSigner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ModeInfo describes the signing mode of a single or nested multisig signer.
 */
@ApiModel(description = "ModeInfo describes the signing mode of a single or nested multisig signer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T23:37:17.045990200+02:00[Europe/Paris]")
public class CosmosTxV1beta1ModeInfo {
  public static final String SERIALIZED_NAME_SINGLE = "single";
  @SerializedName(SERIALIZED_NAME_SINGLE)
  private SingleRepresentsASingleSigner single;

  public static final String SERIALIZED_NAME_MULTI = "multi";
  @SerializedName(SERIALIZED_NAME_MULTI)
  private CosmosTxV1beta1ModeInfoMulti multi;


  public CosmosTxV1beta1ModeInfo single(SingleRepresentsASingleSigner single) {
    
    this.single = single;
    return this;
  }

   /**
   * Get single
   * @return single
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SingleRepresentsASingleSigner getSingle() {
    return single;
  }


  public void setSingle(SingleRepresentsASingleSigner single) {
    this.single = single;
  }


  public CosmosTxV1beta1ModeInfo multi(CosmosTxV1beta1ModeInfoMulti multi) {
    
    this.multi = multi;
    return this;
  }

   /**
   * Get multi
   * @return multi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CosmosTxV1beta1ModeInfoMulti getMulti() {
    return multi;
  }


  public void setMulti(CosmosTxV1beta1ModeInfoMulti multi) {
    this.multi = multi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosTxV1beta1ModeInfo cosmosTxV1beta1ModeInfo = (CosmosTxV1beta1ModeInfo) o;
    return Objects.equals(this.single, cosmosTxV1beta1ModeInfo.single) &&
        Objects.equals(this.multi, cosmosTxV1beta1ModeInfo.multi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(single, multi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosTxV1beta1ModeInfo {\n");
    sb.append("    single: ").append(toIndentedString(single)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
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
