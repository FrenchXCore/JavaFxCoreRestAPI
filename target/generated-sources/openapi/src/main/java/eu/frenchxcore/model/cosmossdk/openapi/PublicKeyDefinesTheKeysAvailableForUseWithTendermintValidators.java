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
 * PublicKeyDefinesTheKeysAvailableForUseWithTendermintValidators
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-12T09:18:01.385767300+02:00[Europe/Paris]")
public class PublicKeyDefinesTheKeysAvailableForUseWithTendermintValidators {
  public static final String SERIALIZED_NAME_ED25519 = "ed25519";
  @SerializedName(SERIALIZED_NAME_ED25519)
  private byte[] ed25519;

  public static final String SERIALIZED_NAME_SECP256K1 = "secp256k1";
  @SerializedName(SERIALIZED_NAME_SECP256K1)
  private byte[] secp256k1;


  public PublicKeyDefinesTheKeysAvailableForUseWithTendermintValidators ed25519(byte[] ed25519) {
    
    this.ed25519 = ed25519;
    return this;
  }

   /**
   * Get ed25519
   * @return ed25519
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getEd25519() {
    return ed25519;
  }


  public void setEd25519(byte[] ed25519) {
    this.ed25519 = ed25519;
  }


  public PublicKeyDefinesTheKeysAvailableForUseWithTendermintValidators secp256k1(byte[] secp256k1) {
    
    this.secp256k1 = secp256k1;
    return this;
  }

   /**
   * Get secp256k1
   * @return secp256k1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getSecp256k1() {
    return secp256k1;
  }


  public void setSecp256k1(byte[] secp256k1) {
    this.secp256k1 = secp256k1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKeyDefinesTheKeysAvailableForUseWithTendermintValidators publicKeyDefinesTheKeysAvailableForUseWithTendermintValidators = (PublicKeyDefinesTheKeysAvailableForUseWithTendermintValidators) o;
    return Arrays.equals(this.ed25519, publicKeyDefinesTheKeysAvailableForUseWithTendermintValidators.ed25519) &&
        Arrays.equals(this.secp256k1, publicKeyDefinesTheKeysAvailableForUseWithTendermintValidators.secp256k1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(ed25519), Arrays.hashCode(secp256k1));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKeyDefinesTheKeysAvailableForUseWithTendermintValidators {\n");
    sb.append("    ed25519: ").append(toIndentedString(ed25519)).append("\n");
    sb.append("    secp256k1: ").append(toIndentedString(secp256k1)).append("\n");
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

