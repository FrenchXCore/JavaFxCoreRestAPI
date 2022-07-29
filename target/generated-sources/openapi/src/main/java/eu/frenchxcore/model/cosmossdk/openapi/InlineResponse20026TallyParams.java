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
 * tally_params defines the parameters related to tally.
 */
@ApiModel(description = "tally_params defines the parameters related to tally.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:17.959489600+02:00[Europe/Paris]")
public class InlineResponse20026TallyParams {
  public static final String SERIALIZED_NAME_QUORUM = "quorum";
  @SerializedName(SERIALIZED_NAME_QUORUM)
  private byte[] quorum;

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private byte[] threshold;

  public static final String SERIALIZED_NAME_VETO_THRESHOLD = "veto_threshold";
  @SerializedName(SERIALIZED_NAME_VETO_THRESHOLD)
  private byte[] vetoThreshold;


  public InlineResponse20026TallyParams quorum(byte[] quorum) {
    
    this.quorum = quorum;
    return this;
  }

   /**
   * Minimum percentage of total stake needed to vote for a result to be  considered valid.
   * @return quorum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum percentage of total stake needed to vote for a result to be  considered valid.")

  public byte[] getQuorum() {
    return quorum;
  }


  public void setQuorum(byte[] quorum) {
    this.quorum = quorum;
  }


  public InlineResponse20026TallyParams threshold(byte[] threshold) {
    
    this.threshold = threshold;
    return this;
  }

   /**
   * Minimum proportion of Yes votes for proposal to pass. Default value: 0.5.
   * @return threshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum proportion of Yes votes for proposal to pass. Default value: 0.5.")

  public byte[] getThreshold() {
    return threshold;
  }


  public void setThreshold(byte[] threshold) {
    this.threshold = threshold;
  }


  public InlineResponse20026TallyParams vetoThreshold(byte[] vetoThreshold) {
    
    this.vetoThreshold = vetoThreshold;
    return this;
  }

   /**
   * Minimum value of Veto votes to Total votes ratio for proposal to be  vetoed. Default value: 1/3.
   * @return vetoThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum value of Veto votes to Total votes ratio for proposal to be  vetoed. Default value: 1/3.")

  public byte[] getVetoThreshold() {
    return vetoThreshold;
  }


  public void setVetoThreshold(byte[] vetoThreshold) {
    this.vetoThreshold = vetoThreshold;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20026TallyParams inlineResponse20026TallyParams = (InlineResponse20026TallyParams) o;
    return Arrays.equals(this.quorum, inlineResponse20026TallyParams.quorum) &&
        Arrays.equals(this.threshold, inlineResponse20026TallyParams.threshold) &&
        Arrays.equals(this.vetoThreshold, inlineResponse20026TallyParams.vetoThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(quorum), Arrays.hashCode(threshold), Arrays.hashCode(vetoThreshold));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20026TallyParams {\n");
    sb.append("    quorum: ").append(toIndentedString(quorum)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    vetoThreshold: ").append(toIndentedString(vetoThreshold)).append("\n");
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

