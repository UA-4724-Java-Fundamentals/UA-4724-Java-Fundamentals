package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task11 {
    public static String run(Scanner sc) {
        System.out.print("Введіть номер картки: ");
        String card = sc.nextLine().replaceAll("\\s+", "");
        if (!card.matches("\\d+")) return "Хибний формат!";
        return luhnCheck(card) ? "Картка правильна" : "Картка хибна";
    }

    private static boolean luhnCheck(String num) {
        int sum = 0;
        boolean alt = false;
        for (int i = num.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(num.substring(i, i + 1));
            if (alt) {
                n *= 2;
                if (n > 9) n -= 9;
            }
            sum += n;
            alt = !alt;
        }
        return sum % 10 == 0;
    }
}
