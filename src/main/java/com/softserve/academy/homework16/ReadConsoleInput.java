package com.softserve.academy.homework16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleInput {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.print("Enter your text: ");
            String text = bufferedReader.readLine();
            System.out.println("Entered text: " + text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
