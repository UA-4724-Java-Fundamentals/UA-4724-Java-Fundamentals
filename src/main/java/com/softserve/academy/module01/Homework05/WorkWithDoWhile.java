package com.softserve.academy.module01.Homework05;

import java.util.Scanner;

public class WorkWithDoWhile {
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        int in;
        int a;
        int b;

        do {
            System.out.println("Хочете виконати програму?\nтак-1 ні-2\n");
            in = sc.nextInt();
            sc.nextLine();

            if (in == 1) {
                try{
                    System.out.println("Введіть 2 числа");
                    a = sc.nextInt();
                    sc.nextLine();
                    b = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Їх сума=" + (a + b));
                }catch (Exception e) {
                    sc.nextLine();
                    throw new Exception("Please enter a number.");
                }

            }
            if (in != 1 && in != 2) {
                System.out.println("Введіть коректне значення");
            }


        } while (in != 2);
    }
}
