/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/appengine/v1/version.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * A service with basic scaling will create an instance when the application
 * receives a request. The instance will be turned down when the app becomes
 * idle. Basic scaling is ideal for work that is intermittent or driven by
 * user activity.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.BasicScaling}
 */
public final class BasicScaling extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.BasicScaling)
    BasicScalingOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BasicScaling.newBuilder() to construct.
  private BasicScaling(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BasicScaling() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BasicScaling();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BasicScaling(
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
          case 10:
            {
              com.google.protobuf.Duration.Builder subBuilder = null;
              if (idleTimeout_ != null) {
                subBuilder = idleTimeout_.toBuilder();
              }
              idleTimeout_ =
                  input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(idleTimeout_);
                idleTimeout_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              maxInstances_ = input.readInt32();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_BasicScaling_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.VersionProto
        .internal_static_google_appengine_v1_BasicScaling_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.BasicScaling.class,
            com.google.appengine.v1.BasicScaling.Builder.class);
  }

  public static final int IDLE_TIMEOUT_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration idleTimeout_;
  /**
   *
   *
   * <pre>
   * Duration of time after the last request that an instance must wait before
   * the instance is shut down.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 1;</code>
   *
   * @return Whether the idleTimeout field is set.
   */
  @java.lang.Override
  public boolean hasIdleTimeout() {
    return idleTimeout_ != null;
  }
  /**
   *
   *
   * <pre>
   * Duration of time after the last request that an instance must wait before
   * the instance is shut down.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 1;</code>
   *
   * @return The idleTimeout.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getIdleTimeout() {
    return idleTimeout_ == null ? com.google.protobuf.Duration.getDefaultInstance() : idleTimeout_;
  }
  /**
   *
   *
   * <pre>
   * Duration of time after the last request that an instance must wait before
   * the instance is shut down.
   * </pre>
   *
   * <code>.google.protobuf.Duration idle_timeout = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getIdleTimeoutOrBuilder() {
    return getIdleTimeout();
  }

  public static final int MAX_INSTANCES_FIELD_NUMBER = 2;
  private int maxInstances_;
  /**
   *
   *
   * <pre>
   * Maximum number of instances to create for this version.
   * </pre>
   *
   * <code>int32 max_instances = 2;</code>
   *
   * @return The maxInstances.
   */
  @java.lang.Override
  public int getMaxInstances() {
    return maxInstances_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (idleTimeout_ != null) {
      output.writeMessage(1, getIdleTimeout());
    }
    if (maxInstances_ != 0) {
      output.writeInt32(2, maxInstances_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idleTimeout_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getIdleTimeout());
    }
    if (maxInstances_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxInstances_);
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
    if (!(obj instanceof com.google.appengine.v1.BasicScaling)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.BasicScaling other = (com.google.appengine.v1.BasicScaling) obj;

    if (hasIdleTimeout() != other.hasIdleTimeout()) return false;
    if (hasIdleTimeout()) {
      if (!getIdleTimeout().equals(other.getIdleTimeout())) return false;
    }
    if (getMaxInstances() != other.getMaxInstances()) return false;
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
    if (hasIdleTimeout()) {
      hash = (37 * hash) + IDLE_TIMEOUT_FIELD_NUMBER;
      hash = (53 * hash) + getIdleTimeout().hashCode();
    }
    hash = (37 * hash) + MAX_INSTANCES_FIELD_NUMBER;
    hash = (53 * hash) + getMaxInstances();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.BasicScaling parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.BasicScaling parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.BasicScaling parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.appengine.v1.BasicScaling prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A service with basic scaling will create an instance when the application
   * receives a request. The instance will be turned down when the app becomes
   * idle. Basic scaling is ideal for work that is intermittent or driven by
   * user activity.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.BasicScaling}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.BasicScaling)
      com.google.appengine.v1.BasicScalingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_BasicScaling_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_BasicScaling_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.BasicScaling.class,
              com.google.appengine.v1.BasicScaling.Builder.class);
    }

    // Construct using com.google.appengine.v1.BasicScaling.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (idleTimeoutBuilder_ == null) {
        idleTimeout_ = null;
      } else {
        idleTimeout_ = null;
        idleTimeoutBuilder_ = null;
      }
      maxInstances_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.VersionProto
          .internal_static_google_appengine_v1_BasicScaling_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.BasicScaling getDefaultInstanceForType() {
      return com.google.appengine.v1.BasicScaling.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.BasicScaling build() {
      com.google.appengine.v1.BasicScaling result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.BasicScaling buildPartial() {
      com.google.appengine.v1.BasicScaling result = new com.google.appengine.v1.BasicScaling(this);
      if (idleTimeoutBuilder_ == null) {
        result.idleTimeout_ = idleTimeout_;
      } else {
        result.idleTimeout_ = idleTimeoutBuilder_.build();
      }
      result.maxInstances_ = maxInstances_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.appengine.v1.BasicScaling) {
        return mergeFrom((com.google.appengine.v1.BasicScaling) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.BasicScaling other) {
      if (other == com.google.appengine.v1.BasicScaling.getDefaultInstance()) return this;
      if (other.hasIdleTimeout()) {
        mergeIdleTimeout(other.getIdleTimeout());
      }
      if (other.getMaxInstances() != 0) {
        setMaxInstances(other.getMaxInstances());
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
      com.google.appengine.v1.BasicScaling parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.appengine.v1.BasicScaling) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Duration idleTimeout_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        idleTimeoutBuilder_;
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     *
     * @return Whether the idleTimeout field is set.
     */
    public boolean hasIdleTimeout() {
      return idleTimeoutBuilder_ != null || idleTimeout_ != null;
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     *
     * @return The idleTimeout.
     */
    public com.google.protobuf.Duration getIdleTimeout() {
      if (idleTimeoutBuilder_ == null) {
        return idleTimeout_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : idleTimeout_;
      } else {
        return idleTimeoutBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     */
    public Builder setIdleTimeout(com.google.protobuf.Duration value) {
      if (idleTimeoutBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        idleTimeout_ = value;
        onChanged();
      } else {
        idleTimeoutBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     */
    public Builder setIdleTimeout(com.google.protobuf.Duration.Builder builderForValue) {
      if (idleTimeoutBuilder_ == null) {
        idleTimeout_ = builderForValue.build();
        onChanged();
      } else {
        idleTimeoutBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     */
    public Builder mergeIdleTimeout(com.google.protobuf.Duration value) {
      if (idleTimeoutBuilder_ == null) {
        if (idleTimeout_ != null) {
          idleTimeout_ =
              com.google.protobuf.Duration.newBuilder(idleTimeout_).mergeFrom(value).buildPartial();
        } else {
          idleTimeout_ = value;
        }
        onChanged();
      } else {
        idleTimeoutBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     */
    public Builder clearIdleTimeout() {
      if (idleTimeoutBuilder_ == null) {
        idleTimeout_ = null;
        onChanged();
      } else {
        idleTimeout_ = null;
        idleTimeoutBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getIdleTimeoutBuilder() {

      onChanged();
      return getIdleTimeoutFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getIdleTimeoutOrBuilder() {
      if (idleTimeoutBuilder_ != null) {
        return idleTimeoutBuilder_.getMessageOrBuilder();
      } else {
        return idleTimeout_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : idleTimeout_;
      }
    }
    /**
     *
     *
     * <pre>
     * Duration of time after the last request that an instance must wait before
     * the instance is shut down.
     * </pre>
     *
     * <code>.google.protobuf.Duration idle_timeout = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getIdleTimeoutFieldBuilder() {
      if (idleTimeoutBuilder_ == null) {
        idleTimeoutBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getIdleTimeout(), getParentForChildren(), isClean());
        idleTimeout_ = null;
      }
      return idleTimeoutBuilder_;
    }

    private int maxInstances_;
    /**
     *
     *
     * <pre>
     * Maximum number of instances to create for this version.
     * </pre>
     *
     * <code>int32 max_instances = 2;</code>
     *
     * @return The maxInstances.
     */
    @java.lang.Override
    public int getMaxInstances() {
      return maxInstances_;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of instances to create for this version.
     * </pre>
     *
     * <code>int32 max_instances = 2;</code>
     *
     * @param value The maxInstances to set.
     * @return This builder for chaining.
     */
    public Builder setMaxInstances(int value) {

      maxInstances_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maximum number of instances to create for this version.
     * </pre>
     *
     * <code>int32 max_instances = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxInstances() {

      maxInstances_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.BasicScaling)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.BasicScaling)
  private static final com.google.appengine.v1.BasicScaling DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.BasicScaling();
  }

  public static com.google.appengine.v1.BasicScaling getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BasicScaling> PARSER =
      new com.google.protobuf.AbstractParser<BasicScaling>() {
        @java.lang.Override
        public BasicScaling parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BasicScaling(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BasicScaling> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BasicScaling> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.BasicScaling getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
