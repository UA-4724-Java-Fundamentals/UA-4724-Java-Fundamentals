package com.softserve.academy.homework4;

import java.util.Scanner;

public class FiveIntNumbers {

    static int[] arr = new int[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[ " + i + " ] = " + arr[i]);
        }
        //
        int countPos = 0;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos++;
            }
            if (countPos == 2) {
                pos = i;
                break;
            }
        }
        System.out.println("Position the second positive numbers = " + pos);

        int min = arr[0];
        int imin = 0;
        int i = 0;
        while(i<arr.length) {
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
            i++;
        }
        System.out.println("Minimum value is " + min);
        System.out.println("Minimum value is at index " + imin);

        int product = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {product = product * arr[j];}}

        System.out.println("Product = " + product);

    }

}
