// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/query.proto

package cosmos.gov.v1beta1;

public interface QueryProposalResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.gov.v1beta1.QueryProposalResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.gov.v1beta1.Proposal proposal = 1 [(.gogoproto.nullable) = false];</code>
   * @return Whether the proposal field is set.
   */
  boolean hasProposal();
  /**
   * <code>.cosmos.gov.v1beta1.Proposal proposal = 1 [(.gogoproto.nullable) = false];</code>
   * @return The proposal.
   */
  cosmos.gov.v1beta1.Gov.Proposal getProposal();
  /**
   * <code>.cosmos.gov.v1beta1.Proposal proposal = 1 [(.gogoproto.nullable) = false];</code>
   */
  cosmos.gov.v1beta1.Gov.ProposalOrBuilder getProposalOrBuilder();
}
