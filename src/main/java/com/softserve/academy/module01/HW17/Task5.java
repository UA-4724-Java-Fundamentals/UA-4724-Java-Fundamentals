package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task5 {
    public static String run(Scanner sc) {
        System.out.print("Введіть рядок: ");
        String str = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev) ? "Падіндром" : "Не паліндром";
    }
}

