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
 * Plan specifies information about a planned upgrade and when it should occur.
 */
@ApiModel(description = "Plan specifies information about a planned upgrade and when it should occur.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosUpgradeV1beta1Plan {
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


  public CosmosUpgradeV1beta1Plan name(String name) {
    
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


  public CosmosUpgradeV1beta1Plan time(OffsetDateTime time) {
    
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


  public CosmosUpgradeV1beta1Plan height(String height) {
    
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


  public CosmosUpgradeV1beta1Plan info(String info) {
    
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


  public CosmosUpgradeV1beta1Plan upgradedClientState(InlineResponse200Accounts upgradedClientState) {
    
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
    CosmosUpgradeV1beta1Plan cosmosUpgradeV1beta1Plan = (CosmosUpgradeV1beta1Plan) o;
    return Objects.equals(this.name, cosmosUpgradeV1beta1Plan.name) &&
        Objects.equals(this.time, cosmosUpgradeV1beta1Plan.time) &&
        Objects.equals(this.height, cosmosUpgradeV1beta1Plan.height) &&
        Objects.equals(this.info, cosmosUpgradeV1beta1Plan.info) &&
        Objects.equals(this.upgradedClientState, cosmosUpgradeV1beta1Plan.upgradedClientState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, time, height, info, upgradedClientState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosUpgradeV1beta1Plan {\n");
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

