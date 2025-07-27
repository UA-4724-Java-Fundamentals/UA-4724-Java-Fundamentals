package com.softserve.academy.module01.HW12;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть речення: ");
        String input = scanner.nextLine();

        String result = input.replaceAll("\\s+", " ");

        System.out.println("Виправленне речення:");
        System.out.println(result);
    }
}

