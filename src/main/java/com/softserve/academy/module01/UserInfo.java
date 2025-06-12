package com.softserve.academy.module01;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        //
        System.out.println("Where do you live, [name]");
        String address = scanner.nextLine();
        //
        System.out.println("Name:" + name);
        System.out.println("Address:" + address);

        scanner.close();




    }
}
