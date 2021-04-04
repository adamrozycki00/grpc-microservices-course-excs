package com.tenetmind.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = ServerBuilder.forPort(6565)
                .addService(new BankService())
                .build();

        server.start().awaitTermination();
    }

}
