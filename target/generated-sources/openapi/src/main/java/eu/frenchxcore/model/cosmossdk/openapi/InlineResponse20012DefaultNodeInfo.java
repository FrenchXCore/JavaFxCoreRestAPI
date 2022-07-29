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
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20012DefaultNodeInfoOther;
import eu.frenchxcore.model.cosmossdk.openapi.InlineResponse20012DefaultNodeInfoProtocolVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse20012DefaultNodeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-29T09:44:15.814924900+02:00[Europe/Paris]")
public class InlineResponse20012DefaultNodeInfo {
  public static final String SERIALIZED_NAME_PROTOCOL_VERSION = "protocol_version";
  @SerializedName(SERIALIZED_NAME_PROTOCOL_VERSION)
  private InlineResponse20012DefaultNodeInfoProtocolVersion protocolVersion;

  public static final String SERIALIZED_NAME_DEFAULT_NODE_ID = "default_node_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_NODE_ID)
  private String defaultNodeId;

  public static final String SERIALIZED_NAME_LISTEN_ADDR = "listen_addr";
  @SerializedName(SERIALIZED_NAME_LISTEN_ADDR)
  private String listenAddr;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private String network;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_CHANNELS = "channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS)
  private byte[] channels;

  public static final String SERIALIZED_NAME_MONIKER = "moniker";
  @SerializedName(SERIALIZED_NAME_MONIKER)
  private String moniker;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private InlineResponse20012DefaultNodeInfoOther other;


  public InlineResponse20012DefaultNodeInfo protocolVersion(InlineResponse20012DefaultNodeInfoProtocolVersion protocolVersion) {
    
    this.protocolVersion = protocolVersion;
    return this;
  }

   /**
   * Get protocolVersion
   * @return protocolVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20012DefaultNodeInfoProtocolVersion getProtocolVersion() {
    return protocolVersion;
  }


  public void setProtocolVersion(InlineResponse20012DefaultNodeInfoProtocolVersion protocolVersion) {
    this.protocolVersion = protocolVersion;
  }


  public InlineResponse20012DefaultNodeInfo defaultNodeId(String defaultNodeId) {
    
    this.defaultNodeId = defaultNodeId;
    return this;
  }

   /**
   * Get defaultNodeId
   * @return defaultNodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultNodeId() {
    return defaultNodeId;
  }


  public void setDefaultNodeId(String defaultNodeId) {
    this.defaultNodeId = defaultNodeId;
  }


  public InlineResponse20012DefaultNodeInfo listenAddr(String listenAddr) {
    
    this.listenAddr = listenAddr;
    return this;
  }

   /**
   * Get listenAddr
   * @return listenAddr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getListenAddr() {
    return listenAddr;
  }


  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }


  public InlineResponse20012DefaultNodeInfo network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetwork() {
    return network;
  }


  public void setNetwork(String network) {
    this.network = network;
  }


  public InlineResponse20012DefaultNodeInfo version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public InlineResponse20012DefaultNodeInfo channels(byte[] channels) {
    
    this.channels = channels;
    return this;
  }

   /**
   * Get channels
   * @return channels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getChannels() {
    return channels;
  }


  public void setChannels(byte[] channels) {
    this.channels = channels;
  }


  public InlineResponse20012DefaultNodeInfo moniker(String moniker) {
    
    this.moniker = moniker;
    return this;
  }

   /**
   * Get moniker
   * @return moniker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMoniker() {
    return moniker;
  }


  public void setMoniker(String moniker) {
    this.moniker = moniker;
  }


  public InlineResponse20012DefaultNodeInfo other(InlineResponse20012DefaultNodeInfoOther other) {
    
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InlineResponse20012DefaultNodeInfoOther getOther() {
    return other;
  }


  public void setOther(InlineResponse20012DefaultNodeInfoOther other) {
    this.other = other;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012DefaultNodeInfo inlineResponse20012DefaultNodeInfo = (InlineResponse20012DefaultNodeInfo) o;
    return Objects.equals(this.protocolVersion, inlineResponse20012DefaultNodeInfo.protocolVersion) &&
        Objects.equals(this.defaultNodeId, inlineResponse20012DefaultNodeInfo.defaultNodeId) &&
        Objects.equals(this.listenAddr, inlineResponse20012DefaultNodeInfo.listenAddr) &&
        Objects.equals(this.network, inlineResponse20012DefaultNodeInfo.network) &&
        Objects.equals(this.version, inlineResponse20012DefaultNodeInfo.version) &&
        Arrays.equals(this.channels, inlineResponse20012DefaultNodeInfo.channels) &&
        Objects.equals(this.moniker, inlineResponse20012DefaultNodeInfo.moniker) &&
        Objects.equals(this.other, inlineResponse20012DefaultNodeInfo.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocolVersion, defaultNodeId, listenAddr, network, version, Arrays.hashCode(channels), moniker, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012DefaultNodeInfo {\n");
    sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
    sb.append("    defaultNodeId: ").append(toIndentedString(defaultNodeId)).append("\n");
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    moniker: ").append(toIndentedString(moniker)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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

