package microservice.User;

import io.grpc.stub.StreamObserver;
import user.UserOuterClass;
import user.UsersGrpc;

public class UserService extends UsersGrpc.UsersImplBase {
    @Override
    public void getUser(UserOuterClass.GetUserRequest request, StreamObserver<UserOuterClass.UserReply> responseObserver) {
        super.getUser(request, responseObserver);
    }
}
