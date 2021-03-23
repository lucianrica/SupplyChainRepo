package com.example;

import com.example.rawMaterial.GetAllItemsRequest;
import com.example.rawMaterial.RawMaterialServiceGrpc;
import com.example.shop.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI implements ActionListener {


    JTextField textField;
    JTextField textField2;
    JTextField textField3;


    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        // create and build new Client GUI
//        ClientGUI gui = new ClientGUI();
//        gui.build();
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClientGUIForm clientGUIForm = new ClientGUIForm();
                clientGUIForm.setVisible(true);
            }
        });


    }

    private void build() {
        JFrame frame = new JFrame("Smart Supply Chain Management");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        // add background panel
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        // Set the BoxLayout to be X_AXIS: from left to right
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        BoxLayout boxlayout2 = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);
        panel.setLayout(boxlayout2);

        // Set border for the panel
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
        panel2.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

        panel.add(getShopServiceJPanel());
        panel2.add(getRawMaterialsJPanel());

        // Set size for the frame
        frame.setSize(400, 400);

        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);
    }

    private Component getRawMaterialsJPanel() {
        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);


//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//        entry1 = new JTextField("",10);
//        panel.add(entry1);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button = new JButton("Get Raw Materials");
        JButton button2 = new JButton("Get Item");
        JButton button3 = new JButton("Buy Item");
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        textField = new JTextField(8);
        panel.add(textField);
        textField2 = new JTextField(8);
        panel.add(textField2);
        textField3 = new JTextField(8);
        panel.add(textField3);


        reply1 = new JTextArea(0, 50);

        reply1.setEditable(false);
        panel.add(reply1);

        panel.setLayout(boxlayout);
        return panel;
    }


    private JTextArea entry1, reply1;

    private JPanel getShopServiceJPanel() {

        JPanel panel = new JPanel();

        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);


//        panel.add(Box.createRigidArea(new Dimension(10, 0)));
//        entry1 = new JTextField("",10);
//        panel.add(entry1);
//        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        JButton button = new JButton("Get Items");
        JButton button2 = new JButton("Get Item");
        JButton button3 = new JButton("Buy Item");
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        reply1 = new JTextArea(0, 50);

        reply1.setEditable(false);
        panel.add(reply1);

        panel.setLayout(boxlayout);

        return panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        String label = button.getActionCommand();

        if (label.equals("Get Items")) {
            System.out.println("Retrieving all items");


            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress("localhost", 9000)
                    .usePlaintext()
                    .build();


            ShopServiceGrpc.ShopServiceBlockingStub client = ShopServiceGrpc.newBlockingStub(channel);

            //preparing message to send
            GetProductsRequest request = GetProductsRequest.newBuilder().build();


            try {
                reply1.setText("");
                client.getProducts(request).forEachRemaining(product -> {
                    System.out.println(product.getProduct());
                    String x = reply1.getText();
                    String y = x + "\n" + product.getProduct();
                    reply1.setText(y);
                });
            } catch (Exception err) {
                System.out.println(err);
            }

        }

        if (label.equals("Get Item")) {
            System.out.println("Retrieving one item");


            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress("localhost", 9000)
                    .usePlaintext()
                    .build();




            // create a greet service client (blocking - synchronous)
            ShopServiceGrpc.ShopServiceBlockingStub client;
            client = ShopServiceGrpc.newBlockingStub(channel);



            Product product = Product.newBuilder()
                    .setProductId(textField.getText())
                    .build();

            // create a protocol buffer
            GetProductRequest request = GetProductRequest.newBuilder()
                    .setProduct(product)
                    .build();


            // call the RPC and get back a Response (protocol buffers)
            try {

                // Print response
                reply1.setText("");
                GetProductResponse response = client.getProduct(request);
                System.out.println(response.getProduct());
                    String x = reply1.getText();
                    String y = x + "\n" + response.getProduct();
                    reply1.setText(y);

            } catch (Exception err) {
                System.out.println(err);
            }










//            ShopServiceGrpc.ShopServiceBlockingStub client = ShopServiceGrpc.newBlockingStub(channel);
//
//            //preparing message to send
//            GetProductsRequest request = GetProductsRequest.newBuilder().build();
//
//            try {
//                reply1.setText("");
//                client.getProducts(request).forEachRemaining(product -> {
//                    System.out.println(product.getProduct());
//                    String x = reply1.getText();
//                    String y = x + "\n" + product.getProduct();
//                    reply1.setText(y);
//                });
//            } catch (Exception err) {
//                System.out.println(err);
//            }

        }

        if (label.equals("Get Raw Materials")) {
            System.out.println("Retrieving all raw materials");


            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress("localhost", 9002)
                    .usePlaintext()
                    .build();


            // create a greet service client (blocking - synchronous)
            RawMaterialServiceGrpc.RawMaterialServiceBlockingStub client;
            client = RawMaterialServiceGrpc.newBlockingStub(channel);

            GetAllItemsRequest request = GetAllItemsRequest
                    .newBuilder()
                    .build();


            try {
                reply1.setText("");
                client.getAllRawMaterials(request).forEachRemaining(rawMaterial -> {
                    System.out.println(rawMaterial.getRawMaterial());
                    String x = reply1.getText();
                    String y = x + "\n" + rawMaterial.getRawMaterial();
                    reply1.setText(y);
                });
            } catch (Exception err) {
                System.out.println(err);
            }

        }


    }


}
