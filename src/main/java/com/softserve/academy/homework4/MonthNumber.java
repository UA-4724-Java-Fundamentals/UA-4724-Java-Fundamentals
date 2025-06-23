package com.softserve.academy.homework4;

import java.util.Scanner;

public class MonthNumber {
    static int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = sc.nextInt();
        if (0 < month & month <= 12) {
            System.out.println(months[month-1]);
        } else {
            System.out.println("Month must be from 1 to 12");
        }
    }
}
