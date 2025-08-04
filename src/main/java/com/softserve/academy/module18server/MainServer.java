package com.softserve.academy.module18server;

import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

class MainServer {
    public static void main(String[] args) throws Exception {
        //
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 100);
        server.createContext("/hello", exchange -> {
            System.out.println("Request from '" +
                    exchange.getRemoteAddress() + "': " +
                    exchange.getRequestMethod() + " " +
                    exchange.getRequestURI());
            //
            System.out.println("RequestHeaders = " + exchange.getRequestHeaders().entrySet());
            System.out.println("getRequestMethod = " + exchange.getRequestMethod());
            //
            String box = (String) exchange.getAttribute("box");
            if (box != null && box.length() > 0) {
                System.out.println("\n\tbox = " + box);
            }
            //
           String query = exchange.getRequestURI().getQuery();
            System.out.println("query = " + query);
            if (query != null) {
                Map<String, String> parms = new HashMap<>();
                for (String param : query.split("&")) {
                    String[] entry = param.split("=");
                    if (entry.length > 1) {
                        parms.put(entry[0], entry[1]);
                    } else {
                        parms.put(entry[0], "");
                    }
                }
                for (Map.Entry<String, String> entry : parms.entrySet()) {
                    System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
                }
            }
            //
            InputStream input = exchange.getRequestBody();
            StringBuilder stringBuilder = new StringBuilder();
            new BufferedReader(new InputStreamReader(input))
                    .lines()
                    .forEach( (String s) -> stringBuilder.append(s + "\n") );
            System.out.println("\nBody:\n" + stringBuilder);
            // TODO split parameters
            //
            var response = "<b>Hello</b>, HTTP world!".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            exchange.setAttribute("Content-Type", "text/html");
            //exchange.setAttribute("Content-Type", "application/zip");
            exchange.getResponseBody().write(response);
        });
        //
        server.createContext("/stop", exchange -> {
            var response = "By!".getBytes();
            exchange.sendResponseHeaders(200, response.length);
            exchange.getResponseBody().write(response);
            System.out.println("getRequestMethod = " + exchange.getRequestMethod());
            System.out.println("Stopping the server. By!");
            server.stop(1);
        });
        //
        server.start();
        System.out.println("start server");
    }
}
         