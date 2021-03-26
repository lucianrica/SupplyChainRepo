package com.example.shop;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SERVICE DEFINITION
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: retailers/shop.proto")
public final class ShopServiceGrpc {

  private ShopServiceGrpc() {}

  public static final String SERVICE_NAME = "retailers.ShopService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.shop.GetProductsRequest,
      com.example.shop.GetProductsResponse> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducts",
      requestType = com.example.shop.GetProductsRequest.class,
      responseType = com.example.shop.GetProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.shop.GetProductsRequest,
      com.example.shop.GetProductsResponse> getGetProductsMethod() {
    io.grpc.MethodDescriptor<com.example.shop.GetProductsRequest, com.example.shop.GetProductsResponse> getGetProductsMethod;
    if ((getGetProductsMethod = ShopServiceGrpc.getGetProductsMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getGetProductsMethod = ShopServiceGrpc.getGetProductsMethod) == null) {
          ShopServiceGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<com.example.shop.GetProductsRequest, com.example.shop.GetProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.GetProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.GetProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("GetProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.shop.UpdateProductsRequest,
      com.example.shop.UpdateProductsResponse> getUpdateProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProducts",
      requestType = com.example.shop.UpdateProductsRequest.class,
      responseType = com.example.shop.UpdateProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.shop.UpdateProductsRequest,
      com.example.shop.UpdateProductsResponse> getUpdateProductsMethod() {
    io.grpc.MethodDescriptor<com.example.shop.UpdateProductsRequest, com.example.shop.UpdateProductsResponse> getUpdateProductsMethod;
    if ((getUpdateProductsMethod = ShopServiceGrpc.getUpdateProductsMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getUpdateProductsMethod = ShopServiceGrpc.getUpdateProductsMethod) == null) {
          ShopServiceGrpc.getUpdateProductsMethod = getUpdateProductsMethod =
              io.grpc.MethodDescriptor.<com.example.shop.UpdateProductsRequest, com.example.shop.UpdateProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.UpdateProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.UpdateProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("UpdateProducts"))
              .build();
        }
      }
    }
    return getUpdateProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.shop.GetProductRequest,
      com.example.shop.GetProductResponse> getGetProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProduct",
      requestType = com.example.shop.GetProductRequest.class,
      responseType = com.example.shop.GetProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shop.GetProductRequest,
      com.example.shop.GetProductResponse> getGetProductMethod() {
    io.grpc.MethodDescriptor<com.example.shop.GetProductRequest, com.example.shop.GetProductResponse> getGetProductMethod;
    if ((getGetProductMethod = ShopServiceGrpc.getGetProductMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getGetProductMethod = ShopServiceGrpc.getGetProductMethod) == null) {
          ShopServiceGrpc.getGetProductMethod = getGetProductMethod =
              io.grpc.MethodDescriptor.<com.example.shop.GetProductRequest, com.example.shop.GetProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.GetProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.GetProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("GetProduct"))
              .build();
        }
      }
    }
    return getGetProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.shop.UpdateProductRequest,
      com.example.shop.UpdateProductResponse> getUpdateProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProduct",
      requestType = com.example.shop.UpdateProductRequest.class,
      responseType = com.example.shop.UpdateProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.shop.UpdateProductRequest,
      com.example.shop.UpdateProductResponse> getUpdateProductMethod() {
    io.grpc.MethodDescriptor<com.example.shop.UpdateProductRequest, com.example.shop.UpdateProductResponse> getUpdateProductMethod;
    if ((getUpdateProductMethod = ShopServiceGrpc.getUpdateProductMethod) == null) {
      synchronized (ShopServiceGrpc.class) {
        if ((getUpdateProductMethod = ShopServiceGrpc.getUpdateProductMethod) == null) {
          ShopServiceGrpc.getUpdateProductMethod = getUpdateProductMethod =
              io.grpc.MethodDescriptor.<com.example.shop.UpdateProductRequest, com.example.shop.UpdateProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.UpdateProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.shop.UpdateProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ShopServiceMethodDescriptorSupplier("UpdateProduct"))
              .build();
        }
      }
    }
    return getUpdateProductMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShopServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceStub>() {
        @java.lang.Override
        public ShopServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceStub(channel, callOptions);
        }
      };
    return ShopServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShopServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceBlockingStub>() {
        @java.lang.Override
        public ShopServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceBlockingStub(channel, callOptions);
        }
      };
    return ShopServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShopServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShopServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShopServiceFutureStub>() {
        @java.lang.Override
        public ShopServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShopServiceFutureStub(channel, callOptions);
        }
      };
    return ShopServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static abstract class ShopServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * GET PRODUCTS, Server streaming
     * </pre>
     */
    public void getProducts(com.example.shop.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.shop.GetProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * UPDATE PRODUCTS, BI-DI streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.shop.UpdateProductsRequest> updateProducts(
        io.grpc.stub.StreamObserver<com.example.shop.UpdateProductsResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUpdateProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public void getProduct(com.example.shop.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.example.shop.GetProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public void updateProduct(com.example.shop.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.example.shop.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProductMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProductsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.shop.GetProductsRequest,
                com.example.shop.GetProductsResponse>(
                  this, METHODID_GET_PRODUCTS)))
          .addMethod(
            getUpdateProductsMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.shop.UpdateProductsRequest,
                com.example.shop.UpdateProductsResponse>(
                  this, METHODID_UPDATE_PRODUCTS)))
          .addMethod(
            getGetProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.shop.GetProductRequest,
                com.example.shop.GetProductResponse>(
                  this, METHODID_GET_PRODUCT)))
          .addMethod(
            getUpdateProductMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.shop.UpdateProductRequest,
                com.example.shop.UpdateProductResponse>(
                  this, METHODID_UPDATE_PRODUCT)))
          .build();
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class ShopServiceStub extends io.grpc.stub.AbstractAsyncStub<ShopServiceStub> {
    private ShopServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET PRODUCTS, Server streaming
     * </pre>
     */
    public void getProducts(com.example.shop.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.example.shop.GetProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UPDATE PRODUCTS, BI-DI streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.example.shop.UpdateProductsRequest> updateProducts(
        io.grpc.stub.StreamObserver<com.example.shop.UpdateProductsResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getUpdateProductsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public void getProduct(com.example.shop.GetProductRequest request,
        io.grpc.stub.StreamObserver<com.example.shop.GetProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public void updateProduct(com.example.shop.UpdateProductRequest request,
        io.grpc.stub.StreamObserver<com.example.shop.UpdateProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class ShopServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ShopServiceBlockingStub> {
    private ShopServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET PRODUCTS, Server streaming
     * </pre>
     */
    public java.util.Iterator<com.example.shop.GetProductsResponse> getProducts(
        com.example.shop.GetProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public com.example.shop.GetProductResponse getProduct(com.example.shop.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public com.example.shop.UpdateProductResponse updateProduct(com.example.shop.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProductMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SERVICE DEFINITION
   * </pre>
   */
  public static final class ShopServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ShopServiceFutureStub> {
    private ShopServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShopServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * GET PRODUCT, Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shop.GetProductResponse> getProduct(
        com.example.shop.GetProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UPDATE PRODUCT, Unary communication
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.shop.UpdateProductResponse> updateProduct(
        com.example.shop.UpdateProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProductMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCT = 1;
  private static final int METHODID_UPDATE_PRODUCT = 2;
  private static final int METHODID_UPDATE_PRODUCTS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShopServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShopServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((com.example.shop.GetProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shop.GetProductsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT:
          serviceImpl.getProduct((com.example.shop.GetProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shop.GetProductResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCT:
          serviceImpl.updateProduct((com.example.shop.UpdateProductRequest) request,
              (io.grpc.stub.StreamObserver<com.example.shop.UpdateProductResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<com.example.shop.UpdateProductsResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShopServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.shop.Shop.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShopService");
    }
  }

  private static final class ShopServiceFileDescriptorSupplier
      extends ShopServiceBaseDescriptorSupplier {
    ShopServiceFileDescriptorSupplier() {}
  }

  private static final class ShopServiceMethodDescriptorSupplier
      extends ShopServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShopServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShopServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShopServiceFileDescriptorSupplier())
              .addMethod(getGetProductsMethod())
              .addMethod(getUpdateProductsMethod())
              .addMethod(getGetProductMethod())
              .addMethod(getUpdateProductMethod())
              .build();
        }
      }
    }
    return result;
  }
}
