package com.softserve.academy.homework05;

public class GrassHopper {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }

    public static int summation(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            result += i;
        }
        return result;
    }
}
