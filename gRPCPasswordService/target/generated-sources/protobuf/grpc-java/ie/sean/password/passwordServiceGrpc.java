package ie.sean.password;

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
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: passwordService.proto")
public final class PasswordServiceGrpc {

  private PasswordServiceGrpc() {}

  public static final String SERVICE_NAME = "PasswordService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ie.sean.password.PasswordServiceOuterClass.Credentials,
      ie.sean.password.PasswordServiceOuterClass.HashResponse> getHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hash",
      requestType = ie.sean.password.PasswordServiceOuterClass.Credentials.class,
      responseType = ie.sean.password.PasswordServiceOuterClass.HashResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.sean.password.PasswordServiceOuterClass.Credentials,
      ie.sean.password.PasswordServiceOuterClass.HashResponse> getHashMethod() {
    io.grpc.MethodDescriptor<ie.sean.password.PasswordServiceOuterClass.Credentials, ie.sean.password.PasswordServiceOuterClass.HashResponse> getHashMethod;
    if ((getHashMethod = PasswordServiceGrpc.getHashMethod) == null) {
      synchronized (PasswordServiceGrpc.class) {
        if ((getHashMethod = PasswordServiceGrpc.getHashMethod) == null) {
          PasswordServiceGrpc.getHashMethod = getHashMethod =
              io.grpc.MethodDescriptor.<ie.sean.password.PasswordServiceOuterClass.Credentials, ie.sean.password.PasswordServiceOuterClass.HashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.sean.password.PasswordServiceOuterClass.Credentials.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.sean.password.PasswordServiceOuterClass.HashResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordServiceMethodDescriptorSupplier("hash"))
              .build();
        }
      }
    }
    return getHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ie.sean.password.PasswordServiceOuterClass.Compare,
      com.google.protobuf.BoolValue> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validate",
      requestType = ie.sean.password.PasswordServiceOuterClass.Compare.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.sean.password.PasswordServiceOuterClass.Compare,
      com.google.protobuf.BoolValue> getValidateMethod() {
    io.grpc.MethodDescriptor<ie.sean.password.PasswordServiceOuterClass.Compare, com.google.protobuf.BoolValue> getValidateMethod;
    if ((getValidateMethod = PasswordServiceGrpc.getValidateMethod) == null) {
      synchronized (PasswordServiceGrpc.class) {
        if ((getValidateMethod = PasswordServiceGrpc.getValidateMethod) == null) {
          PasswordServiceGrpc.getValidateMethod = getValidateMethod =
              io.grpc.MethodDescriptor.<ie.sean.password.PasswordServiceOuterClass.Compare, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.sean.password.PasswordServiceOuterClass.Compare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordServiceMethodDescriptorSupplier("validate"))
              .build();
        }
      }
    }
    return getValidateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PasswordServiceStub newStub(io.grpc.Channel channel) {
    return new PasswordServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PasswordServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PasswordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PasswordServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PasswordServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Hash Method - Hashes salts password then returns it
     * </pre>
     */
    public void hash(ie.sean.password.PasswordServiceOuterClass.Credentials request,
        io.grpc.stub.StreamObserver<ie.sean.password.PasswordServiceOuterClass.HashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getHashMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate method - Returns true if the passwords matches
     * </pre>
     */
    public void validate(ie.sean.password.PasswordServiceOuterClass.Compare request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.sean.password.PasswordServiceOuterClass.Credentials,
                ie.sean.password.PasswordServiceOuterClass.HashResponse>(
                  this, METHODID_HASH)))
          .addMethod(
            getValidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.sean.password.PasswordServiceOuterClass.Compare,
                com.google.protobuf.BoolValue>(
                  this, METHODID_VALIDATE)))
          .build();
    }
  }

  /**
   */
  public static final class PasswordServiceStub extends io.grpc.stub.AbstractStub<PasswordServiceStub> {
    private PasswordServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hash Method - Hashes salts password then returns it
     * </pre>
     */
    public void hash(ie.sean.password.PasswordServiceOuterClass.Credentials request,
        io.grpc.stub.StreamObserver<ie.sean.password.PasswordServiceOuterClass.HashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate method - Returns true if the passwords matches
     * </pre>
     */
    public void validate(ie.sean.password.PasswordServiceOuterClass.Compare request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PasswordServiceBlockingStub extends io.grpc.stub.AbstractStub<PasswordServiceBlockingStub> {
    private PasswordServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hash Method - Hashes salts password then returns it
     * </pre>
     */
    public ie.sean.password.PasswordServiceOuterClass.HashResponse hash(ie.sean.password.PasswordServiceOuterClass.Credentials request) {
      return blockingUnaryCall(
          getChannel(), getHashMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate method - Returns true if the passwords matches
     * </pre>
     */
    public com.google.protobuf.BoolValue validate(ie.sean.password.PasswordServiceOuterClass.Compare request) {
      return blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PasswordServiceFutureStub extends io.grpc.stub.AbstractStub<PasswordServiceFutureStub> {
    private PasswordServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Hash Method - Hashes salts password then returns it
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ie.sean.password.PasswordServiceOuterClass.HashResponse> hash(
        ie.sean.password.PasswordServiceOuterClass.Credentials request) {
      return futureUnaryCall(
          getChannel().newCall(getHashMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate method - Returns true if the passwords matches
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> validate(
        ie.sean.password.PasswordServiceOuterClass.Compare request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HASH = 0;
  private static final int METHODID_VALIDATE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PasswordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PasswordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HASH:
          serviceImpl.hash((ie.sean.password.PasswordServiceOuterClass.Credentials) request,
              (io.grpc.stub.StreamObserver<ie.sean.password.PasswordServiceOuterClass.HashResponse>) responseObserver);
          break;
        case METHODID_VALIDATE:
          serviceImpl.validate((ie.sean.password.PasswordServiceOuterClass.Compare) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
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

  private static abstract class PasswordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PasswordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ie.sean.password.PasswordServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PasswordService");
    }
  }

  private static final class PasswordServiceFileDescriptorSupplier
      extends PasswordServiceBaseDescriptorSupplier {
    PasswordServiceFileDescriptorSupplier() {}
  }

  private static final class PasswordServiceMethodDescriptorSupplier
      extends PasswordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PasswordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PasswordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PasswordServiceFileDescriptorSupplier())
              .addMethod(getHashMethod())
              .addMethod(getValidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
