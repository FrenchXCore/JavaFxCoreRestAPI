// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/genesis.proto

package cosmos.auth.v1beta1;

public final class CosmosAuthGenesisProto {
  private CosmosAuthGenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!cosmos/auth/v1beta1/genesis.proto\022\023cos" +
      "mos.auth.v1beta1\032\031google/protobuf/any.pr" +
      "oto\032\024gogoproto/gogo.proto\032\036cosmos/auth/v" +
      "1beta1/auth.proto\"i\n\014GenesisState\0221\n\006par" +
      "ams\030\001 \001(\0132\033.cosmos.auth.v1beta1.ParamsB\004" +
      "\310\336\037\000\022&\n\010accounts\030\002 \003(\0132\024.google.protobuf" +
      ".AnyBZ\n\023cosmos.auth.v1beta1B\026CosmosAuthG" +
      "enesisProtoP\001Z)github.com/cosmos/cosmos-" +
      "sdk/x/auth/typesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.GoGoProtos.getDescriptor(),
          cosmos.auth.v1beta1.CosmosAuthAuthProto.getDescriptor(),
        });
    internal_static_cosmos_auth_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_auth_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "Accounts", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.auth.v1beta1.CosmosAuthAuthProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}