package com.example.suppliers.server;

import com.example.raw_material.*;
import com.example.supply_material.GetRawMaterialsRequest;
import com.example.supply_material.GetRawMaterialsResponse;
import com.example.supply_material.SupplyMaterialGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;

public class SupplyMaterialImpl extends SupplyMaterialGrpc.SupplyMaterialImplBase {

    boolean runOnce = true;
    ArrayList<RawMaterial> list = new ArrayList<>();

    @Override
    public StreamObserver<GetRawMaterialsRequest> getRawMaterials(
            StreamObserver<GetRawMaterialsResponse> responseObserver) {

        StreamObserver<GetRawMaterialsRequest> requestObserver = new StreamObserver<GetRawMaterialsRequest>() {
            @Override
            public void onNext(GetRawMaterialsRequest value) {

                ManagedChannel channel = ManagedChannelBuilder
                        .forAddress("localhost", 9002)
                        .usePlaintext()
                        .build();


                // create a greet service client (blocking - synchronous)
                RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
                client = RawMaterialServiceGrpc.newBlockingStub(channel);

                RawMaterialRequest request = RawMaterialRequest
                        .newBuilder()
                        .build();


                client.getRawMaterials(request).forEachRemaining(rawMaterialResponse ->{
                    System.out.println(rawMaterialResponse.getRawMaterial());
                });


                channel.shutdown();
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestObserver;

    }
}
