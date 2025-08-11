package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task2 {
    public static String run(Scanner sc) {
        System.out.print("Введіть число: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= num; i++) {
            int count = 0;
            while (num % i == 0) {
                num /= i;
                count++;
            }
            if (count > 0) {
                sb.append(i);
                if (count > 1) sb.append("^").append(count);
                if (num > 1) sb.append(", ");
            }
        }
        return sb.toString();
    }
}
