package com.softserve.academy.module13lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppPre {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David", "Andriy");
        System.out.println("Original names = " + names);
        //
        List<String> namesA = new ArrayList<>();
        for (int i=0; i<names.size(); i++) {
            if (names.get(i).startsWith("A")) {
                namesA.add(names.get(i));
            }
        }
        System.out.println("Original namesA = " + namesA);
        //
        List<String> namesWithA = names
                .stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());
        namesWithA.forEach(name -> System.out.print(name + "  "));
        //namesWithA.forEach(System.out::println);
        //
    }
}
