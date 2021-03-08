package com.example.raw_material.server;


import com.example.raw_material.CreateRawMaterialRequest;
import com.example.raw_material.CreateRawMaterialResponse;
import com.example.raw_material.RawMaterial;
import com.example.raw_material.RawMaterialServiceGrpc;
import com.example.raw_material.model.RawMaterialModel;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.UUID;

public class RawMaterialServiceImpl
        extends RawMaterialServiceGrpc.RawMaterialServiceImplBase {


//    ArrayList<RawMaterialModel> list = new ArrayList<>();
    ArrayList<RawMaterial> list = new ArrayList<>();


    @Override
    public void createRawMaterial(
            CreateRawMaterialRequest request,
            StreamObserver<CreateRawMaterialResponse> responseObserver) {


        // extract the raw material
        RawMaterial rawMaterial = request.getRawMaterial();


//        // model to save to array
//        RawMaterialModel dto = new RawMaterialModel();
//        String uuid = UUID.randomUUID().toString();
//        dto.setId(uuid);
//        dto.setName(rawMaterial.getName());
//        dto.setQuantity(rawMaterial.getQuantity());


        // add raw material to the list
        list.add(rawMaterial);
//        list.add(dto);


//        // create response obj
//        CreateRawMaterialResponse response =
//                RawMaterial
//                        .newBuilder()
//                        .setId()
//                        .setRawMaterial(rawMaterial)
//                        .build();

        // build the response
        CreateRawMaterialResponse response =
                CreateRawMaterialResponse
                        .newBuilder()
                        .setRawMaterial(rawMaterial)
                        .build();


        // send the response to the client
        responseObserver.onNext(response);



        // complete the RPC call (Remote procedure call)
        responseObserver.onCompleted();






    }
}
