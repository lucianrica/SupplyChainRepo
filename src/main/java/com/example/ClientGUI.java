package com.example;

import com.example.shop.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI implements ActionListener {

    public static void main(String[] args) {
        // create and build new Client GUI
        ClientGUI gui = new ClientGUI();
        gui.build();
    }

    private void build() {
        JFrame frame = new JFrame("Smart Supply Chain Management");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        // add background panel
        JPanel panel = new JPanel();

        // Set the BoxLayout to be X_AXIS: from left to right
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);

        // Set border for the panel
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));

        panel.add( getShopServiceJPanel() );

        // Set size for the frame
        frame.setSize(600, 600);

        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
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

        reply1 .setEditable(false);
        panel.add(reply1 );

        panel.setLayout(boxlayout);

        return panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        String label = button.getActionCommand();

        if (label.equals("Get Items")){
            System.out.println("Retrieving all items");


            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress("localhost", 9000)
                    .usePlaintext()
                    .build();


            ShopServiceGrpc.ShopServiceBlockingStub client = ShopServiceGrpc.newBlockingStub(channel);

            //preparing message to send
            GetProductsRequest request = GetProductsRequest.newBuilder().build();


            client.getProducts(request).forEachRemaining(product -> {
                System.out.println(product.getProduct());
                String x = reply1.getText();
                String y = x + "\n" + product.getProduct();
                reply1.setText( y );
            });

        }

//        if (label.equals("Get Item")){
//            System.out.println("Retrieving item");
//
//
//            ManagedChannel channel = ManagedChannelBuilder
//                    .forAddress("localhost", 9000)
//                    .usePlaintext()
//                    .build();
//
//
//            ShopServiceGrpc.ShopServiceBlockingStub client = ShopServiceGrpc.newBlockingStub(channel);
//
//            //preparing message to send
//            GetProductRequest request = GetProductRequest.newBuilder()
//                    .setProduct(entry2.getTe)
//                    .build();
//
//
//            client.getProducts(request).forEachRemaining(product -> {
//                System.out.println(product.getProduct());
//                String x = reply1.getText();
//                String y = x + "\n" + product.getProduct();
//                reply1.setText( y );
//            });
//
//            //preparing message to send
//            ds.service2.RequestMessage request = ds.service2.RequestMessage.newBuilder().setText(entry2.getText()).build();
//
//            //retreving reply from service
//            ds.service2.ResponseMessage response = blockingStub.service2Do(request);
//
//            reply2.setText( String.valueOf( response.getLength()) );
//
//        }


    }



















}
