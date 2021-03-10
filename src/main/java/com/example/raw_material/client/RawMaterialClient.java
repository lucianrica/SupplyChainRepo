package com.example.raw_material.client;


import com.example.raw_material.*;
import com.example.supply_material.GetRawMaterialsRequest;
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
                .forAddress("localhost", 9000)
                .usePlaintext()
                .build();




        // call the server
        unaryRawMaterialCall(channel);
        serverStreamRequest(channel);


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
        RawMaterial rawMaterial = RawMaterial.newBuilder()
                .setName("iron")
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


    private void serverStreamRequest(ManagedChannel channel) {


        // create a greet service client (blocking - synchronous)
        RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
        client = RawMaterialServiceGrpc.newBlockingStub(channel);

        RawMaterialRequest request = RawMaterialRequest
                .newBuilder()
                .build();


        client.getRawMaterials(request).forEachRemaining(rawMaterialResponse ->{
            System.out.println(rawMaterialResponse.getRawMaterial());
        });



    }




}
