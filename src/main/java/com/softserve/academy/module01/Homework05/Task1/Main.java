package com.softserve.academy.module01.Homework05.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть № програми яку виконати:\n1-Кількість днів в місяці" +
                "\n2-Сума і добуток чисел\n3-Позиція числа,пошук min та max, добуток парних чисел");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                new Program1().run();
                break;
            case 2:
                new Program2().run();
                break;
            case 3:
                new Program3().run();
                break;
            default:

        }
    }
}
