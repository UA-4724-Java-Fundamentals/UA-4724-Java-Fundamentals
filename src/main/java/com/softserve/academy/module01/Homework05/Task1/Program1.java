package com.softserve.academy.module01.Homework05.Task1;

import java.util.Scanner;

public class Program1 {

    private int numMonth;
    private final int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public void setNumMonth(int numMonth) {
        this.numMonth = numMonth;
    }

    public int getNumMonth() {
        return numMonth;
    }

    public int getDaysInMonth() {
        return daysOfMonth[numMonth - 1];

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть номер місяця:");
        int num = sc.nextInt();
        setNumMonth(num);
        System.out.println("В цьому місяці: " + getDaysInMonth() + " днів");
    }


}
