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
import eu.frenchxcore.model.cosmossdk.openapi.DataContainsTheSetOfTransactionsIncludedInTheBlock;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockEvidence;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TendermintTypesBlock
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-16T07:33:41.243799100+02:00[Europe/Paris]")
public class TendermintTypesBlock {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private InlineResponse20010BlockHeader header;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private DataContainsTheSetOfTransactionsIncludedInTheBlock data;

  public static final String SERIALIZED_NAME_EVIDENCE = "evidence";
  @SerializedName(SERIALIZED_NAME_EVIDENCE)
  private InlineResponse20010BlockEvidence evidence;

  public static final String SERIALIZED_NAME_LAST_COMMIT = "last_commit";
  @SerializedName(SERIALIZED_NAME_LAST_COMMIT)
  private InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit lastCommit;


  public TendermintTypesBlock header(InlineResponse20010BlockHeader header) {
    
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20010BlockHeader getHeader() {
    return header;
  }


  public void setHeader(InlineResponse20010BlockHeader header) {
    this.header = header;
  }


  public TendermintTypesBlock data(DataContainsTheSetOfTransactionsIncludedInTheBlock data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DataContainsTheSetOfTransactionsIncludedInTheBlock getData() {
    return data;
  }


  public void setData(DataContainsTheSetOfTransactionsIncludedInTheBlock data) {
    this.data = data;
  }


  public TendermintTypesBlock evidence(InlineResponse20010BlockEvidence evidence) {
    
    this.evidence = evidence;
    return this;
  }

   /**
   * Get evidence
   * @return evidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20010BlockEvidence getEvidence() {
    return evidence;
  }


  public void setEvidence(InlineResponse20010BlockEvidence evidence) {
    this.evidence = evidence;
  }


  public TendermintTypesBlock lastCommit(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit lastCommit) {
    
    this.lastCommit = lastCommit;
    return this;
  }

   /**
   * Get lastCommit
   * @return lastCommit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit getLastCommit() {
    return lastCommit;
  }


  public void setLastCommit(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit lastCommit) {
    this.lastCommit = lastCommit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintTypesBlock tendermintTypesBlock = (TendermintTypesBlock) o;
    return Objects.equals(this.header, tendermintTypesBlock.header) &&
        Objects.equals(this.data, tendermintTypesBlock.data) &&
        Objects.equals(this.evidence, tendermintTypesBlock.evidence) &&
        Objects.equals(this.lastCommit, tendermintTypesBlock.lastCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, data, evidence, lastCommit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintTypesBlock {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    lastCommit: ").append(toIndentedString(lastCommit)).append("\n");
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

