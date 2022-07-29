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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20014Pagination;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20014Validators;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GetValidatorSetByHeightResponse is the response type for the Query/GetValidatorSetByHeight RPC method.
 */
@ApiModel(description = "GetValidatorSetByHeightResponse is the response type for the Query/GetValidatorSetByHeight RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:17.959489600+02:00[Europe/Paris]")
public class InlineResponse20015 {
  public static final String SERIALIZED_NAME_BLOCK_HEIGHT = "block_height";
  @SerializedName(SERIALIZED_NAME_BLOCK_HEIGHT)
  private String blockHeight;

  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<InlineResponse20014Validators> validators = null;

  public static final String SERIALIZED_NAME_PAGINATION = "pagination";
  @SerializedName(SERIALIZED_NAME_PAGINATION)
  private InlineResponse20014Pagination pagination;


  public InlineResponse20015 blockHeight(String blockHeight) {
    
    this.blockHeight = blockHeight;
    return this;
  }

   /**
   * Get blockHeight
   * @return blockHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBlockHeight() {
    return blockHeight;
  }


  public void setBlockHeight(String blockHeight) {
    this.blockHeight = blockHeight;
  }


  public InlineResponse20015 validators(List<InlineResponse20014Validators> validators) {
    
    this.validators = validators;
    return this;
  }

  public InlineResponse20015 addValidatorsItem(InlineResponse20014Validators validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<InlineResponse20014Validators>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse20014Validators> getValidators() {
    return validators;
  }


  public void setValidators(List<InlineResponse20014Validators> validators) {
    this.validators = validators;
  }


  public InlineResponse20015 pagination(InlineResponse20014Pagination pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20014Pagination getPagination() {
    return pagination;
  }


  public void setPagination(InlineResponse20014Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015 inlineResponse20015 = (InlineResponse20015) o;
    return Objects.equals(this.blockHeight, inlineResponse20015.blockHeight) &&
        Objects.equals(this.validators, inlineResponse20015.validators) &&
        Objects.equals(this.pagination, inlineResponse20015.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockHeight, validators, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015 {\n");
    sb.append("    blockHeight: ").append(toIndentedString(blockHeight)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

