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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse2005DenomOwners;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Pagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryDenomOwnersResponse defines the RPC response of a DenomOwners RPC query.
 */
@ApiModel(description = "QueryDenomOwnersResponse defines the RPC response of a DenomOwners RPC query.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class InlineResponse2005 {
  public static final String SERIALIZED_NAME_DENOM_OWNERS = "denom_owners";
  @SerializedName(SERIALIZED_NAME_DENOM_OWNERS)
  private List<InlineResponse2005DenomOwners> denomOwners = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse200Pagination pagination;


  public InlineResponse2005 denomOwners(List<InlineResponse2005DenomOwners> denomOwners) {
    
    this.denomOwners = denomOwners;
    return this;
  }

  public InlineResponse2005 addDenomOwnersItem(InlineResponse2005DenomOwners denomOwnersItem) {
    if (this.denomOwners == null) {
      this.denomOwners = new ArrayList<InlineResponse2005DenomOwners>();
    }
    this.denomOwners.add(denomOwnersItem);
    return this;
  }

   /**
   * Get denomOwners
   * @return denomOwners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse2005DenomOwners> getDenomOwners() {
    return denomOwners;
  }


  public void setDenomOwners(List<InlineResponse2005DenomOwners> denomOwners) {
    this.denomOwners = denomOwners;
  }


  public InlineResponse2005 pagination(InlineResponse200Pagination pagination) {
    
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
    InlineResponse2005 inlineResponse2005 = (InlineResponse2005) o;
    return Objects.equals(this.denomOwners, inlineResponse2005.denomOwners) &&
        Objects.equals(this.pagination, inlineResponse2005.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denomOwners, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005 {\n");
    sb.append("    denomOwners: ").append(toIndentedString(denomOwners)).append("\n");
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

