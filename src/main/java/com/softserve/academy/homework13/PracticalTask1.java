package com.softserve.academy.homework13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class PracticalTask1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        // Show which today is a day of a week
        System.out.println(localDate.getDayOfWeek());

        // Show a date of first Monday for current month
        LocalDate firstMonday = localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMonday);

        // Write a method for sorting list of Strings using Java 8
        List<String> list = Arrays.asList("asdf", "dsfadf", "bsfsd");
        Collections.sort(list);

        // count of elements in array that satisfy the condition
        Random random = new Random();
        List<Integer> numbers = Stream.generate(random::nextInt)
                .limit(10)
                .toList();
        System.out.println(count(numbers, x -> x > 0));
    }

    private static Long count(List<Integer> numbers, IntPredicate intPredicate) {
        return numbers.stream()
                .filter(intPredicate::test)
                .count();
    }
}
