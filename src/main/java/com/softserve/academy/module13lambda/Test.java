package com.softserve.academy.module13lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Original List = " + list);
        //
        System.out.print("\nPrint all numbers: ");
        eval(list, n -> true);
        //
        System.out.print("\nPrint even numbers: ");
        eval(list, n -> n % 2 == 0);
        //
        System.out.print("\nPrint numbers greater than 3: ");
        eval(list, n -> n > 3);
    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
    }

}

