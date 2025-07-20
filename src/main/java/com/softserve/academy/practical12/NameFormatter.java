package com.softserve.academy.practical12;

import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine().trim();

        String initials = firstName.charAt(0) + "." + middleName.charAt(0) + ".";
        System.out.println("Last name and initials: " + lastName + " " + initials);

        System.out.println("First name: " + firstName);

        System.out.println("Full name: " + firstName + " " + middleName + " " + lastName);
    }
}

