package com.softserve.academy.module3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for Rectangle
 */
public class RectangleTest {

    @Test
    @DisplayName("Verify Rectangle class is public")
    void testRectangleIsPublic() {
        assertTrue(Modifier.isPublic(Rectangle.class.getModifiers()),
                "Rectangle class should be public");
    }

    @Test
    @DisplayName("Test default constructor")
    void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0, rectangle.getWidth(), "Default width should be 1.0");
        assertEquals(1.0, rectangle.getHeight(), "Default height should be 1.0");
    }

    @Test
    @DisplayName("Test parameterized constructor with valid values")
    void testParameterizedConstructorWithValidValues() {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        assertEquals(5.0, rectangle.getWidth(), "Width should be 5.0");
        assertEquals(3.0, rectangle.getHeight(), "Height should be 3.0");
    }


    @Test
    @DisplayName("Test setWidth with valid value")
    void testSetWidthWithValidValue() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(7.5);
        assertEquals(7.5, rectangle.getWidth(), "Width should be updated to 7.5");
    }

    @Test
    @DisplayName("Test setWidth with invalid value")
    void testSetWidthWithInvalidValue() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(-2.0);
        assertEquals(1.0, rectangle.getWidth(), "Width should remain unchanged for invalid input");
    }

    @Test
    @DisplayName("Test setHeight with valid value")
    void testSetHeightWithValidValue() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(8.5);
        assertEquals(8.5, rectangle.getHeight(), "Height should be updated to 8.5");
    }

    @Test
    @DisplayName("Test setHeight with invalid value")
    void testSetHeightWithInvalidValue() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(-3.0);
        assertEquals(1.0, rectangle.getHeight(), "Height should remain unchanged for invalid input");
    }

    @Test
    @DisplayName("Test calculateArea method")
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(20.0, rectangle.calculateArea(), "Area should be width * height = 4.0 * 5.0 = 20.0");

        rectangle.setWidth(2.5);
        rectangle.setHeight(3.0);
        assertEquals(7.5, rectangle.calculateArea(), "Area should be width * height = 2.5 * 3.0 = 7.5");
    }

    @Test
    @DisplayName("Test calculatePerimeter method")
    void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        assertEquals(18.0, rectangle.calculatePerimeter(), "Perimeter should be 2 * (width + height) = 2 * (4.0 + 5.0) = 18.0");

        rectangle.setWidth(2.5);
        rectangle.setHeight(3.0);
        assertEquals(11.0, rectangle.calculatePerimeter(), "Perimeter should be 2 * (width + height) = 2 * (2.5 + 3.0) = 11.0");
    }

    @Test
    @DisplayName("Test toString method")
    void testToString() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        String expected = "Rectangle [width=4.0, height=5.0, area=20.0, perimeter=18.0]";
        assertEquals(expected, rectangle.toString(), "toString should return formatted string with rectangle properties");
    }

    @Test
    @DisplayName("Verify all required methods exist with correct signatures")
    void testMethodSignatures() throws NoSuchMethodException {
        // Check getWidth method
        Method getWidthMethod = Rectangle.class.getMethod("getWidth");
        assertTrue(Modifier.isPublic(getWidthMethod.getModifiers()), "getWidth method should be public");
        assertEquals(double.class, getWidthMethod.getReturnType(), "getWidth should return double");

        // Check getHeight method
        Method getHeightMethod = Rectangle.class.getMethod("getHeight");
        assertTrue(Modifier.isPublic(getHeightMethod.getModifiers()), "getHeight method should be public");
        assertEquals(double.class, getHeightMethod.getReturnType(), "getHeight should return double");

        // Check setWidth method
        Method setWidthMethod = Rectangle.class.getMethod("setWidth", double.class);
        assertTrue(Modifier.isPublic(setWidthMethod.getModifiers()), "setWidth method should be public");
        assertEquals(void.class, setWidthMethod.getReturnType(), "setWidth should return void");

        // Check setHeight method
        Method setHeightMethod = Rectangle.class.getMethod("setHeight", double.class);
        assertTrue(Modifier.isPublic(setHeightMethod.getModifiers()), "setHeight method should be public");
        assertEquals(void.class, setHeightMethod.getReturnType(), "setHeight should return void");

        // Check calculateArea method
        Method calculateAreaMethod = Rectangle.class.getMethod("calculateArea");
        assertTrue(Modifier.isPublic(calculateAreaMethod.getModifiers()), "calculateArea method should be public");
        assertEquals(double.class, calculateAreaMethod.getReturnType(), "calculateArea should return double");

        // Check calculatePerimeter method
        Method calculatePerimeterMethod = Rectangle.class.getMethod("calculatePerimeter");
        assertTrue(Modifier.isPublic(calculatePerimeterMethod.getModifiers()), "calculatePerimeter method should be public");
        assertEquals(double.class, calculatePerimeterMethod.getReturnType(), "calculatePerimeter should return double");

        // Check inputAndDisplayInfo method
        Method inputAndDisplayInfoMethod = Rectangle.class.getMethod("inputAndDisplayInfo");
        assertTrue(Modifier.isPublic(inputAndDisplayInfoMethod.getModifiers()), "inputAndDisplayInfo method should be public");
        assertEquals(void.class, inputAndDisplayInfoMethod.getReturnType(), "inputAndDisplayInfo should return void");
    }
}
