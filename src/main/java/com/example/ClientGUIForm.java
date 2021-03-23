package com.example;

import com.example.rawMaterial.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ClientGUIForm extends JFrame {

    private JButton getAllProductsButton;
    private JTextArea productsTextArea;
    private JButton updateProductButton;
    private JTextField productIdTextField;
    private JPanel rootPanel;
    private JButton getMaterialsByIdButton1;
    private JButton updateRawMaterialButton;
    private JButton createDelieryButton;
    private JButton getDeliveryByIdButton;
    private JButton updateProductsButton;
    private JTextField rawMaterialIdTextField;
    private JTextField textField3;
    private JTextArea deliveryTextArea;
    private JTextArea rawMaterialsTextArea;
    private JProgressBar progressBar1;
    private JButton getProductsButton;
    private JButton getRawMaterialsButton;
    private JButton deleteRawMaterialButton;
    private JTextField rawMaterialNameTextField;
    private JTextField rawMaterialsInStockTextField;
    private JTextField rawMaterialsPriceTextField;
    private JTextField rawMaterialsVolumeTextField;
    private JTextField productNameJTextField;
    private JTextField productPriceJTextField;
    private JTextField productsInStockJTextField;
    private JButton createRawMaterialButton;

    public ClientGUIForm() {

        add(rootPanel);

        setTitle("Smart Supply Chain App");
        setSize(1200, 1200);

        // a gRPC channel provides a connection to a gRPC server on a specified host and port.
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9002)
                .usePlaintext()
                .build();

        createRawMaterialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
                        rawMaterialsTextArea.setText("");

                        rawMaterialsTextArea.setText(value.getResult());
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

                int rawMaterialsInStock = 0;
                double rawMaterialsPrice = 0;
                int rawMaterialsVolume = 0;

                if (rawMaterialsInStockTextField.getText().length() > 1){
                    rawMaterialsInStock = Integer.parseInt(rawMaterialsInStockTextField.getText());
                }
                if (rawMaterialsPriceTextField.getText().length() > 1){
                    rawMaterialsPrice = Double.parseDouble(rawMaterialsPriceTextField.getText());
                }
                if (rawMaterialsVolumeTextField.getText().length() > 1){
                    rawMaterialsVolume = Integer.parseInt(rawMaterialsVolumeTextField.getText());
                }

                request.onNext(CreateItemRequest.newBuilder()
                        .setRawMaterial(RawMaterial.newBuilder()
                                .setRawMaterialName(rawMaterialNameTextField.getText())
                                .setRawMaterialsInStock(rawMaterialsInStock)
                                .setRawMaterialsPrice(rawMaterialsPrice)
                                .setRawMaterialsVolume(rawMaterialsVolume)
                                .build())
                        .build());

                // tell the server that the client is done sending data
                request.onCompleted();

                try {
                    latch.await(3, TimeUnit.SECONDS);
                } catch (InterruptedException err) {
                    err.printStackTrace();
                }
            }
        });

        getRawMaterialsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                get all
                // create a greet service client (blocking - synchronous)
                RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
                client = RawMaterialServiceGrpc.newBlockingStub(channel);

                GetAllItemsRequest request = GetAllItemsRequest
                        .newBuilder()
                        .build();


                try {
                    rawMaterialsTextArea.setText("");
                    client.getAllRawMaterials(request).forEachRemaining(rawMaterialResponse -> {
                        String x = rawMaterialsTextArea.getText();
                        String y = x + "\n" + rawMaterialResponse.getRawMaterial();
                        rawMaterialsTextArea.setText(y);
                    });
                } catch (Exception err) {
                    System.out.println(err);
                }

            }
        });
        getMaterialsByIdButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // create a greet service client (blocking - synchronous)
                RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
                client = RawMaterialServiceGrpc.newBlockingStub(channel);


                // create a protocol buffer
                GetItemByIdRequest request = GetItemByIdRequest.newBuilder()
                        .setRawMaterialId(rawMaterialIdTextField.getText())
                        .build();


                // call the RPC and get back a Response (protocol buffers)
                try {
                    rawMaterialsTextArea.setText("");
                    GetItemByIdResponse response = client.getRawMaterialById(request);

                    // Print response
                    rawMaterialsTextArea.setText(response.getRawMaterial().toString());
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });
        updateRawMaterialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // create a greet service client (blocking - synchronous)
                RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
                client = RawMaterialServiceGrpc.newBlockingStub(channel);

                int rawMaterialsInStock = 0;
                double rawMaterialsPrice = 0;
                int rawMaterialsVolume = 0;

                if (rawMaterialsInStockTextField.getText().length() > 1){
                    rawMaterialsInStock = Integer.parseInt(rawMaterialsInStockTextField.getText());
                }
                if (rawMaterialsPriceTextField.getText().length() > 1){
                    rawMaterialsPrice = Double.parseDouble(rawMaterialsPriceTextField.getText());
                }
                if (rawMaterialsVolumeTextField.getText().length() > 1){
                    rawMaterialsVolume = Integer.parseInt(rawMaterialsVolumeTextField.getText());
                }

                // create a protocol buffer
                RawMaterial rawMaterial = RawMaterial.newBuilder()
                        .setRawMaterialId(rawMaterialIdTextField.getText())
                        .setRawMaterialName(rawMaterialNameTextField.getText())
                        .setRawMaterialsInStock(rawMaterialsInStock)
                        .setRawMaterialsPrice(rawMaterialsPrice)
                        .setRawMaterialsVolume(rawMaterialsVolume)
                        .build();


                UpdateItemByIdRequest request = UpdateItemByIdRequest.newBuilder()
                        .setRawMaterial(rawMaterial)
                        .build();


                try {
                    rawMaterialsTextArea.setText("");
                    // call the RPC and get back a GreetResponse (protocol buffers)
                    UpdateItemByIdResponse response = client.updateRawMaterialById(request);

                    // Print response
                    rawMaterialsTextArea.setText(response.getRawMaterial().toString());
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });
        deleteRawMaterialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // create a greet service client (blocking - synchronous)
                RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
                client = RawMaterialServiceGrpc.newBlockingStub(channel);


                // create a protocol buffer
                DeleteItemByIdRequest request = DeleteItemByIdRequest.newBuilder()
                        .setRawMaterialId(rawMaterialIdTextField.getText())
                        .build();


                try {
                    rawMaterialsTextArea.setText("");
                    // call the RPC and get back a Response (protocol buffers)
                    DeleteItemByIdResponse response = client.deleteRawMaterialById(request);


                    // Print response
                    rawMaterialsTextArea.setText(response.getResult());
                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });

    }
}
