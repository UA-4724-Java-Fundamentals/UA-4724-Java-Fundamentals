package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task10 {
    public static String run(Scanner sc) {
        System.out.print("Введіть число (>1): ");
        long n = sc.nextLong();
        int steps = 0;
        while (n > 1) {
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            steps++;
        }
        return "Кроків: " + steps;
    }
}

