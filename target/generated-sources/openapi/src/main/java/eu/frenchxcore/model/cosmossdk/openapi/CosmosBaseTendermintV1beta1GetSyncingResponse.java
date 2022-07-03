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
 * GetSyncingResponse is the response type for the Query/GetSyncing RPC method.
 */
@ApiModel(description = "GetSyncingResponse is the response type for the Query/GetSyncing RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosBaseTendermintV1beta1GetSyncingResponse {
  public static final String SERIALIZED_NAME_SYNCING = "syncing";
  @SerializedName(SERIALIZED_NAME_SYNCING)
  private Boolean syncing;


  public CosmosBaseTendermintV1beta1GetSyncingResponse syncing(Boolean syncing) {
    
    this.syncing = syncing;
    return this;
  }

   /**
   * Get syncing
   * @return syncing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSyncing() {
    return syncing;
  }


  public void setSyncing(Boolean syncing) {
    this.syncing = syncing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosBaseTendermintV1beta1GetSyncingResponse cosmosBaseTendermintV1beta1GetSyncingResponse = (CosmosBaseTendermintV1beta1GetSyncingResponse) o;
    return Objects.equals(this.syncing, cosmosBaseTendermintV1beta1GetSyncingResponse.syncing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosBaseTendermintV1beta1GetSyncingResponse {\n");
    sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
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

