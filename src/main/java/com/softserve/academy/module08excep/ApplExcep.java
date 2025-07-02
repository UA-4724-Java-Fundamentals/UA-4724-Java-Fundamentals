package com.softserve.academy.module08excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplExcep {

    public static void main(String[] args) {
        //
        double d = 0.0;
        System.out.println("1 / d = " + 1 / d);
        //
        int i = 0;
        try {
            i = 10 / i;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("i = " + i);
        //
        int[] arr = new int[5];
        arr[0] = 1;
        try {
            System.out.println("arr[10] = " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        //
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int k = Integer.parseInt(br.readLine());
    }
}
