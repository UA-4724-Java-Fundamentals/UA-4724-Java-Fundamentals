package com.softserve.academy.module08excep;

public class AppEx {

    static double safeSqrt(double x) throws ArithmeticException {
        if (x < 0.0) {
            throw new IllegalArgumentException();
            //throw new ArithmeticException();
        }
        return Math.sqrt(x);
    }

    static double foo(double x) {
        double result = 0;
        try {
            result = safeSqrt(x);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.err.println("Error Founded = " + e);
            e.printStackTrace();
            result = -1;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\tresult: " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("safeSqrt(4) = " + safeSqrt(4));
        //System.out.println("safeSqrt(-4) = " + safeSqrt(-4));
        System.out.println("safeSqrt(-4) = " + foo(-4));
    }
}
 