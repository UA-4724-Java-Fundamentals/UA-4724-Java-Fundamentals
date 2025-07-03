package com.softserve.academy.module01.Homework05.Task1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть № програми яку виконати:\n1-Кількість днів в місяці" +
                "\n2-Сума і добуток чисел\n3-Позиція числа,пошук min та max, добуток парних чисел");
        try {
            int choice = sc.nextInt();
            if (choice != 1 && choice != 2 && choice != 3) {
                throw new Exception("Invalid choice");
            }
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

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
