package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task1 {
    public static String run(Scanner sc) {
        System.out.print("Введіть число: ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            sb.append(a);
            if (i < n - 1) sb.append(", ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        return sb.toString();
    }
}

