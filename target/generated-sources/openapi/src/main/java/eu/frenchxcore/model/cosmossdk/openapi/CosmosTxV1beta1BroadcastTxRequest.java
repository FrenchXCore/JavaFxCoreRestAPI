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
 * BroadcastTxRequest is the request type for the Service.BroadcastTxRequest RPC method.
 */
@ApiModel(description = "BroadcastTxRequest is the request type for the Service.BroadcastTxRequest RPC method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-03T14:44:16.849699+02:00[Europe/Paris]")
public class CosmosTxV1beta1BroadcastTxRequest {
  public static final String SERIALIZED_NAME_TX_BYTES = "tx_bytes";
  @SerializedName(SERIALIZED_NAME_TX_BYTES)
  private byte[] txBytes;

  /**
   * BroadcastMode specifies the broadcast mode for the TxService.Broadcast RPC method.   - BROADCAST_MODE_UNSPECIFIED: zero-value for mode ordering  - BROADCAST_MODE_BLOCK: BROADCAST_MODE_BLOCK defines a tx broadcasting mode where the client waits for the tx to be committed in a block.  - BROADCAST_MODE_SYNC: BROADCAST_MODE_SYNC defines a tx broadcasting mode where the client waits for a CheckTx execution response only.  - BROADCAST_MODE_ASYNC: BROADCAST_MODE_ASYNC defines a tx broadcasting mode where the client returns immediately.
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    UNSPECIFIED("BROADCAST_MODE_UNSPECIFIED"),
    
    BLOCK("BROADCAST_MODE_BLOCK"),
    
    SYNC("BROADCAST_MODE_SYNC"),
    
    ASYNC("BROADCAST_MODE_ASYNC");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private ModeEnum mode = ModeEnum.UNSPECIFIED;


  public CosmosTxV1beta1BroadcastTxRequest txBytes(byte[] txBytes) {
    
    this.txBytes = txBytes;
    return this;
  }

   /**
   * tx_bytes is the raw transaction.
   * @return txBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tx_bytes is the raw transaction.")

  public byte[] getTxBytes() {
    return txBytes;
  }


  public void setTxBytes(byte[] txBytes) {
    this.txBytes = txBytes;
  }


  public CosmosTxV1beta1BroadcastTxRequest mode(ModeEnum mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * BroadcastMode specifies the broadcast mode for the TxService.Broadcast RPC method.   - BROADCAST_MODE_UNSPECIFIED: zero-value for mode ordering  - BROADCAST_MODE_BLOCK: BROADCAST_MODE_BLOCK defines a tx broadcasting mode where the client waits for the tx to be committed in a block.  - BROADCAST_MODE_SYNC: BROADCAST_MODE_SYNC defines a tx broadcasting mode where the client waits for a CheckTx execution response only.  - BROADCAST_MODE_ASYNC: BROADCAST_MODE_ASYNC defines a tx broadcasting mode where the client returns immediately.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BroadcastMode specifies the broadcast mode for the TxService.Broadcast RPC method.   - BROADCAST_MODE_UNSPECIFIED: zero-value for mode ordering  - BROADCAST_MODE_BLOCK: BROADCAST_MODE_BLOCK defines a tx broadcasting mode where the client waits for the tx to be committed in a block.  - BROADCAST_MODE_SYNC: BROADCAST_MODE_SYNC defines a tx broadcasting mode where the client waits for a CheckTx execution response only.  - BROADCAST_MODE_ASYNC: BROADCAST_MODE_ASYNC defines a tx broadcasting mode where the client returns immediately.")

  public ModeEnum getMode() {
    return mode;
  }


  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosTxV1beta1BroadcastTxRequest cosmosTxV1beta1BroadcastTxRequest = (CosmosTxV1beta1BroadcastTxRequest) o;
    return Arrays.equals(this.txBytes, cosmosTxV1beta1BroadcastTxRequest.txBytes) &&
        Objects.equals(this.mode, cosmosTxV1beta1BroadcastTxRequest.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(txBytes), mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosTxV1beta1BroadcastTxRequest {\n");
    sb.append("    txBytes: ").append(toIndentedString(txBytes)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

