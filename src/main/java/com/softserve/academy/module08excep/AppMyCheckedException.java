package com.softserve.academy.module08excep;

public class AppMyCheckedException {

    static void doSomething(int num) throws MyCheckedException {
        if (num > 0) {
            int value = 100 / num;
        } else {
            // if the number is less than or equal to zero, throw an exception
            throw new MyCheckedException("Value must be greater than zero");
        }
    }

    public static void main(String[] args) {
        // /*
        try {
            doSomething(-1);
        } catch (MyCheckedException e) {
            System.err.print(e.getMessage());
        }
        // */
        //doSomething(-1);
    }
}

