package com.softserve.academy.homework_11;

import java.util.Set;
import java.util.HashSet;

public class SetOperations {

    // Returns the union of two sets: all unique elements from both sets
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);  // Create a new set containing all elements from set1
        result.addAll(set2);                  // Add all elements from set2 (duplicates will be ignored)
        return result;                        // Return the resulting set
        // Example result: [apple, banana, cherry, grape]
    }

    // Returns the intersection of two sets: only elements that exist in both sets
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);  // Create a new set containing all elements from set1
        result.retainAll(set2);               // Keep only elements that are also in set2
        return result;                        // Return the resulting set
        // Example result: [banana, cherry]
    }

    public static void main(String[] args) {
        // Create and initialize setA
        Set<String> setA = new HashSet<>();
        setA.add("apple");
        setA.add("banana");
        setA.add("cherry");

        // Create and initialize setB
        Set<String> setB = new HashSet<>();
        setB.add("banana");
        setB.add("cherry");
        setB.add("grape");

        // Call the union method and print the result
        Set<String> unionSet = union(setA, setB);
        System.out.println("Union of sets: " + unionSet);


        // Call the intersect method and print the result
        Set<String> intersectSet = intersect(setA, setB);
        System.out.println("Intersection of sets: " + intersectSet);

    }
}
