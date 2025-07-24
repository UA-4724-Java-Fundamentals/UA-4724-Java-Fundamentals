package com.softserve.academy.homework14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracticalTask1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

        // First Task
        // Print how many empty strings are in this list
        System.out.println(list.stream().filter(String::isEmpty).count());

        // Remove all empty Strings from list and print the result
        List<String> withoutEmpty = list.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(withoutEmpty);

        // Convert String to uppercase and Join them with coma. Print the result
        System.out.println(list.stream().filter(s -> !s.isEmpty()).map(String::toUpperCase).collect(Collectors.joining(",")));

        // 2. Second Task
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        System.out.println(primes.stream().count());
        System.out.println(primes.stream().min(Integer::compareTo).get());
        System.out.println(primes.stream().max(Integer::compareTo).get());
        System.out.println(primes.stream().mapToInt(Integer::intValue).sum());
    }
}
