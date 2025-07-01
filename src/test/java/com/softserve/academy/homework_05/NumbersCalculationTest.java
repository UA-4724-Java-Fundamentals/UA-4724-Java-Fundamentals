package com.softserve.academy.homework_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersCalculationTest {

    @Test
    public void testSumOfFirstFiveAllPositive() {
        NumbersCalculation calc = new NumbersCalculation();

        int[] input = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50}; // All first 5 positive
        int result = calc.process(input);

        assertEquals(15, result); // 1+2+3+4+5
    }

    @Test
    public void testProductOfLastFiveIfNegativeInFirstFive() {
        NumbersCalculation calc = new NumbersCalculation();

        int[] input = {-1, 2, 3, 4, 5, 2, 2, 2, 2, 2}; // -1 breaks positivity
        int result = calc.process(input);

        assertEquals(32, result); // 2*2*2*2*2
    }

    @Test
    public void testProductIfZeroInFirstFive() {
        NumbersCalculation calc = new NumbersCalculation();

        int[] input = {0, 1, 2, 3, 4, 3, 3, 3, 3, 3};
        int result = calc.process(input);

        assertEquals(243, result); // 3^5 = 243
    }

    @Test
    public void testAllFirstFiveNegative() {
        NumbersCalculation calc = new NumbersCalculation();

        int[] input = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 5};
        int result = calc.process(input);

        assertEquals(120, result); // 1*2*3*4*5
    }

    @Test
    public void testAllTenOnes() {
        NumbersCalculation calc = new NumbersCalculation();

        int[] input = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int result = calc.process(input);

        assertEquals(5, result); // 1+1+1+1+1
    }

    @Test
    public void testProductWithZeroInLastFive() {
        NumbersCalculation calc = new NumbersCalculation();

        int[] input = {-1, 2, 3, 4, 5, 2, 2, 0, 2, 2}; // Zero in last five
        int result = calc.process(input);

        assertEquals(0, result); // Any multiplication by 0 = 0
    }
}
