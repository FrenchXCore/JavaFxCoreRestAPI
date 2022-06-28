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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20043Hist;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryHistoricalInfoResponse is response type for the Query/HistoricalInfo RPC method.
 */
@ApiModel(description = "QueryHistoricalInfoResponse is response type for the Query/HistoricalInfo RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class InlineResponse20043 {
  public static final String SERIALIZED_NAME_HIST = "hist";
  @SerializedName(SERIALIZED_NAME_HIST)
  private InlineResponse20043Hist hist;


  public InlineResponse20043 hist(InlineResponse20043Hist hist) {
    
    this.hist = hist;
    return this;
  }

   /**
   * Get hist
   * @return hist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20043Hist getHist() {
    return hist;
  }


  public void setHist(InlineResponse20043Hist hist) {
    this.hist = hist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20043 inlineResponse20043 = (InlineResponse20043) o;
    return Objects.equals(this.hist, inlineResponse20043.hist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20043 {\n");
    sb.append("    hist: ").append(toIndentedString(hist)).append("\n");
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

