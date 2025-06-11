package com.softserve.academy.module02;

public class AppParameter {

    public static void swap(int w, int h) {
        int temp = w;
        w = h;
        h = temp;
        System.out.println("swap: width = " + w + "\theight = " + h);
    }

    public static void main(String[] args) {
        int width = 25;
        int height = 10;
        //
        System.out.println("Before calling method 'swap': " + "width = " + width + "\tand height = " + height);
        swap(width, height);
        System.out.println("After calling method 'swap': " + "width = " + width + "\tand height = " + height);
    }

}   