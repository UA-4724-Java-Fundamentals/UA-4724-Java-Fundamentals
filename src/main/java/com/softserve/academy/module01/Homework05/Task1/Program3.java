package com.softserve.academy.module01.Homework05.Task1;

import java.util.Scanner;

public class Program3 {

    public static void secondplus(int[] arr) {
        int counter1 = 0;
        int indx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                counter1++;
                if (counter1 == 2) {
                    indx = i;
                    break;
                }
            }
        }
        System.out.println("Позиція другого додатного числа: " + (indx + 1));

    }

    public static void min(int[] arr) {
        int indx = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indx = i;
            }
        }
        System.out.println("Мінімальне значення в масиві: " + min + " його позиція: " + (indx + 1));
    }

    public static void dobpar(int[] arr) {
        int dob = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                dob = dob * arr[i];
            }
        }
        System.out.println("Добуток усіх введених парних чисел:" + dob);
    }


    public static void run() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введіть елемнт" + (i + 1) + ":");
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        secondplus(arr);
        min(arr);
        dobpar(arr);


    }
}
