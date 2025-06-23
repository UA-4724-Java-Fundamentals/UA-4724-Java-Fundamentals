package com.softserve.academy.module05tst;

import java.util.Scanner;

public class AppPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("input k = ");
        int k = scanner.nextInt();
        //
        boolean isPrime = true;
        for (int i = 2; i < (int) Math.sqrt(k); i = i + 2) {
            if (k % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.print("isPrime = " + isPrime);
    }
}
