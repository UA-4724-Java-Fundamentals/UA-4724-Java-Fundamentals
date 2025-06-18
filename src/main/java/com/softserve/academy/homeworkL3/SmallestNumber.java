package com.softserve.academy.homeworkL3;
//
import java.util.Scanner;

import static java.lang.System.in;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int first1 = getSmall("Input the first number: ");
        int second2 = getSmall("Input the second number: ");
        int third3 = getSmall("Input the third number: ");

        int smallest = findSmallest(first1, second2, third3);

        System.out.println("Smallest number: " + smallest);
    }
    private static int getSmall(String s) {
        Scanner scanner = new Scanner(in);
        System.out.println();
    }

    public static int findSmallest(int a, int b, int c) {
        int min = a;


        return min;
    }


}
