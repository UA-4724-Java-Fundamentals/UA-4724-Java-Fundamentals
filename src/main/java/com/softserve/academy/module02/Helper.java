package com.softserve.academy.module02;

public class Helper {
    private static String message = "first";

    static {
        System.out.println("message = " + message);
        message = "second";
        System.out.println("Helper: static block done");
    }

    public Helper(String message) {
        this.message = message;
    }

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {
        System.out.println(message);
    }
}       