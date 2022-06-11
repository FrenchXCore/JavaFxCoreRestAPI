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
 * CompactBitArray is an implementation of a space efficient bit array. This is used to ensure that the encoded data takes up a minimal amount of space after proto encoding. This is not thread safe, and is not intended for concurrent usage.
 */
@ApiModel(description = "CompactBitArray is an implementation of a space efficient bit array. This is used to ensure that the encoded data takes up a minimal amount of space after proto encoding. This is not thread safe, and is not intended for concurrent usage.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T08:16:25.027082+02:00[Europe/Paris]")
public class CosmosCryptoMultisigV1beta1CompactBitArray {
  public static final String SERIALIZED_NAME_EXTRA_BITS_STORED = "extra_bits_stored";
  @SerializedName(SERIALIZED_NAME_EXTRA_BITS_STORED)
  private Long extraBitsStored;

  public static final String SERIALIZED_NAME_ELEMS = "elems";
  @SerializedName(SERIALIZED_NAME_ELEMS)
  private byte[] elems;


  public CosmosCryptoMultisigV1beta1CompactBitArray extraBitsStored(Long extraBitsStored) {
    
    this.extraBitsStored = extraBitsStored;
    return this;
  }

   /**
   * Get extraBitsStored
   * @return extraBitsStored
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getExtraBitsStored() {
    return extraBitsStored;
  }


  public void setExtraBitsStored(Long extraBitsStored) {
    this.extraBitsStored = extraBitsStored;
  }


  public CosmosCryptoMultisigV1beta1CompactBitArray elems(byte[] elems) {
    
    this.elems = elems;
    return this;
  }

   /**
   * Get elems
   * @return elems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getElems() {
    return elems;
  }


  public void setElems(byte[] elems) {
    this.elems = elems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosCryptoMultisigV1beta1CompactBitArray cosmosCryptoMultisigV1beta1CompactBitArray = (CosmosCryptoMultisigV1beta1CompactBitArray) o;
    return Objects.equals(this.extraBitsStored, cosmosCryptoMultisigV1beta1CompactBitArray.extraBitsStored) &&
        Arrays.equals(this.elems, cosmosCryptoMultisigV1beta1CompactBitArray.elems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraBitsStored, Arrays.hashCode(elems));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosCryptoMultisigV1beta1CompactBitArray {\n");
    sb.append("    extraBitsStored: ").append(toIndentedString(extraBitsStored)).append("\n");
    sb.append("    elems: ").append(toIndentedString(elems)).append("\n");
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

