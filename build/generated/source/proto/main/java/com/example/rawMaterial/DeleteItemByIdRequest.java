// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: source/rawMaterial.proto

package com.example.rawMaterial;

/**
 * <pre>
 * GET RAW MATERIAL BY ID
 * </pre>
 *
 * Protobuf type {@code source.DeleteItemByIdRequest}
 */
public final class DeleteItemByIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:source.DeleteItemByIdRequest)
    DeleteItemByIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteItemByIdRequest.newBuilder() to construct.
  private DeleteItemByIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteItemByIdRequest() {
    rawMaterialId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteItemByIdRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteItemByIdRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            rawMaterialId_ = s;
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
    return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_DeleteItemByIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_DeleteItemByIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.rawMaterial.DeleteItemByIdRequest.class, com.example.rawMaterial.DeleteItemByIdRequest.Builder.class);
  }

  public static final int RAWMATERIALID_FIELD_NUMBER = 1;
  private volatile java.lang.Object rawMaterialId_;
  /**
   * <code>string rawMaterialId = 1;</code>
   * @return The rawMaterialId.
   */
  @java.lang.Override
  public java.lang.String getRawMaterialId() {
    java.lang.Object ref = rawMaterialId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      rawMaterialId_ = s;
      return s;
    }
  }
  /**
   * <code>string rawMaterialId = 1;</code>
   * @return The bytes for rawMaterialId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRawMaterialIdBytes() {
    java.lang.Object ref = rawMaterialId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      rawMaterialId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getRawMaterialIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, rawMaterialId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRawMaterialIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, rawMaterialId_);
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
    if (!(obj instanceof com.example.rawMaterial.DeleteItemByIdRequest)) {
      return super.equals(obj);
    }
    com.example.rawMaterial.DeleteItemByIdRequest other = (com.example.rawMaterial.DeleteItemByIdRequest) obj;

    if (!getRawMaterialId()
        .equals(other.getRawMaterialId())) return false;
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
    hash = (37 * hash) + RAWMATERIALID_FIELD_NUMBER;
    hash = (53 * hash) + getRawMaterialId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.rawMaterial.DeleteItemByIdRequest parseFrom(
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
  public static Builder newBuilder(com.example.rawMaterial.DeleteItemByIdRequest prototype) {
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
   * <pre>
   * GET RAW MATERIAL BY ID
   * </pre>
   *
   * Protobuf type {@code source.DeleteItemByIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:source.DeleteItemByIdRequest)
      com.example.rawMaterial.DeleteItemByIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_DeleteItemByIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_DeleteItemByIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.rawMaterial.DeleteItemByIdRequest.class, com.example.rawMaterial.DeleteItemByIdRequest.Builder.class);
    }

    // Construct using com.example.rawMaterial.DeleteItemByIdRequest.newBuilder()
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
      rawMaterialId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_DeleteItemByIdRequest_descriptor;
    }

    @java.lang.Override
    public com.example.rawMaterial.DeleteItemByIdRequest getDefaultInstanceForType() {
      return com.example.rawMaterial.DeleteItemByIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.rawMaterial.DeleteItemByIdRequest build() {
      com.example.rawMaterial.DeleteItemByIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.rawMaterial.DeleteItemByIdRequest buildPartial() {
      com.example.rawMaterial.DeleteItemByIdRequest result = new com.example.rawMaterial.DeleteItemByIdRequest(this);
      result.rawMaterialId_ = rawMaterialId_;
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
      if (other instanceof com.example.rawMaterial.DeleteItemByIdRequest) {
        return mergeFrom((com.example.rawMaterial.DeleteItemByIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.rawMaterial.DeleteItemByIdRequest other) {
      if (other == com.example.rawMaterial.DeleteItemByIdRequest.getDefaultInstance()) return this;
      if (!other.getRawMaterialId().isEmpty()) {
        rawMaterialId_ = other.rawMaterialId_;
        onChanged();
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
      com.example.rawMaterial.DeleteItemByIdRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.rawMaterial.DeleteItemByIdRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object rawMaterialId_ = "";
    /**
     * <code>string rawMaterialId = 1;</code>
     * @return The rawMaterialId.
     */
    public java.lang.String getRawMaterialId() {
      java.lang.Object ref = rawMaterialId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        rawMaterialId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string rawMaterialId = 1;</code>
     * @return The bytes for rawMaterialId.
     */
    public com.google.protobuf.ByteString
        getRawMaterialIdBytes() {
      java.lang.Object ref = rawMaterialId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        rawMaterialId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string rawMaterialId = 1;</code>
     * @param value The rawMaterialId to set.
     * @return This builder for chaining.
     */
    public Builder setRawMaterialId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      rawMaterialId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string rawMaterialId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRawMaterialId() {
      
      rawMaterialId_ = getDefaultInstance().getRawMaterialId();
      onChanged();
      return this;
    }
    /**
     * <code>string rawMaterialId = 1;</code>
     * @param value The bytes for rawMaterialId to set.
     * @return This builder for chaining.
     */
    public Builder setRawMaterialIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      rawMaterialId_ = value;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:source.DeleteItemByIdRequest)
  }

  // @@protoc_insertion_point(class_scope:source.DeleteItemByIdRequest)
  private static final com.example.rawMaterial.DeleteItemByIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.rawMaterial.DeleteItemByIdRequest();
  }

  public static com.example.rawMaterial.DeleteItemByIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteItemByIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<DeleteItemByIdRequest>() {
    @java.lang.Override
    public DeleteItemByIdRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteItemByIdRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteItemByIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteItemByIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.rawMaterial.DeleteItemByIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

