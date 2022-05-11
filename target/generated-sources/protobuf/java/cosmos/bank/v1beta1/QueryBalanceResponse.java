// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

/**
 * <pre>
 * QueryBalanceResponse is the response type for the Query/Balance RPC method.
 * </pre>
 *
 * Protobuf type {@code cosmos.bank.v1beta1.QueryBalanceResponse}
 */
public final class QueryBalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.bank.v1beta1.QueryBalanceResponse)
    QueryBalanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBalanceResponse.newBuilder() to construct.
  private QueryBalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBalanceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBalanceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryBalanceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            cosmos.base.v1beta1.CoinOuterClass.Coin.Builder subBuilder = null;
            if (balance_ != null) {
              subBuilder = balance_.toBuilder();
            }
            balance_ = input.readMessage(cosmos.base.v1beta1.CoinOuterClass.Coin.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(balance_);
              balance_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.bank.v1beta1.CosmosBankQueryProto.internal_static_cosmos_bank_v1beta1_QueryBalanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.bank.v1beta1.CosmosBankQueryProto.internal_static_cosmos_bank_v1beta1_QueryBalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.bank.v1beta1.QueryBalanceResponse.class, cosmos.bank.v1beta1.QueryBalanceResponse.Builder.class);
  }

  public static final int BALANCE_FIELD_NUMBER = 1;
  private cosmos.base.v1beta1.CoinOuterClass.Coin balance_;
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
   * @return Whether the balance field is set.
   */
  @java.lang.Override
  public boolean hasBalance() {
    return balance_ != null;
  }
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
   * @return The balance.
   */
  @java.lang.Override
  public cosmos.base.v1beta1.CoinOuterClass.Coin getBalance() {
    return balance_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : balance_;
  }
  /**
   * <pre>
   * balance is the balance of the coin.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
   */
  @java.lang.Override
  public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getBalanceOrBuilder() {
    return getBalance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (balance_ != null) {
      output.writeMessage(1, getBalance());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (balance_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBalance());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof cosmos.bank.v1beta1.QueryBalanceResponse)) {
      return super.equals(obj);
    }
    cosmos.bank.v1beta1.QueryBalanceResponse other = (cosmos.bank.v1beta1.QueryBalanceResponse) obj;

    if (hasBalance() != other.hasBalance()) return false;
    if (hasBalance()) {
      if (!getBalance()
          .equals(other.getBalance())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBalance()) {
      hash = (37 * hash) + BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + getBalance().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.bank.v1beta1.QueryBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(cosmos.bank.v1beta1.QueryBalanceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * QueryBalanceResponse is the response type for the Query/Balance RPC method.
   * </pre>
   *
   * Protobuf type {@code cosmos.bank.v1beta1.QueryBalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.bank.v1beta1.QueryBalanceResponse)
      cosmos.bank.v1beta1.QueryBalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.bank.v1beta1.CosmosBankQueryProto.internal_static_cosmos_bank_v1beta1_QueryBalanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.bank.v1beta1.CosmosBankQueryProto.internal_static_cosmos_bank_v1beta1_QueryBalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.bank.v1beta1.QueryBalanceResponse.class, cosmos.bank.v1beta1.QueryBalanceResponse.Builder.class);
    }

    // Construct using cosmos.bank.v1beta1.QueryBalanceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (balanceBuilder_ == null) {
        balance_ = null;
      } else {
        balance_ = null;
        balanceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.bank.v1beta1.CosmosBankQueryProto.internal_static_cosmos_bank_v1beta1_QueryBalanceResponse_descriptor;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QueryBalanceResponse getDefaultInstanceForType() {
      return cosmos.bank.v1beta1.QueryBalanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QueryBalanceResponse build() {
      cosmos.bank.v1beta1.QueryBalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.bank.v1beta1.QueryBalanceResponse buildPartial() {
      cosmos.bank.v1beta1.QueryBalanceResponse result = new cosmos.bank.v1beta1.QueryBalanceResponse(this);
      if (balanceBuilder_ == null) {
        result.balance_ = balance_;
      } else {
        result.balance_ = balanceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof cosmos.bank.v1beta1.QueryBalanceResponse) {
        return mergeFrom((cosmos.bank.v1beta1.QueryBalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.bank.v1beta1.QueryBalanceResponse other) {
      if (other == cosmos.bank.v1beta1.QueryBalanceResponse.getDefaultInstance()) return this;
      if (other.hasBalance()) {
        mergeBalance(other.getBalance());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      cosmos.bank.v1beta1.QueryBalanceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.bank.v1beta1.QueryBalanceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private cosmos.base.v1beta1.CoinOuterClass.Coin balance_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> balanceBuilder_;
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     * @return Whether the balance field is set.
     */
    public boolean hasBalance() {
      return balanceBuilder_ != null || balance_ != null;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     * @return The balance.
     */
    public cosmos.base.v1beta1.CoinOuterClass.Coin getBalance() {
      if (balanceBuilder_ == null) {
        return balance_ == null ? cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : balance_;
      } else {
        return balanceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     */
    public Builder setBalance(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
      if (balanceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        balance_ = value;
        onChanged();
      } else {
        balanceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     */
    public Builder setBalance(
        cosmos.base.v1beta1.CoinOuterClass.Coin.Builder builderForValue) {
      if (balanceBuilder_ == null) {
        balance_ = builderForValue.build();
        onChanged();
      } else {
        balanceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     */
    public Builder mergeBalance(cosmos.base.v1beta1.CoinOuterClass.Coin value) {
      if (balanceBuilder_ == null) {
        if (balance_ != null) {
          balance_ =
            cosmos.base.v1beta1.CoinOuterClass.Coin.newBuilder(balance_).mergeFrom(value).buildPartial();
        } else {
          balance_ = value;
        }
        onChanged();
      } else {
        balanceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     */
    public Builder clearBalance() {
      if (balanceBuilder_ == null) {
        balance_ = null;
        onChanged();
      } else {
        balance_ = null;
        balanceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     */
    public cosmos.base.v1beta1.CoinOuterClass.Coin.Builder getBalanceBuilder() {
      
      onChanged();
      return getBalanceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     */
    public cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder getBalanceOrBuilder() {
      if (balanceBuilder_ != null) {
        return balanceBuilder_.getMessageOrBuilder();
      } else {
        return balance_ == null ?
            cosmos.base.v1beta1.CoinOuterClass.Coin.getDefaultInstance() : balance_;
      }
    }
    /**
     * <pre>
     * balance is the balance of the coin.
     * </pre>
     *
     * <code>.cosmos.base.v1beta1.Coin balance = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder> 
        getBalanceFieldBuilder() {
      if (balanceBuilder_ == null) {
        balanceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.base.v1beta1.CoinOuterClass.Coin, cosmos.base.v1beta1.CoinOuterClass.Coin.Builder, cosmos.base.v1beta1.CoinOuterClass.CoinOrBuilder>(
                getBalance(),
                getParentForChildren(),
                isClean());
        balance_ = null;
      }
      return balanceBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:cosmos.bank.v1beta1.QueryBalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.bank.v1beta1.QueryBalanceResponse)
  private static final cosmos.bank.v1beta1.QueryBalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.bank.v1beta1.QueryBalanceResponse();
  }

  public static cosmos.bank.v1beta1.QueryBalanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryBalanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryBalanceResponse>() {
    @java.lang.Override
    public QueryBalanceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryBalanceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryBalanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryBalanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.bank.v1beta1.QueryBalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

