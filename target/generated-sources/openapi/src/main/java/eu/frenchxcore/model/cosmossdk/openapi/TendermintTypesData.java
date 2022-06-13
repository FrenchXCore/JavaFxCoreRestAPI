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
 * TendermintTypesData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-12T09:18:01.385767300+02:00[Europe/Paris]")
public class TendermintTypesData {
  public static final String SERIALIZED_NAME_TXS = "txs";
  @SerializedName(SERIALIZED_NAME_TXS)
  private List<byte[]> txs = null;


  public TendermintTypesData txs(List<byte[]> txs) {
    
    this.txs = txs;
    return this;
  }

  public TendermintTypesData addTxsItem(byte[] txsItem) {
    if (this.txs == null) {
      this.txs = new ArrayList<byte[]>();
    }
    this.txs.add(txsItem);
    return this;
  }

   /**
   * Txs that will be applied by state @ block.Height+1. NOTE: not all txs here are valid.  We&#39;re just agreeing on the order first. This means that block.AppHash does not include these txs.
   * @return txs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Txs that will be applied by state @ block.Height+1. NOTE: not all txs here are valid.  We're just agreeing on the order first. This means that block.AppHash does not include these txs.")

  public List<byte[]> getTxs() {
    return txs;
  }


  public void setTxs(List<byte[]> txs) {
    this.txs = txs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TendermintTypesData tendermintTypesData = (TendermintTypesData) o;
    return Objects.equals(this.txs, tendermintTypesData.txs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TendermintTypesData {\n");
    sb.append("    txs: ").append(toIndentedString(txs)).append("\n");
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

