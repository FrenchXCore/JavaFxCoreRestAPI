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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20014Pagination;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20055Grants;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * QueryGrantsResponse is the response type for the Query/Authorizations RPC method.
 */
@ApiModel(description = "QueryGrantsResponse is the response type for the Query/Authorizations RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T23:37:17.045990200+02:00[Europe/Paris]")
public class InlineResponse20055 {
  public static final String SERIALIZED_NAME_GRANTS = "grants";
  @SerializedName(SERIALIZED_NAME_GRANTS)
  private List<InlineResponse20055Grants> grants = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse20014Pagination pagination;


  public InlineResponse20055 grants(List<InlineResponse20055Grants> grants) {
    
    this.grants = grants;
    return this;
  }

  public InlineResponse20055 addGrantsItem(InlineResponse20055Grants grantsItem) {
    if (this.grants == null) {
      this.grants = new ArrayList<InlineResponse20055Grants>();
    }
    this.grants.add(grantsItem);
    return this;
  }

   /**
   * authorizations is a list of grants granted for grantee by granter.
   * @return grants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "authorizations is a list of grants granted for grantee by granter.")

  public List<InlineResponse20055Grants> getGrants() {
    return grants;
  }


  public void setGrants(List<InlineResponse20055Grants> grants) {
    this.grants = grants;
  }


  public InlineResponse20055 pagination(InlineResponse20014Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20014Pagination getPagination() {
    return pagination;
  }


  public void setPagination(InlineResponse20014Pagination pagination) {
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
    InlineResponse20055 inlineResponse20055 = (InlineResponse20055) o;
    return Objects.equals(this.grants, inlineResponse20055.grants) &&
        Objects.equals(this.pagination, inlineResponse20055.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grants, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20055 {\n");
    sb.append("    grants: ").append(toIndentedString(grants)).append("\n");
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
