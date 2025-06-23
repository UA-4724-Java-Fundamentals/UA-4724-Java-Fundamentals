package com.softserve.academy.module05tst;

import java.util.Scanner;

public class AppRandom {

    public static void main(String[] args) {
        int random = (int) (Math.random() * 10);
        System.out.println("random = " + random);
        //
        Scanner scanner = new Scanner(System.in);
        boolean isLoop = true;
        int k = -1;
        while (isLoop) {
            System.out.print("Enter number: ");
            k = scanner.nextInt();
            if (k == random) {
                break;
            } else if (k < random) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Too high, try again");
            }
        }
        System.out.println("You win !!!");
    }
}
