package com.softserve.academy.homework12;

import java.util.Scanner;

public class SpaceNormalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with multiple spaces:");
        String input = scanner.nextLine();
        String normalized = input.trim().replaceAll("\\s+", " ");
        System.out.println("Normalized sentence: " + normalized);
    }
}

