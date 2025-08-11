package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task6 {
    public static String run(Scanner sc) {
        System.out.print("Введіть текст: ");
        String text = sc.nextLine().trim();
        if (text.isEmpty()) return "Слів: 0";
        int words = text.split("\\s+").length;
        return "Слів: " + words;
    }
}

