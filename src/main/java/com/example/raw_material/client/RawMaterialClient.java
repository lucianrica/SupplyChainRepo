package com.example.raw_material.client;


import com.example.raw_material.CreateRawMaterialRequest;
import com.example.raw_material.CreateRawMaterialResponse;
import com.example.raw_material.RawMaterial;
import com.example.raw_material.RawMaterialServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.UUID;


public class RawMaterialClient {

    public static void main(String[] args) {
        RawMaterialClient client = new RawMaterialClient();
        client.run();
    }


    private void run() {
        System.out.println("Running : RawMaterial Client channel");

        // a gRPC channel provides a connection to a gRPC server on a specified host and port.
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();


        // call the server
        unaryRawMaterialCall(channel);


        // close connection
        System.out.println("Stopping: RawMaterial Client channel");
        channel.shutdown();
    }


    private void unaryRawMaterialCall(ManagedChannel channel) {

        // create a greet service client (blocking - synchronous)
        RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
        client = RawMaterialServiceGrpc.newBlockingStub(channel);



        // UNARY
        // create a protocol buffer for the message
        String uuid = UUID.randomUUID().toString();
        RawMaterial rawMaterial = RawMaterial.newBuilder()
                .setId(uuid)
                .setQuantity(300)
                .build();



        // create a protocol buffer for numberOfTreesRequest
        CreateRawMaterialRequest request = CreateRawMaterialRequest.newBuilder()
                .setRawMaterial(rawMaterial)
                .build();



        // call the RPC and get back a GreetResponse (protocol buffers)
        CreateRawMaterialResponse response = client.createRawMaterial(request);


        // Print response
        System.out.println(response.getRawMaterial());
    }


}
