// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: processors/factory.proto

package com.example.factory;

public final class Factory {
  private Factory() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_RawMaterial_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_RawMaterial_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetProductsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetProductsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_UpdateProductsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_UpdateProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_UpdateProductsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_UpdateProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_UpdateProductRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_UpdateProductRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_UpdateProductResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_UpdateProductResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_CreateItemRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_CreateItemRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_CreateItemResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_CreateItemResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetAllItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetAllItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetAllItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetAllItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetItemByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetItemByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_GetItemByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_GetItemByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_UpdateItemByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_UpdateItemByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_UpdateItemByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_UpdateItemByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_DeleteItemByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_DeleteItemByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_processors_DeleteItemByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_processors_DeleteItemByIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030processors/factory.proto\022\nprocessors\"w" +
      "\n\007Product\022\021\n\tproductId\030\001 \001(\t\022\023\n\013productN" +
      "ame\030\002 \001(\t\022\027\n\017productsInStock\030\003 \001(\005\022\025\n\rpr" +
      "oductVolume\030\004 \001(\005\022\024\n\014productPrice\030\005 \001(\001\"" +
      "\221\001\n\013RawMaterial\022\025\n\rrawMaterialId\030\001 \001(\t\022\027" +
      "\n\017rawMaterialName\030\002 \001(\t\022\033\n\023rawMaterialsI" +
      "nStock\030\003 \001(\005\022\032\n\022rawMaterialsVolume\030\004 \001(\005" +
      "\022\031\n\021rawMaterialsPrice\030\005 \001(\001\"\024\n\022GetProduc" +
      "tsRequest\";\n\023GetProductsResponse\022$\n\007prod" +
      "uct\030\001 \001(\0132\023.processors.Product\"=\n\025Update" +
      "ProductsRequest\022$\n\007product\030\001 \001(\0132\023.proce" +
      "ssors.Product\">\n\026UpdateProductsResponse\022" +
      "$\n\007product\030\001 \001(\0132\023.processors.Product\"9\n" +
      "\021GetProductRequest\022$\n\007product\030\001 \001(\0132\023.pr" +
      "ocessors.Product\":\n\022GetProductResponse\022$" +
      "\n\007product\030\001 \001(\0132\023.processors.Product\"<\n\024" +
      "UpdateProductRequest\022$\n\007product\030\001 \001(\0132\023." +
      "processors.Product\"=\n\025UpdateProductRespo" +
      "nse\022$\n\007product\030\001 \001(\0132\023.processors.Produc" +
      "t\"A\n\021CreateItemRequest\022,\n\013rawMaterial\030\001 " +
      "\001(\0132\027.processors.RawMaterial\"$\n\022CreateIt" +
      "emResponse\022\016\n\006result\030\001 \001(\t\"\024\n\022GetAllItem" +
      "sRequest\"C\n\023GetAllItemsResponse\022,\n\013rawMa" +
      "terial\030\001 \001(\0132\027.processors.RawMaterial\"+\n" +
      "\022GetItemByIdRequest\022\025\n\rrawMaterialId\030\001 \001" +
      "(\t\"C\n\023GetItemByIdResponse\022,\n\013rawMaterial" +
      "\030\001 \001(\0132\027.processors.RawMaterial\"E\n\025Updat" +
      "eItemByIdRequest\022,\n\013rawMaterial\030\001 \001(\0132\027." +
      "processors.RawMaterial\"F\n\026UpdateItemById" +
      "Response\022,\n\013rawMaterial\030\001 \001(\0132\027.processo" +
      "rs.RawMaterial\".\n\025DeleteItemByIdRequest\022" +
      "\025\n\rrawMaterialId\030\001 \001(\t\"(\n\026DeleteItemById" +
      "Response\022\016\n\006result\030\001 \001(\t2\272\006\n\016FactoryServ" +
      "ice\022]\n\016UpdateProducts\022!.processors.Updat" +
      "eProductsRequest\032\".processors.UpdateProd" +
      "uctsResponse\"\000(\0010\001\022R\n\013GetProducts\022\036.proc" +
      "essors.GetProductsRequest\032\037.processors.G" +
      "etProductsResponse\"\0000\001\022M\n\nGetProduct\022\035.p" +
      "rocessors.GetProductRequest\032\036.processors" +
      ".GetProductResponse\"\000\022V\n\rUpdateProduct\022 " +
      ".processors.UpdateProductRequest\032!.proce" +
      "ssors.UpdateProductResponse\"\000\022V\n\021CreateR" +
      "awMaterial\022\035.processors.CreateItemReques" +
      "t\032\036.processors.CreateItemResponse\"\000(\001\022Y\n" +
      "\022GetAllRawMaterials\022\036.processors.GetAllI" +
      "temsRequest\032\037.processors.GetAllItemsResp" +
      "onse\"\0000\001\022W\n\022GetRawMaterialById\022\036.process" +
      "ors.GetItemByIdRequest\032\037.processors.GetI" +
      "temByIdResponse\"\000\022`\n\025UpdateRawMaterialBy" +
      "Id\022!.processors.UpdateItemByIdRequest\032\"." +
      "processors.UpdateItemByIdResponse\"\000\022`\n\025D" +
      "eleteRawMaterialById\022!.processors.Delete" +
      "ItemByIdRequest\032\".processors.DeleteItemB" +
      "yIdResponse\"\000B\027\n\023com.example.factoryP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_processors_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_processors_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_Product_descriptor,
        new java.lang.String[] { "ProductId", "ProductName", "ProductsInStock", "ProductVolume", "ProductPrice", });
    internal_static_processors_RawMaterial_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_processors_RawMaterial_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_RawMaterial_descriptor,
        new java.lang.String[] { "RawMaterialId", "RawMaterialName", "RawMaterialsInStock", "RawMaterialsVolume", "RawMaterialsPrice", });
    internal_static_processors_GetProductsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_processors_GetProductsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetProductsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_processors_GetProductsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_processors_GetProductsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetProductsResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_processors_UpdateProductsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_processors_UpdateProductsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_UpdateProductsRequest_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_processors_UpdateProductsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_processors_UpdateProductsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_UpdateProductsResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_processors_GetProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_processors_GetProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetProductRequest_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_processors_GetProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_processors_GetProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetProductResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_processors_UpdateProductRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_processors_UpdateProductRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_UpdateProductRequest_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_processors_UpdateProductResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_processors_UpdateProductResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_UpdateProductResponse_descriptor,
        new java.lang.String[] { "Product", });
    internal_static_processors_CreateItemRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_processors_CreateItemRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_CreateItemRequest_descriptor,
        new java.lang.String[] { "RawMaterial", });
    internal_static_processors_CreateItemResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_processors_CreateItemResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_CreateItemResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_processors_GetAllItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_processors_GetAllItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetAllItemsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_processors_GetAllItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_processors_GetAllItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetAllItemsResponse_descriptor,
        new java.lang.String[] { "RawMaterial", });
    internal_static_processors_GetItemByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_processors_GetItemByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetItemByIdRequest_descriptor,
        new java.lang.String[] { "RawMaterialId", });
    internal_static_processors_GetItemByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_processors_GetItemByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_GetItemByIdResponse_descriptor,
        new java.lang.String[] { "RawMaterial", });
    internal_static_processors_UpdateItemByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_processors_UpdateItemByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_UpdateItemByIdRequest_descriptor,
        new java.lang.String[] { "RawMaterial", });
    internal_static_processors_UpdateItemByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_processors_UpdateItemByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_UpdateItemByIdResponse_descriptor,
        new java.lang.String[] { "RawMaterial", });
    internal_static_processors_DeleteItemByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_processors_DeleteItemByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_DeleteItemByIdRequest_descriptor,
        new java.lang.String[] { "RawMaterialId", });
    internal_static_processors_DeleteItemByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_processors_DeleteItemByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_processors_DeleteItemByIdResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}