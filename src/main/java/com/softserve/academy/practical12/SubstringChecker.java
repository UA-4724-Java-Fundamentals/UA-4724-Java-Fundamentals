package com.softserve.academy.practical12;

import java.util.Scanner;

public class SubstringChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String sub = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String full = scanner.nextLine();

        boolean isSubstring = full.contains(sub);
        System.out.println("Is first string a substring of the second? " + isSubstring);
    }
}
