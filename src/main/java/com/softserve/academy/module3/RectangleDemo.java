package com.softserve.academy.module3;

public class RectangleDemo {
    public static void main(String[] args) {
        // Creating a default rectangle
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Default rectangle:");
        System.out.println(defaultRectangle);

        // Creating a rectangle with specified dimensions
        Rectangle customRectangle = new Rectangle(5.0, 3.0);
        System.out.println("\nRectangle with dimensions 5.0 x 3.0:");
        System.out.println(customRectangle);

        // Entering data from keyboard
        System.out.println("\nEntering data for a new rectangle:");
        Rectangle userRectangle = new Rectangle();
        userRectangle.inputAndDisplayInfo();
    }
}
