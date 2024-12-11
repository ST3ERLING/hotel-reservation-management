package com.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class HotelReservationServiceGrpc {

  private HotelReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.grpc.HotelReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.Reservation.ReservationRequest,
      com.grpc.Reservation.ReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = com.grpc.Reservation.ReservationRequest.class,
      responseType = com.grpc.Reservation.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.Reservation.ReservationRequest,
      com.grpc.Reservation.ReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<com.grpc.Reservation.ReservationRequest, com.grpc.Reservation.ReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = HotelReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (HotelReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = HotelReservationServiceGrpc.getCreateReservationMethod) == null) {
          HotelReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.Reservation.ReservationRequest, com.grpc.Reservation.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.HotelReservationService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.Reservation.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.Reservation.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelReservationServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.Reservation.ReservationRequest,
      com.grpc.Reservation.ReservationResponse> getGetReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservation",
      requestType = com.grpc.Reservation.ReservationRequest.class,
      responseType = com.grpc.Reservation.ReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.Reservation.ReservationRequest,
      com.grpc.Reservation.ReservationResponse> getGetReservationMethod() {
    io.grpc.MethodDescriptor<com.grpc.Reservation.ReservationRequest, com.grpc.Reservation.ReservationResponse> getGetReservationMethod;
    if ((getGetReservationMethod = HotelReservationServiceGrpc.getGetReservationMethod) == null) {
      synchronized (HotelReservationServiceGrpc.class) {
        if ((getGetReservationMethod = HotelReservationServiceGrpc.getGetReservationMethod) == null) {
          HotelReservationServiceGrpc.getGetReservationMethod = getGetReservationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.Reservation.ReservationRequest, com.grpc.Reservation.ReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.grpc.HotelReservationService", "GetReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.Reservation.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.Reservation.ReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HotelReservationServiceMethodDescriptorSupplier("GetReservation"))
                  .build();
          }
        }
     }
     return getGetReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelReservationServiceStub newStub(io.grpc.Channel channel) {
    return new HotelReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HotelReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HotelReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HotelReservationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createReservation(com.grpc.Reservation.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.Reservation.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    public void getReservation(com.grpc.Reservation.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.Reservation.ReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.Reservation.ReservationRequest,
                com.grpc.Reservation.ReservationResponse>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getGetReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.Reservation.ReservationRequest,
                com.grpc.Reservation.ReservationResponse>(
                  this, METHODID_GET_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class HotelReservationServiceStub extends io.grpc.stub.AbstractStub<HotelReservationServiceStub> {
    private HotelReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createReservation(com.grpc.Reservation.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.Reservation.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservation(com.grpc.Reservation.ReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.Reservation.ReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HotelReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<HotelReservationServiceBlockingStub> {
    private HotelReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.Reservation.ReservationResponse createReservation(com.grpc.Reservation.ReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.Reservation.ReservationResponse getReservation(com.grpc.Reservation.ReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HotelReservationServiceFutureStub extends io.grpc.stub.AbstractStub<HotelReservationServiceFutureStub> {
    private HotelReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HotelReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HotelReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.Reservation.ReservationResponse> createReservation(
        com.grpc.Reservation.ReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.Reservation.ReservationResponse> getReservation(
        com.grpc.Reservation.ReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_GET_RESERVATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HotelReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HotelReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((com.grpc.Reservation.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.Reservation.ReservationResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION:
          serviceImpl.getReservation((com.grpc.Reservation.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.Reservation.ReservationResponse>) responseObserver);
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

  private static abstract class HotelReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelReservationService");
    }
  }

  private static final class HotelReservationServiceFileDescriptorSupplier
      extends HotelReservationServiceBaseDescriptorSupplier {
    HotelReservationServiceFileDescriptorSupplier() {}
  }

  private static final class HotelReservationServiceMethodDescriptorSupplier
      extends HotelReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HotelReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HotelReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelReservationServiceFileDescriptorSupplier())
              .addMethod(getCreateReservationMethod())
              .addMethod(getGetReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
