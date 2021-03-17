package com.example.retailers;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class ShopServiceServer {

    public static void main(String[] args) throws IOException {

        // service registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        // Exposing a new service using JmDNS
        ServiceInfo serviceInfo = ServiceInfo.create(
                "_http._tcp.local.",
                "ShopService",
                9000,
                "ShopService");

        jmdns.registerService(serviceInfo);

        // crete the server
        Server server = ServerBuilder.forPort(serviceInfo.getPort())
                .addService(new ShopServiceImpl())
                .build();


        // start the server
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Server started on PORT: " + server.getPort());


        // listen for the shutdown request
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request...");
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));


        // wait for termination signal
        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
