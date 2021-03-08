package com.example.raw_material.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class RawMaterialServer {

    public static void main(String[] args) {

        // crete the server
        Server server = ServerBuilder.forPort(50051)
                .addService(new RawMaterialServiceImpl())
                .build();


        // start the server
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Server started on PORT: " + server.getPort());


        // listen for the shutdown request
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request...");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));


        // wait for termination signal
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
