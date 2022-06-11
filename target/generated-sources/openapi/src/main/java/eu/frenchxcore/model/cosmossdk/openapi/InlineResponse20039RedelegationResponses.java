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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20039Entries;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20039Redelegation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RedelegationResponse is equivalent to a Redelegation except that its entries contain a balance in addition to shares which is more suitable for client responses.
 */
@ApiModel(description = "RedelegationResponse is equivalent to a Redelegation except that its entries contain a balance in addition to shares which is more suitable for client responses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T08:16:25.027082+02:00[Europe/Paris]")
public class InlineResponse20039RedelegationResponses {
  public static final String SERIALIZED_NAME_REDELEGATION = "redelegation";
  @SerializedName(SERIALIZED_NAME_REDELEGATION)
  private InlineResponse20039Redelegation redelegation;

  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<InlineResponse20039Entries> entries = null;


  public InlineResponse20039RedelegationResponses redelegation(InlineResponse20039Redelegation redelegation) {
    
    this.redelegation = redelegation;
    return this;
  }

   /**
   * Get redelegation
   * @return redelegation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20039Redelegation getRedelegation() {
    return redelegation;
  }


  public void setRedelegation(InlineResponse20039Redelegation redelegation) {
    this.redelegation = redelegation;
  }


  public InlineResponse20039RedelegationResponses entries(List<InlineResponse20039Entries> entries) {
    
    this.entries = entries;
    return this;
  }

  public InlineResponse20039RedelegationResponses addEntriesItem(InlineResponse20039Entries entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<InlineResponse20039Entries>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20039Entries> getEntries() {
    return entries;
  }


  public void setEntries(List<InlineResponse20039Entries> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20039RedelegationResponses inlineResponse20039RedelegationResponses = (InlineResponse20039RedelegationResponses) o;
    return Objects.equals(this.redelegation, inlineResponse20039RedelegationResponses.redelegation) &&
        Objects.equals(this.entries, inlineResponse20039RedelegationResponses.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redelegation, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20039RedelegationResponses {\n");
    sb.append("    redelegation: ").append(toIndentedString(redelegation)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

