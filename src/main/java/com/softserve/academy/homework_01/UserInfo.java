package com.softserve.academy.homework_01;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the name and address
        System.out.println("What is your name?"
        );
        String name = sc.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = sc.nextLine();

        // Output the complete information
        System.out.println("Name: " + name + ", Address: " + address);

        // Close the scanner
        sc.close();

    }

}
