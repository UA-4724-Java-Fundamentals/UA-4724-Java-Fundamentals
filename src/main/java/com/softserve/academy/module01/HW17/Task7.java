package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task7 {
    public static String run(Scanner sc) {
        System.out.print("Введіть число: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return n + "! = " + fact;
    }
}

