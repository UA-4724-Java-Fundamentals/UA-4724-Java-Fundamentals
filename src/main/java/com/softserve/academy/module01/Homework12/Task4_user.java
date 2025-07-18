package com.softserve.academy.module01.Homework12;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task4_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        StringBuilder str = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-zA-Z- ]+");

        String fullname = " ";
        boolean flag = true;
        while (flag) {
            System.out.println("Enter fullname of people");
            fullname = sc.nextLine();
            if (pattern.matcher(fullname).matches()) {
                str.append(fullname).append("\n");
                flag = false;
            } else {
                System.out.println("Enter valid name of people. Try again");
            }
        }

        String[] str2 = new String[5];
        str2[0] = "Hello";
        str2[1] = "Hi";
        str2[2] = "Ciao";
        str2[3] = "Bonjour";
        str2[4] = "Hola";

        int number = rand.nextInt(str2.length);
        System.out.printf("%s %s", str2[number], fullname);

    }
}
