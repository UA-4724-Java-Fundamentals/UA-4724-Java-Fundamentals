package com.softserve.academy.homework12;

import java.util.Scanner;

public class PracticalTask2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter Last name,  First name  and Middle name: ");
        String str = scanner.nextLine();

        String[] strArr = str.split(" ");
        System.out.printf("Last name and initials: %s %c. %c.%n",
                strArr[0],
                strArr[1].charAt(0),
                strArr[2].charAt(0));
        System.out.println("First name: " + strArr[1]);
        System.out.println(
                "First name, middle name, and last name: "
                        .concat(strArr[0].concat(", "))
                        .concat(strArr[1].concat(", ")
                                .concat(strArr[2]).concat("."))
        );
    }
}
