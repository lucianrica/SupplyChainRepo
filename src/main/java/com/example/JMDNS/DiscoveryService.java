package com.example.JMDNS;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

public class DiscoveryService implements ServiceListener {


    public void serviceAdded(ServiceEvent event) {

        System.out.println("Service added: " + event.getType() + event.getName());

    }


    public void serviceRemoved(ServiceEvent event) {
        System.out.println("Service removed: " + event.getInfo());
    }


    public void serviceResolved(ServiceEvent event) {
        System.out.println("Service resolved: " + event.getInfo());

        ServiceInfo info = event.getInfo();
        int port = info.getPort();
        String path = info.getNiceTextString();

//        String[] serviceUrls = event.getInfo().getURLs();
//        for (String url : serviceUrls) {
//            System.out.println(url);
//        }

        String url = "http://localhost:" + port + "/" + path;
        System.out.println(" --- sending request to " + url);


    }

    public static void main(String[] args) throws InterruptedException {
        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());


            // Add a service listener
            jmdns.addServiceListener("_http._tcp.local.",
                    new DiscoveryService());

            System.out.println("Listening");


        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
