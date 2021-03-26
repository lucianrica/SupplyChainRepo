// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processors/factory.proto

package com.example.factory;

/**
 * <pre>
 * PRODUCT MODEL
 * </pre>
 *
 * Protobuf type {@code processors.Product}
 */
public final class Product extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:processors.Product)
    ProductOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Product.newBuilder() to construct.
  private Product(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Product() {
    productId_ = "";
    productName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Product();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Product(
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

            productId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            productName_ = s;
            break;
          }
          case 24: {

            productsInStock_ = input.readInt32();
            break;
          }
          case 32: {

            productVolume_ = input.readInt32();
            break;
          }
          case 41: {

            productPrice_ = input.readDouble();
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
    return com.example.factory.Factory.internal_static_processors_Product_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.factory.Factory.internal_static_processors_Product_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.factory.Product.class, com.example.factory.Product.Builder.class);
  }

  public static final int PRODUCTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object productId_;
  /**
   * <code>string productId = 1;</code>
   * @return The productId.
   */
  @java.lang.Override
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   * <code>string productId = 1;</code>
   * @return The bytes for productId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object productName_;
  /**
   * <code>string productName = 2;</code>
   * @return The productName.
   */
  @java.lang.Override
  public java.lang.String getProductName() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productName_ = s;
      return s;
    }
  }
  /**
   * <code>string productName = 2;</code>
   * @return The bytes for productName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProductNameBytes() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCTSINSTOCK_FIELD_NUMBER = 3;
  private int productsInStock_;
  /**
   * <code>int32 productsInStock = 3;</code>
   * @return The productsInStock.
   */
  @java.lang.Override
  public int getProductsInStock() {
    return productsInStock_;
  }

  public static final int PRODUCTVOLUME_FIELD_NUMBER = 4;
  private int productVolume_;
  /**
   * <pre>
   * Depth × Width × Length
   * </pre>
   *
   * <code>int32 productVolume = 4;</code>
   * @return The productVolume.
   */
  @java.lang.Override
  public int getProductVolume() {
    return productVolume_;
  }

  public static final int PRODUCTPRICE_FIELD_NUMBER = 5;
  private double productPrice_;
  /**
   * <code>double productPrice = 5;</code>
   * @return The productPrice.
   */
  @java.lang.Override
  public double getProductPrice() {
    return productPrice_;
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
    if (!getProductIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productId_);
    }
    if (!getProductNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, productName_);
    }
    if (productsInStock_ != 0) {
      output.writeInt32(3, productsInStock_);
    }
    if (productVolume_ != 0) {
      output.writeInt32(4, productVolume_);
    }
    if (productPrice_ != 0D) {
      output.writeDouble(5, productPrice_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productId_);
    }
    if (!getProductNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, productName_);
    }
    if (productsInStock_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, productsInStock_);
    }
    if (productVolume_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, productVolume_);
    }
    if (productPrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, productPrice_);
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
    if (!(obj instanceof com.example.factory.Product)) {
      return super.equals(obj);
    }
    com.example.factory.Product other = (com.example.factory.Product) obj;

    if (!getProductId()
        .equals(other.getProductId())) return false;
    if (!getProductName()
        .equals(other.getProductName())) return false;
    if (getProductsInStock()
        != other.getProductsInStock()) return false;
    if (getProductVolume()
        != other.getProductVolume()) return false;
    if (java.lang.Double.doubleToLongBits(getProductPrice())
        != java.lang.Double.doubleToLongBits(
            other.getProductPrice())) return false;
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
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    hash = (37 * hash) + PRODUCTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getProductName().hashCode();
    hash = (37 * hash) + PRODUCTSINSTOCK_FIELD_NUMBER;
    hash = (53 * hash) + getProductsInStock();
    hash = (37 * hash) + PRODUCTVOLUME_FIELD_NUMBER;
    hash = (53 * hash) + getProductVolume();
    hash = (37 * hash) + PRODUCTPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getProductPrice()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.factory.Product parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.factory.Product parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.factory.Product parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.factory.Product parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.factory.Product parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.factory.Product parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.factory.Product parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.factory.Product parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.factory.Product parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.factory.Product parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.factory.Product parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.factory.Product parseFrom(
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
  public static Builder newBuilder(com.example.factory.Product prototype) {
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
   * PRODUCT MODEL
   * </pre>
   *
   * Protobuf type {@code processors.Product}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:processors.Product)
      com.example.factory.ProductOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.factory.Factory.internal_static_processors_Product_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.factory.Factory.internal_static_processors_Product_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.factory.Product.class, com.example.factory.Product.Builder.class);
    }

    // Construct using com.example.factory.Product.newBuilder()
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
      productId_ = "";

      productName_ = "";

      productsInStock_ = 0;

      productVolume_ = 0;

      productPrice_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.factory.Factory.internal_static_processors_Product_descriptor;
    }

    @java.lang.Override
    public com.example.factory.Product getDefaultInstanceForType() {
      return com.example.factory.Product.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.factory.Product build() {
      com.example.factory.Product result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.factory.Product buildPartial() {
      com.example.factory.Product result = new com.example.factory.Product(this);
      result.productId_ = productId_;
      result.productName_ = productName_;
      result.productsInStock_ = productsInStock_;
      result.productVolume_ = productVolume_;
      result.productPrice_ = productPrice_;
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
      if (other instanceof com.example.factory.Product) {
        return mergeFrom((com.example.factory.Product)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.factory.Product other) {
      if (other == com.example.factory.Product.getDefaultInstance()) return this;
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
      }
      if (!other.getProductName().isEmpty()) {
        productName_ = other.productName_;
        onChanged();
      }
      if (other.getProductsInStock() != 0) {
        setProductsInStock(other.getProductsInStock());
      }
      if (other.getProductVolume() != 0) {
        setProductVolume(other.getProductVolume());
      }
      if (other.getProductPrice() != 0D) {
        setProductPrice(other.getProductPrice());
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
      com.example.factory.Product parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.factory.Product) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object productId_ = "";
    /**
     * <code>string productId = 1;</code>
     * @return The productId.
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     * @return The bytes for productId.
     */
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     * @param value The productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductId() {
      
      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     * @param value The bytes for productId to set.
     * @return This builder for chaining.
     */
    public Builder setProductIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object productName_ = "";
    /**
     * <code>string productName = 2;</code>
     * @return The productName.
     */
    public java.lang.String getProductName() {
      java.lang.Object ref = productName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productName = 2;</code>
     * @return The bytes for productName.
     */
    public com.google.protobuf.ByteString
        getProductNameBytes() {
      java.lang.Object ref = productName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productName = 2;</code>
     * @param value The productName to set.
     * @return This builder for chaining.
     */
    public Builder setProductName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductName() {
      
      productName_ = getDefaultInstance().getProductName();
      onChanged();
      return this;
    }
    /**
     * <code>string productName = 2;</code>
     * @param value The bytes for productName to set.
     * @return This builder for chaining.
     */
    public Builder setProductNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productName_ = value;
      onChanged();
      return this;
    }

    private int productsInStock_ ;
    /**
     * <code>int32 productsInStock = 3;</code>
     * @return The productsInStock.
     */
    @java.lang.Override
    public int getProductsInStock() {
      return productsInStock_;
    }
    /**
     * <code>int32 productsInStock = 3;</code>
     * @param value The productsInStock to set.
     * @return This builder for chaining.
     */
    public Builder setProductsInStock(int value) {
      
      productsInStock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 productsInStock = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductsInStock() {
      
      productsInStock_ = 0;
      onChanged();
      return this;
    }

    private int productVolume_ ;
    /**
     * <pre>
     * Depth × Width × Length
     * </pre>
     *
     * <code>int32 productVolume = 4;</code>
     * @return The productVolume.
     */
    @java.lang.Override
    public int getProductVolume() {
      return productVolume_;
    }
    /**
     * <pre>
     * Depth × Width × Length
     * </pre>
     *
     * <code>int32 productVolume = 4;</code>
     * @param value The productVolume to set.
     * @return This builder for chaining.
     */
    public Builder setProductVolume(int value) {
      
      productVolume_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Depth × Width × Length
     * </pre>
     *
     * <code>int32 productVolume = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductVolume() {
      
      productVolume_ = 0;
      onChanged();
      return this;
    }

    private double productPrice_ ;
    /**
     * <code>double productPrice = 5;</code>
     * @return The productPrice.
     */
    @java.lang.Override
    public double getProductPrice() {
      return productPrice_;
    }
    /**
     * <code>double productPrice = 5;</code>
     * @param value The productPrice to set.
     * @return This builder for chaining.
     */
    public Builder setProductPrice(double value) {
      
      productPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double productPrice = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductPrice() {
      
      productPrice_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:processors.Product)
  }

  // @@protoc_insertion_point(class_scope:processors.Product)
  private static final com.example.factory.Product DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.factory.Product();
  }

  public static com.example.factory.Product getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Product>
      PARSER = new com.google.protobuf.AbstractParser<Product>() {
    @java.lang.Override
    public Product parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Product(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Product> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Product> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.factory.Product getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

