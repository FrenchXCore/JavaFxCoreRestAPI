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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse200Accounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Grant gives permissions to execute the provide method with expiration time.
 */
@ApiModel(description = "Grant gives permissions to execute the provide method with expiration time.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-11T08:16:25.027082+02:00[Europe/Paris]")
public class CosmosAuthzV1beta1Grant {
  public static final String SERIALIZED_NAME_AUTHORIZATION = "authorization";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION)
  private InlineResponse200Accounts authorization;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private OffsetDateTime expiration;


  public CosmosAuthzV1beta1Grant authorization(InlineResponse200Accounts authorization) {
    
    this.authorization = authorization;
    return this;
  }

   /**
   * Get authorization
   * @return authorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200Accounts getAuthorization() {
    return authorization;
  }


  public void setAuthorization(InlineResponse200Accounts authorization) {
    this.authorization = authorization;
  }


  public CosmosAuthzV1beta1Grant expiration(OffsetDateTime expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpiration() {
    return expiration;
  }


  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosAuthzV1beta1Grant cosmosAuthzV1beta1Grant = (CosmosAuthzV1beta1Grant) o;
    return Objects.equals(this.authorization, cosmosAuthzV1beta1Grant.authorization) &&
        Objects.equals(this.expiration, cosmosAuthzV1beta1Grant.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorization, expiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosAuthzV1beta1Grant {\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

