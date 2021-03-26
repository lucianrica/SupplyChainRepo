package com.example.rawMaterial;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SERVICE DEFINITION
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: source/rawMaterial.proto")
public final class RawMaterialServiceGrpc {

  private RawMaterialServiceGrpc() {}

  public static final String SERVICE_NAME = "source.RawMaterialService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.rawMaterial.CreateItemRequest,
      com.example.rawMaterial.CreateItemResponse> getCreateRawMaterialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRawMaterial",
      requestType = com.example.rawMaterial.CreateItemRequest.class,
      responseType = com.example.rawMaterial.CreateItemResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.rawMaterial.CreateItemRequest,
      com.example.rawMaterial.CreateItemResponse> getCreateRawMaterialMethod() {
    io.grpc.MethodDescriptor<com.example.rawMaterial.CreateItemRequest, com.example.rawMaterial.CreateItemResponse> getCreateRawMaterialMethod;
    if ((getCreateRawMaterialMethod = RawMaterialServiceGrpc.getCreateRawMaterialMethod) == null) {
      synchronized (RawMaterialServiceGrpc.class) {
        if ((getCreateRawMaterialMethod = RawMaterialServiceGrpc.getCreateRawMaterialMethod) == null) {
          RawMaterialServiceGrpc.getCreateRawMaterialMethod = getCreateRawMaterialMethod =
              io.grpc.MethodDescriptor.<com.example.rawMaterial.CreateItemRequest, com.example.rawMaterial.CreateItemResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRawMaterial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.CreateItemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.CreateItemResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawMaterialServiceMethodDescriptorSupplier("CreateRawMaterial"))
              .build();
        }
      }
    }
    return getCreateRawMaterialMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rawMaterial.GetAllItemsRequest,
      com.example.rawMaterial.GetAllItemsResponse> getGetAllRawMaterialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRawMaterials",
      requestType = com.example.rawMaterial.GetAllItemsRequest.class,
      responseType = com.example.rawMaterial.GetAllItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.rawMaterial.GetAllItemsRequest,
      com.example.rawMaterial.GetAllItemsResponse> getGetAllRawMaterialsMethod() {
    io.grpc.MethodDescriptor<com.example.rawMaterial.GetAllItemsRequest, com.example.rawMaterial.GetAllItemsResponse> getGetAllRawMaterialsMethod;
    if ((getGetAllRawMaterialsMethod = RawMaterialServiceGrpc.getGetAllRawMaterialsMethod) == null) {
      synchronized (RawMaterialServiceGrpc.class) {
        if ((getGetAllRawMaterialsMethod = RawMaterialServiceGrpc.getGetAllRawMaterialsMethod) == null) {
          RawMaterialServiceGrpc.getGetAllRawMaterialsMethod = getGetAllRawMaterialsMethod =
              io.grpc.MethodDescriptor.<com.example.rawMaterial.GetAllItemsRequest, com.example.rawMaterial.GetAllItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllRawMaterials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.GetAllItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.GetAllItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawMaterialServiceMethodDescriptorSupplier("GetAllRawMaterials"))
              .build();
        }
      }
    }
    return getGetAllRawMaterialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rawMaterial.GetItemByIdRequest,
      com.example.rawMaterial.GetItemByIdResponse> getGetRawMaterialByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRawMaterialById",
      requestType = com.example.rawMaterial.GetItemByIdRequest.class,
      responseType = com.example.rawMaterial.GetItemByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rawMaterial.GetItemByIdRequest,
      com.example.rawMaterial.GetItemByIdResponse> getGetRawMaterialByIdMethod() {
    io.grpc.MethodDescriptor<com.example.rawMaterial.GetItemByIdRequest, com.example.rawMaterial.GetItemByIdResponse> getGetRawMaterialByIdMethod;
    if ((getGetRawMaterialByIdMethod = RawMaterialServiceGrpc.getGetRawMaterialByIdMethod) == null) {
      synchronized (RawMaterialServiceGrpc.class) {
        if ((getGetRawMaterialByIdMethod = RawMaterialServiceGrpc.getGetRawMaterialByIdMethod) == null) {
          RawMaterialServiceGrpc.getGetRawMaterialByIdMethod = getGetRawMaterialByIdMethod =
              io.grpc.MethodDescriptor.<com.example.rawMaterial.GetItemByIdRequest, com.example.rawMaterial.GetItemByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRawMaterialById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.GetItemByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.GetItemByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawMaterialServiceMethodDescriptorSupplier("GetRawMaterialById"))
              .build();
        }
      }
    }
    return getGetRawMaterialByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rawMaterial.UpdateItemByIdRequest,
      com.example.rawMaterial.UpdateItemByIdResponse> getUpdateRawMaterialByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRawMaterialById",
      requestType = com.example.rawMaterial.UpdateItemByIdRequest.class,
      responseType = com.example.rawMaterial.UpdateItemByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rawMaterial.UpdateItemByIdRequest,
      com.example.rawMaterial.UpdateItemByIdResponse> getUpdateRawMaterialByIdMethod() {
    io.grpc.MethodDescriptor<com.example.rawMaterial.UpdateItemByIdRequest, com.example.rawMaterial.UpdateItemByIdResponse> getUpdateRawMaterialByIdMethod;
    if ((getUpdateRawMaterialByIdMethod = RawMaterialServiceGrpc.getUpdateRawMaterialByIdMethod) == null) {
      synchronized (RawMaterialServiceGrpc.class) {
        if ((getUpdateRawMaterialByIdMethod = RawMaterialServiceGrpc.getUpdateRawMaterialByIdMethod) == null) {
          RawMaterialServiceGrpc.getUpdateRawMaterialByIdMethod = getUpdateRawMaterialByIdMethod =
              io.grpc.MethodDescriptor.<com.example.rawMaterial.UpdateItemByIdRequest, com.example.rawMaterial.UpdateItemByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRawMaterialById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.UpdateItemByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.UpdateItemByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawMaterialServiceMethodDescriptorSupplier("UpdateRawMaterialById"))
              .build();
        }
      }
    }
    return getUpdateRawMaterialByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.rawMaterial.DeleteItemByIdRequest,
      com.example.rawMaterial.DeleteItemByIdResponse> getDeleteRawMaterialByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRawMaterialById",
      requestType = com.example.rawMaterial.DeleteItemByIdRequest.class,
      responseType = com.example.rawMaterial.DeleteItemByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.rawMaterial.DeleteItemByIdRequest,
      com.example.rawMaterial.DeleteItemByIdResponse> getDeleteRawMaterialByIdMethod() {
    io.grpc.MethodDescriptor<com.example.rawMaterial.DeleteItemByIdRequest, com.example.rawMaterial.DeleteItemByIdResponse> getDeleteRawMaterialByIdMethod;
    if ((getDeleteRawMaterialByIdMethod = RawMaterialServiceGrpc.getDeleteRawMaterialByIdMethod) == null) {
      synchronized (RawMaterialServiceGrpc.class) {
        if ((getDeleteRawMaterialByIdMethod = RawMaterialServiceGrpc.getDeleteRawMaterialByIdMethod) == null) {
          RawMaterialServiceGrpc.getDeleteRawMaterialByIdMethod = getDeleteRawMaterialByIdMethod =
              io.grpc.MethodDescriptor.<com.example.rawMaterial.DeleteItemByIdRequest, com.example.rawMaterial.DeleteItemByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRawMaterialById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.DeleteItemByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.rawMaterial.DeleteItemByIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RawMaterialServiceMethodDescriptorSupplier("DeleteRawMaterialById"))
              .build();
        }
      }
    }
    return getDeleteRawMaterialByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RawMaterialServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawMaterialServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawMaterialServiceStub>() {
        @java.lang.Override
        public RawMaterialServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawMaterialServiceStub(channel, callOptions);
        }
      };
    return RawMaterialServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RawMaterialServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawMaterialServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawMaterialServiceBlockingStub>() {
        @java.lang.Override
        public RawMaterialServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawMaterialServiceBlockingStub(channel, callOptions);
        }
      };
    return RawMaterialServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RawMaterialServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawMaterialServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawMaterialServiceFutureStub>() {
        @java.lang.Override
        public RawMaterialServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawMaterialServiceFutureStub(channel, callOptions);
        }
      };
    return RawMaterialServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static abstract class RawMaterialServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client streaming communication
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.rawMaterial.CreateItemRequest> createRawMaterial(
        io.grpc.stub.StreamObserver<com.example.rawMaterial.CreateItemResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getCreateRawMaterialMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public void getAllRawMaterials(com.example.rawMaterial.GetAllItemsRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.GetAllItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRawMaterialsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void getRawMaterialById(com.example.rawMaterial.GetItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.GetItemByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRawMaterialByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void updateRawMaterialById(com.example.rawMaterial.UpdateItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.UpdateItemByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRawMaterialByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void deleteRawMaterialById(com.example.rawMaterial.DeleteItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.DeleteItemByIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRawMaterialByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRawMaterialMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.example.rawMaterial.CreateItemRequest,
                com.example.rawMaterial.CreateItemResponse>(
                  this, METHODID_CREATE_RAW_MATERIAL)))
          .addMethod(
            getGetAllRawMaterialsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.rawMaterial.GetAllItemsRequest,
                com.example.rawMaterial.GetAllItemsResponse>(
                  this, METHODID_GET_ALL_RAW_MATERIALS)))
          .addMethod(
            getGetRawMaterialByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rawMaterial.GetItemByIdRequest,
                com.example.rawMaterial.GetItemByIdResponse>(
                  this, METHODID_GET_RAW_MATERIAL_BY_ID)))
          .addMethod(
            getUpdateRawMaterialByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rawMaterial.UpdateItemByIdRequest,
                com.example.rawMaterial.UpdateItemByIdResponse>(
                  this, METHODID_UPDATE_RAW_MATERIAL_BY_ID)))
          .addMethod(
            getDeleteRawMaterialByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.rawMaterial.DeleteItemByIdRequest,
                com.example.rawMaterial.DeleteItemByIdResponse>(
                  this, METHODID_DELETE_RAW_MATERIAL_BY_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class RawMaterialServiceStub extends io.grpc.stub.AbstractAsyncStub<RawMaterialServiceStub> {
    private RawMaterialServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawMaterialServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawMaterialServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client streaming communication
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.rawMaterial.CreateItemRequest> createRawMaterial(
        io.grpc.stub.StreamObserver<com.example.rawMaterial.CreateItemResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getCreateRawMaterialMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public void getAllRawMaterials(com.example.rawMaterial.GetAllItemsRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.GetAllItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllRawMaterialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void getRawMaterialById(com.example.rawMaterial.GetItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.GetItemByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRawMaterialByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void updateRawMaterialById(com.example.rawMaterial.UpdateItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.UpdateItemByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRawMaterialByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public void deleteRawMaterialById(com.example.rawMaterial.DeleteItemByIdRequest request,
        io.grpc.stub.StreamObserver<com.example.rawMaterial.DeleteItemByIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRawMaterialByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class RawMaterialServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RawMaterialServiceBlockingStub> {
    private RawMaterialServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawMaterialServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawMaterialServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server streaming
     * </pre>
     */
    public java.util.Iterator<com.example.rawMaterial.GetAllItemsResponse> getAllRawMaterials(
        com.example.rawMaterial.GetAllItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllRawMaterialsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.example.rawMaterial.GetItemByIdResponse getRawMaterialById(com.example.rawMaterial.GetItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRawMaterialByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.example.rawMaterial.UpdateItemByIdResponse updateRawMaterialById(com.example.rawMaterial.UpdateItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRawMaterialByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.example.rawMaterial.DeleteItemByIdResponse deleteRawMaterialById(com.example.rawMaterial.DeleteItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRawMaterialByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class RawMaterialServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RawMaterialServiceFutureStub> {
    private RawMaterialServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawMaterialServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawMaterialServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rawMaterial.GetItemByIdResponse> getRawMaterialById(
        com.example.rawMaterial.GetItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRawMaterialByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rawMaterial.UpdateItemByIdResponse> updateRawMaterialById(
        com.example.rawMaterial.UpdateItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRawMaterialByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.rawMaterial.DeleteItemByIdResponse> deleteRawMaterialById(
        com.example.rawMaterial.DeleteItemByIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRawMaterialByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_RAW_MATERIALS = 0;
  private static final int METHODID_GET_RAW_MATERIAL_BY_ID = 1;
  private static final int METHODID_UPDATE_RAW_MATERIAL_BY_ID = 2;
  private static final int METHODID_DELETE_RAW_MATERIAL_BY_ID = 3;
  private static final int METHODID_CREATE_RAW_MATERIAL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RawMaterialServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RawMaterialServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_RAW_MATERIALS:
          serviceImpl.getAllRawMaterials((com.example.rawMaterial.GetAllItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rawMaterial.GetAllItemsResponse>) responseObserver);
          break;
        case METHODID_GET_RAW_MATERIAL_BY_ID:
          serviceImpl.getRawMaterialById((com.example.rawMaterial.GetItemByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rawMaterial.GetItemByIdResponse>) responseObserver);
          break;
        case METHODID_UPDATE_RAW_MATERIAL_BY_ID:
          serviceImpl.updateRawMaterialById((com.example.rawMaterial.UpdateItemByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rawMaterial.UpdateItemByIdResponse>) responseObserver);
          break;
        case METHODID_DELETE_RAW_MATERIAL_BY_ID:
          serviceImpl.deleteRawMaterialById((com.example.rawMaterial.DeleteItemByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.rawMaterial.DeleteItemByIdResponse>) responseObserver);
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
        case METHODID_CREATE_RAW_MATERIAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.createRawMaterial(
              (io.grpc.stub.StreamObserver<com.example.rawMaterial.CreateItemResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RawMaterialServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RawMaterialServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.rawMaterial.RawMaterialOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RawMaterialService");
    }
  }

  private static final class RawMaterialServiceFileDescriptorSupplier
      extends RawMaterialServiceBaseDescriptorSupplier {
    RawMaterialServiceFileDescriptorSupplier() {}
  }

  private static final class RawMaterialServiceMethodDescriptorSupplier
      extends RawMaterialServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RawMaterialServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RawMaterialServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RawMaterialServiceFileDescriptorSupplier())
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
