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

}
