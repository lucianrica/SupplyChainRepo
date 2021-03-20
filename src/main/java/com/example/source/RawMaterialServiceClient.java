package com.example.source;

import com.example.rawMaterial.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class RawMaterialServiceClient {

    public static void main(String[] args) {
        RawMaterialServiceClient client = new RawMaterialServiceClient();
        client.run();
    }

    private void run() {
        System.out.println("RawMaterial Client Started \n");


        // a gRPC channel provides a connection to a gRPC server on a specified host and port.
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9002)
                .usePlaintext()
                .build();


        // call the server
//        createItem(channel);
//        getRawMaterials(channel);
//        getRawMaterial(channel);
//        updateRawMaterial(channel);
//        deleteRawMaterial(channel);


        // close connection
        System.out.println("RawMaterial Client Stopped");
        channel.shutdown();
    }

    private void createItem(ManagedChannel channel) {

        // create a greet service client (blocking - synchronous)
        RawMaterialServiceGrpc.RawMaterialServiceStub client;
        client = RawMaterialServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<CreateItemRequest> request = client.createRawMaterial(new StreamObserver<CreateItemResponse>() {
            @Override
            public void onNext(CreateItemResponse value) {
                // we get a response from the server
                System.out.println("Received response from server");
                System.out.println(value.getResult());
                // on next will be called only once
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error encountered: " + t);
            }

            @Override
            public void onCompleted() {
                // the server is done sending us data
                System.out.println("Server has completed sending us the request");
                latch.countDown();
                // on completed will be called right after on next
            }
        });


        // streaming message #1
        System.out.println("Creating item #1");
        request.onNext(CreateItemRequest.newBuilder()
                .setRawMaterial(RawMaterial.newBuilder()
                        .setRawMaterialName("Tree")
                        .setRawMaterialsInStock(10000)
                        .setRawMaterialsPrice(25.59)
                        .setRawMaterialsVolume(40)
                        .build())
                .build());


        // streaming message #2
        System.out.println("Creating item #2");
        request.onNext(CreateItemRequest.newBuilder()
                .setRawMaterial(RawMaterial.newBuilder()
                        .setRawMaterialName("Metal")
                        .setRawMaterialsInStock(2500)
                        .setRawMaterialsPrice(4400)
                        .setRawMaterialsVolume(30)
                        .build())
                .build());


        // streaming message #3
        System.out.println("Creating item #3");
        request.onNext(CreateItemRequest.newBuilder()
                .setRawMaterial(RawMaterial.newBuilder()
                        .setRawMaterialName("Paint")
                        .setRawMaterialsInStock(100000)
                        .setRawMaterialsPrice(12.89)
                        .setRawMaterialsVolume(20)
                        .build())
                .build());


        // tell the server that the client is done sending data
        request.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void getRawMaterials(ManagedChannel channel) {

        // create a greet service client (blocking - synchronous)
        RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
        client = RawMaterialServiceGrpc.newBlockingStub(channel);

        GetAllItemsRequest request = GetAllItemsRequest
                .newBuilder()
                .build();


        try {
            client.getAllRawMaterials(request).forEachRemaining(rawMaterialResponse -> {
                System.out.println(rawMaterialResponse.getRawMaterial());
            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void getRawMaterial(ManagedChannel channel) {

        // create a greet service client (blocking - synchronous)
        RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
        client = RawMaterialServiceGrpc.newBlockingStub(channel);


        // create a protocol buffer
        GetItemByIdRequest request = GetItemByIdRequest.newBuilder()
                .setRawMaterialId("a2d29dc7-1dd0-4d9f-8e09-943896a025af")
                .build();


        // call the RPC and get back a Response (protocol buffers)
        try {
            GetItemByIdResponse response = client.getRawMaterialById(request);

            // Print response
            System.out.println(response.getRawMaterial());
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    private void updateRawMaterial(ManagedChannel channel) {

        // create a greet service client (blocking - synchronous)
        RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
        client = RawMaterialServiceGrpc.newBlockingStub(channel);


        // create a protocol buffer
        RawMaterial rawMaterial = RawMaterial.newBuilder()
                .setRawMaterialId("a2d29dc7-1dd0-4d9f-8e09-943896a025af")
                .setRawMaterialName("New Tree")
                .setRawMaterialsInStock(100000)
                .setRawMaterialsPrice(12.89)
                .setRawMaterialsVolume(20)
                .build();


        UpdateItemByIdRequest request = UpdateItemByIdRequest.newBuilder()
                .setRawMaterial(rawMaterial)
                .build();


        try {
            // call the RPC and get back a GreetResponse (protocol buffers)
            UpdateItemByIdResponse response = client.updateRawMaterialById(request);

            // Print response
            System.out.println(response.getRawMaterial());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void deleteRawMaterial(ManagedChannel channel) {

        // create a greet service client (blocking - synchronous)
        RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
        client = RawMaterialServiceGrpc.newBlockingStub(channel);


        // create a protocol buffer
        DeleteItemByIdRequest request = DeleteItemByIdRequest.newBuilder()
                .setRawMaterialId("a2d29dc7-1dd0-4d9f-8e09-943896a025af")
                .build();


        try {
            // call the RPC and get back a Response (protocol buffers)
            DeleteItemByIdResponse response = client.deleteRawMaterialById(request);


            // Print response
            System.out.println(response.getResult());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
