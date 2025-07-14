package com.softserve.academy.module11set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        //Set<String> set = new HashSet<>();
        //Set<String> set = new TreeSet<>();
        //
        set.add("Mike");
        set.add("Nike");
        set.add("Alex");
        set.add("Sara");
        //
        for (String object : set) {
            System.out.println(object);
        }
    }
}     