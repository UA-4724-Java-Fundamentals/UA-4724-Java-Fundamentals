package com.softserve.academy.homework12;

import java.util.Scanner;

public class PracticalTask1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the str1: ");
        String str1 = scanner.nextLine();
        System.out.print("Please enter the str2: ");
        String str2 = scanner.nextLine();

        System.out.println(isSubstring(str1.toLowerCase(), str2.toLowerCase()));
    }

    private static boolean isSubstring(String str1, String str2) {
        if (str1.isEmpty() || str2.isEmpty()) {
            System.out.println("Empty String");
            return false;
        }
        return str2.contains(str1);
    }
}
