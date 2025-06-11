package com.softserve.academy.module02;

public class MyMessage {

    // Overload
    public void printMessage() {
        System.out.println("No message provided");
    }

    // Overload
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Overload
    public void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Message: " + message);
        }
    }
} 