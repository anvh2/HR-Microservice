package user;

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
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: user.proto")
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final String SERVICE_NAME = "user.Users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<user.UserOuterClass.GetUserRequest,
      user.UserOuterClass.UserReply> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = user.UserOuterClass.GetUserRequest.class,
      responseType = user.UserOuterClass.UserReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<user.UserOuterClass.GetUserRequest,
      user.UserOuterClass.UserReply> getGetUserMethod() {
    io.grpc.MethodDescriptor<user.UserOuterClass.GetUserRequest, user.UserOuterClass.UserReply> getGetUserMethod;
    if ((getGetUserMethod = UsersGrpc.getGetUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetUserMethod = UsersGrpc.getGetUserMethod) == null) {
          UsersGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<user.UserOuterClass.GetUserRequest, user.UserOuterClass.UserReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user.Users", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserOuterClass.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  user.UserOuterClass.UserReply.getDefaultInstance()))
                  .setSchemaDescriptor(new UsersMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    return new UsersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UsersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UsersFutureStub(channel);
  }

  /**
   */
  public static abstract class UsersImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUser(user.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<user.UserOuterClass.UserReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                user.UserOuterClass.GetUserRequest,
                user.UserOuterClass.UserReply>(
                  this, METHODID_GET_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UsersStub extends io.grpc.stub.AbstractStub<UsersStub> {
    private UsersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
    }

    /**
     */
    public void getUser(user.UserOuterClass.GetUserRequest request,
        io.grpc.stub.StreamObserver<user.UserOuterClass.UserReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersBlockingStub extends io.grpc.stub.AbstractStub<UsersBlockingStub> {
    private UsersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
    }

    /**
     */
    public user.UserOuterClass.UserReply getUser(user.UserOuterClass.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersFutureStub extends io.grpc.stub.AbstractStub<UsersFutureStub> {
    private UsersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<user.UserOuterClass.UserReply> getUser(
        user.UserOuterClass.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((user.UserOuterClass.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<user.UserOuterClass.UserReply>) responseObserver);
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

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return user.UserOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
