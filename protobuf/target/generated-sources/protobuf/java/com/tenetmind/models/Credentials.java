// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/credentials.proto

package com.tenetmind.models;

/**
 * Protobuf type {@code common.Credentials}
 */
public final class Credentials extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.Credentials)
    CredentialsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Credentials.newBuilder() to construct.
  private Credentials(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Credentials() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Credentials();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Credentials(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.tenetmind.models.EmailCredentials.Builder subBuilder = null;
            if (modeCase_ == 1) {
              subBuilder = ((com.tenetmind.models.EmailCredentials) mode_).toBuilder();
            }
            mode_ =
                input.readMessage(com.tenetmind.models.EmailCredentials.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.tenetmind.models.EmailCredentials) mode_);
              mode_ = subBuilder.buildPartial();
            }
            modeCase_ = 1;
            break;
          }
          case 18: {
            com.tenetmind.models.PhoneOTP.Builder subBuilder = null;
            if (modeCase_ == 2) {
              subBuilder = ((com.tenetmind.models.PhoneOTP) mode_).toBuilder();
            }
            mode_ =
                input.readMessage(com.tenetmind.models.PhoneOTP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.tenetmind.models.PhoneOTP) mode_);
              mode_ = subBuilder.buildPartial();
            }
            modeCase_ = 2;
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
    return com.tenetmind.models.CredentialsOuterClass.internal_static_common_Credentials_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tenetmind.models.CredentialsOuterClass.internal_static_common_Credentials_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tenetmind.models.Credentials.class, com.tenetmind.models.Credentials.Builder.class);
  }

  private int modeCase_ = 0;
  private java.lang.Object mode_;
  public enum ModeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    EMAILMODE(1),
    PHONEMODE(2),
    MODE_NOT_SET(0);
    private final int value;
    private ModeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ModeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ModeCase forNumber(int value) {
      switch (value) {
        case 1: return EMAILMODE;
        case 2: return PHONEMODE;
        case 0: return MODE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ModeCase
  getModeCase() {
    return ModeCase.forNumber(
        modeCase_);
  }

  public static final int EMAILMODE_FIELD_NUMBER = 1;
  /**
   * <code>.common.EmailCredentials emailMode = 1;</code>
   * @return Whether the emailMode field is set.
   */
  @java.lang.Override
  public boolean hasEmailMode() {
    return modeCase_ == 1;
  }
  /**
   * <code>.common.EmailCredentials emailMode = 1;</code>
   * @return The emailMode.
   */
  @java.lang.Override
  public com.tenetmind.models.EmailCredentials getEmailMode() {
    if (modeCase_ == 1) {
       return (com.tenetmind.models.EmailCredentials) mode_;
    }
    return com.tenetmind.models.EmailCredentials.getDefaultInstance();
  }
  /**
   * <code>.common.EmailCredentials emailMode = 1;</code>
   */
  @java.lang.Override
  public com.tenetmind.models.EmailCredentialsOrBuilder getEmailModeOrBuilder() {
    if (modeCase_ == 1) {
       return (com.tenetmind.models.EmailCredentials) mode_;
    }
    return com.tenetmind.models.EmailCredentials.getDefaultInstance();
  }

  public static final int PHONEMODE_FIELD_NUMBER = 2;
  /**
   * <code>.common.PhoneOTP phoneMode = 2;</code>
   * @return Whether the phoneMode field is set.
   */
  @java.lang.Override
  public boolean hasPhoneMode() {
    return modeCase_ == 2;
  }
  /**
   * <code>.common.PhoneOTP phoneMode = 2;</code>
   * @return The phoneMode.
   */
  @java.lang.Override
  public com.tenetmind.models.PhoneOTP getPhoneMode() {
    if (modeCase_ == 2) {
       return (com.tenetmind.models.PhoneOTP) mode_;
    }
    return com.tenetmind.models.PhoneOTP.getDefaultInstance();
  }
  /**
   * <code>.common.PhoneOTP phoneMode = 2;</code>
   */
  @java.lang.Override
  public com.tenetmind.models.PhoneOTPOrBuilder getPhoneModeOrBuilder() {
    if (modeCase_ == 2) {
       return (com.tenetmind.models.PhoneOTP) mode_;
    }
    return com.tenetmind.models.PhoneOTP.getDefaultInstance();
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
    if (modeCase_ == 1) {
      output.writeMessage(1, (com.tenetmind.models.EmailCredentials) mode_);
    }
    if (modeCase_ == 2) {
      output.writeMessage(2, (com.tenetmind.models.PhoneOTP) mode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.tenetmind.models.EmailCredentials) mode_);
    }
    if (modeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.tenetmind.models.PhoneOTP) mode_);
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
    if (!(obj instanceof com.tenetmind.models.Credentials)) {
      return super.equals(obj);
    }
    com.tenetmind.models.Credentials other = (com.tenetmind.models.Credentials) obj;

    if (!getModeCase().equals(other.getModeCase())) return false;
    switch (modeCase_) {
      case 1:
        if (!getEmailMode()
            .equals(other.getEmailMode())) return false;
        break;
      case 2:
        if (!getPhoneMode()
            .equals(other.getPhoneMode())) return false;
        break;
      case 0:
      default:
    }
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
    switch (modeCase_) {
      case 1:
        hash = (37 * hash) + EMAILMODE_FIELD_NUMBER;
        hash = (53 * hash) + getEmailMode().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PHONEMODE_FIELD_NUMBER;
        hash = (53 * hash) + getPhoneMode().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tenetmind.models.Credentials parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tenetmind.models.Credentials parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tenetmind.models.Credentials parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tenetmind.models.Credentials parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tenetmind.models.Credentials parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tenetmind.models.Credentials parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tenetmind.models.Credentials parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tenetmind.models.Credentials parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tenetmind.models.Credentials parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tenetmind.models.Credentials parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tenetmind.models.Credentials parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tenetmind.models.Credentials parseFrom(
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
  public static Builder newBuilder(com.tenetmind.models.Credentials prototype) {
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
   * Protobuf type {@code common.Credentials}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.Credentials)
      com.tenetmind.models.CredentialsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tenetmind.models.CredentialsOuterClass.internal_static_common_Credentials_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tenetmind.models.CredentialsOuterClass.internal_static_common_Credentials_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tenetmind.models.Credentials.class, com.tenetmind.models.Credentials.Builder.class);
    }

    // Construct using com.tenetmind.models.Credentials.newBuilder()
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
      modeCase_ = 0;
      mode_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tenetmind.models.CredentialsOuterClass.internal_static_common_Credentials_descriptor;
    }

    @java.lang.Override
    public com.tenetmind.models.Credentials getDefaultInstanceForType() {
      return com.tenetmind.models.Credentials.getDefaultInstance();
    }

    @java.lang.Override
    public com.tenetmind.models.Credentials build() {
      com.tenetmind.models.Credentials result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tenetmind.models.Credentials buildPartial() {
      com.tenetmind.models.Credentials result = new com.tenetmind.models.Credentials(this);
      if (modeCase_ == 1) {
        if (emailModeBuilder_ == null) {
          result.mode_ = mode_;
        } else {
          result.mode_ = emailModeBuilder_.build();
        }
      }
      if (modeCase_ == 2) {
        if (phoneModeBuilder_ == null) {
          result.mode_ = mode_;
        } else {
          result.mode_ = phoneModeBuilder_.build();
        }
      }
      result.modeCase_ = modeCase_;
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
      if (other instanceof com.tenetmind.models.Credentials) {
        return mergeFrom((com.tenetmind.models.Credentials)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tenetmind.models.Credentials other) {
      if (other == com.tenetmind.models.Credentials.getDefaultInstance()) return this;
      switch (other.getModeCase()) {
        case EMAILMODE: {
          mergeEmailMode(other.getEmailMode());
          break;
        }
        case PHONEMODE: {
          mergePhoneMode(other.getPhoneMode());
          break;
        }
        case MODE_NOT_SET: {
          break;
        }
      }
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
      com.tenetmind.models.Credentials parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tenetmind.models.Credentials) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int modeCase_ = 0;
    private java.lang.Object mode_;
    public ModeCase
        getModeCase() {
      return ModeCase.forNumber(
          modeCase_);
    }

    public Builder clearMode() {
      modeCase_ = 0;
      mode_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.tenetmind.models.EmailCredentials, com.tenetmind.models.EmailCredentials.Builder, com.tenetmind.models.EmailCredentialsOrBuilder> emailModeBuilder_;
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     * @return Whether the emailMode field is set.
     */
    @java.lang.Override
    public boolean hasEmailMode() {
      return modeCase_ == 1;
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     * @return The emailMode.
     */
    @java.lang.Override
    public com.tenetmind.models.EmailCredentials getEmailMode() {
      if (emailModeBuilder_ == null) {
        if (modeCase_ == 1) {
          return (com.tenetmind.models.EmailCredentials) mode_;
        }
        return com.tenetmind.models.EmailCredentials.getDefaultInstance();
      } else {
        if (modeCase_ == 1) {
          return emailModeBuilder_.getMessage();
        }
        return com.tenetmind.models.EmailCredentials.getDefaultInstance();
      }
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     */
    public Builder setEmailMode(com.tenetmind.models.EmailCredentials value) {
      if (emailModeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        emailModeBuilder_.setMessage(value);
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     */
    public Builder setEmailMode(
        com.tenetmind.models.EmailCredentials.Builder builderForValue) {
      if (emailModeBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        emailModeBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     */
    public Builder mergeEmailMode(com.tenetmind.models.EmailCredentials value) {
      if (emailModeBuilder_ == null) {
        if (modeCase_ == 1 &&
            mode_ != com.tenetmind.models.EmailCredentials.getDefaultInstance()) {
          mode_ = com.tenetmind.models.EmailCredentials.newBuilder((com.tenetmind.models.EmailCredentials) mode_)
              .mergeFrom(value).buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 1) {
          emailModeBuilder_.mergeFrom(value);
        }
        emailModeBuilder_.setMessage(value);
      }
      modeCase_ = 1;
      return this;
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     */
    public Builder clearEmailMode() {
      if (emailModeBuilder_ == null) {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
        }
        emailModeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     */
    public com.tenetmind.models.EmailCredentials.Builder getEmailModeBuilder() {
      return getEmailModeFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     */
    @java.lang.Override
    public com.tenetmind.models.EmailCredentialsOrBuilder getEmailModeOrBuilder() {
      if ((modeCase_ == 1) && (emailModeBuilder_ != null)) {
        return emailModeBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 1) {
          return (com.tenetmind.models.EmailCredentials) mode_;
        }
        return com.tenetmind.models.EmailCredentials.getDefaultInstance();
      }
    }
    /**
     * <code>.common.EmailCredentials emailMode = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tenetmind.models.EmailCredentials, com.tenetmind.models.EmailCredentials.Builder, com.tenetmind.models.EmailCredentialsOrBuilder> 
        getEmailModeFieldBuilder() {
      if (emailModeBuilder_ == null) {
        if (!(modeCase_ == 1)) {
          mode_ = com.tenetmind.models.EmailCredentials.getDefaultInstance();
        }
        emailModeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tenetmind.models.EmailCredentials, com.tenetmind.models.EmailCredentials.Builder, com.tenetmind.models.EmailCredentialsOrBuilder>(
                (com.tenetmind.models.EmailCredentials) mode_,
                getParentForChildren(),
                isClean());
        mode_ = null;
      }
      modeCase_ = 1;
      onChanged();;
      return emailModeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.tenetmind.models.PhoneOTP, com.tenetmind.models.PhoneOTP.Builder, com.tenetmind.models.PhoneOTPOrBuilder> phoneModeBuilder_;
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     * @return Whether the phoneMode field is set.
     */
    @java.lang.Override
    public boolean hasPhoneMode() {
      return modeCase_ == 2;
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     * @return The phoneMode.
     */
    @java.lang.Override
    public com.tenetmind.models.PhoneOTP getPhoneMode() {
      if (phoneModeBuilder_ == null) {
        if (modeCase_ == 2) {
          return (com.tenetmind.models.PhoneOTP) mode_;
        }
        return com.tenetmind.models.PhoneOTP.getDefaultInstance();
      } else {
        if (modeCase_ == 2) {
          return phoneModeBuilder_.getMessage();
        }
        return com.tenetmind.models.PhoneOTP.getDefaultInstance();
      }
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     */
    public Builder setPhoneMode(com.tenetmind.models.PhoneOTP value) {
      if (phoneModeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        phoneModeBuilder_.setMessage(value);
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     */
    public Builder setPhoneMode(
        com.tenetmind.models.PhoneOTP.Builder builderForValue) {
      if (phoneModeBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        phoneModeBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     */
    public Builder mergePhoneMode(com.tenetmind.models.PhoneOTP value) {
      if (phoneModeBuilder_ == null) {
        if (modeCase_ == 2 &&
            mode_ != com.tenetmind.models.PhoneOTP.getDefaultInstance()) {
          mode_ = com.tenetmind.models.PhoneOTP.newBuilder((com.tenetmind.models.PhoneOTP) mode_)
              .mergeFrom(value).buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 2) {
          phoneModeBuilder_.mergeFrom(value);
        }
        phoneModeBuilder_.setMessage(value);
      }
      modeCase_ = 2;
      return this;
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     */
    public Builder clearPhoneMode() {
      if (phoneModeBuilder_ == null) {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
        }
        phoneModeBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     */
    public com.tenetmind.models.PhoneOTP.Builder getPhoneModeBuilder() {
      return getPhoneModeFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     */
    @java.lang.Override
    public com.tenetmind.models.PhoneOTPOrBuilder getPhoneModeOrBuilder() {
      if ((modeCase_ == 2) && (phoneModeBuilder_ != null)) {
        return phoneModeBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 2) {
          return (com.tenetmind.models.PhoneOTP) mode_;
        }
        return com.tenetmind.models.PhoneOTP.getDefaultInstance();
      }
    }
    /**
     * <code>.common.PhoneOTP phoneMode = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tenetmind.models.PhoneOTP, com.tenetmind.models.PhoneOTP.Builder, com.tenetmind.models.PhoneOTPOrBuilder> 
        getPhoneModeFieldBuilder() {
      if (phoneModeBuilder_ == null) {
        if (!(modeCase_ == 2)) {
          mode_ = com.tenetmind.models.PhoneOTP.getDefaultInstance();
        }
        phoneModeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tenetmind.models.PhoneOTP, com.tenetmind.models.PhoneOTP.Builder, com.tenetmind.models.PhoneOTPOrBuilder>(
                (com.tenetmind.models.PhoneOTP) mode_,
                getParentForChildren(),
                isClean());
        mode_ = null;
      }
      modeCase_ = 2;
      onChanged();;
      return phoneModeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:common.Credentials)
  }

  // @@protoc_insertion_point(class_scope:common.Credentials)
  private static final com.tenetmind.models.Credentials DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tenetmind.models.Credentials();
  }

  public static com.tenetmind.models.Credentials getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Credentials>
      PARSER = new com.google.protobuf.AbstractParser<Credentials>() {
    @java.lang.Override
    public Credentials parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Credentials(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Credentials> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Credentials> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tenetmind.models.Credentials getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

