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
import java.util.ArrayList;
import java.util.List;

/**
 * DenomUnit represents a struct that describes a given denomination unit of the basic token.
 */
@ApiModel(description = "DenomUnit represents a struct that describes a given denomination unit of the basic token.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class InlineResponse2006DenomUnits {
  public static final String SERIALIZED_NAME_DENOM = "denom";
  @SerializedName(SERIALIZED_NAME_DENOM)
  private String denom;

  public static final String SERIALIZED_NAME_EXPONENT = "exponent";
  @SerializedName(SERIALIZED_NAME_EXPONENT)
  private Long exponent;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<String> aliases = null;


  public InlineResponse2006DenomUnits denom(String denom) {
    
    this.denom = denom;
    return this;
  }

   /**
   * denom represents the string name of the given denom unit (e.g uatom).
   * @return denom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "denom represents the string name of the given denom unit (e.g uatom).")

  public String getDenom() {
    return denom;
  }


  public void setDenom(String denom) {
    this.denom = denom;
  }


  public InlineResponse2006DenomUnits exponent(Long exponent) {
    
    this.exponent = exponent;
    return this;
  }

   /**
   * exponent represents power of 10 exponent that one must raise the base_denom to in order to equal the given DenomUnit&#39;s denom 1 denom &#x3D; 1^exponent base_denom (e.g. with a base_denom of uatom, one can create a DenomUnit of &#39;atom&#39; with exponent &#x3D; 6, thus: 1 atom &#x3D; 10^6 uatom).
   * @return exponent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "exponent represents power of 10 exponent that one must raise the base_denom to in order to equal the given DenomUnit's denom 1 denom = 1^exponent base_denom (e.g. with a base_denom of uatom, one can create a DenomUnit of 'atom' with exponent = 6, thus: 1 atom = 10^6 uatom).")

  public Long getExponent() {
    return exponent;
  }


  public void setExponent(Long exponent) {
    this.exponent = exponent;
  }


  public InlineResponse2006DenomUnits aliases(List<String> aliases) {
    
    this.aliases = aliases;
    return this;
  }

  public InlineResponse2006DenomUnits addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<String>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * Get aliases
   * @return aliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAliases() {
    return aliases;
  }


  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006DenomUnits inlineResponse2006DenomUnits = (InlineResponse2006DenomUnits) o;
    return Objects.equals(this.denom, inlineResponse2006DenomUnits.denom) &&
        Objects.equals(this.exponent, inlineResponse2006DenomUnits.exponent) &&
        Objects.equals(this.aliases, inlineResponse2006DenomUnits.aliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(denom, exponent, aliases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006DenomUnits {\n");
    sb.append("    denom: ").append(toIndentedString(denom)).append("\n");
    sb.append("    exponent: ").append(toIndentedString(exponent)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
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

