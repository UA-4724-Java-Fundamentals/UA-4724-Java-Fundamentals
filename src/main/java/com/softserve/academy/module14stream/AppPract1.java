package com.softserve.academy.module14stream;

import java.util.Arrays;
import java.util.List;

public class AppPract1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "", "sec", "blablabla");
        long count = list.stream()
                .filter(s -> s.length() == 0)
                .count();
        System.out.println("count = " + count);
    }
}
