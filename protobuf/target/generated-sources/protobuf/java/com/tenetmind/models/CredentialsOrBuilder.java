// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/credentials.proto

package com.tenetmind.models;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.common.EmailCredentials emailMode = 1;</code>
   * @return Whether the emailMode field is set.
   */
  boolean hasEmailMode();
  /**
   * <code>.common.EmailCredentials emailMode = 1;</code>
   * @return The emailMode.
   */
  com.tenetmind.models.EmailCredentials getEmailMode();
  /**
   * <code>.common.EmailCredentials emailMode = 1;</code>
   */
  com.tenetmind.models.EmailCredentialsOrBuilder getEmailModeOrBuilder();

  /**
   * <code>.common.PhoneOTP phoneMode = 2;</code>
   * @return Whether the phoneMode field is set.
   */
  boolean hasPhoneMode();
  /**
   * <code>.common.PhoneOTP phoneMode = 2;</code>
   * @return The phoneMode.
   */
  com.tenetmind.models.PhoneOTP getPhoneMode();
  /**
   * <code>.common.PhoneOTP phoneMode = 2;</code>
   */
  com.tenetmind.models.PhoneOTPOrBuilder getPhoneModeOrBuilder();

  public com.tenetmind.models.Credentials.ModeCase getModeCase();
}