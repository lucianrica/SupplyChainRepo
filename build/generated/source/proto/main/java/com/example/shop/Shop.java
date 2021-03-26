// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: retailers/shop.proto

package com.example.shop;

public final class Shop {
  private Shop() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_GetProductsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_GetProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_GetProductsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_GetProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_UpdateProductsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_UpdateProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_UpdateProductsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_UpdateProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_GetProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_GetProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_GetProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_GetProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_UpdateProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_UpdateProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_retailers_UpdateProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_retailers_UpdateProductResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024retailers/shop.proto\022\tretailers\"`\n\007Pro" +
      "duct\022\021\n\tproductId\030\001 \001(\t\022\023\n\013productName\030\002" +
      " \001(\t\022\027\n\017productsInStock\030\003 \001(\005\022\024\n\014product" +
      "Price\030\004 \001(\001\"\024\n\022GetProductsRequest\":\n\023Get" +
      "ProductsResponse\022#\n\007product\030\001 \001(\0132\022.reta" +
      "ilers.Product\"<\n\025UpdateProductsRequest\022#" +
      "\n\007product\030\001 \001(\0132\022.retailers.Product\"=\n\026U" +
      "pdateProductsResponse\022#\n\007product\030\001 \001(\0132\022" +
      ".retailers.Product\"8\n\021GetProductRequest\022" +
      "#\n\007product\030\001 \001(\0132\022.retailers.Product\"9\n\022" +
      "GetProductResponse\022#\n\007product\030\001 \001(\0132\022.re" +
      "tailers.Product\";\n\024UpdateProductRequest\022" +
      "#\n\007product\030\001 \001(\0132\022.retailers.Product\"<\n\025" +
      "UpdateProductResponse\022#\n\007product\030\001 \001(\0132\022" +
      ".retailers.Product2\337\002\n\013ShopService\022P\n\013Ge" +
      "tProducts\022\035.retailers.GetProductsRequest" +
      "\032\036.retailers.GetProductsResponse\"\0000\001\022[\n\016" +
      "UpdateProducts\022 .retailers.UpdateProduct" +
      "sRequest\032!.retailers.UpdateProductsRespo" +
      "nse\"\000(\0010\001\022K\n\nGetProduct\022\034.retailers.GetP" +
      "roductRequest\032\035.retailers.GetProductResp" +
      "onse\"\000\022T\n\rUpdateProduct\022\037.retailers.Upda" +
      "teProductRequest\032 .retailers.UpdateProdu" +
      "ctResponse\"\000B\024\n\020com.example.shopP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_retailers_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_retailers_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_Product_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", "ProductsInStock", "ProductPrice", });
    internal_static_retailers_GetProductsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_retailers_GetProductsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_GetProductsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_retailers_GetProductsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_retailers_GetProductsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_GetProductsResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_retailers_UpdateProductsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_retailers_UpdateProductsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_UpdateProductsRequest_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_retailers_UpdateProductsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_retailers_UpdateProductsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_UpdateProductsResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_retailers_GetProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_retailers_GetProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_GetProductRequest_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_retailers_GetProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_retailers_GetProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_GetProductResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_retailers_UpdateProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_retailers_UpdateProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_UpdateProductRequest_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_retailers_UpdateProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_retailers_UpdateProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_retailers_UpdateProductResponse_descriptor,
        new java.lang.String[] { "Product", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}