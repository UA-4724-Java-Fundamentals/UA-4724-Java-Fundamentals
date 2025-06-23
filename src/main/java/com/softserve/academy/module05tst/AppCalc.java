package com.softserve.academy.module05tst;

import java.util.Scanner;

public class AppCalc {

    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        //
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        //
        System.out.println("a + b = " + (a + b));
        sc.close();
        */
        //
        Calc calc = new Calc();
        int a = 5;
        int b = 5;
        System.out.println("a + b = " + calc.add(a, b));
        //
        a = 20;
        b = 5;
        System.out.println("a / b = " + calc.div(a, b));
        //
    }
}     