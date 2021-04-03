// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: complex/dealer.proto

package com.tenetmind.models;

/**
 * Protobuf type {@code complex.Dealer}
 */
public final class Dealer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:complex.Dealer)
    DealerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Dealer.newBuilder() to construct.
  private Dealer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Dealer() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Dealer();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Dealer(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              model_ = com.google.protobuf.MapField.newMapField(
                  ModelDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, com.tenetmind.models.Car>
            model__ = input.readMessage(
                ModelDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            model_.getMutableMap().put(
                model__.getKey(), model__.getValue());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tenetmind.models.DealerOuterClass.internal_static_complex_Dealer_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetModel();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tenetmind.models.DealerOuterClass.internal_static_complex_Dealer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tenetmind.models.Dealer.class, com.tenetmind.models.Dealer.Builder.class);
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  private static final class ModelDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, com.tenetmind.models.Car> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, com.tenetmind.models.Car>newDefaultInstance(
                com.tenetmind.models.DealerOuterClass.internal_static_complex_Dealer_ModelEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.tenetmind.models.Car.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, com.tenetmind.models.Car> model_;
  private com.google.protobuf.MapField<java.lang.Integer, com.tenetmind.models.Car>
  internalGetModel() {
    if (model_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ModelDefaultEntryHolder.defaultEntry);
    }
    return model_;
  }

  public int getModelCount() {
    return internalGetModel().getMap().size();
  }
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */

  @java.lang.Override
  public boolean containsModel(
      int key) {
    
    return internalGetModel().getMap().containsKey(key);
  }
  /**
   * Use {@link #getModelMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, com.tenetmind.models.Car> getModel() {
    return getModelMap();
  }
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.Integer, com.tenetmind.models.Car> getModelMap() {
    return internalGetModel().getMap();
  }
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */
  @java.lang.Override

  public com.tenetmind.models.Car getModelOrDefault(
      int key,
      com.tenetmind.models.Car defaultValue) {
    
    java.util.Map<java.lang.Integer, com.tenetmind.models.Car> map =
        internalGetModel().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
   */
  @java.lang.Override

  public com.tenetmind.models.Car getModelOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, com.tenetmind.models.Car> map =
        internalGetModel().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetModel(),
        ModelDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, com.tenetmind.models.Car> entry
         : internalGetModel().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, com.tenetmind.models.Car>
      model__ = ModelDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, model__);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tenetmind.models.Dealer)) {
      return super.equals(obj);
    }
    com.tenetmind.models.Dealer other = (com.tenetmind.models.Dealer) obj;

    if (!internalGetModel().equals(
        other.internalGetModel())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetModel().getMap().isEmpty()) {
      hash = (37 * hash) + MODEL_FIELD_NUMBER;
      hash = (53 * hash) + internalGetModel().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tenetmind.models.Dealer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tenetmind.models.Dealer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tenetmind.models.Dealer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tenetmind.models.Dealer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tenetmind.models.Dealer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tenetmind.models.Dealer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tenetmind.models.Dealer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tenetmind.models.Dealer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tenetmind.models.Dealer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tenetmind.models.Dealer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tenetmind.models.Dealer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tenetmind.models.Dealer parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tenetmind.models.Dealer prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code complex.Dealer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:complex.Dealer)
      com.tenetmind.models.DealerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tenetmind.models.DealerOuterClass.internal_static_complex_Dealer_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetModel();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableModel();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tenetmind.models.DealerOuterClass.internal_static_complex_Dealer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tenetmind.models.Dealer.class, com.tenetmind.models.Dealer.Builder.class);
    }

    // Construct using com.tenetmind.models.Dealer.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableModel().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tenetmind.models.DealerOuterClass.internal_static_complex_Dealer_descriptor;
    }

    @java.lang.Override
    public com.tenetmind.models.Dealer getDefaultInstanceForType() {
      return com.tenetmind.models.Dealer.getDefaultInstance();
    }

    @java.lang.Override
    public com.tenetmind.models.Dealer build() {
      com.tenetmind.models.Dealer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tenetmind.models.Dealer buildPartial() {
      com.tenetmind.models.Dealer result = new com.tenetmind.models.Dealer(this);
      int from_bitField0_ = bitField0_;
      result.model_ = internalGetModel();
      result.model_.makeImmutable();
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tenetmind.models.Dealer) {
        return mergeFrom((com.tenetmind.models.Dealer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tenetmind.models.Dealer other) {
      if (other == com.tenetmind.models.Dealer.getDefaultInstance()) return this;
      internalGetMutableModel().mergeFrom(
          other.internalGetModel());
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tenetmind.models.Dealer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tenetmind.models.Dealer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, com.tenetmind.models.Car> model_;
    private com.google.protobuf.MapField<java.lang.Integer, com.tenetmind.models.Car>
    internalGetModel() {
      if (model_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ModelDefaultEntryHolder.defaultEntry);
      }
      return model_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, com.tenetmind.models.Car>
    internalGetMutableModel() {
      onChanged();;
      if (model_ == null) {
        model_ = com.google.protobuf.MapField.newMapField(
            ModelDefaultEntryHolder.defaultEntry);
      }
      if (!model_.isMutable()) {
        model_ = model_.copy();
      }
      return model_;
    }

    public int getModelCount() {
      return internalGetModel().getMap().size();
    }
    /**
     * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
     */

    @java.lang.Override
    public boolean containsModel(
        int key) {
      
      return internalGetModel().getMap().containsKey(key);
    }
    /**
     * Use {@link #getModelMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.tenetmind.models.Car> getModel() {
      return getModelMap();
    }
    /**
     * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, com.tenetmind.models.Car> getModelMap() {
      return internalGetModel().getMap();
    }
    /**
     * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
     */
    @java.lang.Override

    public com.tenetmind.models.Car getModelOrDefault(
        int key,
        com.tenetmind.models.Car defaultValue) {
      
      java.util.Map<java.lang.Integer, com.tenetmind.models.Car> map =
          internalGetModel().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
     */
    @java.lang.Override

    public com.tenetmind.models.Car getModelOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, com.tenetmind.models.Car> map =
          internalGetModel().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearModel() {
      internalGetMutableModel().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
     */

    public Builder removeModel(
        int key) {
      
      internalGetMutableModel().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, com.tenetmind.models.Car>
    getMutableModel() {
      return internalGetMutableModel().getMutableMap();
    }
    /**
     * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
     */
    public Builder putModel(
        int key,
        com.tenetmind.models.Car value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableModel().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;int32, .common.Car&gt; model = 1;</code>
     */

    public Builder putAllModel(
        java.util.Map<java.lang.Integer, com.tenetmind.models.Car> values) {
      internalGetMutableModel().getMutableMap()
          .putAll(values);
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:complex.Dealer)
  }

  // @@protoc_insertion_point(class_scope:complex.Dealer)
  private static final com.tenetmind.models.Dealer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tenetmind.models.Dealer();
  }

  public static com.tenetmind.models.Dealer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Dealer>
      PARSER = new com.google.protobuf.AbstractParser<Dealer>() {
    @java.lang.Override
    public Dealer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Dealer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Dealer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Dealer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tenetmind.models.Dealer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

