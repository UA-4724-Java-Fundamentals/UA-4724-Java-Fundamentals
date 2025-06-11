package com.softserve.academy.module02;

public class AppRectangle {

    public static void swap(Rectangle rect) {
        System.out.println("start swap: " + rect);
        int temp = rect.getWidth();
        rect.setWidth(rect.getHeight());
        rect.setHeight(temp);
        System.out.println("end swap: " + rect);
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(25, 10);
        System.out.println("Before calling method 'swap': " + rectangle);
        swap(rectangle);
        System.out.println("After calling method 'swap': " + rectangle);
    }

}
    