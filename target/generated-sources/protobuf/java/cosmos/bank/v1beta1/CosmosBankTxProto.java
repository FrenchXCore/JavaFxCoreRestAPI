// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/tx.proto

package cosmos.bank.v1beta1;

public final class CosmosBankTxProto {
  private CosmosBankTxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_bank_v1beta1_MsgSend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_bank_v1beta1_MsgSend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_bank_v1beta1_MsgSendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_bank_v1beta1_MsgSendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_bank_v1beta1_MsgMultiSend_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_bank_v1beta1_MsgMultiSend_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_bank_v1beta1_MsgMultiSendResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_bank_v1beta1_MsgMultiSendResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034cosmos/bank/v1beta1/tx.proto\022\023cosmos.b" +
      "ank.v1beta1\032\024gogoproto/gogo.proto\032\036cosmo" +
      "s/base/v1beta1/coin.proto\032\036cosmos/bank/v" +
      "1beta1/bank.proto\032\031cosmos_proto/cosmos.p" +
      "roto\"\316\001\n\007MsgSend\022.\n\014from_address\030\001 \001(\tB\030" +
      "\322\264-\024cosmos.AddressString\022,\n\nto_address\030\002" +
      " \001(\tB\030\322\264-\024cosmos.AddressString\022[\n\006amount" +
      "\030\003 \003(\0132\031.cosmos.base.v1beta1.CoinB0\310\336\037\000\252" +
      "\337\037(github.com/cosmos/cosmos-sdk/types.Co" +
      "ins:\010\350\240\037\000\210\240\037\000\"\021\n\017MsgSendResponse\"z\n\014MsgM" +
      "ultiSend\0220\n\006inputs\030\001 \003(\0132\032.cosmos.bank.v" +
      "1beta1.InputB\004\310\336\037\000\0222\n\007outputs\030\002 \003(\0132\033.co" +
      "smos.bank.v1beta1.OutputB\004\310\336\037\000:\004\350\240\037\000\"\026\n\024" +
      "MsgMultiSendResponse2\254\001\n\003Msg\022J\n\004Send\022\034.c" +
      "osmos.bank.v1beta1.MsgSend\032$.cosmos.bank" +
      ".v1beta1.MsgSendResponse\022Y\n\tMultiSend\022!." +
      "cosmos.bank.v1beta1.MsgMultiSend\032).cosmo" +
      "s.bank.v1beta1.MsgMultiSendResponseBU\n\023c" +
      "osmos.bank.v1beta1B\021CosmosBankTxProtoP\001Z" +
      ")github.com/cosmos/cosmos-sdk/x/bank/typ" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.GoGoProtos.getDescriptor(),
          cosmos.base.v1beta1.CoinOuterClass.getDescriptor(),
          cosmos.bank.v1beta1.Bank.getDescriptor(),
          cosmos_proto.Cosmos.getDescriptor(),
        });
    internal_static_cosmos_bank_v1beta1_MsgSend_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_bank_v1beta1_MsgSend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_bank_v1beta1_MsgSend_descriptor,
        new java.lang.String[] { "FromAddress", "ToAddress", "Amount", });
    internal_static_cosmos_bank_v1beta1_MsgSendResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_bank_v1beta1_MsgSendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_bank_v1beta1_MsgSendResponse_descriptor,
        new java.lang.String[] { });
    internal_static_cosmos_bank_v1beta1_MsgMultiSend_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_bank_v1beta1_MsgMultiSend_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_bank_v1beta1_MsgMultiSend_descriptor,
        new java.lang.String[] { "Inputs", "Outputs", });
    internal_static_cosmos_bank_v1beta1_MsgMultiSendResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_bank_v1beta1_MsgMultiSendResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_bank_v1beta1_MsgMultiSendResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(cosmos_proto.Cosmos.scalar);
    registry.add(com.google.protobuf.GoGoProtos.castrepeated);
    registry.add(com.google.protobuf.GoGoProtos.equal);
    registry.add(com.google.protobuf.GoGoProtos.goprotoGetters);
    registry.add(com.google.protobuf.GoGoProtos.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.GoGoProtos.getDescriptor();
    cosmos.base.v1beta1.CoinOuterClass.getDescriptor();
    cosmos.bank.v1beta1.Bank.getDescriptor();
    cosmos_proto.Cosmos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
