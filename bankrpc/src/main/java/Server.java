import java.io.IOException;

import io.grpc.ServerBuilder;

public class Server
{
    public static void main(String[] args) throws IOException, InterruptedException {

        io.grpc.Server server = ServerBuilder.forPort(4321).addService(new Service()).build();

        server.start();
        System.out.println("Server is listening to port: " + server.getPort());
        server.awaitTermination();
        
    }
}
