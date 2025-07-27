package com.softserve.academy.homework11set;

import java.util.*;

public class AppSetOperations {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }


    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>(Arrays.asList("mango", "banana", "apple", "cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("banana", "time", "kiwi", "mango"));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        Set<String> unionResult = union(set1, set2);
        Set<String> intersectionResult = intersect(set1, set2);

        System.out.println("Union: " + unionResult);
        System.out.println("Intersection: " + intersectionResult);
    }
}
