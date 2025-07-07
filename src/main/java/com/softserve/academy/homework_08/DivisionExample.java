package com.softserve.academy.homework_08;

public class DivisionExample {
    public static double div(double a, double b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Warning! Dividing by zero!");
        }
        return a/b;
    }
}
