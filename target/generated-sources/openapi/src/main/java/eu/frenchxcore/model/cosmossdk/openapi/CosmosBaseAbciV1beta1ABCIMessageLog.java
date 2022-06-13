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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20050TxResponseEvents;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ABCIMessageLog defines a structure containing an indexed tx ABCI message log.
 */
@ApiModel(description = "ABCIMessageLog defines a structure containing an indexed tx ABCI message log.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-12T09:18:01.385767300+02:00[Europe/Paris]")
public class CosmosBaseAbciV1beta1ABCIMessageLog {
  public static final String SERIALIZED_NAME_MSG_INDEX = "msg_index";
  @SerializedName(SERIALIZED_NAME_MSG_INDEX)
  private Long msgIndex;

  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private String log;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<InlineResponse20050TxResponseEvents> events = null;


  public CosmosBaseAbciV1beta1ABCIMessageLog msgIndex(Long msgIndex) {
    
    this.msgIndex = msgIndex;
    return this;
  }

   /**
   * Get msgIndex
   * @return msgIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMsgIndex() {
    return msgIndex;
  }


  public void setMsgIndex(Long msgIndex) {
    this.msgIndex = msgIndex;
  }


  public CosmosBaseAbciV1beta1ABCIMessageLog log(String log) {
    
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLog() {
    return log;
  }


  public void setLog(String log) {
    this.log = log;
  }


  public CosmosBaseAbciV1beta1ABCIMessageLog events(List<InlineResponse20050TxResponseEvents> events) {
    
    this.events = events;
    return this;
  }

  public CosmosBaseAbciV1beta1ABCIMessageLog addEventsItem(InlineResponse20050TxResponseEvents eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<InlineResponse20050TxResponseEvents>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events contains a slice of Event objects that were emitted during some execution.
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Events contains a slice of Event objects that were emitted during some execution.")

  public List<InlineResponse20050TxResponseEvents> getEvents() {
    return events;
  }


  public void setEvents(List<InlineResponse20050TxResponseEvents> events) {
    this.events = events;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosBaseAbciV1beta1ABCIMessageLog cosmosBaseAbciV1beta1ABCIMessageLog = (CosmosBaseAbciV1beta1ABCIMessageLog) o;
    return Objects.equals(this.msgIndex, cosmosBaseAbciV1beta1ABCIMessageLog.msgIndex) &&
        Objects.equals(this.log, cosmosBaseAbciV1beta1ABCIMessageLog.log) &&
        Objects.equals(this.events, cosmosBaseAbciV1beta1ABCIMessageLog.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msgIndex, log, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosBaseAbciV1beta1ABCIMessageLog {\n");
    sb.append("    msgIndex: ").append(toIndentedString(msgIndex)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

