package com.softserve.academy.module02;

public class AppMyMessage {

    public static void main(String[] args) {
        MyMessage obj = new MyMessage();
        obj.printMessage();
        obj.printMessage("Hello, world!");
        obj.printMessage("Java is awesome!", 3);
    }
}
   