package com.softserve.academy.module18server;

import java.net.URI;
import java.net.http.*;

public class MainClient {
    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/hello?mail=client"))
                //.uri(URI.create("http://localhost:8080/stop"))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            System.out.println("Status Code: " + statusCode);

            HttpHeaders headers = response.headers();
            System.out.println("Response Headers: " + headers);

            String responseBody = response.body();
            System.out.println("Response Body: " + responseBody);
        } catch (Exception e) {
            System.out.println("Error during request execution: " + e.getMessage());
        }
    }
}           