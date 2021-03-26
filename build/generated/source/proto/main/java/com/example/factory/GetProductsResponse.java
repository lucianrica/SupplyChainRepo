// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processors/factory.proto

package com.example.factory;

/**
 * Protobuf type {@code processors.GetProductsResponse}
 */
public final class GetProductsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:processors.GetProductsResponse)
    GetProductsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetProductsResponse.newBuilder() to construct.
  private GetProductsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetProductsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetProductsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetProductsResponse(
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
            com.example.factory.Product.Builder subBuilder = null;
            if (product_ != null) {
              subBuilder = product_.toBuilder();
            }
            product_ = input.readMessage(com.example.factory.Product.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(product_);
              product_ = subBuilder.buildPartial();
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
    return com.example.factory.Factory.internal_static_processors_GetProductsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.factory.Factory.internal_static_processors_GetProductsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.factory.GetProductsResponse.class, com.example.factory.GetProductsResponse.Builder.class);
  }

  public static final int PRODUCT_FIELD_NUMBER = 1;
  private com.example.factory.Product product_;
  /**
   * <code>.processors.Product product = 1;</code>
   * @return Whether the product field is set.
   */
  @java.lang.Override
  public boolean hasProduct() {
    return product_ != null;
  }
  /**
   * <code>.processors.Product product = 1;</code>
   * @return The product.
   */
  @java.lang.Override
  public com.example.factory.Product getProduct() {
    return product_ == null ? com.example.factory.Product.getDefaultInstance() : product_;
  }
  /**
   * <code>.processors.Product product = 1;</code>
   */
  @java.lang.Override
  public com.example.factory.ProductOrBuilder getProductOrBuilder() {
    return getProduct();
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
    if (product_ != null) {
      output.writeMessage(1, getProduct());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (product_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProduct());
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
    if (!(obj instanceof com.example.factory.GetProductsResponse)) {
      return super.equals(obj);
    }
    com.example.factory.GetProductsResponse other = (com.example.factory.GetProductsResponse) obj;

    if (hasProduct() != other.hasProduct()) return false;
    if (hasProduct()) {
      if (!getProduct()
          .equals(other.getProduct())) return false;
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
    if (hasProduct()) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProduct().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.factory.GetProductsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.factory.GetProductsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.factory.GetProductsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.factory.GetProductsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.factory.GetProductsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.factory.GetProductsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.factory.GetProductsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.factory.GetProductsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.factory.GetProductsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.factory.GetProductsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.factory.GetProductsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.factory.GetProductsResponse parseFrom(
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
  public static Builder newBuilder(com.example.factory.GetProductsResponse prototype) {
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
   * Protobuf type {@code processors.GetProductsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:processors.GetProductsResponse)
      com.example.factory.GetProductsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.factory.Factory.internal_static_processors_GetProductsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.factory.Factory.internal_static_processors_GetProductsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.factory.GetProductsResponse.class, com.example.factory.GetProductsResponse.Builder.class);
    }

    // Construct using com.example.factory.GetProductsResponse.newBuilder()
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
      if (productBuilder_ == null) {
        product_ = null;
      } else {
        product_ = null;
        productBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.factory.Factory.internal_static_processors_GetProductsResponse_descriptor;
    }

    @java.lang.Override
    public com.example.factory.GetProductsResponse getDefaultInstanceForType() {
      return com.example.factory.GetProductsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.factory.GetProductsResponse build() {
      com.example.factory.GetProductsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.factory.GetProductsResponse buildPartial() {
      com.example.factory.GetProductsResponse result = new com.example.factory.GetProductsResponse(this);
      if (productBuilder_ == null) {
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
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
      if (other instanceof com.example.factory.GetProductsResponse) {
        return mergeFrom((com.example.factory.GetProductsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.factory.GetProductsResponse other) {
      if (other == com.example.factory.GetProductsResponse.getDefaultInstance()) return this;
      if (other.hasProduct()) {
        mergeProduct(other.getProduct());
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
      com.example.factory.GetProductsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.factory.GetProductsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.example.factory.Product product_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.factory.Product, com.example.factory.Product.Builder, com.example.factory.ProductOrBuilder> productBuilder_;
    /**
     * <code>.processors.Product product = 1;</code>
     * @return Whether the product field is set.
     */
    public boolean hasProduct() {
      return productBuilder_ != null || product_ != null;
    }
    /**
     * <code>.processors.Product product = 1;</code>
     * @return The product.
     */
    public com.example.factory.Product getProduct() {
      if (productBuilder_ == null) {
        return product_ == null ? com.example.factory.Product.getDefaultInstance() : product_;
      } else {
        return productBuilder_.getMessage();
      }
    }
    /**
     * <code>.processors.Product product = 1;</code>
     */
    public Builder setProduct(com.example.factory.Product value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        product_ = value;
        onChanged();
      } else {
        productBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.processors.Product product = 1;</code>
     */
    public Builder setProduct(
        com.example.factory.Product.Builder builderForValue) {
      if (productBuilder_ == null) {
        product_ = builderForValue.build();
        onChanged();
      } else {
        productBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.processors.Product product = 1;</code>
     */
    public Builder mergeProduct(com.example.factory.Product value) {
      if (productBuilder_ == null) {
        if (product_ != null) {
          product_ =
            com.example.factory.Product.newBuilder(product_).mergeFrom(value).buildPartial();
        } else {
          product_ = value;
        }
        onChanged();
      } else {
        productBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.processors.Product product = 1;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = null;
        onChanged();
      } else {
        product_ = null;
        productBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.processors.Product product = 1;</code>
     */
    public com.example.factory.Product.Builder getProductBuilder() {
      
      onChanged();
      return getProductFieldBuilder().getBuilder();
    }
    /**
     * <code>.processors.Product product = 1;</code>
     */
    public com.example.factory.ProductOrBuilder getProductOrBuilder() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilder();
      } else {
        return product_ == null ?
            com.example.factory.Product.getDefaultInstance() : product_;
      }
    }
    /**
     * <code>.processors.Product product = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.factory.Product, com.example.factory.Product.Builder, com.example.factory.ProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.factory.Product, com.example.factory.Product.Builder, com.example.factory.ProductOrBuilder>(
                getProduct(),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
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


    // @@protoc_insertion_point(builder_scope:processors.GetProductsResponse)
  }

  // @@protoc_insertion_point(class_scope:processors.GetProductsResponse)
  private static final com.example.factory.GetProductsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.factory.GetProductsResponse();
  }

  public static com.example.factory.GetProductsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetProductsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetProductsResponse>() {
    @java.lang.Override
    public GetProductsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetProductsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetProductsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetProductsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.factory.GetProductsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

