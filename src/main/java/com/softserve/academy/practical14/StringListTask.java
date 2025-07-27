package com.softserve.academy.practical14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListTask {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        long emptyCount = list.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Empty strings count: " + emptyCount);

        List<String> nonEmptyList = list.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("List without empty strings: " + nonEmptyList);

        String joinedUppercase = nonEmptyList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Uppercase joined string: " + joinedUppercase);
    }
}

