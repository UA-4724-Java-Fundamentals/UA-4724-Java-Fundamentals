package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Task3 {
    public static String run(Scanner sc) {
        System.out.print("Введіть курс доллара: ");
        double rate = sc.nextDouble();
        System.out.print("Введіть сумму в гривнях: ");
        double uah = sc.nextDouble();
        int dollars = (int) (uah / rate);
        double change = uah - dollars * rate;
        return "Можете купити: " + dollars + " USD, здача: " + String.format("%.2f", change) + " грн";
    }
}

