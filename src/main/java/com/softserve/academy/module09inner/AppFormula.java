package com.softserve.academy.module09inner;

interface Formula {
    double calculate(double a); // public abstract

    default double mysqrt(double a) {
        return Math.sqrt(a);
    }
}

class MyFormula implements Formula {

    @Override
    public double calculate(double a) {
        return mysqrt(a * 5);
    }
}

public class AppFormula {
    public static void main(String[] args) {
        //MyFormula formula = new MyFormula();
        //
        // /*
        Formula formula = new Formula() {
            @Override
            public double calculate(double a) {
                return mysqrt(a * 5);
            }
        };
        // */
        //
        double result = formula.calculate(20);
        System.out.println("Square root of 100 is " + result);

    }
}
                