package com.example.raw_material.server;


import com.example.raw_material.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class RawMaterialServiceImpl
        extends RawMaterialServiceGrpc.RawMaterialServiceImplBase {

    boolean runOnce = true;
    ArrayList<RawMaterial> list = new ArrayList<>();


    @Override
    public void createRawMaterial(
            CreateRawMaterialRequest request,
            StreamObserver<CreateRawMaterialResponse> responseObserver) {

        if (runOnce) {
            // TODO remove when promoting to prod, adding few items to help populate the list for developing app
            addFewItemsForTestingPurposes();
            runOnce = false;
        }

        // extract the raw material
        System.out.println("Received Create Raw Material request");
        RawMaterial rawMaterial = request.getRawMaterial();


        // mutate the rawMaterial from received request to add id
        String uuid = UUID.randomUUID().toString();
        rawMaterial = rawMaterial.toBuilder().setId(uuid).build();


        // add rawMaterial to the list/repo
        list.add(rawMaterial);


        // build the response
        CreateRawMaterialResponse response =
                CreateRawMaterialResponse.newBuilder()
                        .setRawMaterial(rawMaterial)
                        .build();


        // send the response to the client
        responseObserver.onNext(response);
        // complete the RPC call (Remote procedure call)
        responseObserver.onCompleted();
    }


    @Override
    public void getRawMaterials(
            RawMaterialRequest request,
            StreamObserver<RawMaterialResponse> responseObserver) {


        if (runOnce) {
            // TODO remove, adding few items to help populate the list for developing app
            addFewItemsForTestingPurposes();
            runOnce = false;
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
                RawMaterialResponse response = RawMaterialResponse
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
    public void getRawMaterialById(GetRawMaterialByIdRequest request, StreamObserver<GetRawMaterialByIdResponse> responseObserver) {

        System.out.println("Received Get Raw Material by Id request");
        String id = request.getRawMaterialId();
        CountDownLatch latch = new CountDownLatch(1);

        boolean found = false;
        for (RawMaterial rawMat : list) {
            if (rawMat.getId().equals(id)) {
                GetRawMaterialByIdResponse response = GetRawMaterialByIdResponse
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
    public void updateRawMaterialById(
            UpdateRawMaterialByIdRequest request,
            StreamObserver<UpdateRawMaterialByIdResponse> responseObserver) {


        System.out.println("Received Update Raw Material by Id request");
        RawMaterial rawMaterial = request.getRawMaterial();
        String id = rawMaterial.getId();
        CountDownLatch latch = new CountDownLatch(1);


        boolean found = false;
        for (RawMaterial rawMat : list) {
            if (rawMat.getId().equals(id)) {
                RawMaterial newRawMaterial = RawMaterial
                        .newBuilder()
                        .setId(id)
                        .setName(rawMaterial.getName())
                        .setQuantity(rawMaterial.getQuantity())
                        .setWidth(rawMaterial.getWidth())
                        .setDepth(rawMat.getDepth())
                        .setLength(rawMat.getLength())
                        .build();

                list.remove(rawMat);
                list.add(newRawMaterial);

                UpdateRawMaterialByIdResponse response = UpdateRawMaterialByIdResponse
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
    public void deleteRawMaterialById(DeleteRawMaterialByIdRequest request, StreamObserver<DeleteRawMaterialByIdResponse> responseObserver) {

        System.out.println("Received Get Raw Material by Id request");
        String id = request.getRawMaterialId();
        CountDownLatch latch = new CountDownLatch(1);

        boolean found = false;
        for (RawMaterial rawMat : list) {
            if (rawMat.getId().equals(id)) {

                list.remove(rawMat);

                DeleteRawMaterialByIdResponse response = DeleteRawMaterialByIdResponse
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

    // easy test method
    private void addFewItemsForTestingPurposes() {

        String uuid = UUID.randomUUID().toString();
        RawMaterial tree = RawMaterial.newBuilder()
                .setId(uuid)
                .setName("Tree")
                .setQuantity(10000000)
                .setDepth(50)
                .setWidth(50)
                .setLength(2000)
                .build();

        String uuid2 = UUID.randomUUID().toString();
        RawMaterial screws = RawMaterial.newBuilder()
                .setId(uuid2)
                .setName("Metal")
                .setQuantity(10000000)
                .setDepth(100)
                .setWidth(100)
                .setLength(4000)
                .build();

        String uuid3 = UUID.randomUUID().toString();
        RawMaterial metalJoints = RawMaterial.newBuilder()
                .setId(uuid3)
                .setName("Paint")
                .setQuantity(10000000)
                .setDepth(200)
                .setWidth(100)
                .setLength(100)
                .build();

        list.add(tree);
        list.add(screws);
        list.add(metalJoints);

    }


}
