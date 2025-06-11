package com.softserve.academy.module02;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a =: ");
        int a = scanner.nextInt();

        System.out.print("Enter b =: ");
        int b = scanner.nextInt();

        System.out.print("Enter c =: ");
        int c = scanner.nextInt();

        if (a < b) { // a<b
            if (a < c) { // a<b && a<c
                System.out.println(a);
            } else {  // a<b && a>c
                System.out.println(c);
            }
        } else if (b < c) { // a>b && b<c
            System.out.println(b);
        } else { // a>b && b>c
            System.out.println(c);
        }
    }
}
