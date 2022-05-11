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
 * TendermintP2pDefaultNodeInfoOther
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-11T15:53:29.765516100+02:00[Europe/Paris]")
public class TendermintP2pDefaultNodeInfoOther {
  public static final String SERIALIZED_NAME_TX_INDEX = "tx_index";
  @SerializedName(SERIALIZED_NAME_TX_INDEX)
  private String txIndex;

  public static final String SERIALIZED_NAME_RPC_ADDRESS = "rpc_address";
  @SerializedName(SERIALIZED_NAME_RPC_ADDRESS)
  private String rpcAddress;


  public TendermintP2pDefaultNodeInfoOther txIndex(String txIndex) {
    
    this.txIndex = txIndex;
    return this;
  }

   /**
   * Get txIndex
   * @return txIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTxIndex() {
    return txIndex;
  }


  public void setTxIndex(String txIndex) {
    this.txIndex = txIndex;
  }


  public TendermintP2pDefaultNodeInfoOther rpcAddress(String rpcAddress) {
    
    this.rpcAddress = rpcAddress;
    return this;
  }

   /**
   * Get rpcAddress
   * @return rpcAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRpcAddress() {
    return rpcAddress;
  }


  public void setRpcAddress(String rpcAddress) {
    this.rpcAddress = rpcAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintP2pDefaultNodeInfoOther tendermintP2pDefaultNodeInfoOther = (TendermintP2pDefaultNodeInfoOther) o;
    return Objects.equals(this.txIndex, tendermintP2pDefaultNodeInfoOther.txIndex) &&
        Objects.equals(this.rpcAddress, tendermintP2pDefaultNodeInfoOther.rpcAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txIndex, rpcAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintP2pDefaultNodeInfoOther {\n");
    sb.append("    txIndex: ").append(toIndentedString(txIndex)).append("\n");
    sb.append("    rpcAddress: ").append(toIndentedString(rpcAddress)).append("\n");
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

