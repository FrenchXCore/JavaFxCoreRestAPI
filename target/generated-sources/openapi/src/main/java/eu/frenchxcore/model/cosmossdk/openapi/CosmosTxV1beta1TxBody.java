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
import java.util.ArrayList;
import java.util.List;

/**
 * TxBody is the body of a transaction that all signers sign over.
 */
@ApiModel(description = "TxBody is the body of a transaction that all signers sign over.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-28T00:22:37.119222300+02:00[Europe/Paris]")
public class CosmosTxV1beta1TxBody {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<InlineResponse200Accounts> messages = null;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_TIMEOUT_HEIGHT = "timeout_height";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_HEIGHT)
  private String timeoutHeight;

  public static final String SERIALIZED_NAME_EXTENSION_OPTIONS = "extension_options";
  @SerializedName(SERIALIZED_NAME_EXTENSION_OPTIONS)
  private List<InlineResponse200Accounts> extensionOptions = null;

  public static final String SERIALIZED_NAME_NON_CRITICAL_EXTENSION_OPTIONS = "non_critical_extension_options";
  @SerializedName(SERIALIZED_NAME_NON_CRITICAL_EXTENSION_OPTIONS)
  private List<InlineResponse200Accounts> nonCriticalExtensionOptions = null;


  public CosmosTxV1beta1TxBody messages(List<InlineResponse200Accounts> messages) {
    
    this.messages = messages;
    return this;
  }

  public CosmosTxV1beta1TxBody addMessagesItem(InlineResponse200Accounts messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<InlineResponse200Accounts>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * messages is a list of messages to be executed. The required signers of those messages define the number and order of elements in AuthInfo&#39;s signer_infos and Tx&#39;s signatures. Each required signer address is added to the list only the first time it occurs. By convention, the first required signer (usually from the first message) is referred to as the primary signer and pays the fee for the whole transaction.
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "messages is a list of messages to be executed. The required signers of those messages define the number and order of elements in AuthInfo's signer_infos and Tx's signatures. Each required signer address is added to the list only the first time it occurs. By convention, the first required signer (usually from the first message) is referred to as the primary signer and pays the fee for the whole transaction.")

  public List<InlineResponse200Accounts> getMessages() {
    return messages;
  }


  public void setMessages(List<InlineResponse200Accounts> messages) {
    this.messages = messages;
  }


  public CosmosTxV1beta1TxBody memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * memo is any arbitrary note/comment to be added to the transaction. WARNING: in clients, any publicly exposed text should not be called memo, but should be called &#x60;note&#x60; instead (see https://github.com/cosmos/cosmos-sdk/issues/9122).
   * @return memo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "memo is any arbitrary note/comment to be added to the transaction. WARNING: in clients, any publicly exposed text should not be called memo, but should be called `note` instead (see https://github.com/cosmos/cosmos-sdk/issues/9122).")

  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public CosmosTxV1beta1TxBody timeoutHeight(String timeoutHeight) {
    
    this.timeoutHeight = timeoutHeight;
    return this;
  }

   /**
   * Get timeoutHeight
   * @return timeoutHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeoutHeight() {
    return timeoutHeight;
  }


  public void setTimeoutHeight(String timeoutHeight) {
    this.timeoutHeight = timeoutHeight;
  }


  public CosmosTxV1beta1TxBody extensionOptions(List<InlineResponse200Accounts> extensionOptions) {
    
    this.extensionOptions = extensionOptions;
    return this;
  }

  public CosmosTxV1beta1TxBody addExtensionOptionsItem(InlineResponse200Accounts extensionOptionsItem) {
    if (this.extensionOptions == null) {
      this.extensionOptions = new ArrayList<InlineResponse200Accounts>();
    }
    this.extensionOptions.add(extensionOptionsItem);
    return this;
  }

   /**
   * Get extensionOptions
   * @return extensionOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse200Accounts> getExtensionOptions() {
    return extensionOptions;
  }


  public void setExtensionOptions(List<InlineResponse200Accounts> extensionOptions) {
    this.extensionOptions = extensionOptions;
  }


  public CosmosTxV1beta1TxBody nonCriticalExtensionOptions(List<InlineResponse200Accounts> nonCriticalExtensionOptions) {
    
    this.nonCriticalExtensionOptions = nonCriticalExtensionOptions;
    return this;
  }

  public CosmosTxV1beta1TxBody addNonCriticalExtensionOptionsItem(InlineResponse200Accounts nonCriticalExtensionOptionsItem) {
    if (this.nonCriticalExtensionOptions == null) {
      this.nonCriticalExtensionOptions = new ArrayList<InlineResponse200Accounts>();
    }
    this.nonCriticalExtensionOptions.add(nonCriticalExtensionOptionsItem);
    return this;
  }

   /**
   * Get nonCriticalExtensionOptions
   * @return nonCriticalExtensionOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<InlineResponse200Accounts> getNonCriticalExtensionOptions() {
    return nonCriticalExtensionOptions;
  }


  public void setNonCriticalExtensionOptions(List<InlineResponse200Accounts> nonCriticalExtensionOptions) {
    this.nonCriticalExtensionOptions = nonCriticalExtensionOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CosmosTxV1beta1TxBody cosmosTxV1beta1TxBody = (CosmosTxV1beta1TxBody) o;
    return Objects.equals(this.messages, cosmosTxV1beta1TxBody.messages) &&
        Objects.equals(this.memo, cosmosTxV1beta1TxBody.memo) &&
        Objects.equals(this.timeoutHeight, cosmosTxV1beta1TxBody.timeoutHeight) &&
        Objects.equals(this.extensionOptions, cosmosTxV1beta1TxBody.extensionOptions) &&
        Objects.equals(this.nonCriticalExtensionOptions, cosmosTxV1beta1TxBody.nonCriticalExtensionOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, memo, timeoutHeight, extensionOptions, nonCriticalExtensionOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CosmosTxV1beta1TxBody {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    timeoutHeight: ").append(toIndentedString(timeoutHeight)).append("\n");
    sb.append("    extensionOptions: ").append(toIndentedString(extensionOptions)).append("\n");
    sb.append("    nonCriticalExtensionOptions: ").append(toIndentedString(nonCriticalExtensionOptions)).append("\n");
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

