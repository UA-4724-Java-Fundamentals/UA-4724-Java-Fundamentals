package com.softserve.academy.module01.Homework05.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {
    public static void run() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 10 чисел");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ) {
            try {
                System.out.println("Число №" + (i + 1) + ":");
                list.add(sc.nextInt());
                i++;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }

        }
        boolean allPositive = true;
        for (int i = 0; i < 5; i++) {
            if (list.get(i) <= 0) {
                allPositive = false;
                break;
            }
        }

        if (allPositive) {
            int sumFirst = 0;
            for (int i = 0; i < 5; i++) {
                sumFirst += list.get(i);
            }
            System.out.println("Перші 5 елементів всі додатні.\nСума перших 5 елементів: " + sumFirst);
        } else {
            int prodLast = 1;
            for (int i = 5; i < 10; i++) {
                prodLast *= list.get(i);
            }
            System.out.println("Перші 5 елементів не всі додатні.\nДобуток останніх 5 елементів: " + prodLast);
        }

    }
}
