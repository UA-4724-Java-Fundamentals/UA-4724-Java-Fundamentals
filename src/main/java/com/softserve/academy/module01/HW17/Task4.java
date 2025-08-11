package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task4 {
    public static String run(Scanner sc) {
        System.out.print("Введіть строку: ");
        String text = sc.nextLine().toLowerCase();
        int count = 0;
        for (char c : text.toCharArray()) {
            if ("aeiouаеєиіїоуюя".indexOf(c) >= 0) count++;
        }
        return "Кількість голосних: " + count;
    }
}
