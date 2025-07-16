package com.softserve.academy.module01.Homework12.PracticalTasks;

import java.util.Scanner;

public class Task1_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter second string");
        String s2 = sc.nextLine();

        System.out.println("s2 contains s1: " + s2.contains(s1));
    }
}
