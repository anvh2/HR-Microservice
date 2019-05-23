package role;

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
    comments = "Source: role.proto")
public final class RolesGrpc {

  private RolesGrpc() {}

  public static final String SERVICE_NAME = "role.Roles";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<role.RoleOuterClass.UserRolesRequest,
      role.RoleOuterClass.EmptyResponse> getSetUserRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetUserRole",
      requestType = role.RoleOuterClass.UserRolesRequest.class,
      responseType = role.RoleOuterClass.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<role.RoleOuterClass.UserRolesRequest,
      role.RoleOuterClass.EmptyResponse> getSetUserRoleMethod() {
    io.grpc.MethodDescriptor<role.RoleOuterClass.UserRolesRequest, role.RoleOuterClass.EmptyResponse> getSetUserRoleMethod;
    if ((getSetUserRoleMethod = RolesGrpc.getSetUserRoleMethod) == null) {
      synchronized (RolesGrpc.class) {
        if ((getSetUserRoleMethod = RolesGrpc.getSetUserRoleMethod) == null) {
          RolesGrpc.getSetUserRoleMethod = getSetUserRoleMethod = 
              io.grpc.MethodDescriptor.<role.RoleOuterClass.UserRolesRequest, role.RoleOuterClass.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "role.Roles", "SetUserRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.UserRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.EmptyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RolesMethodDescriptorSupplier("SetUserRole"))
                  .build();
          }
        }
     }
     return getSetUserRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<role.RoleOuterClass.UserRequest,
      role.RoleOuterClass.UserRoleResponse> getGetUserRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserRole",
      requestType = role.RoleOuterClass.UserRequest.class,
      responseType = role.RoleOuterClass.UserRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<role.RoleOuterClass.UserRequest,
      role.RoleOuterClass.UserRoleResponse> getGetUserRoleMethod() {
    io.grpc.MethodDescriptor<role.RoleOuterClass.UserRequest, role.RoleOuterClass.UserRoleResponse> getGetUserRoleMethod;
    if ((getGetUserRoleMethod = RolesGrpc.getGetUserRoleMethod) == null) {
      synchronized (RolesGrpc.class) {
        if ((getGetUserRoleMethod = RolesGrpc.getGetUserRoleMethod) == null) {
          RolesGrpc.getGetUserRoleMethod = getGetUserRoleMethod = 
              io.grpc.MethodDescriptor.<role.RoleOuterClass.UserRequest, role.RoleOuterClass.UserRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "role.Roles", "GetUserRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.UserRoleResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RolesMethodDescriptorSupplier("GetUserRole"))
                  .build();
          }
        }
     }
     return getGetUserRoleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RolesStub newStub(io.grpc.Channel channel) {
    return new RolesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RolesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RolesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RolesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RolesFutureStub(channel);
  }

  /**
   */
  public static abstract class RolesImplBase implements io.grpc.BindableService {

    /**
     */
    public void setUserRole(role.RoleOuterClass.UserRolesRequest request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetUserRoleMethod(), responseObserver);
    }

    /**
     */
    public void getUserRole(role.RoleOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.UserRoleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserRoleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetUserRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                role.RoleOuterClass.UserRolesRequest,
                role.RoleOuterClass.EmptyResponse>(
                  this, METHODID_SET_USER_ROLE)))
          .addMethod(
            getGetUserRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                role.RoleOuterClass.UserRequest,
                role.RoleOuterClass.UserRoleResponse>(
                  this, METHODID_GET_USER_ROLE)))
          .build();
    }
  }

  /**
   */
  public static final class RolesStub extends io.grpc.stub.AbstractStub<RolesStub> {
    private RolesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RolesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RolesStub(channel, callOptions);
    }

    /**
     */
    public void setUserRole(role.RoleOuterClass.UserRolesRequest request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetUserRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserRole(role.RoleOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.UserRoleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserRoleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RolesBlockingStub extends io.grpc.stub.AbstractStub<RolesBlockingStub> {
    private RolesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RolesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RolesBlockingStub(channel, callOptions);
    }

    /**
     */
    public role.RoleOuterClass.EmptyResponse setUserRole(role.RoleOuterClass.UserRolesRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetUserRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public role.RoleOuterClass.UserRoleResponse getUserRole(role.RoleOuterClass.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserRoleMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RolesFutureStub extends io.grpc.stub.AbstractStub<RolesFutureStub> {
    private RolesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RolesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RolesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RolesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<role.RoleOuterClass.EmptyResponse> setUserRole(
        role.RoleOuterClass.UserRolesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetUserRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<role.RoleOuterClass.UserRoleResponse> getUserRole(
        role.RoleOuterClass.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserRoleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_USER_ROLE = 0;
  private static final int METHODID_GET_USER_ROLE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RolesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RolesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_USER_ROLE:
          serviceImpl.setUserRole((role.RoleOuterClass.UserRolesRequest) request,
              (io.grpc.stub.StreamObserver<role.RoleOuterClass.EmptyResponse>) responseObserver);
          break;
        case METHODID_GET_USER_ROLE:
          serviceImpl.getUserRole((role.RoleOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<role.RoleOuterClass.UserRoleResponse>) responseObserver);
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

  private static abstract class RolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RolesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return role.RoleOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Roles");
    }
  }

  private static final class RolesFileDescriptorSupplier
      extends RolesBaseDescriptorSupplier {
    RolesFileDescriptorSupplier() {}
  }

  private static final class RolesMethodDescriptorSupplier
      extends RolesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RolesMethodDescriptorSupplier(String methodName) {
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
      synchronized (RolesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RolesFileDescriptorSupplier())
              .addMethod(getSetUserRoleMethod())
              .addMethod(getGetUserRoleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
