// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/auth.proto

package cosmos.auth.v1beta1;

/**
 * <pre>
 * ModuleAccount defines an account for modules that holds coins on a pool.
 * </pre>
 *
 * Protobuf type {@code cosmos.auth.v1beta1.ModuleAccount}
 */
public final class ModuleAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.auth.v1beta1.ModuleAccount)
    ModuleAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ModuleAccount.newBuilder() to construct.
  private ModuleAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ModuleAccount() {
    name_ = "";
    permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ModuleAccount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ModuleAccount(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            cosmos.auth.v1beta1.BaseAccount.Builder subBuilder = null;
            if (baseAccount_ != null) {
              subBuilder = baseAccount_.toBuilder();
            }
            baseAccount_ = input.readMessage(cosmos.auth.v1beta1.BaseAccount.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(baseAccount_);
              baseAccount_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              permissions_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            permissions_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        permissions_ = permissions_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return cosmos.auth.v1beta1.CosmosAuthAuthProto.internal_static_cosmos_auth_v1beta1_ModuleAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return cosmos.auth.v1beta1.CosmosAuthAuthProto.internal_static_cosmos_auth_v1beta1_ModuleAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            cosmos.auth.v1beta1.ModuleAccount.class, cosmos.auth.v1beta1.ModuleAccount.Builder.class);
  }

  public static final int BASE_ACCOUNT_FIELD_NUMBER = 1;
  private cosmos.auth.v1beta1.BaseAccount baseAccount_;
  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
   * @return Whether the baseAccount field is set.
   */
  @java.lang.Override
  public boolean hasBaseAccount() {
    return baseAccount_ != null;
  }
  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
   * @return The baseAccount.
   */
  @java.lang.Override
  public cosmos.auth.v1beta1.BaseAccount getBaseAccount() {
    return baseAccount_ == null ? cosmos.auth.v1beta1.BaseAccount.getDefaultInstance() : baseAccount_;
  }
  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
   */
  @java.lang.Override
  public cosmos.auth.v1beta1.BaseAccountOrBuilder getBaseAccountOrBuilder() {
    return getBaseAccount();
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSIONS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList permissions_;
  /**
   * <code>repeated string permissions = 3;</code>
   * @return A list containing the permissions.
   */
  public com.google.protobuf.ProtocolStringList
      getPermissionsList() {
    return permissions_;
  }
  /**
   * <code>repeated string permissions = 3;</code>
   * @return The count of permissions.
   */
  public int getPermissionsCount() {
    return permissions_.size();
  }
  /**
   * <code>repeated string permissions = 3;</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  public java.lang.String getPermissions(int index) {
    return permissions_.get(index);
  }
  /**
   * <code>repeated string permissions = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  public com.google.protobuf.ByteString
      getPermissionsBytes(int index) {
    return permissions_.getByteString(index);
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
    if (baseAccount_ != null) {
      output.writeMessage(1, getBaseAccount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    for (int i = 0; i < permissions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, permissions_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (baseAccount_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseAccount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < permissions_.size(); i++) {
        dataSize += computeStringSizeNoTag(permissions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPermissionsList().size();
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
    if (!(obj instanceof cosmos.auth.v1beta1.ModuleAccount)) {
      return super.equals(obj);
    }
    cosmos.auth.v1beta1.ModuleAccount other = (cosmos.auth.v1beta1.ModuleAccount) obj;

    if (hasBaseAccount() != other.hasBaseAccount()) return false;
    if (hasBaseAccount()) {
      if (!getBaseAccount()
          .equals(other.getBaseAccount())) return false;
    }
    if (!getName()
        .equals(other.getName())) return false;
    if (!getPermissionsList()
        .equals(other.getPermissionsList())) return false;
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
    if (hasBaseAccount()) {
      hash = (37 * hash) + BASE_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getBaseAccount().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getPermissionsCount() > 0) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static cosmos.auth.v1beta1.ModuleAccount parseFrom(
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
  public static Builder newBuilder(cosmos.auth.v1beta1.ModuleAccount prototype) {
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
   * ModuleAccount defines an account for modules that holds coins on a pool.
   * </pre>
   *
   * Protobuf type {@code cosmos.auth.v1beta1.ModuleAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.auth.v1beta1.ModuleAccount)
      cosmos.auth.v1beta1.ModuleAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cosmos.auth.v1beta1.CosmosAuthAuthProto.internal_static_cosmos_auth_v1beta1_ModuleAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cosmos.auth.v1beta1.CosmosAuthAuthProto.internal_static_cosmos_auth_v1beta1_ModuleAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cosmos.auth.v1beta1.ModuleAccount.class, cosmos.auth.v1beta1.ModuleAccount.Builder.class);
    }

    // Construct using cosmos.auth.v1beta1.ModuleAccount.newBuilder()
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
      if (baseAccountBuilder_ == null) {
        baseAccount_ = null;
      } else {
        baseAccount_ = null;
        baseAccountBuilder_ = null;
      }
      name_ = "";

      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return cosmos.auth.v1beta1.CosmosAuthAuthProto.internal_static_cosmos_auth_v1beta1_ModuleAccount_descriptor;
    }

    @java.lang.Override
    public cosmos.auth.v1beta1.ModuleAccount getDefaultInstanceForType() {
      return cosmos.auth.v1beta1.ModuleAccount.getDefaultInstance();
    }

    @java.lang.Override
    public cosmos.auth.v1beta1.ModuleAccount build() {
      cosmos.auth.v1beta1.ModuleAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public cosmos.auth.v1beta1.ModuleAccount buildPartial() {
      cosmos.auth.v1beta1.ModuleAccount result = new cosmos.auth.v1beta1.ModuleAccount(this);
      int from_bitField0_ = bitField0_;
      if (baseAccountBuilder_ == null) {
        result.baseAccount_ = baseAccount_;
      } else {
        result.baseAccount_ = baseAccountBuilder_.build();
      }
      result.name_ = name_;
      if (((bitField0_ & 0x00000001) != 0)) {
        permissions_ = permissions_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.permissions_ = permissions_;
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
      if (other instanceof cosmos.auth.v1beta1.ModuleAccount) {
        return mergeFrom((cosmos.auth.v1beta1.ModuleAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(cosmos.auth.v1beta1.ModuleAccount other) {
      if (other == cosmos.auth.v1beta1.ModuleAccount.getDefaultInstance()) return this;
      if (other.hasBaseAccount()) {
        mergeBaseAccount(other.getBaseAccount());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.permissions_.isEmpty()) {
        if (permissions_.isEmpty()) {
          permissions_ = other.permissions_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePermissionsIsMutable();
          permissions_.addAll(other.permissions_);
        }
        onChanged();
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
      cosmos.auth.v1beta1.ModuleAccount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (cosmos.auth.v1beta1.ModuleAccount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private cosmos.auth.v1beta1.BaseAccount baseAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.auth.v1beta1.BaseAccount, cosmos.auth.v1beta1.BaseAccount.Builder, cosmos.auth.v1beta1.BaseAccountOrBuilder> baseAccountBuilder_;
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     * @return Whether the baseAccount field is set.
     */
    public boolean hasBaseAccount() {
      return baseAccountBuilder_ != null || baseAccount_ != null;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     * @return The baseAccount.
     */
    public cosmos.auth.v1beta1.BaseAccount getBaseAccount() {
      if (baseAccountBuilder_ == null) {
        return baseAccount_ == null ? cosmos.auth.v1beta1.BaseAccount.getDefaultInstance() : baseAccount_;
      } else {
        return baseAccountBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public Builder setBaseAccount(cosmos.auth.v1beta1.BaseAccount value) {
      if (baseAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseAccount_ = value;
        onChanged();
      } else {
        baseAccountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public Builder setBaseAccount(
        cosmos.auth.v1beta1.BaseAccount.Builder builderForValue) {
      if (baseAccountBuilder_ == null) {
        baseAccount_ = builderForValue.build();
        onChanged();
      } else {
        baseAccountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public Builder mergeBaseAccount(cosmos.auth.v1beta1.BaseAccount value) {
      if (baseAccountBuilder_ == null) {
        if (baseAccount_ != null) {
          baseAccount_ =
            cosmos.auth.v1beta1.BaseAccount.newBuilder(baseAccount_).mergeFrom(value).buildPartial();
        } else {
          baseAccount_ = value;
        }
        onChanged();
      } else {
        baseAccountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public Builder clearBaseAccount() {
      if (baseAccountBuilder_ == null) {
        baseAccount_ = null;
        onChanged();
      } else {
        baseAccount_ = null;
        baseAccountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public cosmos.auth.v1beta1.BaseAccount.Builder getBaseAccountBuilder() {
      
      onChanged();
      return getBaseAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    public cosmos.auth.v1beta1.BaseAccountOrBuilder getBaseAccountOrBuilder() {
      if (baseAccountBuilder_ != null) {
        return baseAccountBuilder_.getMessageOrBuilder();
      } else {
        return baseAccount_ == null ?
            cosmos.auth.v1beta1.BaseAccount.getDefaultInstance() : baseAccount_;
      }
    }
    /**
     * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [(.gogoproto.embed) = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        cosmos.auth.v1beta1.BaseAccount, cosmos.auth.v1beta1.BaseAccount.Builder, cosmos.auth.v1beta1.BaseAccountOrBuilder> 
        getBaseAccountFieldBuilder() {
      if (baseAccountBuilder_ == null) {
        baseAccountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            cosmos.auth.v1beta1.BaseAccount, cosmos.auth.v1beta1.BaseAccount.Builder, cosmos.auth.v1beta1.BaseAccountOrBuilder>(
                getBaseAccount(),
                getParentForChildren(),
                isClean());
        baseAccount_ = null;
      }
      return baseAccountBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePermissionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        permissions_ = new com.google.protobuf.LazyStringArrayList(permissions_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @return A list containing the permissions.
     */
    public com.google.protobuf.ProtocolStringList
        getPermissionsList() {
      return permissions_.getUnmodifiableView();
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @return The count of permissions.
     */
    public int getPermissionsCount() {
      return permissions_.size();
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param index The index of the element to return.
     * @return The permissions at the given index.
     */
    public java.lang.String getPermissions(int index) {
      return permissions_.get(index);
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the permissions at the given index.
     */
    public com.google.protobuf.ByteString
        getPermissionsBytes(int index) {
      return permissions_.getByteString(index);
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param index The index to set the value at.
     * @param value The permissions to set.
     * @return This builder for chaining.
     */
    public Builder setPermissions(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param value The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissions(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePermissionsIsMutable();
      permissions_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param values The permissions to add.
     * @return This builder for chaining.
     */
    public Builder addAllPermissions(
        java.lang.Iterable<java.lang.String> values) {
      ensurePermissionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, permissions_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPermissions() {
      permissions_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string permissions = 3;</code>
     * @param value The bytes of the permissions to add.
     * @return This builder for chaining.
     */
    public Builder addPermissionsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePermissionsIsMutable();
      permissions_.add(value);
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


    // @@protoc_insertion_point(builder_scope:cosmos.auth.v1beta1.ModuleAccount)
  }

  // @@protoc_insertion_point(class_scope:cosmos.auth.v1beta1.ModuleAccount)
  private static final cosmos.auth.v1beta1.ModuleAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new cosmos.auth.v1beta1.ModuleAccount();
  }

  public static cosmos.auth.v1beta1.ModuleAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModuleAccount>
      PARSER = new com.google.protobuf.AbstractParser<ModuleAccount>() {
    @java.lang.Override
    public ModuleAccount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ModuleAccount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ModuleAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModuleAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public cosmos.auth.v1beta1.ModuleAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
