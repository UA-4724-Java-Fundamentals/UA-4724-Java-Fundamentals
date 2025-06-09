package com.softserve.academy.module00;

import java.util.Scanner;

public class TestInputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        String name = sc.nextLine();

        System.out.print("How old are you? ");
        int age = sc.nextInt();

        System.out.println("Hello " + name);
        System.out.println("You are " + age);

        sc.close();
    }
}
