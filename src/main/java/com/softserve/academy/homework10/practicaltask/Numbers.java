package com.softserve.academy.homework10.practicaltask;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        String str = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        List<String> list = Arrays.asList(str.split(", "));

        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
