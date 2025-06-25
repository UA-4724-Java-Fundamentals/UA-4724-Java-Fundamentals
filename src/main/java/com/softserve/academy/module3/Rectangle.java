package com.softserve.academy.module3;

import java.util.Scanner;

/**
 * Practical task: Creating a class for working with rectangles
 * <p>
 * Develop a Rectangle class that represents a rectangle with specific dimensions.
 * The class should allow:
 * 1. Creating rectangles with specified width and height
 * 2. Calculating the area and perimeter of the rectangle
 * 3. Changing the dimensions of the rectangle with input validation
 * 4. Displaying information about rectangle
 * 5. Entering rectangle data from the keyboard
 */
public class Rectangle {

    // Static Scanner for input operations
    private static final Scanner INPUT_SCANNER = new Scanner(System.in);

    private double width;
    private double height;

    /**
     * Default constructor creates a rectangle with sides 1x1
     */
    public Rectangle() {
        this.width = 1.0;//
        this.height = 1.0;
    }

    /**
     * Constructor with parameters
     *
     * @param width  width of the rectangle
     * @param height height of the rectangle
     */
    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            System.out.println("Error: Width and height must be greater than zero.");
        }
        this.width = width;
        this.height = height;
    }


    /**
     * Returns the width of the rectangle
     *
     * @return width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle
     *
     * @param width new width of the rectangle
     */
    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Error: Width must be greater than zero.");
            return;
        }
        this.width = width;
    }

    /**
     * Returns the height of the rectangle
     *
     * @return height of the rectangle
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the rectangle
     *
     * @param height new height of the rectangle
     */
    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Error: Height must be greater than zero.");
            return;
        }
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle
     *
     * @return area of the rectangle
     */
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle
     *
     * @return perimeter of the rectangle
     */
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    /**
     * Returns a string representation of the rectangle
     *
     * @return string with information about the rectangle
     */
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", area=" + calculateArea() + ", perimeter=" + calculatePerimeter() + "]";
    }

    /**
     * Method for entering rectangle data from the keyboard and displaying information
     *
     * @param scanner Scanner object for reading input
     */
    public void inputAndDisplayInfo(Scanner scanner) {
        boolean inputValid = true;

        System.out.print("Enter the width of the rectangle: ");
        double newWidth = 0;

        // Handle potential input errors without exceptions
        if (scanner.hasNextDouble()) {
            newWidth = scanner.nextDouble();
        } else {
            System.out.println("Error: Invalid input. Please enter a number.");
            scanner.next(); // Clear the invalid input
            inputValid = false;
        }

        System.out.print("Enter the height of the rectangle: ");
        double newHeight = 0;

        // Handle potential input errors without exceptions
        if (scanner.hasNextDouble()) {
            newHeight = scanner.nextDouble();
        } else {
            System.out.println("Error: Invalid input. Please enter a number.");
            scanner.next(); // Clear the invalid input
            inputValid = false;
        }

        if (inputValid) {
            // Check if values are valid before setting them
            boolean validWidth = newWidth > 0;
            boolean validHeight = newHeight > 0;

            if (validWidth && validHeight) {
                setWidth(newWidth);
                setHeight(newHeight);

                // Display information about the rectangle
                System.out.println("\nRectangle information:");
                System.out.println(this);
            } else {
                // Display error messages for invalid values
                if (!validWidth) {
                    System.out.println("Error: Width must be greater than zero.");
                }
                if (!validHeight) {
                    System.out.println("Error: Height must be greater than zero.");
                }
            }
        }
    }

    /**
     * Method for entering rectangle data from the keyboard and displaying information.
     * This method uses a static Scanner to avoid creating a new Scanner object each time it's called.
     * It's still recommended to use {@link #inputAndDisplayInfo(Scanner)} for better resource management.
     */
    public void inputAndDisplayInfo() {
        inputAndDisplayInfo(INPUT_SCANNER);
    }

}
