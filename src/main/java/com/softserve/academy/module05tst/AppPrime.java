package com.softserve.academy.module05tst;

import java.util.Scanner;

public class AppPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("input k = ");
        int k = Math.abs(scanner.nextInt());
        //
        boolean isPrime = false;
        if ((k != 0) && (k != 1)) {
            isPrime = true;
            for (int i = 3; i <= (int) (Math.sqrt(k) + 0.1); i = i + 2) {
                System.out.print(i + "  ");
                if (k % i == 0) {
                    System.out.print(k + " % " + i + " == 0");
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.print("\nisPrime = " + isPrime);
    }
}
