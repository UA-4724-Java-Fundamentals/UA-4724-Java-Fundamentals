package com.softserve.academy.module01.Homework12.PracticalTasks;

import java.util.Scanner;

public class Task2_fullname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the last name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter the first name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter the middle name: ");
        String middleName = sc.nextLine();

        System.out.println(lastName + " " + firstName.charAt(0) + "." + middleName.charAt(0) + ".");
        System.out.println(firstName);
        System.out.println(firstName + " " + middleName + " " + lastName);

    }
}
