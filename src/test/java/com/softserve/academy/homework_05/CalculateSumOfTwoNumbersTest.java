package com.softserve.academy.homework_05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// This class contains unit tests for the CalculateSumOfTwoNumbers class
public class CalculateSumOfTwoNumbersTest {

    @Test
    public void testSumWithPositiveNumbers() {
        CalculateSumOfTwoNumbers calculator = new CalculateSumOfTwoNumbers();
        int result = calculator.sum(10, 5);
        assertEquals(15, result); // 10 + 5 = 15
    }

    @Test
    public void testSumWithNegativeNumbers() {
        CalculateSumOfTwoNumbers calculator = new CalculateSumOfTwoNumbers();
        int result = calculator.sum(-3, -7);
        assertEquals(-10, result); // -3 + (-7) = -10
    }

    @Test
    public void testSumWithZero() {
        CalculateSumOfTwoNumbers calculator = new CalculateSumOfTwoNumbers();
        int result = calculator.sum(0, 8);
        assertEquals(8, result); // 0 + 8 = 8
    }
    @Test
    public void testSumWithMixedSigns(){
        CalculateSumOfTwoNumbers calculator = new CalculateSumOfTwoNumbers();
        int result = calculator.sum(-41,55);
        assertEquals(14,result);

    }
}


/* import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculateSumOfTwoNumbersTest {
    @ParameterizedTest
    @CsvSource({
            "2, 3, 5",
            "-1, -4, -5",
            "-3, 7, 4",
            "0, 0, 0",
            "10, -10, 0",
            "-41, 55, 14"
    })
    public void testSumWithDifferentInputs(int a, int b, int expected) {
        CalculateSumOfTwoNumbers calculator = new CalculateSumOfTwoNumbers();
        int result = calculator.sum(a, b);
        assertEquals(expected, result);
    }
}
*/