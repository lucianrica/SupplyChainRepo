package com.example;

import java.awt.Color;
import javax.swing.border.LineBorder;

import com.example.delivery.DeliveryServiceGrpc;
import com.example.delivery.Van;
import com.example.delivery.VanRequest;
import com.example.delivery.VanResponse;
import com.example.rawMaterial.*;
import com.example.shop.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ClientGUIForm extends JFrame {

    private JButton getProductByIdButton;
    private JTextArea productsTextArea;
    private JButton updateProductButton;
    private JTextField productIdTextField;
    private JPanel rootPanel;
    private JButton getMaterialsByIdButton1;
    private JButton updateRawMaterialButton;
    private JButton createDelieryButton;
    private JButton updateProductsButton;
    private JTextField rawMaterialIdTextField;
    private JTextField requiredDriversTextField;
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
    private JButton updateButton;
    private JButton addAllButton;
    private JTextArea deliveryItemsTextArea;
    private JTextField vanCapacityTextField;
    private JRadioButton startedRadioButton;
    private JRadioButton notStartedRadioButton;
    private JRadioButton fulfilledRadioButton;
    private String tempItemsList;
    private boolean deliveryStarted = false;
    private boolean deliveryFulfilled = false;

    ArrayList<Product> productsList = new ArrayList<>();
    ArrayList<RawMaterial> rawMaterialsList = new ArrayList<>();

    public ClientGUIForm() {

        add(rootPanel);

        setTitle("Smart Supply Chain App");
        setSize(1600, 1000);

        // a gRPC channel provides a connection to a gRPC server on a specified host and port.
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9002)
                .usePlaintext()
                .build();

        // a gRPC channel provides a connection to a gRPC server on a specified host and port.
        ManagedChannel shopChannel = ManagedChannelBuilder
                .forAddress("localhost", 9000)
                .usePlaintext()
                .build();

        // a gRPC channel provides a connection to a gRPC server on a specified host and port.
        ManagedChannel deliveryChannel = ManagedChannelBuilder
                .forAddress("localhost", 9003)
                .usePlaintext()
                .build();


        createRawMaterialButton.addActionListener(e -> {

            int rawMaterialsInStock = 0;
            double rawMaterialsPrice = 0;
            int rawMaterialsVolume = 0;

            if (rawMaterialsInStockTextField.getText().length() > 0) {
                rawMaterialsInStock = Integer.parseInt(rawMaterialsInStockTextField.getText());
            }
            if (rawMaterialsPriceTextField.getText().length() > 0) {
                rawMaterialsPrice = Double.parseDouble(rawMaterialsPriceTextField.getText());
            }
            if (rawMaterialsVolumeTextField.getText().length() > 0) {
                rawMaterialsVolume = Integer.parseInt(rawMaterialsVolumeTextField.getText());
            }

            RawMaterial rawMaterial = RawMaterial.newBuilder()
                    .setRawMaterialName(rawMaterialNameTextField.getText())
                    .setRawMaterialsInStock(rawMaterialsInStock)
                    .setRawMaterialsPrice(rawMaterialsPrice)
                    .setRawMaterialsVolume(rawMaterialsVolume)
                    .build();

            rawMaterialsList.add(rawMaterial);


            String x = rawMaterialsTextArea.getText();
            String y = x + "\n" + "Raw Material added to Create list";
            rawMaterialsTextArea.setText(y);

        });

        addAllButton.addActionListener(e -> {


            // create a greet service client (blocking - synchronous)
            RawMaterialServiceGrpc.RawMaterialServiceStub client;
            client = RawMaterialServiceGrpc.newStub(channel);
            CountDownLatch latch = new CountDownLatch(1);

            StreamObserver<CreateItemRequest> request = client.createRawMaterial(new StreamObserver<>() {
                @Override
                public void onNext(CreateItemResponse value) {
                    // we get a response from the server
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


            rawMaterialsList.forEach(material -> {
                request.onNext(CreateItemRequest.newBuilder()
                        .setRawMaterial(material)
                        .build());
            });


            // tell the server that the client is done sending data
            request.onCompleted();

            try {
                latch.await(3, TimeUnit.SECONDS);
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
            rawMaterialsList.clear();
        });

        getRawMaterialsButton.addActionListener(e -> {
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
                err.printStackTrace();
            }

        });
        getMaterialsByIdButton1.addActionListener(e -> {
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
                err.printStackTrace();
            }
        });

        updateRawMaterialButton.addActionListener(e -> {
            // create a greet service client (blocking - synchronous)
            RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
            client = RawMaterialServiceGrpc.newBlockingStub(channel);

            int rawMaterialsInStock = 0;
            double rawMaterialsPrice = 0;
            int rawMaterialsVolume = 0;

            if (rawMaterialsInStockTextField.getText().length() > 0) {
                rawMaterialsInStock = Integer.parseInt(rawMaterialsInStockTextField.getText());
            }
            if (rawMaterialsPriceTextField.getText().length() > 0) {
                rawMaterialsPrice = Double.parseDouble(rawMaterialsPriceTextField.getText());
            }
            if (rawMaterialsVolumeTextField.getText().length() > 0) {
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
                err.printStackTrace();
            }
        });
        deleteRawMaterialButton.addActionListener(e -> {
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
                err.printStackTrace();
            }
        });

        // Products listeners ##################################


        getProductsButton.addActionListener(e -> {
            CountDownLatch latch = new CountDownLatch(1);

            // create a service client (blocking - synchronous)
            ShopServiceGrpc.ShopServiceBlockingStub client;
            client = ShopServiceGrpc.newBlockingStub(shopChannel);

            GetProductsRequest request = GetProductsRequest
                    .newBuilder()
                    .build();


            try {
                client.getProducts(request).forEachRemaining(getProductsResponse -> {
                    System.out.println(getProductsResponse.getProduct());
                });


                productsTextArea.setText("");
                client.getProducts(request).forEachRemaining(productsResponse -> {
                    String x = productsTextArea.getText();
                    String y = x + "\n" + productsResponse.getProduct();
                    productsTextArea.setText(y);
                });

            } catch (Exception err) {
                err.printStackTrace();
            }
        });
        getProductByIdButton.addActionListener(e -> {
            // create a greet service client (blocking - synchronous)
            ShopServiceGrpc.ShopServiceBlockingStub client;
            client = ShopServiceGrpc.newBlockingStub(shopChannel);


            double productPrice = 0;
            int productsInStock = 0;

            if (productPriceJTextField.getText().length() > 0) {
                productPrice = Double.parseDouble(productPriceJTextField.getText());
            }
            if (productsInStockJTextField.getText().length() > 0) {
                productsInStock = Integer.parseInt(productsInStockJTextField.getText());
            }


            // create a protocol buffer
            Product product = Product.newBuilder()
                    .setProductId(productIdTextField.getText())
                    .setProductName(productNameJTextField.getText())
                    .setProductPrice(productPrice)
                    .setProductsInStock(productsInStock)
                    .build();


            // create a protocol buffer
            GetProductRequest request = GetProductRequest.newBuilder()
                    .setProduct(product)
                    .build();


            try {

                productsTextArea.setText("");
                // call the RPC and get back a GreetResponse (protocol buffers)
                GetProductResponse response = client.getProduct(request);

                // Print response
                productsTextArea.setText(response.getProduct().toString());
            } catch (Exception err) {
                err.printStackTrace();
            }
        });
        updateProductButton.addActionListener(e -> {

            // create a greet service client (blocking - synchronous)
            ShopServiceGrpc.ShopServiceBlockingStub client;
            client = ShopServiceGrpc.newBlockingStub(shopChannel);


            double productPrice = 0;
            int productsInStock = 0;

            if (productPriceJTextField.getText().length() > 0) {
                productPrice = Double.parseDouble(productPriceJTextField.getText());
            }
            if (productsInStockJTextField.getText().length() > 0) {
                productsInStock = Integer.parseInt(productsInStockJTextField.getText());
            }


            // create a protocol buffer
            Product product = Product.newBuilder()
                    .setProductId(productIdTextField.getText())
                    .setProductName(productNameJTextField.getText())
                    .setProductPrice(productPrice)
                    .setProductsInStock(productsInStock)
                    .build();


            UpdateProductRequest request = UpdateProductRequest.newBuilder()
                    .setProduct(product)
                    .build();


            try {
                productsTextArea.setText("");
                // call the RPC and get back a GreetResponse (protocol buffers)
                UpdateProductResponse response = client.updateProduct(request);

                // Print response
                productsTextArea.setText(response.getProduct().toString());
            } catch (Exception err) {
                err.printStackTrace();
            }
        });
        updateProductsButton.addActionListener(e -> {

            double productPrice = 0;
            int productsInStock = 0;

            if (productPriceJTextField.getText().length() > 0) {
                productPrice = Double.parseDouble(productPriceJTextField.getText());
            }
            if (productsInStockJTextField.getText().length() > 0) {
                productsInStock = Integer.parseInt(productsInStockJTextField.getText());
            }

            Product product = Product.newBuilder()
                    .setProductId(productIdTextField.getText())
                    .setProductName(productNameJTextField.getText())
                    .setProductPrice(productPrice)
                    .setProductsInStock(productsInStock)
                    .build();

            productsList.add(product);


            String x = productsTextArea.getText();
            String y = x + "\n" + "Product added to Update list";
            productsTextArea.setText(y);

        });

        updateButton.addActionListener(e -> {
            productsTextArea.setText("");

            ShopServiceGrpc.ShopServiceStub client;
            client = ShopServiceGrpc.newStub(shopChannel);
            CountDownLatch latch = new CountDownLatch(1);

            StreamObserver<UpdateProductsRequest> request = client.updateProducts(new StreamObserver<UpdateProductsResponse>() {
                @Override
                public void onNext(UpdateProductsResponse value) {
                    System.out.println("Response from server: " + value.getProduct());


                    String x = productsTextArea.getText();
                    String y = x + "\n" + value.getProduct().toString();
                    productsTextArea.setText(y);


                }

                @Override
                public void onError(Throwable t) {
                    latch.countDown();
                    System.out.println(t);
                }

                @Override
                public void onCompleted() {
                    System.out.println("Server is done sending data");
                    latch.countDown();
                }
            });


            // streaming each entity
            productsList.forEach(item -> {
                request.onNext(UpdateProductsRequest.newBuilder()
                        .setProduct(item)
                        .build());
            });


            request.onCompleted();


            try {
                latch.await(3, TimeUnit.SECONDS);
            } catch (InterruptedException err) {
                err.printStackTrace();
            }
            productsList.clear();
        });

        productsInStockJTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                char kp = e.getKeyChar();
                if (kp == '1' || kp == '2' || kp == '3' || kp == '4' || kp == '5' || kp == '6' || kp == '7' || kp == '8' || kp == '9' || kp == '0') {
                    productsInStockJTextField.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                } else {
                    productsInStockJTextField.setBorder(new LineBorder(Color.RED, 2));
                }
            }
        });

        productPriceJTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                char kp = e.getKeyChar();
                System.out.println(kp);
                if (kp == '1' || kp == '2' || kp == '3' || kp == '4' || kp == '5' || kp == '6' || kp == '7' || kp == '8' || kp == '9' || kp == '0' || kp == '.') {
                    productPriceJTextField.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                } else {
                    productPriceJTextField.setBorder(new LineBorder(Color.RED, 2));
                }

            }
        });

        rawMaterialsInStockTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char kp = e.getKeyChar();
                if (kp == '1' || kp == '2' || kp == '3' || kp == '4' || kp == '5' || kp == '6' || kp == '7' || kp == '8' || kp == '9' || kp == '0') {
                    rawMaterialsInStockTextField.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                } else {
                    rawMaterialsInStockTextField.setBorder(new LineBorder(Color.RED, 2));
                }
            }
        });
        rawMaterialsPriceTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {


                char kp = e.getKeyChar();
                System.out.println(kp);
                if (kp == '1' || kp == '2' || kp == '3' || kp == '4' || kp == '5' || kp == '6' || kp == '7' || kp == '8' || kp == '9' || kp == '0' || kp == '.') {
                    rawMaterialsPriceTextField.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                } else {
                    rawMaterialsPriceTextField.setBorder(new LineBorder(Color.RED, 2));
                }
            }
        });
        rawMaterialsVolumeTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char kp = e.getKeyChar();
                if (kp == '1' || kp == '2' || kp == '3' || kp == '4' || kp == '5' || kp == '6' || kp == '7' || kp == '8' || kp == '9' || kp == '0') {
                    rawMaterialsVolumeTextField.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                } else {
                    rawMaterialsVolumeTextField.setBorder(new LineBorder(Color.RED, 2));
                }
            }
        });

