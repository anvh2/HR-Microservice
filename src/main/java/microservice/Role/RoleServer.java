package microservice.Role;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class RoleServer {
    public static void main(String[] args) {
        Server server = ServerBuilder
                .forPort(4040)
                .addService(new RoleService())
                .build();

        try {
            server.start();
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
