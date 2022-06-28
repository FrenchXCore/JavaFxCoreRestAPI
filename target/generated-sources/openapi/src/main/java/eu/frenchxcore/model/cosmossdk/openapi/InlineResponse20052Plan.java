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
 * plan is the current upgrade plan.
 */
@ApiModel(description = "plan is the current upgrade plan.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class InlineResponse20052Plan {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

  public static final String SERIALIZED_NAME_UPGRADED_CLIENT_STATE = "upgraded_client_state";
  @SerializedName(SERIALIZED_NAME_UPGRADED_CLIENT_STATE)
  private InlineResponse200Accounts upgradedClientState;


  public InlineResponse20052Plan name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Sets the name for the upgrade. This name will be used by the upgraded version of the software to apply any special \&quot;on-upgrade\&quot; commands during the first BeginBlock method after the upgrade is applied. It is also used to detect whether a software version can handle a given upgrade. If no upgrade handler with this name has been set in the software, it will be assumed that the software is out-of-date when the upgrade Time or Height is reached and the software will exit.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sets the name for the upgrade. This name will be used by the upgraded version of the software to apply any special \"on-upgrade\" commands during the first BeginBlock method after the upgrade is applied. It is also used to detect whether a software version can handle a given upgrade. If no upgrade handler with this name has been set in the software, it will be assumed that the software is out-of-date when the upgrade Time or Height is reached and the software will exit.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse20052Plan time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Deprecated: Time based upgrades have been deprecated. Time based upgrade logic has been removed from the SDK. If this field is not empty, an error will be thrown.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated: Time based upgrades have been deprecated. Time based upgrade logic has been removed from the SDK. If this field is not empty, an error will be thrown.")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }


  public InlineResponse20052Plan height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * The height at which the upgrade must be performed. Only used if Time is not set.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height at which the upgrade must be performed. Only used if Time is not set.")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public InlineResponse20052Plan info(String info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInfo() {
    return info;
  }


  public void setInfo(String info) {
    this.info = info;
  }


  public InlineResponse20052Plan upgradedClientState(InlineResponse200Accounts upgradedClientState) {
    
    this.upgradedClientState = upgradedClientState;
    return this;
  }

   /**
   * Get upgradedClientState
   * @return upgradedClientState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse200Accounts getUpgradedClientState() {
    return upgradedClientState;
  }


  public void setUpgradedClientState(InlineResponse200Accounts upgradedClientState) {
    this.upgradedClientState = upgradedClientState;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20052Plan inlineResponse20052Plan = (InlineResponse20052Plan) o;
    return Objects.equals(this.name, inlineResponse20052Plan.name) &&
        Objects.equals(this.time, inlineResponse20052Plan.time) &&
        Objects.equals(this.height, inlineResponse20052Plan.height) &&
        Objects.equals(this.info, inlineResponse20052Plan.info) &&
        Objects.equals(this.upgradedClientState, inlineResponse20052Plan.upgradedClientState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, time, height, info, upgradedClientState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20052Plan {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    upgradedClientState: ").append(toIndentedString(upgradedClientState)).append("\n");
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

