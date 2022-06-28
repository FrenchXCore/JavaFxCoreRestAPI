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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20010BlockHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader {
  public static final String SERIALIZED_NAME_HEADER = "header";
  @SerializedName(SERIALIZED_NAME_HEADER)
  private InlineResponse20010BlockHeader header;

  public static final String SERIALIZED_NAME_COMMIT = "commit";
  @SerializedName(SERIALIZED_NAME_COMMIT)
  private InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit commit;


  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader header(InlineResponse20010BlockHeader header) {
    
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


  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader commit(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit commit) {
    
    this.commit = commit;
    return this;
  }

   /**
   * Get commit
   * @return commit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit getCommit() {
    return commit;
  }


  public void setCommit(InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeaderCommit commit) {
    this.commit = commit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader = (InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader) o;
    return Objects.equals(this.header, inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader.header) &&
        Objects.equals(this.commit, inlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader.commit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, commit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010BlockEvidenceLightClientAttackEvidenceConflictingBlockSignedHeader {\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
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

