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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TendermintTypesLightBlock
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class TendermintTypesLightBlock {
  public static final String SERIALIZED_NAME_SIGNED_HEADER = "signed_header";
  @SerializedName(SERIALIZED_NAME_SIGNED_HEADER)
  private InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader signedHeader;

  public static final String SERIALIZED_NAME_VALIDATOR_SET = "validator_set";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_SET)
  private InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSet validatorSet;


  public TendermintTypesLightBlock signedHeader(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader signedHeader) {
    
    this.signedHeader = signedHeader;
    return this;
  }

   /**
   * Get signedHeader
   * @return signedHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader getSignedHeader() {
    return signedHeader;
  }


  public void setSignedHeader(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader signedHeader) {
    this.signedHeader = signedHeader;
  }


  public TendermintTypesLightBlock validatorSet(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSet validatorSet) {
    
    this.validatorSet = validatorSet;
    return this;
  }

   /**
   * Get validatorSet
   * @return validatorSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSet getValidatorSet() {
    return validatorSet;
  }


  public void setValidatorSet(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockValidatorSet validatorSet) {
    this.validatorSet = validatorSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintTypesLightBlock tendermintTypesLightBlock = (TendermintTypesLightBlock) o;
    return Objects.equals(this.signedHeader, tendermintTypesLightBlock.signedHeader) &&
        Objects.equals(this.validatorSet, tendermintTypesLightBlock.validatorSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedHeader, validatorSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintTypesLightBlock {\n");
    sb.append("    signedHeader: ").append(toIndentedString(signedHeader)).append("\n");
    sb.append("    validatorSet: ").append(toIndentedString(validatorSet)).append("\n");
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

