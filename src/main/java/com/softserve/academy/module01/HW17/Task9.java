package com.softserve.academy.module01.HW17;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static String run(Scanner sc) {
        System.out.print("Введіть n: ");
        int n = sc.nextInt();
        Random rnd = new Random();
        int ones = 0;
        for (int i = 0; i < n; i++) {
            int val = rnd.nextInt(2);
            if (val == 1) ones++;
        }
        return "Кількість одиниць: " + ones;
    }
}

