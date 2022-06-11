// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/auth.proto

package cosmos.auth.v1beta1;

public interface BaseAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.auth.v1beta1.BaseAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [(.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [(.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>.google.protobuf.Any pub_key = 2 [json_name = "public_key"];</code>
   * @return Whether the pubKey field is set.
   */
  boolean hasPubKey();
  /**
   * <code>.google.protobuf.Any pub_key = 2 [json_name = "public_key"];</code>
   * @return The pubKey.
   */
  com.google.protobuf.Any getPubKey();
  /**
   * <code>.google.protobuf.Any pub_key = 2 [json_name = "public_key"];</code>
   */
  com.google.protobuf.AnyOrBuilder getPubKeyOrBuilder();

  /**
   * <code>uint64 account_number = 3;</code>
   * @return The accountNumber.
   */
  long getAccountNumber();

  /**
   * <code>uint64 sequence = 4;</code>
   * @return The sequence.
   */
  long getSequence();
}