package com.softserve.academy.homework_05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberAnalysisTest {

    // Tests for findSecondPositive method

    @Test
    public void findSecondPositive_shouldReturnIndexOfSecondPositiveNumber() {
        int[] numbers = {1, 2, 3, 4, 5};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.findSecondPositive();
        // The second positive number is '2' at index 1
        assertEquals(1, result);
    }

    @Test
    public void findSecondPositive_shouldReturnIndexIfSecondPositiveIsLastElement() {
        int[] numbers = {-1, 2, -3, -4, 5};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.findSecondPositive();
        // The second positive number is '5' at index 4
        assertEquals(4, result);
    }

    @Test
    public void findSecondPositive_shouldReturnMinusOneIfLessThanTwoPositiveNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.findSecondPositive();
        // No second positive number, should return -1
        assertEquals(-1, result);
    }

    @Test
    public void findSecondPositive_shouldReturnIndexWhenSecondPositiveImmediatelyFollowsFirst() {
        int[] numbers = {0, 5, 10};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.findSecondPositive();
        // Positives are 5 at index 1 and 10 at index 2, second positive index is 2
        assertEquals(2, result);
    }

    @Test
    public void findSecondPositive_shouldReturnMinusOneWhenOnlyOnePositiveExists() {
        int[] numbers = {0, -1, 3, -2};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.findSecondPositive();
        // Only one positive number (3), should return -1
        assertEquals(-1, result);
    }

    @Test
    public void findSecondPositive_shouldReturnMinusOneForEmptyArray() {
        int[] numbers = {};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.findSecondPositive();
        // Empty array, no positives, should return -1
        assertEquals(-1, result);
    }


    // Tests for findMinAndIndex method

    @Test
    public void findMinAndIndex_shouldReturnMinAndIndexForAllNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4, -5};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int[] result = analysis.findMinAndIndex();
        int[] expected = new int[]{-5, 4};
        // Minimum is -5 at index 4
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMinAndIndex_shouldReturnMinAndIndexWhenMinIsNotFirstElement() {
        int[] numbers = {1, -2, 3, 4, 5};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int[] result = analysis.findMinAndIndex();
        int[] expected = new int[]{-2, 1};
        // Minimum is -2 at index 1
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMinAndIndex_shouldReturnMinAndIndexForSingleElementArray() {
        int[] numbers = {7};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int[] result = analysis.findMinAndIndex();
        int[] expected = new int[]{7, 0};
        // Only one element, min is 7 at index 0
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMinAndIndex_shouldReturnFirstMinIndexIfDuplicatesExist() {
        int[] numbers = {3, 1, 4, 1};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int[] result = analysis.findMinAndIndex();
        int[] expected = new int[]{1, 1};
        // Minimum is 1, first occurrence at index 1
        assertArrayEquals(expected, result);
    }

    @Test
    public void findMinAndIndex_shouldReturnMinAndMinusOneForEmptyArray() {
        int[] numbers = {};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int[] result = analysis.findMinAndIndex();
        int[] expected = new int[]{Integer.MIN_VALUE, -1};
        // Empty array returns this default value
        assertArrayEquals(expected, result);
    }


    // Tests for calculateEvenProduct method

    @Test
    public void calculateEvenProduct_shouldReturnProductOfEvenNumbersIncludingNegatives() {
        int[] numbers = {1, -2, 3, 4, 5};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.calculateEvenProduct();
        // Even numbers are -2 and 4, product is -8
        assertEquals(-8, result);
    }

    @Test
    public void calculateEvenProduct_shouldReturnProductForMultipleEvenNumbers() {
        int[] numbers = {2, 2, 6, 4, 5};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.calculateEvenProduct();
        // Product: 2*2*6*4 = 96
        assertEquals(96, result);
    }

    @Test
    public void calculateEvenProduct_shouldReturnZeroIfNoEvenNumbers() {
        int[] numbers = {1, 3, 5, 7};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.calculateEvenProduct();
        // No even numbers, should return 0
        assertEquals(0, result);
    }

    @Test
    public void calculateEvenProduct_shouldReturnEvenNumberIfOnlyOne() {
        int[] numbers = {7, 4, 9};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.calculateEvenProduct();
        // Only one even number (4), product is 4
        assertEquals(4, result);
    }

    @Test
    public void calculateEvenProduct_shouldIgnoreZerosInProduct() {
        int[] numbers = {0, 2, 0, 4};
        NumberAnalysis analysis = new NumberAnalysis(numbers);
        int result = analysis.calculateEvenProduct();
        // Zeros ignored, product 2*4=8
        assertEquals(8, result);
    }

}

