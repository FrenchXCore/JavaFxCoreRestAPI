// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/crypto/hd/v1/hd.proto

package cosmos.crypto.hd.v1;

public final class Hd {
  private Hd() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BIP44ParamsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cosmos.crypto.hd.v1.BIP44Params)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
     * </pre>
     *
     * <code>uint32 purpose = 1;</code>
     * @return The purpose.
     */
    int getPurpose();

    /**
     * <pre>
     * coin_type is a constant that improves privacy
     * </pre>
     *
     * <code>uint32 coin_type = 2;</code>
     * @return The coinType.
     */
    int getCoinType();

    /**
     * <pre>
     * account splits the key space into independent user identities
     * </pre>
     *
     * <code>uint32 account = 3;</code>
     * @return The account.
     */
    int getAccount();

    /**
     * <pre>
     * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
     * chain.
     * </pre>
     *
     * <code>bool change = 4;</code>
     * @return The change.
     */
    boolean getChange();

    /**
     * <pre>
     * address_index is used as child index in BIP32 derivation
     * </pre>
     *
     * <code>uint32 address_index = 5;</code>
     * @return The addressIndex.
     */
    int getAddressIndex();
  }
  /**
   * <pre>
   * BIP44Params is used as path field in ledger item in Record.
   * </pre>
   *
   * Protobuf type {@code cosmos.crypto.hd.v1.BIP44Params}
   */
  public static final class BIP44Params extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cosmos.crypto.hd.v1.BIP44Params)
      BIP44ParamsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BIP44Params.newBuilder() to construct.
    private BIP44Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BIP44Params() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BIP44Params();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BIP44Params(
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
            case 8: {

              purpose_ = input.readUInt32();
              break;
            }
            case 16: {

              coinType_ = input.readUInt32();
              break;
            }
            case 24: {

              account_ = input.readUInt32();
              break;
            }
            case 32: {

              change_ = input.readBool();
              break;
            }
            case 40: {

              addressIndex_ = input.readUInt32();
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
      return cosmos.crypto.hd.v1.Hd.internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.crypto.hd.v1.Hd.internal_static_cosmos_crypto_hd_v1_BIP44Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.crypto.hd.v1.Hd.BIP44Params.class, cosmos.crypto.hd.v1.Hd.BIP44Params.Builder.class);
    }

    public static final int PURPOSE_FIELD_NUMBER = 1;
    private int purpose_;
    /**
     * <pre>
     * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
     * </pre>
     *
     * <code>uint32 purpose = 1;</code>
     * @return The purpose.
     */
    @java.lang.Override
    public int getPurpose() {
      return purpose_;
    }

    public static final int COIN_TYPE_FIELD_NUMBER = 2;
    private int coinType_;
    /**
     * <pre>
     * coin_type is a constant that improves privacy
     * </pre>
     *
     * <code>uint32 coin_type = 2;</code>
     * @return The coinType.
     */
    @java.lang.Override
    public int getCoinType() {
      return coinType_;
    }

    public static final int ACCOUNT_FIELD_NUMBER = 3;
    private int account_;
    /**
     * <pre>
     * account splits the key space into independent user identities
     * </pre>
     *
     * <code>uint32 account = 3;</code>
     * @return The account.
     */
    @java.lang.Override
    public int getAccount() {
      return account_;
    }

    public static final int CHANGE_FIELD_NUMBER = 4;
    private boolean change_;
    /**
     * <pre>
     * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
     * chain.
     * </pre>
     *
     * <code>bool change = 4;</code>
     * @return The change.
     */
    @java.lang.Override
    public boolean getChange() {
      return change_;
    }

    public static final int ADDRESS_INDEX_FIELD_NUMBER = 5;
    private int addressIndex_;
    /**
     * <pre>
     * address_index is used as child index in BIP32 derivation
     * </pre>
     *
     * <code>uint32 address_index = 5;</code>
     * @return The addressIndex.
     */
    @java.lang.Override
    public int getAddressIndex() {
      return addressIndex_;
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
      if (purpose_ != 0) {
        output.writeUInt32(1, purpose_);
      }
      if (coinType_ != 0) {
        output.writeUInt32(2, coinType_);
      }
      if (account_ != 0) {
        output.writeUInt32(3, account_);
      }
      if (change_ != false) {
        output.writeBool(4, change_);
      }
      if (addressIndex_ != 0) {
        output.writeUInt32(5, addressIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (purpose_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, purpose_);
      }
      if (coinType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, coinType_);
      }
      if (account_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, account_);
      }
      if (change_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, change_);
      }
      if (addressIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, addressIndex_);
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
      if (!(obj instanceof cosmos.crypto.hd.v1.Hd.BIP44Params)) {
        return super.equals(obj);
      }
      cosmos.crypto.hd.v1.Hd.BIP44Params other = (cosmos.crypto.hd.v1.Hd.BIP44Params) obj;

      if (getPurpose()
          != other.getPurpose()) return false;
      if (getCoinType()
          != other.getCoinType()) return false;
      if (getAccount()
          != other.getAccount()) return false;
      if (getChange()
          != other.getChange()) return false;
      if (getAddressIndex()
          != other.getAddressIndex()) return false;
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
      hash = (37 * hash) + PURPOSE_FIELD_NUMBER;
      hash = (53 * hash) + getPurpose();
      hash = (37 * hash) + COIN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCoinType();
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount();
      hash = (37 * hash) + CHANGE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getChange());
      hash = (37 * hash) + ADDRESS_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getAddressIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cosmos.crypto.hd.v1.Hd.BIP44Params parseFrom(
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
    public static Builder newBuilder(cosmos.crypto.hd.v1.Hd.BIP44Params prototype) {
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
     * BIP44Params is used as path field in ledger item in Record.
     * </pre>
     *
     * Protobuf type {@code cosmos.crypto.hd.v1.BIP44Params}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cosmos.crypto.hd.v1.BIP44Params)
        cosmos.crypto.hd.v1.Hd.BIP44ParamsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cosmos.crypto.hd.v1.Hd.internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cosmos.crypto.hd.v1.Hd.internal_static_cosmos_crypto_hd_v1_BIP44Params_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cosmos.crypto.hd.v1.Hd.BIP44Params.class, cosmos.crypto.hd.v1.Hd.BIP44Params.Builder.class);
      }

      // Construct using cosmos.crypto.hd.v1.Hd.BIP44Params.newBuilder()
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
        purpose_ = 0;

        coinType_ = 0;

        account_ = 0;

        change_ = false;

        addressIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cosmos.crypto.hd.v1.Hd.internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor;
      }

      @java.lang.Override
      public cosmos.crypto.hd.v1.Hd.BIP44Params getDefaultInstanceForType() {
        return cosmos.crypto.hd.v1.Hd.BIP44Params.getDefaultInstance();
      }

      @java.lang.Override
      public cosmos.crypto.hd.v1.Hd.BIP44Params build() {
        cosmos.crypto.hd.v1.Hd.BIP44Params result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cosmos.crypto.hd.v1.Hd.BIP44Params buildPartial() {
        cosmos.crypto.hd.v1.Hd.BIP44Params result = new cosmos.crypto.hd.v1.Hd.BIP44Params(this);
        result.purpose_ = purpose_;
        result.coinType_ = coinType_;
        result.account_ = account_;
        result.change_ = change_;
        result.addressIndex_ = addressIndex_;
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
        if (other instanceof cosmos.crypto.hd.v1.Hd.BIP44Params) {
          return mergeFrom((cosmos.crypto.hd.v1.Hd.BIP44Params)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cosmos.crypto.hd.v1.Hd.BIP44Params other) {
        if (other == cosmos.crypto.hd.v1.Hd.BIP44Params.getDefaultInstance()) return this;
        if (other.getPurpose() != 0) {
          setPurpose(other.getPurpose());
        }
        if (other.getCoinType() != 0) {
          setCoinType(other.getCoinType());
        }
        if (other.getAccount() != 0) {
          setAccount(other.getAccount());
        }
        if (other.getChange() != false) {
          setChange(other.getChange());
        }
        if (other.getAddressIndex() != 0) {
          setAddressIndex(other.getAddressIndex());
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
        cosmos.crypto.hd.v1.Hd.BIP44Params parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cosmos.crypto.hd.v1.Hd.BIP44Params) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int purpose_ ;
      /**
       * <pre>
       * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
       * </pre>
       *
       * <code>uint32 purpose = 1;</code>
       * @return The purpose.
       */
      @java.lang.Override
      public int getPurpose() {
        return purpose_;
      }
      /**
       * <pre>
       * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
       * </pre>
       *
       * <code>uint32 purpose = 1;</code>
       * @param value The purpose to set.
       * @return This builder for chaining.
       */
      public Builder setPurpose(int value) {
        
        purpose_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * purpose is a constant set to 44' (or 0x8000002C) following the BIP43 recommendation
       * </pre>
       *
       * <code>uint32 purpose = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPurpose() {
        
        purpose_ = 0;
        onChanged();
        return this;
      }

      private int coinType_ ;
      /**
       * <pre>
       * coin_type is a constant that improves privacy
       * </pre>
       *
       * <code>uint32 coin_type = 2;</code>
       * @return The coinType.
       */
      @java.lang.Override
      public int getCoinType() {
        return coinType_;
      }
      /**
       * <pre>
       * coin_type is a constant that improves privacy
       * </pre>
       *
       * <code>uint32 coin_type = 2;</code>
       * @param value The coinType to set.
       * @return This builder for chaining.
       */
      public Builder setCoinType(int value) {
        
        coinType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * coin_type is a constant that improves privacy
       * </pre>
       *
       * <code>uint32 coin_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCoinType() {
        
        coinType_ = 0;
        onChanged();
        return this;
      }

      private int account_ ;
      /**
       * <pre>
       * account splits the key space into independent user identities
       * </pre>
       *
       * <code>uint32 account = 3;</code>
       * @return The account.
       */
      @java.lang.Override
      public int getAccount() {
        return account_;
      }
      /**
       * <pre>
       * account splits the key space into independent user identities
       * </pre>
       *
       * <code>uint32 account = 3;</code>
       * @param value The account to set.
       * @return This builder for chaining.
       */
      public Builder setAccount(int value) {
        
        account_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * account splits the key space into independent user identities
       * </pre>
       *
       * <code>uint32 account = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccount() {
        
        account_ = 0;
        onChanged();
        return this;
      }

      private boolean change_ ;
      /**
       * <pre>
       * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
       * chain.
       * </pre>
       *
       * <code>bool change = 4;</code>
       * @return The change.
       */
      @java.lang.Override
      public boolean getChange() {
        return change_;
      }
      /**
       * <pre>
       * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
       * chain.
       * </pre>
       *
       * <code>bool change = 4;</code>
       * @param value The change to set.
       * @return This builder for chaining.
       */
      public Builder setChange(boolean value) {
        
        change_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * change is a constant used for public derivation. Constant 0 is used for external chain and constant 1 for internal
       * chain.
       * </pre>
       *
       * <code>bool change = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearChange() {
        
        change_ = false;
        onChanged();
        return this;
      }

      private int addressIndex_ ;
      /**
       * <pre>
       * address_index is used as child index in BIP32 derivation
       * </pre>
       *
       * <code>uint32 address_index = 5;</code>
       * @return The addressIndex.
       */
      @java.lang.Override
      public int getAddressIndex() {
        return addressIndex_;
      }
      /**
       * <pre>
       * address_index is used as child index in BIP32 derivation
       * </pre>
       *
       * <code>uint32 address_index = 5;</code>
       * @param value The addressIndex to set.
       * @return This builder for chaining.
       */
      public Builder setAddressIndex(int value) {
        
        addressIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * address_index is used as child index in BIP32 derivation
       * </pre>
       *
       * <code>uint32 address_index = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAddressIndex() {
        
        addressIndex_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:cosmos.crypto.hd.v1.BIP44Params)
    }

    // @@protoc_insertion_point(class_scope:cosmos.crypto.hd.v1.BIP44Params)
    private static final cosmos.crypto.hd.v1.Hd.BIP44Params DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cosmos.crypto.hd.v1.Hd.BIP44Params();
    }

    public static cosmos.crypto.hd.v1.Hd.BIP44Params getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BIP44Params>
        PARSER = new com.google.protobuf.AbstractParser<BIP44Params>() {
      @java.lang.Override
      public BIP44Params parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BIP44Params(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BIP44Params> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BIP44Params> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cosmos.crypto.hd.v1.Hd.BIP44Params getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_crypto_hd_v1_BIP44Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034cosmos/crypto/hd/v1/hd.proto\022\023cosmos.c" +
      "rypto.hd.v1\032\024gogoproto/gogo.proto\"o\n\013BIP" +
      "44Params\022\017\n\007purpose\030\001 \001(\r\022\021\n\tcoin_type\030\002" +
      " \001(\r\022\017\n\007account\030\003 \001(\r\022\016\n\006change\030\004 \001(\010\022\025\n" +
      "\raddress_index\030\005 \001(\r:\004\230\240\037\000B,Z&github.com" +
      "/cosmos/cosmos-sdk/crypto/hd\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
        });
    internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_crypto_hd_v1_BIP44Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_crypto_hd_v1_BIP44Params_descriptor,
        new java.lang.String[] { "Purpose", "CoinType", "Account", "Change", "AddressIndex", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.goprotoGettersAll);
    registry.add(com.google.protobuf.GoGoProtos.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
