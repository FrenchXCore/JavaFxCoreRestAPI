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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20032Options;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Vote defines a vote on a governance proposal. A Vote consists of a proposal ID, the voter, and the vote option.
 */
@ApiModel(description = "Vote defines a vote on a governance proposal. A Vote consists of a proposal ID, the voter, and the vote option.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class CosmosGovV1beta1Vote {
  public static final String SERIALIZED_NAME_PROPOSAL_ID = "proposal_id";
  @SerializedName(SERIALIZED_NAME_PROPOSAL_ID)
  private String proposalId;

  public static final String SERIALIZED_NAME_VOTER = "voter";
  @SerializedName(SERIALIZED_NAME_VOTER)
  private String voter;

  /**
   * Deprecated: Prefer to use &#x60;options&#x60; instead. This field is set in queries if and only if &#x60;len(options) &#x3D;&#x3D; 1&#x60; and that option has weight 1. In all other cases, this field will default to VOTE_OPTION_UNSPECIFIED.
   */
  @JsonAdapter(OptionEnum.Adapter.class)
  public enum OptionEnum {
    UNSPECIFIED("VOTE_OPTION_UNSPECIFIED"),
    
    YES("VOTE_OPTION_YES"),
    
    ABSTAIN("VOTE_OPTION_ABSTAIN"),
    
    NO("VOTE_OPTION_NO"),
    
    NO_WITH_VETO("VOTE_OPTION_NO_WITH_VETO");

    private String value;

    OptionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OptionEnum fromValue(String value) {
      for (OptionEnum b : OptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OptionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OptionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OptionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OptionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPTION = "option";
  @SerializedName(SERIALIZED_NAME_OPTION)
  private OptionEnum option = OptionEnum.UNSPECIFIED;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<InlineResponse20032Options> options = null;


  public CosmosGovV1beta1Vote proposalId(String proposalId) {
    
    this.proposalId = proposalId;
    return this;
  }

   /**
   * Get proposalId
   * @return proposalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProposalId() {
    return proposalId;
  }


  public void setProposalId(String proposalId) {
    this.proposalId = proposalId;
  }


  public CosmosGovV1beta1Vote voter(String voter) {
    
    this.voter = voter;
    return this;
  }

   /**
   * Get voter
   * @return voter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVoter() {
    return voter;
  }


  public void setVoter(String voter) {
    this.voter = voter;
  }


  public CosmosGovV1beta1Vote option(OptionEnum option) {
    
    this.option = option;
    return this;
  }

   /**
   * Deprecated: Prefer to use &#x60;options&#x60; instead. This field is set in queries if and only if &#x60;len(options) &#x3D;&#x3D; 1&#x60; and that option has weight 1. In all other cases, this field will default to VOTE_OPTION_UNSPECIFIED.
   * @return option
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated: Prefer to use `options` instead. This field is set in queries if and only if `len(options) == 1` and that option has weight 1. In all other cases, this field will default to VOTE_OPTION_UNSPECIFIED.")

  public OptionEnum getOption() {
    return option;
  }


  public void setOption(OptionEnum option) {
    this.option = option;
  }


  public CosmosGovV1beta1Vote options(List<InlineResponse20032Options> options) {
    
    this.options = options;
    return this;
  }

  public CosmosGovV1beta1Vote addOptionsItem(InlineResponse20032Options optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<InlineResponse20032Options>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20032Options> getOptions() {
    return options;
  }


  public void setOptions(List<InlineResponse20032Options> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosGovV1beta1Vote cosmosGovV1beta1Vote = (CosmosGovV1beta1Vote) o;
    return Objects.equals(this.proposalId, cosmosGovV1beta1Vote.proposalId) &&
        Objects.equals(this.voter, cosmosGovV1beta1Vote.voter) &&
        Objects.equals(this.option, cosmosGovV1beta1Vote.option) &&
        Objects.equals(this.options, cosmosGovV1beta1Vote.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proposalId, voter, option, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosGovV1beta1Vote {\n");
    sb.append("    proposalId: ").append(toIndentedString(proposalId)).append("\n");
    sb.append("    voter: ").append(toIndentedString(voter)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

