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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20041Validators;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * QueryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class QueryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod {
  public static final String SERIALIZED_NAME_VALIDATOR = "validator";
  @SerializedName(SERIALIZED_NAME_VALIDATOR)
  private InlineResponse20041Validators validator;


  public QueryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod validator(InlineResponse20041Validators validator) {
    
    this.validator = validator;
    return this;
  }

   /**
   * Get validator
   * @return validator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20041Validators getValidator() {
    return validator;
  }


  public void setValidator(InlineResponse20041Validators validator) {
    this.validator = validator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod queryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod = (QueryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod) o;
    return Objects.equals(this.validator, queryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod.validator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryValidatorResponseIsResponseTypeForTheQueryValidatorRPCMethod {\n");
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
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

