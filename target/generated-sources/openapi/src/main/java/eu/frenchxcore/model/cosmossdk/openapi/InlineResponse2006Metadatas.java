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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse2006DenomUnits;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Metadata represents a struct that describes a basic token.
 */
@ApiModel(description = "Metadata represents a struct that describes a basic token.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:17.959489600+02:00[Europe/Paris]")
public class InlineResponse2006Metadatas {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DENOM_UNITS = "denom_units";
  @SerializedName(SERIALIZED_NAME_DENOM_UNITS)
  private List<InlineResponse2006DenomUnits> denomUnits = null;

  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private String base;

  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private String display;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_URI_HASH = "uri_hash";
  @SerializedName(SERIALIZED_NAME_URI_HASH)
  private String uriHash;


  public InlineResponse2006Metadatas description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InlineResponse2006Metadatas denomUnits(List<InlineResponse2006DenomUnits> denomUnits) {
    
    this.denomUnits = denomUnits;
    return this;
  }

  public InlineResponse2006Metadatas addDenomUnitsItem(InlineResponse2006DenomUnits denomUnitsItem) {
    if (this.denomUnits == null) {
      this.denomUnits = new ArrayList<InlineResponse2006DenomUnits>();
    }
    this.denomUnits.add(denomUnitsItem);
    return this;
  }

   /**
   * Get denomUnits
   * @return denomUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse2006DenomUnits> getDenomUnits() {
    return denomUnits;
  }


  public void setDenomUnits(List<InlineResponse2006DenomUnits> denomUnits) {
    this.denomUnits = denomUnits;
  }


  public InlineResponse2006Metadatas base(String base) {
    
    this.base = base;
    return this;
  }

   /**
   * base represents the base denom (should be the DenomUnit with exponent &#x3D; 0).
   * @return base
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "base represents the base denom (should be the DenomUnit with exponent = 0).")

  public String getBase() {
    return base;
  }


  public void setBase(String base) {
    this.base = base;
  }


  public InlineResponse2006Metadatas display(String display) {
    
    this.display = display;
    return this;
  }

   /**
   * display indicates the suggested denom that should be displayed in clients.
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "display indicates the suggested denom that should be displayed in clients.")

  public String getDisplay() {
    return display;
  }


  public void setDisplay(String display) {
    this.display = display;
  }


  public InlineResponse2006Metadatas name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2006Metadatas symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * symbol is the token symbol usually shown on exchanges (eg: ATOM). This can be the same as the display.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "symbol is the token symbol usually shown on exchanges (eg: ATOM). This can be the same as the display.")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public InlineResponse2006Metadatas uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI to a document (on or off-chain) that contains additional information. Optional.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI to a document (on or off-chain) that contains additional information. Optional.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public InlineResponse2006Metadatas uriHash(String uriHash) {
    
    this.uriHash = uriHash;
    return this;
  }

   /**
   * URIHash is a sha256 hash of a document pointed by URI. It&#39;s used to verify that the document didn&#39;t change. Optional.
   * @return uriHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URIHash is a sha256 hash of a document pointed by URI. It's used to verify that the document didn't change. Optional.")

  public String getUriHash() {
    return uriHash;
  }


  public void setUriHash(String uriHash) {
    this.uriHash = uriHash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006Metadatas inlineResponse2006Metadatas = (InlineResponse2006Metadatas) o;
    return Objects.equals(this.description, inlineResponse2006Metadatas.description) &&
        Objects.equals(this.denomUnits, inlineResponse2006Metadatas.denomUnits) &&
        Objects.equals(this.base, inlineResponse2006Metadatas.base) &&
        Objects.equals(this.display, inlineResponse2006Metadatas.display) &&
        Objects.equals(this.name, inlineResponse2006Metadatas.name) &&
        Objects.equals(this.symbol, inlineResponse2006Metadatas.symbol) &&
        Objects.equals(this.uri, inlineResponse2006Metadatas.uri) &&
        Objects.equals(this.uriHash, inlineResponse2006Metadatas.uriHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, denomUnits, base, display, name, symbol, uri, uriHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006Metadatas {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    denomUnits: ").append(toIndentedString(denomUnits)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    uriHash: ").append(toIndentedString(uriHash)).append("\n");
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

