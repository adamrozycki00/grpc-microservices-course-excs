// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: complex/person.proto

package com.tenetmind.models;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_complex_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_complex_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024complex/person.proto\022\007complex\032\020common/" +
      "car.proto\032\024common/address.proto\032\036google/" +
      "protobuf/wrappers.proto\"|\n\006Person\022\014\n\004nam" +
      "e\030\001 \001(\t\022(\n\003age\030\002 \001(\0132\033.google.protobuf.I" +
      "nt32Value\022 \n\007address\030\003 \001(\0132\017.common.Addr" +
      "ess\022\030\n\003car\030\004 \003(\0132\013.common.CarB\030\n\024com.ten" +
      "etmind.modelsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tenetmind.models.CarOuterClass.getDescriptor(),
          com.tenetmind.models.AddressOuterClass.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_complex_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_complex_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_complex_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "Address", "Car", });
    com.tenetmind.models.CarOuterClass.getDescriptor();
    com.tenetmind.models.AddressOuterClass.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
