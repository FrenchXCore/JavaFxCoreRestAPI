// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package cosmos.bank.v1beta1;

public interface QueryDenomsMetadataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.QueryDenomsMetadataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   * @return The pagination.
   */
  cosmos.base.query.v1beta1.Pagination.PageRequest getPagination();
  /**
   * <pre>
   * pagination defines an optional pagination for the request.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1;</code>
   */
  cosmos.base.query.v1beta1.Pagination.PageRequestOrBuilder getPaginationOrBuilder();
}