//        addItemsIdComaButton.addActionListener(e -> {
//            String itemsIds = deliveryItemsTextArea.getText();
//            String[] arr = itemsIds.split(",");
//            String body = "[";
//            int count = 0;
//
//            for (String it : arr) {
//                if (count > 0) {
//                    body += ",";
//                }
//                body += "\"" + it + "\"";
//                count++;
//            }
//            body += "]";
//
//            tempItemsList = body;
//            System.out.println(tempItemsList);
//        });

        createDelieryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String itemsIds = deliveryItemsTextArea.getText();
                String[] arr = itemsIds.split(",");
                String body = "[";
                int count = 0;

                for (String it : arr) {
                    if (count > 0) {
                        body += ",";
                    }
                    body += "\"" + it + "\"";
                    count++;
                }
                body += "]";

                tempItemsList = body;
                System.out.println(tempItemsList);

                // create a greet service client (blocking - synchronous)
                DeliveryServiceGrpc.DeliveryServiceBlockingStub client;
                client = DeliveryServiceGrpc.newBlockingStub(deliveryChannel);

                int requiredDrivers = 0;
                boolean deliveringStarting = false;
                boolean deliveringFulfilled = false;
                int vanCapacity = 200;

                if (requiredDriversTextField.getText().length() > 0) {
                    requiredDrivers = Integer.parseInt(requiredDriversTextField.getText());
                }

                if (vanCapacityTextField.getText().length() > 0) {
                    vanCapacity = Integer.parseInt(vanCapacityTextField.getText());
                }


                // create a protocol buffer
                Van loadedVan = Van.newBuilder()
                        .setDelivering(deliveryStarted)
                        .setDrivers(requiredDrivers)
                        .setFulfilled(deliveryFulfilled)
                        .setItemId(tempItemsList)
                        .setVolume(vanCapacity)
                        .build();


                VanRequest request = VanRequest.newBuilder()
                        .setVan(loadedVan)
                        .build();


                client.createDelivery(request);

                try {
                    deliveryTextArea.setText("");
                    // call the RPC and get back a GreetResponse (protocol buffers)
                    VanResponse response = client.createDelivery(request);

                    // Print response
                    String x = deliveryTextArea.getText();
                    String y = x + "\n" + response.getVan().toString();
                    deliveryTextArea.setText(y);

                } catch (Exception err) {
                    System.out.println(err);
                }
            }
        });
        requiredDriversTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char kp = e.getKeyChar();
                if (kp == '1' || kp == '2' || kp == '3' || kp == '4' || kp == '5' || kp == '6' || kp == '7' || kp == '8' || kp == '9' || kp == '0') {
                    requiredDriversTextField.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                } else {
                    requiredDriversTextField.setBorder(new LineBorder(Color.RED, 2));
                }
            }
        });
        vanCapacityTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char kp = e.getKeyChar();
                if (kp == '1' || kp == '2' || kp == '3' || kp == '4' || kp == '5' || kp == '6' || kp == '7' || kp == '8' || kp == '9' || kp == '0') {
                    vanCapacityTextField.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
                } else {
                    vanCapacityTextField.setBorder(new LineBorder(Color.RED, 2));
                }
            }
        });

        notStartedRadioButton.setSelected(true);

        notStartedRadioButton.addItemListener(e -> {
            if (e.getStateChange() == 1) {
                deliveryStarted = false;
                startedRadioButton.setSelected(false);
                fulfilledRadioButton.setSelected(false);
            }
        });

        startedRadioButton.addItemListener(e -> {
            if (e.getStateChange() == 1) {
                deliveryStarted = true;
                notStartedRadioButton.setSelected(false);
                fulfilledRadioButton.setSelected(false);

            }
        });

        fulfilledRadioButton.addItemListener(e -> {
            if (e.getStateChange() == 1) {
                deliveryFulfilled = true;
                notStartedRadioButton.setSelected(false);
                startedRadioButton.setSelected(false);

            }
        });
    }
}
