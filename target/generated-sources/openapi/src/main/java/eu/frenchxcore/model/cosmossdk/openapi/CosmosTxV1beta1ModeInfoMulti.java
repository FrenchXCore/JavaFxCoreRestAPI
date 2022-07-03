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
import eu.frenchxcore.model.cosmossdk.openapi.BitarraySpecifiesWhichKeysWithinTheMultisigAreSigning;
import eu.frenchxcore.model.cosmossdk.openapi.CosmosTxV1beta1ModeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CosmosTxV1beta1ModeInfoMulti
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosTxV1beta1ModeInfoMulti {
  public static final String SERIALIZED_NAME_BITARRAY = "bitarray";
  @SerializedName(SERIALIZED_NAME_BITARRAY)
  private BitarraySpecifiesWhichKeysWithinTheMultisigAreSigning bitarray;

  public static final String SERIALIZED_NAME_MODE_INFOS = "mode_infos";
  @SerializedName(SERIALIZED_NAME_MODE_INFOS)
  private List<CosmosTxV1beta1ModeInfo> modeInfos = null;


  public CosmosTxV1beta1ModeInfoMulti bitarray(BitarraySpecifiesWhichKeysWithinTheMultisigAreSigning bitarray) {
    
    this.bitarray = bitarray;
    return this;
  }

   /**
   * Get bitarray
   * @return bitarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BitarraySpecifiesWhichKeysWithinTheMultisigAreSigning getBitarray() {
    return bitarray;
  }


  public void setBitarray(BitarraySpecifiesWhichKeysWithinTheMultisigAreSigning bitarray) {
    this.bitarray = bitarray;
  }


  public CosmosTxV1beta1ModeInfoMulti modeInfos(List<CosmosTxV1beta1ModeInfo> modeInfos) {
    
    this.modeInfos = modeInfos;
    return this;
  }

  public CosmosTxV1beta1ModeInfoMulti addModeInfosItem(CosmosTxV1beta1ModeInfo modeInfosItem) {
    if (this.modeInfos == null) {
      this.modeInfos = new ArrayList<CosmosTxV1beta1ModeInfo>();
    }
    this.modeInfos.add(modeInfosItem);
    return this;
  }

   /**
   * Get modeInfos
   * @return modeInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CosmosTxV1beta1ModeInfo> getModeInfos() {
    return modeInfos;
  }


  public void setModeInfos(List<CosmosTxV1beta1ModeInfo> modeInfos) {
    this.modeInfos = modeInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosTxV1beta1ModeInfoMulti cosmosTxV1beta1ModeInfoMulti = (CosmosTxV1beta1ModeInfoMulti) o;
    return Objects.equals(this.bitarray, cosmosTxV1beta1ModeInfoMulti.bitarray) &&
        Objects.equals(this.modeInfos, cosmosTxV1beta1ModeInfoMulti.modeInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bitarray, modeInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosTxV1beta1ModeInfoMulti {\n");
    sb.append("    bitarray: ").append(toIndentedString(bitarray)).append("\n");
    sb.append("    modeInfos: ").append(toIndentedString(modeInfos)).append("\n");
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

