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
 * TendermintP2pDefaultNodeInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class TendermintP2pDefaultNodeInfo {
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


  public TendermintP2pDefaultNodeInfo protocolVersion(InlineResponse20012DefaultNodeInfoProtocolVersion protocolVersion) {
    
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


  public TendermintP2pDefaultNodeInfo defaultNodeId(String defaultNodeId) {
    
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


  public TendermintP2pDefaultNodeInfo listenAddr(String listenAddr) {
    
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


  public TendermintP2pDefaultNodeInfo network(String network) {
    
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


  public TendermintP2pDefaultNodeInfo version(String version) {
    
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


  public TendermintP2pDefaultNodeInfo channels(byte[] channels) {
    
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


  public TendermintP2pDefaultNodeInfo moniker(String moniker) {
    
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


  public TendermintP2pDefaultNodeInfo other(InlineResponse20012DefaultNodeInfoOther other) {
    
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
    TendermintP2pDefaultNodeInfo tendermintP2pDefaultNodeInfo = (TendermintP2pDefaultNodeInfo) o;
    return Objects.equals(this.protocolVersion, tendermintP2pDefaultNodeInfo.protocolVersion) &&
        Objects.equals(this.defaultNodeId, tendermintP2pDefaultNodeInfo.defaultNodeId) &&
        Objects.equals(this.listenAddr, tendermintP2pDefaultNodeInfo.listenAddr) &&
        Objects.equals(this.network, tendermintP2pDefaultNodeInfo.network) &&
        Objects.equals(this.version, tendermintP2pDefaultNodeInfo.version) &&
        Arrays.equals(this.channels, tendermintP2pDefaultNodeInfo.channels) &&
        Objects.equals(this.moniker, tendermintP2pDefaultNodeInfo.moniker) &&
        Objects.equals(this.other, tendermintP2pDefaultNodeInfo.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocolVersion, defaultNodeId, listenAddr, network, version, Arrays.hashCode(channels), moniker, other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintP2pDefaultNodeInfo {\n");
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

