package com.example.processors;

import com.example.factory.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class FactoryServiceImpl extends FactoryServiceGrpc.FactoryServiceImplBase {

    boolean runOnce = true;
    ArrayList<Product> listOfProducts = new ArrayList<>();
    ArrayList<RawMaterial> rawMaterialsList= new ArrayList<>();

    public void addMockData() {
        runOnce = false;

        String uuid = UUID.randomUUID().toString();
        Product table = Product.newBuilder()
                .setProductId(uuid)
                .setProductName("Table")
                .setProductsInStock(20)
                .setProductPrice(199.00)
                .build();

        String uuid2 = UUID.randomUUID().toString();
        Product chair = Product.newBuilder()
                .setProductId(uuid2)
                .setProductName("Chair")
                .setProductsInStock(80)
                .setProductPrice(49.00)
                .build();

        String uuid3 = UUID.randomUUID().toString();
        Product couch = Product.newBuilder()
                .setProductId(uuid3)
                .setProductName("Couch")
                .setProductsInStock(10)
                .setProductPrice(499.99)
                .build();

        listOfProducts.add(table);
        listOfProducts.add(chair);
        listOfProducts.add(couch);

        String uuid4 = UUID.randomUUID().toString();
        RawMaterial tree = RawMaterial.newBuilder()
                .setRawMaterialId(uuid4)
                .setRawMaterialName("Tree")
                .setRawMaterialsInStock(10000000)
                .setRawMaterialsVolume(50)
                .setRawMaterialsPrice(10.00)
                .build();

        String uuid5 = UUID.randomUUID().toString();
        RawMaterial screws = RawMaterial.newBuilder()
                .setRawMaterialId(uuid5)
                .setRawMaterialName("Metal")
                .setRawMaterialsInStock(10000000)
                .setRawMaterialsVolume(100)
                .setRawMaterialsPrice(2.00)
                .build();

        String uuid6 = UUID.randomUUID().toString();
        RawMaterial paint = RawMaterial.newBuilder()
                .setRawMaterialId(uuid6)
                .setRawMaterialName("Paint")
                .setRawMaterialsInStock(10000000)
                .setRawMaterialsVolume(200)
                .setRawMaterialsPrice(3.01)
                .build();

        rawMaterialsList.add(tree);
        rawMaterialsList.add(screws);
        rawMaterialsList.add(paint);
    }


    @Override
    public StreamObserver<UpdateProductsRequest> updateProducts(StreamObserver<UpdateProductsResponse> responseObserver) {

        // get each request from client
        StreamObserver<UpdateProductsRequest> request = new StreamObserver<>() {
            @Override
            public void onNext(UpdateProductsRequest value) {

                Product updateProduct = value.getProduct();

                String id = updateProduct.getProductId();

                for (Product product : listOfProducts) {
                    if (product.getProductId().equals(id)) {
                        listOfProducts.remove(product);
                        listOfProducts.add(updateProduct);
                        break;
                    }
                }

                UpdateProductsResponse response = UpdateProductsResponse.newBuilder()
                        .setProduct(updateProduct)
                        .build();

                responseObserver.onNext(response);
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
                responseObserver.onCompleted();
            }

        };

        return request;


    }

    @Override
    public void getProducts(GetProductsRequest request, StreamObserver<GetProductsResponse> responseObserver) {

        // add mock data
        if (runOnce) {
            addMockData();
        }


        // delay closing the connection
        CountDownLatch latch = new CountDownLatch(1);
        System.out.println("...getting all products");


        if (listOfProducts.isEmpty()) {
            // send NOT_FOUND message
            responseObserver.onError(Status.NOT_FOUND
                    .withDescription("We don't have any products in the factory")
                    .asRuntimeException());
            return;

        } else {
            for (Product product : listOfProducts) {
                // build the response
                GetProductsResponse response = GetProductsResponse
                        .newBuilder()
                        .setProduct(product)
                        .build();


                // send the response to the client
                responseObserver.onNext(response);
            }

            // complete the RPC call (Remote procedure call)
            responseObserver.onCompleted();
            latch.countDown();
            System.out.println("products response sent");
        }

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getProduct(GetProductRequest request, StreamObserver<GetProductResponse> responseObserver) {
        System.out.println("...looking for product id");
        String id = request.getProduct().getProductId();
        CountDownLatch latch = new CountDownLatch(1);

        boolean found = false;
        for (Product product : listOfProducts) {
            if (product.getProductId().equals(id)) {
                GetProductResponse response = GetProductResponse
                        .newBuilder()
                        .setProduct(product)
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
                    .withDescription("Product with id: " + id + " not found")
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
    public void updateProduct(UpdateProductRequest request, StreamObserver<UpdateProductResponse> responseObserver) {

        System.out.println("...updating product");
        String id = request.getProduct().getProductId();
        CountDownLatch latch = new CountDownLatch(1);


        boolean found = false;
        for (Product product : listOfProducts) {
            if (product.getProductId().equals(id)) {
                Product updateProduct = Product.newBuilder()
                        .setProductId(request.getProduct().getProductId())
                        .setProductName(request.getProduct().getProductName())
                        .setProductsInStock(request.getProduct().getProductsInStock())
                        .setProductPrice(request.getProduct().getProductPrice())
                        .build();

                listOfProducts.remove(product);
                listOfProducts.add(updateProduct);

                UpdateProductResponse response = UpdateProductResponse.newBuilder()
                        .setProduct(updateProduct)
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


    //    raw materials section
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
                rawMaterialsList.add(rawMaterial);
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
            addMockData();
        }

        CountDownLatch latch = new CountDownLatch(1);


        // extract the raw material
        System.out.println("Received Get all Raw Materials request");


        if (rawMaterialsList.isEmpty()) {
            // send NOT_FOUND message
            responseObserver.onError(Status
                    .NOT_FOUND
                    .withDescription("We do not have any raw materials in the list")
                    .asRuntimeException());
            return;

        } else {
            for (RawMaterial rawMat : rawMaterialsList) {
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
        for (RawMaterial rawMat : rawMaterialsList) {
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
        for (RawMaterial rawMat : rawMaterialsList) {
            if (rawMat.getRawMaterialId().equals(id)) {
                RawMaterial newRawMaterial = RawMaterial.newBuilder()
                        .setRawMaterialId(id)
                        .setRawMaterialName(rawMaterial.getRawMaterialName())
                        .setRawMaterialsInStock(rawMaterial.getRawMaterialsInStock())
                        .setRawMaterialsVolume(rawMaterial.getRawMaterialsVolume())
                        .setRawMaterialsPrice(rawMat.getRawMaterialsPrice())
                        .build();

                rawMaterialsList.remove(rawMat);
                rawMaterialsList.add(newRawMaterial);

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
        for (RawMaterial rawMat : rawMaterialsList) {
            if (rawMat.getRawMaterialId().equals(id)) {

                rawMaterialsList.remove(rawMat);

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
}
