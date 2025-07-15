package com.softserve.academy.module01.Homework11;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersect {
    public static <T> Set<T> union(Set set1, Set set2){
        Set<T> result = new HashSet<T>(set1);
        result.addAll(set2);
        return result;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<T>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(7);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Union: "+union(set1, set2));
        System.out.println("Intersect: "+intersect(set1, set2));
    }
}
