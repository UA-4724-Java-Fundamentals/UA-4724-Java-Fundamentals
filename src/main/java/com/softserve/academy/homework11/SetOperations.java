package com.softserve.academy.homework11;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

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
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        Set<Integer> unionSet = union(setA, setB);
        System.out.println("Union of A and B: " + unionSet);

        Set<Integer> intersectSet = intersect(setA, setB);
        System.out.println("Intersection of A and B: " + intersectSet);
    }
}
