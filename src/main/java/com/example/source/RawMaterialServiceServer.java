package com.example.source;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class RawMaterialServiceServer {

    public static void main(String[] args) throws IOException {

        // service registration
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create(
                "_http._tcp.local.",
                "RawMaterialService",
                9002,
                "RawMaterialService");

        jmdns.registerService(serviceInfo);

        // crete the server
        Server server = ServerBuilder.forPort(serviceInfo.getPort())
                .addService(new RawMaterialServiceImpl())
                .build();

        server.start();

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
