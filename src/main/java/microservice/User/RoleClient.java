package microservice.User;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import role.RoleOuterClass;
import role.RolesGrpc;

public class RoleClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 4040)
                .usePlaintext()
                .build();

        RolesGrpc.RolesBlockingStub stub = RolesGrpc.newBlockingStub(channel);

        RoleOuterClass.UserRoleResponse response = stub.getUserRole(RoleOuterClass.UserRequest
                .newBuilder()
                .setUserId(1)
                .build());

        System.out.println("user id: " + response.getUserId());

        for (RoleOuterClass.Role role : response.getRolesList()){
            System.out.println(" -" + role.getId() + ": " + role.getName());
        }

        channel.shutdown();
    }
}
