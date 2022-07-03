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
import eu.frenchxcore.model.cosmossdk.openapi.QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodInfo;
import eu.frenchxcore.model.cosmossdk.openapi.QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodPagination;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CosmosSlashingV1beta1QuerySigningInfosResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosSlashingV1beta1QuerySigningInfosResponse {
  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private List<QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodInfo> info = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodPagination pagination;


  public CosmosSlashingV1beta1QuerySigningInfosResponse info(List<QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodInfo> info) {
    
    this.info = info;
    return this;
  }

  public CosmosSlashingV1beta1QuerySigningInfosResponse addInfoItem(QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodInfo infoItem) {
    if (this.info == null) {
      this.info = new ArrayList<QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodInfo>();
    }
    this.info.add(infoItem);
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodInfo> getInfo() {
    return info;
  }


  public void setInfo(List<QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodInfo> info) {
    this.info = info;
  }


  public CosmosSlashingV1beta1QuerySigningInfosResponse pagination(QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodPagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodPagination getPagination() {
    return pagination;
  }


  public void setPagination(QuerySigningInfosResponseIsTheResponseTypeForTheQuerySigningInfosRPCMethodPagination pagination) {
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
    CosmosSlashingV1beta1QuerySigningInfosResponse cosmosSlashingV1beta1QuerySigningInfosResponse = (CosmosSlashingV1beta1QuerySigningInfosResponse) o;
    return Objects.equals(this.info, cosmosSlashingV1beta1QuerySigningInfosResponse.info) &&
        Objects.equals(this.pagination, cosmosSlashingV1beta1QuerySigningInfosResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosSlashingV1beta1QuerySigningInfosResponse {\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

