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
 * EventAttribute is a single key-value pair, associated with an event.
 */
@ApiModel(description = "EventAttribute is a single key-value pair, associated with an event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class TendermintAbciEventAttribute {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private byte[] key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private byte[] value;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Boolean index;


  public TendermintAbciEventAttribute key(byte[] key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getKey() {
    return key;
  }


  public void setKey(byte[] key) {
    this.key = key;
  }


  public TendermintAbciEventAttribute value(byte[] value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getValue() {
    return value;
  }


  public void setValue(byte[] value) {
    this.value = value;
  }


  public TendermintAbciEventAttribute index(Boolean index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIndex() {
    return index;
  }


  public void setIndex(Boolean index) {
    this.index = index;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintAbciEventAttribute tendermintAbciEventAttribute = (TendermintAbciEventAttribute) o;
    return Arrays.equals(this.key, tendermintAbciEventAttribute.key) &&
        Arrays.equals(this.value, tendermintAbciEventAttribute.value) &&
        Objects.equals(this.index, tendermintAbciEventAttribute.index);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(key), Arrays.hashCode(value), index);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintAbciEventAttribute {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

