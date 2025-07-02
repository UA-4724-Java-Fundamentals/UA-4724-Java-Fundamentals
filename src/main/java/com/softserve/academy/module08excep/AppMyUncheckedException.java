package com.softserve.academy.module08excep;

public class AppMyUncheckedException {

    public static void doSomething(int num) {
        throw new MyUncheckedException("This is an unchecked exception");
    }

    public static void main(String[] args) {
        doSomething(-1);//here try-catch is not needed
    }
}