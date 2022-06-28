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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20027FinalTallyResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryTallyResultResponse is the response type for the Query/Tally RPC method.
 */
@ApiModel(description = "QueryTallyResultResponse is the response type for the Query/Tally RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class CosmosGovV1beta1QueryTallyResultResponse {
  public static final String SERIALIZED_NAME_TALLY = "tally";
  @SerializedName(SERIALIZED_NAME_TALLY)
  private InlineResponse20027FinalTallyResult tally;


  public CosmosGovV1beta1QueryTallyResultResponse tally(InlineResponse20027FinalTallyResult tally) {
    
    this.tally = tally;
    return this;
  }

   /**
   * Get tally
   * @return tally
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20027FinalTallyResult getTally() {
    return tally;
  }


  public void setTally(InlineResponse20027FinalTallyResult tally) {
    this.tally = tally;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1QueryTallyResultResponse cosmosGovV1beta1QueryTallyResultResponse = (CosmosGovV1beta1QueryTallyResultResponse) o;
    return Objects.equals(this.tally, cosmosGovV1beta1QueryTallyResultResponse.tally);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tally);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1QueryTallyResultResponse {\n");
    sb.append("    tally: ").append(toIndentedString(tally)).append("\n");
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

