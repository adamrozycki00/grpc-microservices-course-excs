// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/car.proto

package com.tenetmind.models;

/**
 * Protobuf enum {@code common.BodyStyle}
 */
public enum BodyStyle
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <code>SEDAN = 1;</code>
   */
  SEDAN(1),
  /**
   * <code>COUPE = 2;</code>
   */
  COUPE(2),
  /**
   * <code>SUV = 3;</code>
   */
  SUV(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <code>SEDAN = 1;</code>
   */
  public static final int SEDAN_VALUE = 1;
  /**
   * <code>COUPE = 2;</code>
   */
  public static final int COUPE_VALUE = 2;
  /**
   * <code>SUV = 3;</code>
   */
  public static final int SUV_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static BodyStyle valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static BodyStyle forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return SEDAN;
      case 2: return COUPE;
      case 3: return SUV;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<BodyStyle>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      BodyStyle> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BodyStyle>() {
          public BodyStyle findValueByNumber(int number) {
            return BodyStyle.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.tenetmind.models.CarOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final BodyStyle[] VALUES = values();

  public static BodyStyle valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private BodyStyle(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:common.BodyStyle)
}
