package com.softserve.academy.module01.Homework12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3_patterncurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^\\$[0-9]+\\.[0-9]{2}$");
        String[] text = new String[3];

        for (int i = 0; i < text.length; i++) {
            System.out.println("Enter USA currency");
            text[i] = sc.nextLine();
        }
        for (String text1 : text) {
            if (pattern.matcher(text1).matches()) {
                System.out.println(text1);
            }
        }
    }
}
