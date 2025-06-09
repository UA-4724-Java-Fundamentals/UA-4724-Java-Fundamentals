package com.softserve.academy.module00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Reading a line of text
        System.out.print("text = ");
        String text = br.readLine();
        // Reading and parsing an integer
        System.out.print("age = ");
        int age = Integer.parseInt(br.readLine());

        // Reading and parsing a double
        System.out.print("temperature = ");
        double temperature = Double.parseDouble(br.readLine());
        
        // Displaying the input values
        System.out.println("Text: " + text);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
    }
}