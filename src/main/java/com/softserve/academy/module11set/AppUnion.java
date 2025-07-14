package com.softserve.academy.module11set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AppUnion {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("First");
        set1.add("Second");
        set1.add("Third");
        set1.add("Abc");
        //
        Set<String> set2 = new HashSet<>();
        set2.add("First");
        set2.add("Second");
        set2.add("Third");
        set2.add("Efgh");
        //
        // Union
//        Set<String> set3 = new TreeSet<>(set1);
//        set3.addAll(set2);
//        System.out.println("set3 = " + set3);
        //
        // intersect
        Set<String> set4 = new TreeSet<>(set1);
        set4.retainAll(set2);
        System.out.println("set4 = " + set4);
    }

}
