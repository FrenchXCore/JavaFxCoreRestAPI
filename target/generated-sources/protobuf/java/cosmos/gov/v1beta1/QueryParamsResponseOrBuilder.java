// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

public interface QueryParamsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryParamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * voting_params defines the parameters related to voting.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the votingParams field is set.
   */
  boolean hasVotingParams();
  /**
   * <pre>
   * voting_params defines the parameters related to voting.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [(.gogoproto.nullable) = false];</code>
   * @return The votingParams.
   */
  cosmos.gov.v1beta1.Gov.VotingParams getVotingParams();
  /**
   * <pre>
   * voting_params defines the parameters related to voting.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.VotingParams voting_params = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.gov.v1beta1.Gov.VotingParamsOrBuilder getVotingParamsOrBuilder();

  /**
   * <pre>
   * deposit_params defines the parameters related to deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [(.gogoproto.nullable) = false];</code>
   * @return Whether the depositParams field is set.
   */
  boolean hasDepositParams();
  /**
   * <pre>
   * deposit_params defines the parameters related to deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [(.gogoproto.nullable) = false];</code>
   * @return The depositParams.
   */
  cosmos.gov.v1beta1.Gov.DepositParams getDepositParams();
  /**
   * <pre>
   * deposit_params defines the parameters related to deposit.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.DepositParams deposit_params = 2 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.gov.v1beta1.Gov.DepositParamsOrBuilder getDepositParamsOrBuilder();

  /**
   * <pre>
   * tally_params defines the parameters related to tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [(.gogoproto.nullable) = false];</code>
   * @return Whether the tallyParams field is set.
   */
  boolean hasTallyParams();
  /**
   * <pre>
   * tally_params defines the parameters related to tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [(.gogoproto.nullable) = false];</code>
   * @return The tallyParams.
   */
  cosmos.gov.v1beta1.Gov.TallyParams getTallyParams();
  /**
   * <pre>
   * tally_params defines the parameters related to tally.
   * </pre>
   *
   * <code>.cosmos.gov.v1beta1.TallyParams tally_params = 3 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.gov.v1beta1.Gov.TallyParamsOrBuilder getTallyParamsOrBuilder();
}
