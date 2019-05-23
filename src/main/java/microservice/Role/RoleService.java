package microservice.Role;

import io.grpc.stub.StreamObserver;
import role.RoleOuterClass;
import role.RolesGrpc;

public class RoleService extends RolesGrpc.RolesImplBase {
    @Override
    public void setUserRole(RoleOuterClass.UserRolesRequest request, StreamObserver<RoleOuterClass.EmptyResponse> responseObserver) {
        super.setUserRole(request, responseObserver);
    }

    @Override
    public void getUserRole(RoleOuterClass.UserRequest request, StreamObserver<RoleOuterClass.UserRoleResponse> responseObserver) {
        RoleOuterClass.UserRoleResponse.Builder response = RoleOuterClass.UserRoleResponse.newBuilder();

        response.addRoles(RoleOuterClass.Role.newBuilder().setId(1).setName("Junior Dev").build());
        response.addRoles(RoleOuterClass.Role.newBuilder().setId(2).setName("Admin").build());
        response.setUserId(request.getUserId());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
