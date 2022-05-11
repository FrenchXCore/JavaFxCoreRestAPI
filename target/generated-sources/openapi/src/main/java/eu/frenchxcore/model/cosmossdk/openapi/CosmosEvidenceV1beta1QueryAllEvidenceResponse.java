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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Accounts;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryAllEvidenceResponse is the response type for the Query/AllEvidence RPC method.
 */
@ApiModel(description = "QueryAllEvidenceResponse is the response type for the Query/AllEvidence RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class CosmosEvidenceV1beta1QueryAllEvidenceResponse {
  public static final String SERIALIZED_NAME_EVIDENCE = "evidence";
  @SerializedName(SERIALIZED_NAME_EVIDENCE)
  private List<InlineResponse200Accounts> evidence = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public CosmosEvidenceV1beta1QueryAllEvidenceResponse evidence(List<InlineResponse200Accounts> evidence) {
    
    this.evidence = evidence;
    return this;
  }

  public CosmosEvidenceV1beta1QueryAllEvidenceResponse addEvidenceItem(InlineResponse200Accounts evidenceItem) {
    if (this.evidence == null) {
      this.evidence = new ArrayList<InlineResponse200Accounts>();
    }
    this.evidence.add(evidenceItem);
    return this;
  }

   /**
   * evidence returns all evidences.
   * @return evidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "evidence returns all evidences.")

  public List<InlineResponse200Accounts> getEvidence() {
    return evidence;
  }


  public void setEvidence(List<InlineResponse200Accounts> evidence) {
    this.evidence = evidence;
  }


  public CosmosEvidenceV1beta1QueryAllEvidenceResponse pagination(InlineResponse200Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200Pagination getPagination() {
    return pagination;
  }


  public void setPagination(InlineResponse200Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosEvidenceV1beta1QueryAllEvidenceResponse cosmosEvidenceV1beta1QueryAllEvidenceResponse = (CosmosEvidenceV1beta1QueryAllEvidenceResponse) o;
    return Objects.equals(this.evidence, cosmosEvidenceV1beta1QueryAllEvidenceResponse.evidence) &&
        Objects.equals(this.pagination, cosmosEvidenceV1beta1QueryAllEvidenceResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evidence, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosEvidenceV1beta1QueryAllEvidenceResponse {\n");
    sb.append("    evidence: ").append(toIndentedString(evidence)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

