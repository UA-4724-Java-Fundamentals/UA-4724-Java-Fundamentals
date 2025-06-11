package com.softserve.academy.module01;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Example usage of Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        scanner.close();


    }
}
