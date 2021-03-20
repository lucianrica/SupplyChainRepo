package com.example.source;

import com.example.rawMaterial.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class RawMaterialServiceImpl extends RawMaterialServiceGrpc.RawMaterialServiceImplBase {

    boolean runOnce = true;
    ArrayList<RawMaterial> list = new ArrayList<>();

    @Override
    public StreamObserver<CreateItemRequest> createRawMaterial(StreamObserver<CreateItemResponse> responseObserver) {

        StreamObserver<CreateItemRequest> request = new StreamObserver<>() {

            @Override
            public void onNext(CreateItemRequest value) {
                // extract the raw material
                System.out.println("Received Create Raw Material request");
                RawMaterial rawMaterial = value.getRawMaterial();

                // mutate the rawMaterial from received request to add id
                String uuid = UUID.randomUUID().toString();
                rawMaterial = rawMaterial.toBuilder().setRawMaterialId(uuid).build();

                // add rawMaterial to the list/repo
                list.add(rawMaterial);
            }

            @Override
            public void onError(Throwable t) {
                // send NOT_FOUND message
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("We don't have any products in the store")
                        .asRuntimeException());
                return;
            }

            @Override
            public void onCompleted() {
                // client is done
                // this is when we want to return a response (responseObserver)
                responseObserver.onNext(CreateItemResponse.newBuilder()
                        .setResult("Items successfully created")
                        .build()
                );
                responseObserver.onCompleted();
            }
        };

        return request;
    }

    @Override
    public void getAllRawMaterials(GetAllItemsRequest request, StreamObserver<GetAllItemsResponse> responseObserver) {

        if (runOnce) {
            // TODO remove when promoting to prod, adding few items to help populate the list for developing app
            addFewItemsForTestingPurposes();
        }

        CountDownLatch latch = new CountDownLatch(1);


        // extract the raw material
        System.out.println("Received Get all Raw Materials request");


        if (list.isEmpty()) {
            // send NOT_FOUND message
            responseObserver.onError(Status
                    .NOT_FOUND
                    .withDescription("We do not have any raw materials in the list")
                    .asRuntimeException());
            return;

        } else {
            for (RawMaterial rawMat : list) {
                // build the response
                GetAllItemsResponse response = GetAllItemsResponse
                        .newBuilder()
                        .setRawMaterial(rawMat)
                        .build();


                // send the response to the client
                responseObserver.onNext(response);
            }

            // complete the RPC call (Remote procedure call)
            responseObserver.onCompleted();
            latch.countDown();
        }

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getRawMaterialById(GetItemByIdRequest request, StreamObserver<GetItemByIdResponse> responseObserver) {

        System.out.println("Received Get Raw Material by Id request");
        String id = request.getRawMaterialId();
        CountDownLatch latch = new CountDownLatch(1);

        boolean found = false;
        for (RawMaterial rawMat : list) {
            if (rawMat.getRawMaterialId().equals(id)) {
                GetItemByIdResponse response = GetItemByIdResponse
                        .newBuilder()
                        .setRawMaterial(rawMat)
                        .build();

                // send the response to the client
                responseObserver.onNext(response);
                found = true;
                break;
            }
        }
        if (!found) {
            responseObserver.onError(Status
                    .NOT_FOUND
                    .withDescription("Item with id: " + id + " not found")
                    .asRuntimeException());
            return;
        } else {
            // complete the RPC call (Remote procedure call)
            responseObserver.onCompleted();
            latch.countDown();
        }


        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateRawMaterialById(UpdateItemByIdRequest request, StreamObserver<UpdateItemByIdResponse> responseObserver) {

        System.out.println("Received Update Raw Material by Id request");
        RawMaterial rawMaterial = request.getRawMaterial();
        String id = rawMaterial.getRawMaterialId();
        CountDownLatch latch = new CountDownLatch(1);


        boolean found = false;
        for (RawMaterial rawMat : list) {
            if (rawMat.getRawMaterialId().equals(id)) {
                RawMaterial newRawMaterial = RawMaterial
                        .newBuilder()
                        .setRawMaterialId(id)
                        .setRawMaterialName(rawMaterial.getRawMaterialName())
                        .setRawMaterialsInStock(rawMaterial.getRawMaterialsInStock())
                        .setRawMaterialsVolume(rawMaterial.getRawMaterialsVolume())
                        .setRawMaterialsPrice(rawMat.getRawMaterialsPrice())
                        .build();

                list.remove(rawMat);
                list.add(newRawMaterial);

                UpdateItemByIdResponse response = UpdateItemByIdResponse
                        .newBuilder()
                        .setRawMaterial(newRawMaterial)
                        .build();

                // send the response to the client
                responseObserver.onNext(response);
                found = true;
                break;
            }
        }
        if (!found) {
            responseObserver.onError(Status
                    .NOT_FOUND
                    .withDescription("Item with id: " + id + " not found, update failed")
                    .asRuntimeException());
        } else {
            // complete the RPC call (Remote procedure call)
            responseObserver.onCompleted();
            latch.countDown();
        }

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void deleteRawMaterialById(DeleteItemByIdRequest request, StreamObserver<DeleteItemByIdResponse> responseObserver) {

        System.out.println("Received Get Raw Material by Id request");
        String id = request.getRawMaterialId();
        CountDownLatch latch = new CountDownLatch(1);

        boolean found = false;
        for (RawMaterial rawMat : list) {
            if (rawMat.getRawMaterialId().equals(id)) {

                list.remove(rawMat);

                DeleteItemByIdResponse response = DeleteItemByIdResponse
                        .newBuilder()
                        .setResult("DELETED: " + id)
                        .build();

                // send the response to the client
                responseObserver.onNext(response);
                found = true;
                break;
            }
        }
        if (!found) {
            responseObserver.onError(Status
                    .NOT_FOUND
                    .withDescription("Item with id: " + id + " not found, delete failed")
                    .asRuntimeException());
        } else {
            // complete the RPC call (Remote procedure call)
            responseObserver.onCompleted();
            latch.countDown();
        }

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // temporary method
    public void addFewItemsForTestingPurposes() {

        runOnce = false;

        String uuid = UUID.randomUUID().toString();
        RawMaterial tree = RawMaterial.newBuilder()
                .setRawMaterialId(uuid)
                .setRawMaterialName("Tree")
                .setRawMaterialsInStock(10000000)
                .setRawMaterialsVolume(50)
                .setRawMaterialsPrice(10.00)
                .build();

        String uuid2 = UUID.randomUUID().toString();
        RawMaterial screws = RawMaterial.newBuilder()
                .setRawMaterialId(uuid2)
                .setRawMaterialName("Metal")
                .setRawMaterialsInStock(10000000)
                .setRawMaterialsVolume(100)
                .setRawMaterialsPrice(2.00)
                .build();

        String uuid3 = UUID.randomUUID().toString();
        RawMaterial paint = RawMaterial.newBuilder()
                .setRawMaterialId(uuid3)
                .setRawMaterialName("Paint")
                .setRawMaterialsInStock(10000000)
                .setRawMaterialsVolume(200)
                .setRawMaterialsPrice(3.01)
                .build();

        list.add(tree);
        list.add(screws);
        list.add(paint);

    }

}
