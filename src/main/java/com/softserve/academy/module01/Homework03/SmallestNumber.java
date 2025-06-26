package com.softserve.academy.module01.Homework03;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + " number:");
            nums[i] = input.nextInt();
        }
        System.out.println("The smallest number is " + smallestNumber(nums));

    }

    public static int smallestNumber(int[] nums) {
        int smallest = Math.min(Math.min(nums[0], nums[1]), nums[2]);
        return smallest;

    }
}
