package com.grpc.stubs;

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
 * <pre>
 * ReservationService definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.GetAllReservationsRequest,
      com.grpc.stubs.GetAllReservationsResponse> getAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllReservations",
      requestType = com.grpc.stubs.GetAllReservationsRequest.class,
      responseType = com.grpc.stubs.GetAllReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.GetAllReservationsRequest,
      com.grpc.stubs.GetAllReservationsResponse> getAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.GetAllReservationsRequest, com.grpc.stubs.GetAllReservationsResponse> getAllReservationsMethod;
    if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getAllReservationsMethod = ReservationServiceGrpc.getAllReservationsMethod) == null) {
          ReservationServiceGrpc.getAllReservationsMethod = getAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.GetAllReservationsRequest, com.grpc.stubs.GetAllReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "AllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GetAllReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GetAllReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("AllReservations"))
                  .build();
          }
        }
     }
     return getAllReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.GetReservationByIdRequest,
      com.grpc.stubs.GetReservationByIdResponse> getReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReservationById",
      requestType = com.grpc.stubs.GetReservationByIdRequest.class,
      responseType = com.grpc.stubs.GetReservationByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.GetReservationByIdRequest,
      com.grpc.stubs.GetReservationByIdResponse> getReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.GetReservationByIdRequest, com.grpc.stubs.GetReservationByIdResponse> getReservationByIdMethod;
    if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getReservationByIdMethod = ReservationServiceGrpc.getReservationByIdMethod) == null) {
          ReservationServiceGrpc.getReservationByIdMethod = getReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.GetReservationByIdRequest, com.grpc.stubs.GetReservationByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "ReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GetReservationByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.GetReservationByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("ReservationById"))
                  .build();
          }
        }
     }
     return getReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.stubs.SaveReservationRequest,
      com.grpc.stubs.SaveReservationResponse> getSaveReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveReservation",
      requestType = com.grpc.stubs.SaveReservationRequest.class,
      responseType = com.grpc.stubs.SaveReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.stubs.SaveReservationRequest,
      com.grpc.stubs.SaveReservationResponse> getSaveReservationMethod() {
    io.grpc.MethodDescriptor<com.grpc.stubs.SaveReservationRequest, com.grpc.stubs.SaveReservationResponse> getSaveReservationMethod;
    if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getSaveReservationMethod = ReservationServiceGrpc.getSaveReservationMethod) == null) {
          ReservationServiceGrpc.getSaveReservationMethod = getSaveReservationMethod = 
              io.grpc.MethodDescriptor.<com.grpc.stubs.SaveReservationRequest, com.grpc.stubs.SaveReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "SaveReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.SaveReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.stubs.SaveReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("SaveReservation"))
                  .build();
          }
        }
     }
     return getSaveReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * ReservationService definition
   * </pre>
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get all reservations
     * </pre>
     */
    public void allReservations(com.grpc.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllReservationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get a reservation by ID
     * </pre>
     */
    public void reservationById(com.grpc.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReservationByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Save a reservation
     * </pre>
     */
    public void saveReservation(com.grpc.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.SaveReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.GetAllReservationsRequest,
                com.grpc.stubs.GetAllReservationsResponse>(
                  this, METHODID_ALL_RESERVATIONS)))
          .addMethod(
            getReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.GetReservationByIdRequest,
                com.grpc.stubs.GetReservationByIdResponse>(
                  this, METHODID_RESERVATION_BY_ID)))
          .addMethod(
            getSaveReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.stubs.SaveReservationRequest,
                com.grpc.stubs.SaveReservationResponse>(
                  this, METHODID_SAVE_RESERVATION)))
          .build();
    }
  }

  /**
   * <pre>
   * ReservationService definition
   * </pre>
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get all reservations
     * </pre>
     */
    public void allReservations(com.grpc.stubs.GetAllReservationsRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.GetAllReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get a reservation by ID
     * </pre>
     */
    public void reservationById(com.grpc.stubs.GetReservationByIdRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.GetReservationByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Save a reservation
     * </pre>
     */
    public void saveReservation(com.grpc.stubs.SaveReservationRequest request,
        io.grpc.stub.StreamObserver<com.grpc.stubs.SaveReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ReservationService definition
   * </pre>
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get all reservations
     * </pre>
     */
    public com.grpc.stubs.GetAllReservationsResponse allReservations(com.grpc.stubs.GetAllReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAllReservationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get a reservation by ID
     * </pre>
     */
    public com.grpc.stubs.GetReservationByIdResponse reservationById(com.grpc.stubs.GetReservationByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Save a reservation
     * </pre>
     */
    public com.grpc.stubs.SaveReservationResponse saveReservation(com.grpc.stubs.SaveReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ReservationService definition
   * </pre>
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get all reservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.GetAllReservationsResponse> allReservations(
        com.grpc.stubs.GetAllReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAllReservationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get a reservation by ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.GetReservationByIdResponse> reservationById(
        com.grpc.stubs.GetReservationByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Save a reservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.stubs.SaveReservationResponse> saveReservation(
        com.grpc.stubs.SaveReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_RESERVATIONS = 0;
  private static final int METHODID_RESERVATION_BY_ID = 1;
  private static final int METHODID_SAVE_RESERVATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_RESERVATIONS:
          serviceImpl.allReservations((com.grpc.stubs.GetAllReservationsRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.GetAllReservationsResponse>) responseObserver);
          break;
        case METHODID_RESERVATION_BY_ID:
          serviceImpl.reservationById((com.grpc.stubs.GetReservationByIdRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.GetReservationByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_RESERVATION:
          serviceImpl.saveReservation((com.grpc.stubs.SaveReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.stubs.SaveReservationResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getAllReservationsMethod())
              .addMethod(getReservationByIdMethod())
              .addMethod(getSaveReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
