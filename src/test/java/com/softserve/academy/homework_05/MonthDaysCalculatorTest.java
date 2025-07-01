package com.softserve.academy.homework_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for the MonthDaysCalculator class.
 */
public class MonthDaysCalculatorTest {

    @Test
    public void testGetDaysInJanuary() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(1);
        assertEquals(31, days);
    }

    @Test
    public void testGetDaysInApril() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(4);
        assertEquals(30, days);
    }

    @Test
    public void testGetDaysInJuly() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(7);
        assertEquals(31, days);
    }

    @Test
    public void testGetDaysInSeptember() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(9);
        assertEquals(30, days);
    }

    // 🧪 Test upper boundary (December)
    @Test
    public void testGetDaysInDecember() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(12);
        assertEquals(31, days);
    }

    // 🧪 Test lower boundary (invalid - zero)
    @Test
    public void testGetDaysInMonthZero() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(0);
        assertEquals(-1, days);
    }

    // 🧪 Test above upper boundary (13)
    @Test
    public void testInvalidMonthNumber() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(13);
        assertEquals(-1, days);
    }

    // 🧪 Test negative number
    @Test
    public void testNegativeMonthNumber() {
        MonthDaysCalculator calculator = new MonthDaysCalculator();
        int days = calculator.getDaysInMonth(-5);
        assertEquals(-1, days);
    }
}




