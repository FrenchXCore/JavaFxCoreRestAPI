// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

public interface QueryDepositResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryDepositResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * deposit defines the requested deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the deposit field is set.
   */
  boolean hasDeposit();
  /**
   * <pre>
   * deposit defines the requested deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
   * @return The deposit.
   */
  cosmos.gov.v1beta1.Gov.Deposit getDeposit();
  /**
   * <pre>
   * deposit defines the requested deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.Deposit deposit = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.gov.v1beta1.Gov.DepositOrBuilder getDepositOrBuilder();
}
