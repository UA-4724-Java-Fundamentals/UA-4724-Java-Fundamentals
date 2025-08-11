package com.softserve.academy.module01.HW17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1. Fibonacci sequence");
            System.out.println("2. Prime factorization");
            System.out.println("3. Currency exchange");
            System.out.println("4. Count vowels");
            System.out.println("5. Palindrome check");
            System.out.println("6. Word count");
            System.out.println("7. Factorial");
            System.out.println("8. Number to English");
            System.out.println("9. Random 0/1 counter");
            System.out.println("10. Collatz sequence steps");
            System.out.println("11. Credit card check");
            System.out.println("12. Sum of multiples of 3 or 5 below 1000");
            System.out.println("13. Smallest divisible number (1..20)");
            System.out.println("14. £2 coin combinations");
            System.out.println("0. Exit");
            System.out.print("Оберіть задачу: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            String result = "";
            switch (choice) {
                case 1 -> result = Task1.run(sc);
                case 2 -> result = Task2.run(sc);
                case 3 -> result = Task3.run(sc);
                case 4 -> result = Task4.run(sc);
                case 5 -> result = Task5.run(sc);
                case 6 -> result = Task6.run(sc);
                case 7 -> result = Task7.run(sc);
                case 8 -> result = Task8.run(sc);
                case 9 -> result = Task9.run(sc);
                case 10 -> result = Task10.run(sc);
                case 11 -> result = Task11.run(sc);
                case 12 -> result = Task12.run();
                case 13 -> result = Task13.run();
                case 14 -> result = Task14.run();
                default -> System.out.println("Хибний вибір!");
            }

            if (!result.isEmpty()) {
                System.out.println("Результат:\n" + result);
            }
        }
        sc.close();
    }
}
