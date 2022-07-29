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
 * QueryDelegatorValidatorsResponse is the response type for the Query/DelegatorValidators RPC method.
 */
@ApiModel(description = "QueryDelegatorValidatorsResponse is the response type for the Query/DelegatorValidators RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:07:17.959489600+02:00[Europe/Paris]")
public class InlineResponse20019 {
  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<String> validators = null;


  public InlineResponse20019 validators(List<String> validators) {
    
    this.validators = validators;
    return this;
  }

  public InlineResponse20019 addValidatorsItem(String validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<String>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * validators defines the validators a delegator is delegating for.
   * @return validators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "validators defines the validators a delegator is delegating for.")

  public List<String> getValidators() {
    return validators;
  }


  public void setValidators(List<String> validators) {
    this.validators = validators;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20019 inlineResponse20019 = (InlineResponse20019) o;
    return Objects.equals(this.validators, inlineResponse20019.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20019 {\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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

