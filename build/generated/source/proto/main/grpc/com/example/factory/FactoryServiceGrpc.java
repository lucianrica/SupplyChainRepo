package com.example.factory;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SERVICE DEFINITION
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: processors/factory.proto")
public final class FactoryServiceGrpc {

  private FactoryServiceGrpc() {}

  public static final String SERVICE_NAME = "processors.FactoryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.factory.UpdateProductsRequest,
      com.example.factory.UpdateProductsResponse> getUpdateProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProducts",
      requestType = com.example.factory.UpdateProductsRequest.class,
      responseType = com.example.factory.UpdateProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.factory.UpdateProductsRequest,
      com.example.factory.UpdateProductsResponse> getUpdateProductsMethod() {
    io.grpc.MethodDescriptor<com.example.factory.UpdateProductsRequest, com.example.factory.UpdateProductsResponse> getUpdateProductsMethod;
    if ((getUpdateProductsMethod = FactoryServiceGrpc.getUpdateProductsMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getUpdateProductsMethod = FactoryServiceGrpc.getUpdateProductsMethod) == null) {
          FactoryServiceGrpc.getUpdateProductsMethod = getUpdateProductsMethod =
              io.grpc.MethodDescriptor.<com.example.factory.UpdateProductsRequest, com.example.factory.UpdateProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.UpdateProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.UpdateProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("UpdateProducts"))
              .build();
        }
      }
    }
    return getUpdateProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.GetProductsRequest,
      com.example.factory.GetProductsResponse> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducts",
      requestType = com.example.factory.GetProductsRequest.class,
      responseType = com.example.factory.GetProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.factory.GetProductsRequest,
      com.example.factory.GetProductsResponse> getGetProductsMethod() {
    io.grpc.MethodDescriptor<com.example.factory.GetProductsRequest, com.example.factory.GetProductsResponse> getGetProductsMethod;
    if ((getGetProductsMethod = FactoryServiceGrpc.getGetProductsMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getGetProductsMethod = FactoryServiceGrpc.getGetProductsMethod) == null) {
          FactoryServiceGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<com.example.factory.GetProductsRequest, com.example.factory.GetProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("GetProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.GetProductRequest,
      com.example.factory.GetProductResponse> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = com.example.factory.GetProductRequest.class,
      responseType = com.example.factory.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.factory.GetProductRequest,
      com.example.factory.GetProductResponse> getGetProductMethod() {
    io.grpc.MethodDescriptor<com.example.factory.GetProductRequest, com.example.factory.GetProductResponse> getGetProductMethod;
    if ((getGetProductMethod = FactoryServiceGrpc.getGetProductMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getGetProductMethod = FactoryServiceGrpc.getGetProductMethod) == null) {
          FactoryServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<com.example.factory.GetProductRequest, com.example.factory.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("GetProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.UpdateProductRequest,
      com.example.factory.UpdateProductResponse> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.example.factory.UpdateProductRequest.class,
      responseType = com.example.factory.UpdateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.factory.UpdateProductRequest,
      com.example.factory.UpdateProductResponse> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.example.factory.UpdateProductRequest, com.example.factory.UpdateProductResponse> getUpdateProductMethod;
    if ((getUpdateProductMethod = FactoryServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getUpdateProductMethod = FactoryServiceGrpc.getUpdateProductMethod) == null) {
          FactoryServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<com.example.factory.UpdateProductRequest, com.example.factory.UpdateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.UpdateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.CreateItemRequest,
      com.example.factory.CreateItemResponse> getCreateRawMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRawMaterial",
      requestType = com.example.factory.CreateItemRequest.class,
      responseType = com.example.factory.CreateItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.factory.CreateItemRequest,
      com.example.factory.CreateItemResponse> getCreateRawMaterialMethod() {
    io.grpc.MethodDescriptor<com.example.factory.CreateItemRequest, com.example.factory.CreateItemResponse> getCreateRawMaterialMethod;
    if ((getCreateRawMaterialMethod = FactoryServiceGrpc.getCreateRawMaterialMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getCreateRawMaterialMethod = FactoryServiceGrpc.getCreateRawMaterialMethod) == null) {
          FactoryServiceGrpc.getCreateRawMaterialMethod = getCreateRawMaterialMethod =
              io.grpc.MethodDescriptor.<com.example.factory.CreateItemRequest, com.example.factory.CreateItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRawMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.CreateItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.CreateItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("CreateRawMaterial"))
              .build();
        }
      }
    }
    return getCreateRawMaterialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.GetAllItemsRequest,
      com.example.factory.GetAllItemsResponse> getGetAllRawMaterialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRawMaterials",
      requestType = com.example.factory.GetAllItemsRequest.class,
      responseType = com.example.factory.GetAllItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.factory.GetAllItemsRequest,
      com.example.factory.GetAllItemsResponse> getGetAllRawMaterialsMethod() {
    io.grpc.MethodDescriptor<com.example.factory.GetAllItemsRequest, com.example.factory.GetAllItemsResponse> getGetAllRawMaterialsMethod;
    if ((getGetAllRawMaterialsMethod = FactoryServiceGrpc.getGetAllRawMaterialsMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getGetAllRawMaterialsMethod = FactoryServiceGrpc.getGetAllRawMaterialsMethod) == null) {
          FactoryServiceGrpc.getGetAllRawMaterialsMethod = getGetAllRawMaterialsMethod =
              io.grpc.MethodDescriptor.<com.example.factory.GetAllItemsRequest, com.example.factory.GetAllItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllRawMaterials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetAllItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetAllItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("GetAllRawMaterials"))
              .build();
        }
      }
    }
    return getGetAllRawMaterialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.GetItemByIdRequest,
      com.example.factory.GetItemByIdResponse> getGetRawMaterialByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRawMaterialById",
      requestType = com.example.factory.GetItemByIdRequest.class,
      responseType = com.example.factory.GetItemByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.factory.GetItemByIdRequest,
      com.example.factory.GetItemByIdResponse> getGetRawMaterialByIdMethod() {
    io.grpc.MethodDescriptor<com.example.factory.GetItemByIdRequest, com.example.factory.GetItemByIdResponse> getGetRawMaterialByIdMethod;
    if ((getGetRawMaterialByIdMethod = FactoryServiceGrpc.getGetRawMaterialByIdMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getGetRawMaterialByIdMethod = FactoryServiceGrpc.getGetRawMaterialByIdMethod) == null) {
          FactoryServiceGrpc.getGetRawMaterialByIdMethod = getGetRawMaterialByIdMethod =
              io.grpc.MethodDescriptor.<com.example.factory.GetItemByIdRequest, com.example.factory.GetItemByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRawMaterialById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetItemByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.GetItemByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("GetRawMaterialById"))
              .build();
        }
      }
    }
    return getGetRawMaterialByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.UpdateItemByIdRequest,
      com.example.factory.UpdateItemByIdResponse> getUpdateRawMaterialByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRawMaterialById",
      requestType = com.example.factory.UpdateItemByIdRequest.class,
      responseType = com.example.factory.UpdateItemByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.factory.UpdateItemByIdRequest,
      com.example.factory.UpdateItemByIdResponse> getUpdateRawMaterialByIdMethod() {
    io.grpc.MethodDescriptor<com.example.factory.UpdateItemByIdRequest, com.example.factory.UpdateItemByIdResponse> getUpdateRawMaterialByIdMethod;
    if ((getUpdateRawMaterialByIdMethod = FactoryServiceGrpc.getUpdateRawMaterialByIdMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getUpdateRawMaterialByIdMethod = FactoryServiceGrpc.getUpdateRawMaterialByIdMethod) == null) {
          FactoryServiceGrpc.getUpdateRawMaterialByIdMethod = getUpdateRawMaterialByIdMethod =
              io.grpc.MethodDescriptor.<com.example.factory.UpdateItemByIdRequest, com.example.factory.UpdateItemByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRawMaterialById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.UpdateItemByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.UpdateItemByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("UpdateRawMaterialById"))
              .build();
        }
      }
    }
    return getUpdateRawMaterialByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.factory.DeleteItemByIdRequest,
      com.example.factory.DeleteItemByIdResponse> getDeleteRawMaterialByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRawMaterialById",
      requestType = com.example.factory.DeleteItemByIdRequest.class,
      responseType = com.example.factory.DeleteItemByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.factory.DeleteItemByIdRequest,
      com.example.factory.DeleteItemByIdResponse> getDeleteRawMaterialByIdMethod() {
    io.grpc.MethodDescriptor<com.example.factory.DeleteItemByIdRequest, com.example.factory.DeleteItemByIdResponse> getDeleteRawMaterialByIdMethod;
    if ((getDeleteRawMaterialByIdMethod = FactoryServiceGrpc.getDeleteRawMaterialByIdMethod) == null) {
      synchronized (FactoryServiceGrpc.class) {
        if ((getDeleteRawMaterialByIdMethod = FactoryServiceGrpc.getDeleteRawMaterialByIdMethod) == null) {
          FactoryServiceGrpc.getDeleteRawMaterialByIdMethod = getDeleteRawMaterialByIdMethod =
              io.grpc.MethodDescriptor.<com.example.factory.DeleteItemByIdRequest, com.example.factory.DeleteItemByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRawMaterialById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.DeleteItemByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.factory.DeleteItemByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FactoryServiceMethodDescriptorSupplier("DeleteRawMaterialById"))
              .build();
        }
      }
    }
    return getDeleteRawMaterialByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FactoryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactoryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactoryServiceStub>() {
        @java.lang.Override
        public FactoryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactoryServiceStub(channel, callOptions);
        }
      };
    return FactoryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FactoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactoryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactoryServiceBlockingStub>() {
        @java.lang.Override
        public FactoryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactoryServiceBlockingStub(channel, callOptions);
        }
      };
    return FactoryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FactoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FactoryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FactoryServiceFutureStub>() {
        @java.lang.Override
        public FactoryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FactoryServiceFutureStub(channel, callOptions);
        }
      };
    return FactoryServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static abstract class FactoryServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * UPDATE PRODUCTS, BI-DI streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.factory.UpdateProductsRequest> updateProducts(
        io.grpc.stub.StreamObserver<com.example.factory.UpdateProductsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET PRODUCTS, Server streaming
     * </pre>
     */
    public void getProducts(com.example.factory.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public void getProduct(com.example.factory.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public void updateProduct(com.example.factory.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client streaming communication
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.factory.CreateItemRequest> createRawMaterial(
        io.grpc.stub.StreamObserver<com.example.factory.CreateItemResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateRawMaterialMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public void getAllRawMaterials(com.example.factory.GetAllItemsRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetAllItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRawMaterialsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void getRawMaterialById(com.example.factory.GetItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetItemByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRawMaterialByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void updateRawMaterialById(com.example.factory.UpdateItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.UpdateItemByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRawMaterialByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void deleteRawMaterialById(com.example.factory.DeleteItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.DeleteItemByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRawMaterialByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUpdateProductsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.factory.UpdateProductsRequest,
                com.example.factory.UpdateProductsResponse>(
                  this, METHODID_UPDATE_PRODUCTS)))
          .addMethod(
            getGetProductsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.factory.GetProductsRequest,
                com.example.factory.GetProductsResponse>(
                  this, METHODID_GET_PRODUCTS)))
          .addMethod(
            getGetProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.factory.GetProductRequest,
                com.example.factory.GetProductResponse>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.factory.UpdateProductRequest,
                com.example.factory.UpdateProductResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .addMethod(
            getCreateRawMaterialMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.example.factory.CreateItemRequest,
                com.example.factory.CreateItemResponse>(
                  this, METHODID_CREATE_RAW_MATERIAL)))
          .addMethod(
            getGetAllRawMaterialsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.factory.GetAllItemsRequest,
                com.example.factory.GetAllItemsResponse>(
                  this, METHODID_GET_ALL_RAW_MATERIALS)))
          .addMethod(
            getGetRawMaterialByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.factory.GetItemByIdRequest,
                com.example.factory.GetItemByIdResponse>(
                  this, METHODID_GET_RAW_MATERIAL_BY_ID)))
          .addMethod(
            getUpdateRawMaterialByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.factory.UpdateItemByIdRequest,
                com.example.factory.UpdateItemByIdResponse>(
                  this, METHODID_UPDATE_RAW_MATERIAL_BY_ID)))
          .addMethod(
            getDeleteRawMaterialByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.factory.DeleteItemByIdRequest,
                com.example.factory.DeleteItemByIdResponse>(
                  this, METHODID_DELETE_RAW_MATERIAL_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class FactoryServiceStub extends io.grpc.stub.AbstractAsyncStub<FactoryServiceStub> {
    private FactoryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactoryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactoryServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * UPDATE PRODUCTS, BI-DI streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.factory.UpdateProductsRequest> updateProducts(
        io.grpc.stub.StreamObserver<com.example.factory.UpdateProductsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getUpdateProductsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * GET PRODUCTS, Server streaming
     * </pre>
     */
    public void getProducts(com.example.factory.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public void getProduct(com.example.factory.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public void updateProduct(com.example.factory.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client streaming communication
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.factory.CreateItemRequest> createRawMaterial(
        io.grpc.stub.StreamObserver<com.example.factory.CreateItemResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateRawMaterialMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public void getAllRawMaterials(com.example.factory.GetAllItemsRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetAllItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllRawMaterialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void getRawMaterialById(com.example.factory.GetItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.GetItemByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRawMaterialByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void updateRawMaterialById(com.example.factory.UpdateItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.UpdateItemByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRawMaterialByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void deleteRawMaterialById(com.example.factory.DeleteItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.factory.DeleteItemByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRawMaterialByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class FactoryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<FactoryServiceBlockingStub> {
    private FactoryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactoryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactoryServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET PRODUCTS, Server streaming
     * </pre>
     */
    public java.util.Iterator<com.example.factory.GetProductsResponse> getProducts(
        com.example.factory.GetProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public com.example.factory.GetProductResponse getProduct(com.example.factory.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public com.example.factory.UpdateProductResponse updateProduct(com.example.factory.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public java.util.Iterator<com.example.factory.GetAllItemsResponse> getAllRawMaterials(
        com.example.factory.GetAllItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllRawMaterialsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.example.factory.GetItemByIdResponse getRawMaterialById(com.example.factory.GetItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRawMaterialByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.example.factory.UpdateItemByIdResponse updateRawMaterialById(com.example.factory.UpdateItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRawMaterialByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.example.factory.DeleteItemByIdResponse deleteRawMaterialById(com.example.factory.DeleteItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRawMaterialByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class FactoryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<FactoryServiceFutureStub> {
    private FactoryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FactoryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FactoryServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.factory.GetProductResponse> getProduct(
        com.example.factory.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.factory.UpdateProductResponse> updateProduct(
        com.example.factory.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.factory.GetItemByIdResponse> getRawMaterialById(
        com.example.factory.GetItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRawMaterialByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.factory.UpdateItemByIdResponse> updateRawMaterialById(
        com.example.factory.UpdateItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRawMaterialByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.factory.DeleteItemByIdResponse> deleteRawMaterialById(
        com.example.factory.DeleteItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRawMaterialByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;
  private static final int METHODID_GET_ALL_RAW_MATERIALS = 3;
  private static final int METHODID_GET_RAW_MATERIAL_BY_ID = 4;
  private static final int METHODID_UPDATE_RAW_MATERIAL_BY_ID = 5;
  private static final int METHODID_DELETE_RAW_MATERIAL_BY_ID = 6;
  private static final int METHODID_UPDATE_PRODUCTS = 7;
  private static final int METHODID_CREATE_RAW_MATERIAL = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FactoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FactoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((com.example.factory.GetProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.factory.GetProductsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((com.example.factory.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.factory.GetProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.example.factory.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.factory.UpdateProductResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_RAW_MATERIALS:
          serviceImpl.getAllRawMaterials((com.example.factory.GetAllItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.factory.GetAllItemsResponse>) responseObserver);
          break;
        case METHODID_GET_RAW_MATERIAL_BY_ID:
          serviceImpl.getRawMaterialById((com.example.factory.GetItemByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.factory.GetItemByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RAW_MATERIAL_BY_ID:
          serviceImpl.updateRawMaterialById((com.example.factory.UpdateItemByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.factory.UpdateItemByIdResponse>) responseObserver);
          break;
        case METHODID_DELETE_RAW_MATERIAL_BY_ID:
          serviceImpl.deleteRawMaterialById((com.example.factory.DeleteItemByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.factory.DeleteItemByIdResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPDATE_PRODUCTS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateProducts(
              (io.grpc.stub.StreamObserver<com.example.factory.UpdateProductsResponse>) responseObserver);
        case METHODID_CREATE_RAW_MATERIAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createRawMaterial(
              (io.grpc.stub.StreamObserver<com.example.factory.CreateItemResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FactoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FactoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.factory.Factory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FactoryService");
    }
  }

  private static final class FactoryServiceFileDescriptorSupplier
      extends FactoryServiceBaseDescriptorSupplier {
    FactoryServiceFileDescriptorSupplier() {}
  }

  private static final class FactoryServiceMethodDescriptorSupplier
      extends FactoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FactoryServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FactoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FactoryServiceFileDescriptorSupplier())
              .addMethod(getUpdateProductsMethod())
              .addMethod(getGetProductsMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getUpdateProductMethod())
              .addMethod(getCreateRawMaterialMethod())
              .addMethod(getGetAllRawMaterialsMethod())
              .addMethod(getGetRawMaterialByIdMethod())
              .addMethod(getUpdateRawMaterialByIdMethod())
              .addMethod(getDeleteRawMaterialByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
