package com.softserve.academy.homework05;

import java.util.Scanner;

public class isPrimeNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of elements you want to enter: ");
        int number = scanner.nextInt();
        System.out.println(isPrime(number) ? "Is a prime number" : "Is not prime number");
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        long sqrt = (long) Math.sqrt(number);
        for (long i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }

        return true;
    }
}
