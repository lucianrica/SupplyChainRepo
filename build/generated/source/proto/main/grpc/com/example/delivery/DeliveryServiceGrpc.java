package com.example.delivery;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: delivery/delivery.proto")
public final class DeliveryServiceGrpc {

  private DeliveryServiceGrpc() {}

  public static final String SERVICE_NAME = "delivery.DeliveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.delivery.VanRequest,
      com.example.delivery.VanResponse> getCreateDeliveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createDelivery",
      requestType = com.example.delivery.VanRequest.class,
      responseType = com.example.delivery.VanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.delivery.VanRequest,
      com.example.delivery.VanResponse> getCreateDeliveryMethod() {
    io.grpc.MethodDescriptor<com.example.delivery.VanRequest, com.example.delivery.VanResponse> getCreateDeliveryMethod;
    if ((getCreateDeliveryMethod = DeliveryServiceGrpc.getCreateDeliveryMethod) == null) {
      synchronized (DeliveryServiceGrpc.class) {
        if ((getCreateDeliveryMethod = DeliveryServiceGrpc.getCreateDeliveryMethod) == null) {
          DeliveryServiceGrpc.getCreateDeliveryMethod = getCreateDeliveryMethod =
              io.grpc.MethodDescriptor.<com.example.delivery.VanRequest, com.example.delivery.VanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createDelivery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.delivery.VanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.delivery.VanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryServiceMethodDescriptorSupplier("createDelivery"))
              .build();
        }
      }
    }
    return getCreateDeliveryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeliveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceStub>() {
        @java.lang.Override
        public DeliveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceStub(channel, callOptions);
        }
      };
    return DeliveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeliveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingStub>() {
        @java.lang.Override
        public DeliveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceBlockingStub(channel, callOptions);
        }
      };
    return DeliveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeliveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceFutureStub>() {
        @java.lang.Override
        public DeliveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceFutureStub(channel, callOptions);
        }
      };
    return DeliveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DeliveryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createDelivery(com.example.delivery.VanRequest request,
        io.grpc.stub.StreamObserver<com.example.delivery.VanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDeliveryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDeliveryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.delivery.VanRequest,
                com.example.delivery.VanResponse>(
                  this, METHODID_CREATE_DELIVERY)))
          .build();
    }
  }

  /**
   */
  public static final class DeliveryServiceStub extends io.grpc.stub.AbstractAsyncStub<DeliveryServiceStub> {
    private DeliveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceStub(channel, callOptions);
    }

    /**
     */
    public void createDelivery(com.example.delivery.VanRequest request,
        io.grpc.stub.StreamObserver<com.example.delivery.VanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDeliveryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeliveryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeliveryServiceBlockingStub> {
    private DeliveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.delivery.VanResponse createDelivery(com.example.delivery.VanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDeliveryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeliveryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeliveryServiceFutureStub> {
    private DeliveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.delivery.VanResponse> createDelivery(
        com.example.delivery.VanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDeliveryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DELIVERY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeliveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeliveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DELIVERY:
          serviceImpl.createDelivery((com.example.delivery.VanRequest) request,
              (io.grpc.stub.StreamObserver<com.example.delivery.VanResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeliveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeliveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.delivery.Delivery.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeliveryService");
    }
  }

  private static final class DeliveryServiceFileDescriptorSupplier
      extends DeliveryServiceBaseDescriptorSupplier {
    DeliveryServiceFileDescriptorSupplier() {}
  }

  private static final class DeliveryServiceMethodDescriptorSupplier
      extends DeliveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeliveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeliveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeliveryServiceFileDescriptorSupplier())
              .addMethod(getCreateDeliveryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
