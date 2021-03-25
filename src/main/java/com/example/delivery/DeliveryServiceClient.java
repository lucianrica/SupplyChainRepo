package com.example.delivery;

import com.example.rawMaterial.RawMaterial;
import com.example.rawMaterial.UpdateItemByIdRequest;
import com.example.rawMaterial.UpdateItemByIdResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DeliveryServiceClient {

    List<String> itemIdList = new ArrayList<>();

    public static void main(String[] args) {
        DeliveryServiceClient client = new DeliveryServiceClient();
        client.run();
    }

    private void run() {
        System.out.println("Delivery Client Started \n");

        // a gRPC channel provides a connection to a gRPC server on a specified host and port.
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9003)
                .usePlaintext()
                .build();

        createDelivery(channel);

        // close connection
        System.out.println("RawMaterial Client Stopped");
        channel.shutdown();
    }

    private void createDelivery(ManagedChannel channel) {


        // create a greet service client (blocking - synchronous)
        DeliveryServiceGrpc.DeliveryServiceBlockingStub client;
        client = DeliveryServiceGrpc.newBlockingStub(channel);

        String uuid2 = UUID.randomUUID().toString();
        String uuid3 = UUID.randomUUID().toString();
        String uuid4 = UUID.randomUUID().toString();
        itemIdList.add(uuid2);
        itemIdList.add(uuid3);
        itemIdList.add(uuid4);

        String body = "[";
        int count = 0;

        for (String it: itemIdList) {
            if(count > 0) {
                body += ",";
            }
            body += "\"" + it + "\"";
            count++;
        }
        body += "]";



        String uuid = UUID.randomUUID().toString();
        // create a protocol buffer
        Van loadedVan = Van.newBuilder()
                .setDelivering(true)
                .setDrivers(2)
                .setFulfilled(false)
                .setItemId(body)
                .setVolume(200)
                .build();


        VanRequest request = VanRequest.newBuilder()
                .setVan(loadedVan)
                .build();


        client.createDelivery(request);

        try {
            // call the RPC and get back a GreetResponse (protocol buffers)
            VanResponse response = client.createDelivery(request);

            // Print response
            System.out.println(response.getVan());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
