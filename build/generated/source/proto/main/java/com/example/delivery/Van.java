// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: delivery/delivery.proto

package com.example.delivery;

/**
 * Protobuf type {@code delivery.Van}
 */
public final class Van extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:delivery.Van)
    VanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Van.newBuilder() to construct.
  private Van(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Van() {
    vanId_ = "";
    itemId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Van();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Van(
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

            vanId_ = s;
            break;
          }
          case 16: {

            drivers_ = input.readInt32();
            break;
          }
          case 24: {

            volume_ = input.readInt32();
            break;
          }
          case 32: {

            delivering_ = input.readBool();
            break;
          }
          case 40: {

            fulfilled_ = input.readBool();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            itemId_ = s;
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
    return com.example.delivery.Delivery.internal_static_delivery_Van_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.delivery.Delivery.internal_static_delivery_Van_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.delivery.Van.class, com.example.delivery.Van.Builder.class);
  }

  public static final int VANID_FIELD_NUMBER = 1;
  private volatile java.lang.Object vanId_;
  /**
   * <code>string vanId = 1;</code>
   * @return The vanId.
   */
  @java.lang.Override
  public java.lang.String getVanId() {
    java.lang.Object ref = vanId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vanId_ = s;
      return s;
    }
  }
  /**
   * <code>string vanId = 1;</code>
   * @return The bytes for vanId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVanIdBytes() {
    java.lang.Object ref = vanId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vanId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DRIVERS_FIELD_NUMBER = 2;
  private int drivers_;
  /**
   * <code>int32 drivers = 2;</code>
   * @return The drivers.
   */
  @java.lang.Override
  public int getDrivers() {
    return drivers_;
  }

  public static final int VOLUME_FIELD_NUMBER = 3;
  private int volume_;
  /**
   * <code>int32 volume = 3;</code>
   * @return The volume.
   */
  @java.lang.Override
  public int getVolume() {
    return volume_;
  }

  public static final int DELIVERING_FIELD_NUMBER = 4;
  private boolean delivering_;
  /**
   * <code>bool delivering = 4;</code>
   * @return The delivering.
   */
  @java.lang.Override
  public boolean getDelivering() {
    return delivering_;
  }

  public static final int FULFILLED_FIELD_NUMBER = 5;
  private boolean fulfilled_;
  /**
   * <code>bool fulfilled = 5;</code>
   * @return The fulfilled.
   */
  @java.lang.Override
  public boolean getFulfilled() {
    return fulfilled_;
  }

  public static final int ITEMID_FIELD_NUMBER = 6;
  private volatile java.lang.Object itemId_;
  /**
   * <code>string itemId = 6;</code>
   * @return The itemId.
   */
  @java.lang.Override
  public java.lang.String getItemId() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      itemId_ = s;
      return s;
    }
  }
  /**
   * <code>string itemId = 6;</code>
   * @return The bytes for itemId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemIdBytes() {
    java.lang.Object ref = itemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      itemId_ = b;
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
    if (!getVanIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vanId_);
    }
    if (drivers_ != 0) {
      output.writeInt32(2, drivers_);
    }
    if (volume_ != 0) {
      output.writeInt32(3, volume_);
    }
    if (delivering_ != false) {
      output.writeBool(4, delivering_);
    }
    if (fulfilled_ != false) {
      output.writeBool(5, fulfilled_);
    }
    if (!getItemIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, itemId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVanIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vanId_);
    }
    if (drivers_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, drivers_);
    }
    if (volume_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, volume_);
    }
    if (delivering_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, delivering_);
    }
    if (fulfilled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, fulfilled_);
    }
    if (!getItemIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, itemId_);
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
    if (!(obj instanceof com.example.delivery.Van)) {
      return super.equals(obj);
    }
    com.example.delivery.Van other = (com.example.delivery.Van) obj;

    if (!getVanId()
        .equals(other.getVanId())) return false;
    if (getDrivers()
        != other.getDrivers()) return false;
    if (getVolume()
        != other.getVolume()) return false;
    if (getDelivering()
        != other.getDelivering()) return false;
    if (getFulfilled()
        != other.getFulfilled()) return false;
    if (!getItemId()
        .equals(other.getItemId())) return false;
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
    hash = (37 * hash) + VANID_FIELD_NUMBER;
    hash = (53 * hash) + getVanId().hashCode();
    hash = (37 * hash) + DRIVERS_FIELD_NUMBER;
    hash = (53 * hash) + getDrivers();
    hash = (37 * hash) + VOLUME_FIELD_NUMBER;
    hash = (53 * hash) + getVolume();
    hash = (37 * hash) + DELIVERING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDelivering());
    hash = (37 * hash) + FULFILLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFulfilled());
    hash = (37 * hash) + ITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getItemId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.delivery.Van parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.delivery.Van parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.delivery.Van parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.delivery.Van parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.delivery.Van parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.delivery.Van parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.delivery.Van parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.delivery.Van parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.delivery.Van parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.delivery.Van parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.delivery.Van parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.delivery.Van parseFrom(
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
  public static Builder newBuilder(com.example.delivery.Van prototype) {
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
   * Protobuf type {@code delivery.Van}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:delivery.Van)
      com.example.delivery.VanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.delivery.Delivery.internal_static_delivery_Van_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.delivery.Delivery.internal_static_delivery_Van_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.delivery.Van.class, com.example.delivery.Van.Builder.class);
    }

    // Construct using com.example.delivery.Van.newBuilder()
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
      vanId_ = "";

      drivers_ = 0;

      volume_ = 0;

      delivering_ = false;

      fulfilled_ = false;

      itemId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.delivery.Delivery.internal_static_delivery_Van_descriptor;
    }

    @java.lang.Override
    public com.example.delivery.Van getDefaultInstanceForType() {
      return com.example.delivery.Van.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.delivery.Van build() {
      com.example.delivery.Van result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.delivery.Van buildPartial() {
      com.example.delivery.Van result = new com.example.delivery.Van(this);
      result.vanId_ = vanId_;
      result.drivers_ = drivers_;
      result.volume_ = volume_;
      result.delivering_ = delivering_;
      result.fulfilled_ = fulfilled_;
      result.itemId_ = itemId_;
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
      if (other instanceof com.example.delivery.Van) {
        return mergeFrom((com.example.delivery.Van)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.delivery.Van other) {
      if (other == com.example.delivery.Van.getDefaultInstance()) return this;
      if (!other.getVanId().isEmpty()) {
        vanId_ = other.vanId_;
        onChanged();
      }
      if (other.getDrivers() != 0) {
        setDrivers(other.getDrivers());
      }
      if (other.getVolume() != 0) {
        setVolume(other.getVolume());
      }
      if (other.getDelivering() != false) {
        setDelivering(other.getDelivering());
      }
      if (other.getFulfilled() != false) {
        setFulfilled(other.getFulfilled());
      }
      if (!other.getItemId().isEmpty()) {
        itemId_ = other.itemId_;
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
      com.example.delivery.Van parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.delivery.Van) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object vanId_ = "";
    /**
     * <code>string vanId = 1;</code>
     * @return The vanId.
     */
    public java.lang.String getVanId() {
      java.lang.Object ref = vanId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vanId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string vanId = 1;</code>
     * @return The bytes for vanId.
     */
    public com.google.protobuf.ByteString
        getVanIdBytes() {
      java.lang.Object ref = vanId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vanId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vanId = 1;</code>
     * @param value The vanId to set.
     * @return This builder for chaining.
     */
    public Builder setVanId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vanId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vanId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVanId() {
      
      vanId_ = getDefaultInstance().getVanId();
      onChanged();
      return this;
    }
    /**
     * <code>string vanId = 1;</code>
     * @param value The bytes for vanId to set.
     * @return This builder for chaining.
     */
    public Builder setVanIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vanId_ = value;
      onChanged();
      return this;
    }

    private int drivers_ ;
    /**
     * <code>int32 drivers = 2;</code>
     * @return The drivers.
     */
    @java.lang.Override
    public int getDrivers() {
      return drivers_;
    }
    /**
     * <code>int32 drivers = 2;</code>
     * @param value The drivers to set.
     * @return This builder for chaining.
     */
    public Builder setDrivers(int value) {
      
      drivers_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 drivers = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDrivers() {
      
      drivers_ = 0;
      onChanged();
      return this;
    }

    private int volume_ ;
    /**
     * <code>int32 volume = 3;</code>
     * @return The volume.
     */
    @java.lang.Override
    public int getVolume() {
      return volume_;
    }
    /**
     * <code>int32 volume = 3;</code>
     * @param value The volume to set.
     * @return This builder for chaining.
     */
    public Builder setVolume(int value) {
      
      volume_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 volume = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearVolume() {
      
      volume_ = 0;
      onChanged();
      return this;
    }

    private boolean delivering_ ;
    /**
     * <code>bool delivering = 4;</code>
     * @return The delivering.
     */
    @java.lang.Override
    public boolean getDelivering() {
      return delivering_;
    }
    /**
     * <code>bool delivering = 4;</code>
     * @param value The delivering to set.
     * @return This builder for chaining.
     */
    public Builder setDelivering(boolean value) {
      
      delivering_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool delivering = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDelivering() {
      
      delivering_ = false;
      onChanged();
      return this;
    }

    private boolean fulfilled_ ;
    /**
     * <code>bool fulfilled = 5;</code>
     * @return The fulfilled.
     */
    @java.lang.Override
    public boolean getFulfilled() {
      return fulfilled_;
    }
    /**
     * <code>bool fulfilled = 5;</code>
     * @param value The fulfilled to set.
     * @return This builder for chaining.
     */
    public Builder setFulfilled(boolean value) {
      
      fulfilled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool fulfilled = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFulfilled() {
      
      fulfilled_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object itemId_ = "";
    /**
     * <code>string itemId = 6;</code>
     * @return The itemId.
     */
    public java.lang.String getItemId() {
      java.lang.Object ref = itemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        itemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string itemId = 6;</code>
     * @return The bytes for itemId.
     */
    public com.google.protobuf.ByteString
        getItemIdBytes() {
      java.lang.Object ref = itemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        itemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string itemId = 6;</code>
     * @param value The itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      itemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string itemId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearItemId() {
      
      itemId_ = getDefaultInstance().getItemId();
      onChanged();
      return this;
    }
    /**
     * <code>string itemId = 6;</code>
     * @param value The bytes for itemId to set.
     * @return This builder for chaining.
     */
    public Builder setItemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      itemId_ = value;
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


    // @@protoc_insertion_point(builder_scope:delivery.Van)
  }

  // @@protoc_insertion_point(class_scope:delivery.Van)
  private static final com.example.delivery.Van DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.delivery.Van();
  }

  public static com.example.delivery.Van getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Van>
      PARSER = new com.google.protobuf.AbstractParser<Van>() {
    @java.lang.Override
    public Van parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Van(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Van> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Van> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.delivery.Van getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
