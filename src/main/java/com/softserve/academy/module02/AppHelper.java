package com.softserve.academy.module02;

public class AppHelper {

    static {
        System.out.println("AppHelper: static block done");
    }

    public static void main(String[] args) {
        System.out.println("start main");
        //
        Helper.setMessage("hello");
        Helper.print();
        //
        // Not recommended
        Helper helper = new Helper("end");
        helper.setMessage("new message");
        helper.print();
    }
}     