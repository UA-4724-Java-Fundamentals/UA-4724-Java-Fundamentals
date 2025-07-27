package com.softserve.academy.practical13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionalInterfacePractical {

    // Task 1: Show today's day of the week
    public static void showTodayDayOfWeek() {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        System.out.println("Today is: " + today);
    }

    // Task 2: Get first Monday of current month
    public static LocalDate getFirstMondayOfCurrentMonth() {
        LocalDate now = LocalDate.now();
        LocalDate firstDay = now.withDayOfMonth(1);

        while (firstDay.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDay = firstDay.plusDays(1);
        }

        return firstDay;
    }

    // Task 3: Sort list of strings using Java 8
    public static List<String> sortStrings(List<String> input) {
        return input.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // Task 4: Count integers matching condition
    public static int count(Integer[] numbers, Predicate<Integer> condition) {
        return (int) Arrays.stream(numbers)
                .filter(condition)
                .count();
    }

    public static void main(String[] args) {
        // Task 1: Today day of week
        showTodayDayOfWeek();

        // Task 2: First Monday of the current month
        LocalDate firstMonday = getFirstMondayOfCurrentMonth();
        System.out.println("First Monday of current month: " + firstMonday);

        // Task 3: Sort list of strings
        List<String> names = Arrays.asList("Andrii", "Julia", "Helena", "Rostyslav");
        List<String> sortedNames = sortStrings(names);
        System.out.println("Sorted names: " + sortedNames);

        // Task 4: Count based on condition (e.g., even numbers)
        Integer[] numbers = {1, 4, 7, 2, 8, 9, 10, 3, 6, 5};
        int countEven = count(numbers, n -> n % 2 == 0);
        int countGreaterThanFive = count(numbers, n -> n > 5);

        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of numbers > 5: " + countGreaterThanFive);
    }
}
