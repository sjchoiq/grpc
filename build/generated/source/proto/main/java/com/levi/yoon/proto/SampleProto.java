// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SampleProto.proto

package com.levi.yoon.proto;

public final class SampleProto {
  private SampleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_sample_SampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_sample_SampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_sample_SampleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_sample_SampleResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021SampleProto.proto\022\013grpc.sample\"0\n\rSamp" +
      "leRequest\022\016\n\006userId\030\001 \001(\t\022\017\n\007message\030\002 \001" +
      "(\t\"!\n\016SampleResponse\022\017\n\007message\030\001 \001(\t2X\n" +
      "\rSampleService\022G\n\nSampleCall\022\032.grpc.samp" +
      "le.SampleRequest\032\033.grpc.sample.SampleRes" +
      "ponse\"\000B$\n\023com.levi.yoon.protoB\013SamplePr" +
      "otoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_grpc_sample_SampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_sample_SampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_sample_SampleRequest_descriptor,
        new java.lang.String[] { "UserId", "Message", });
    internal_static_grpc_sample_SampleResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_sample_SampleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_sample_SampleResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
