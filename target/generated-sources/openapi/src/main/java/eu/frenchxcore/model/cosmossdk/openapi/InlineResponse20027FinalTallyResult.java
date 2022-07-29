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
 * TallyResult defines a standard tally for a governance proposal.
 */
@ApiModel(description = "TallyResult defines a standard tally for a governance proposal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:17.959489600+02:00[Europe/Paris]")
public class InlineResponse20027FinalTallyResult {
  public static final String SERIALIZED_NAME_YES = "yes";
  @SerializedName(SERIALIZED_NAME_YES)
  private String yes;

  public static final String SERIALIZED_NAME_ABSTAIN = "abstain";
  @SerializedName(SERIALIZED_NAME_ABSTAIN)
  private String abstain;

  public static final String SERIALIZED_NAME_NO = "no";
  @SerializedName(SERIALIZED_NAME_NO)
  private String no;

  public static final String SERIALIZED_NAME_NO_WITH_VETO = "no_with_veto";
  @SerializedName(SERIALIZED_NAME_NO_WITH_VETO)
  private String noWithVeto;


  public InlineResponse20027FinalTallyResult yes(String yes) {
    
    this.yes = yes;
    return this;
  }

   /**
   * Get yes
   * @return yes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getYes() {
    return yes;
  }


  public void setYes(String yes) {
    this.yes = yes;
  }


  public InlineResponse20027FinalTallyResult abstain(String abstain) {
    
    this.abstain = abstain;
    return this;
  }

   /**
   * Get abstain
   * @return abstain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAbstain() {
    return abstain;
  }


  public void setAbstain(String abstain) {
    this.abstain = abstain;
  }


  public InlineResponse20027FinalTallyResult no(String no) {
    
    this.no = no;
    return this;
  }

   /**
   * Get no
   * @return no
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNo() {
    return no;
  }


  public void setNo(String no) {
    this.no = no;
  }


  public InlineResponse20027FinalTallyResult noWithVeto(String noWithVeto) {
    
    this.noWithVeto = noWithVeto;
    return this;
  }

   /**
   * Get noWithVeto
   * @return noWithVeto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNoWithVeto() {
    return noWithVeto;
  }


  public void setNoWithVeto(String noWithVeto) {
    this.noWithVeto = noWithVeto;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027FinalTallyResult inlineResponse20027FinalTallyResult = (InlineResponse20027FinalTallyResult) o;
    return Objects.equals(this.yes, inlineResponse20027FinalTallyResult.yes) &&
        Objects.equals(this.abstain, inlineResponse20027FinalTallyResult.abstain) &&
        Objects.equals(this.no, inlineResponse20027FinalTallyResult.no) &&
        Objects.equals(this.noWithVeto, inlineResponse20027FinalTallyResult.noWithVeto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yes, abstain, no, noWithVeto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027FinalTallyResult {\n");
    sb.append("    yes: ").append(toIndentedString(yes)).append("\n");
    sb.append("    abstain: ").append(toIndentedString(abstain)).append("\n");
    sb.append("    no: ").append(toIndentedString(no)).append("\n");
    sb.append("    noWithVeto: ").append(toIndentedString(noWithVeto)).append("\n");
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

