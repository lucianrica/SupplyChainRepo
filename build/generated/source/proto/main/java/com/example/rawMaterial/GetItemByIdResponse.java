// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: source/rawMaterial.proto

package com.example.rawMaterial;

/**
 * Protobuf type {@code source.GetItemByIdResponse}
 */
public final class GetItemByIdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:source.GetItemByIdResponse)
    GetItemByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetItemByIdResponse.newBuilder() to construct.
  private GetItemByIdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetItemByIdResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetItemByIdResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetItemByIdResponse(
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
            com.example.rawMaterial.RawMaterial.Builder subBuilder = null;
            if (rawMaterial_ != null) {
              subBuilder = rawMaterial_.toBuilder();
            }
            rawMaterial_ = input.readMessage(com.example.rawMaterial.RawMaterial.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rawMaterial_);
              rawMaterial_ = subBuilder.buildPartial();
            }

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
    return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_GetItemByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_GetItemByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.rawMaterial.GetItemByIdResponse.class, com.example.rawMaterial.GetItemByIdResponse.Builder.class);
  }

  public static final int RAWMATERIAL_FIELD_NUMBER = 1;
  private com.example.rawMaterial.RawMaterial rawMaterial_;
  /**
   * <code>.source.RawMaterial rawMaterial = 1;</code>
   * @return Whether the rawMaterial field is set.
   */
  @java.lang.Override
  public boolean hasRawMaterial() {
    return rawMaterial_ != null;
  }
  /**
   * <code>.source.RawMaterial rawMaterial = 1;</code>
   * @return The rawMaterial.
   */
  @java.lang.Override
  public com.example.rawMaterial.RawMaterial getRawMaterial() {
    return rawMaterial_ == null ? com.example.rawMaterial.RawMaterial.getDefaultInstance() : rawMaterial_;
  }
  /**
   * <code>.source.RawMaterial rawMaterial = 1;</code>
   */
  @java.lang.Override
  public com.example.rawMaterial.RawMaterialOrBuilder getRawMaterialOrBuilder() {
    return getRawMaterial();
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
    if (rawMaterial_ != null) {
      output.writeMessage(1, getRawMaterial());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rawMaterial_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRawMaterial());
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
    if (!(obj instanceof com.example.rawMaterial.GetItemByIdResponse)) {
      return super.equals(obj);
    }
    com.example.rawMaterial.GetItemByIdResponse other = (com.example.rawMaterial.GetItemByIdResponse) obj;

    if (hasRawMaterial() != other.hasRawMaterial()) return false;
    if (hasRawMaterial()) {
      if (!getRawMaterial()
          .equals(other.getRawMaterial())) return false;
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
    if (hasRawMaterial()) {
      hash = (37 * hash) + RAWMATERIAL_FIELD_NUMBER;
      hash = (53 * hash) + getRawMaterial().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.rawMaterial.GetItemByIdResponse parseFrom(
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
  public static Builder newBuilder(com.example.rawMaterial.GetItemByIdResponse prototype) {
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
   * Protobuf type {@code source.GetItemByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:source.GetItemByIdResponse)
      com.example.rawMaterial.GetItemByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_GetItemByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_GetItemByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.rawMaterial.GetItemByIdResponse.class, com.example.rawMaterial.GetItemByIdResponse.Builder.class);
    }

    // Construct using com.example.rawMaterial.GetItemByIdResponse.newBuilder()
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
      if (rawMaterialBuilder_ == null) {
        rawMaterial_ = null;
      } else {
        rawMaterial_ = null;
        rawMaterialBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.rawMaterial.RawMaterialOuterClass.internal_static_source_GetItemByIdResponse_descriptor;
    }

    @java.lang.Override
    public com.example.rawMaterial.GetItemByIdResponse getDefaultInstanceForType() {
      return com.example.rawMaterial.GetItemByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.rawMaterial.GetItemByIdResponse build() {
      com.example.rawMaterial.GetItemByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.rawMaterial.GetItemByIdResponse buildPartial() {
      com.example.rawMaterial.GetItemByIdResponse result = new com.example.rawMaterial.GetItemByIdResponse(this);
      if (rawMaterialBuilder_ == null) {
        result.rawMaterial_ = rawMaterial_;
      } else {
        result.rawMaterial_ = rawMaterialBuilder_.build();
      }
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
      if (other instanceof com.example.rawMaterial.GetItemByIdResponse) {
        return mergeFrom((com.example.rawMaterial.GetItemByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.rawMaterial.GetItemByIdResponse other) {
      if (other == com.example.rawMaterial.GetItemByIdResponse.getDefaultInstance()) return this;
      if (other.hasRawMaterial()) {
        mergeRawMaterial(other.getRawMaterial());
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
      com.example.rawMaterial.GetItemByIdResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.rawMaterial.GetItemByIdResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.rawMaterial.RawMaterial rawMaterial_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.rawMaterial.RawMaterial, com.example.rawMaterial.RawMaterial.Builder, com.example.rawMaterial.RawMaterialOrBuilder> rawMaterialBuilder_;
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     * @return Whether the rawMaterial field is set.
     */
    public boolean hasRawMaterial() {
      return rawMaterialBuilder_ != null || rawMaterial_ != null;
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     * @return The rawMaterial.
     */
    public com.example.rawMaterial.RawMaterial getRawMaterial() {
      if (rawMaterialBuilder_ == null) {
        return rawMaterial_ == null ? com.example.rawMaterial.RawMaterial.getDefaultInstance() : rawMaterial_;
      } else {
        return rawMaterialBuilder_.getMessage();
      }
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     */
    public Builder setRawMaterial(com.example.rawMaterial.RawMaterial value) {
      if (rawMaterialBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rawMaterial_ = value;
        onChanged();
      } else {
        rawMaterialBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     */
    public Builder setRawMaterial(
        com.example.rawMaterial.RawMaterial.Builder builderForValue) {
      if (rawMaterialBuilder_ == null) {
        rawMaterial_ = builderForValue.build();
        onChanged();
      } else {
        rawMaterialBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     */
    public Builder mergeRawMaterial(com.example.rawMaterial.RawMaterial value) {
      if (rawMaterialBuilder_ == null) {
        if (rawMaterial_ != null) {
          rawMaterial_ =
            com.example.rawMaterial.RawMaterial.newBuilder(rawMaterial_).mergeFrom(value).buildPartial();
        } else {
          rawMaterial_ = value;
        }
        onChanged();
      } else {
        rawMaterialBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     */
    public Builder clearRawMaterial() {
      if (rawMaterialBuilder_ == null) {
        rawMaterial_ = null;
        onChanged();
      } else {
        rawMaterial_ = null;
        rawMaterialBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     */
    public com.example.rawMaterial.RawMaterial.Builder getRawMaterialBuilder() {
      
      onChanged();
      return getRawMaterialFieldBuilder().getBuilder();
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     */
    public com.example.rawMaterial.RawMaterialOrBuilder getRawMaterialOrBuilder() {
      if (rawMaterialBuilder_ != null) {
        return rawMaterialBuilder_.getMessageOrBuilder();
      } else {
        return rawMaterial_ == null ?
            com.example.rawMaterial.RawMaterial.getDefaultInstance() : rawMaterial_;
      }
    }
    /**
     * <code>.source.RawMaterial rawMaterial = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.rawMaterial.RawMaterial, com.example.rawMaterial.RawMaterial.Builder, com.example.rawMaterial.RawMaterialOrBuilder> 
        getRawMaterialFieldBuilder() {
      if (rawMaterialBuilder_ == null) {
        rawMaterialBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.rawMaterial.RawMaterial, com.example.rawMaterial.RawMaterial.Builder, com.example.rawMaterial.RawMaterialOrBuilder>(
                getRawMaterial(),
                getParentForChildren(),
                isClean());
        rawMaterial_ = null;
      }
      return rawMaterialBuilder_;
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


    // @@protoc_insertion_point(builder_scope:source.GetItemByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:source.GetItemByIdResponse)
  private static final com.example.rawMaterial.GetItemByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.rawMaterial.GetItemByIdResponse();
  }

  public static com.example.rawMaterial.GetItemByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetItemByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetItemByIdResponse>() {
    @java.lang.Override
    public GetItemByIdResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetItemByIdResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetItemByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetItemByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.rawMaterial.GetItemByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

