package com.softserve.academy.homework11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class UnionAndIntersect {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("apple", "banana");
        Set<String> set2 = Set.of("banana", "cherry");

        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));

        Map<String, String> personMap = new ConcurrentHashMap<>();

        personMap.put("Shevchenko", "Taras");
        personMap.put("Franko", "Ivan");
        personMap.put("Skovoroda", "Hryhorii");
        personMap.put("Kotsiubynskyi", "Mykhailo");
        personMap.put("Lukianenko", "Levko");
        personMap.put("Symonenko", "Vasyl");
        personMap.put("Stus", "Vasyl");
        personMap.put("Bandera", "Stepan");
        personMap.put("Tiahnybok", "Orest");
        personMap.put("Zaluzhnyi", "Valerii");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals("Orest")) {
                personMap.remove(entry.getKey());
            }
        }
        System.out.println(personMap);

        Set<String> valuesFromMap = new HashSet<>(personMap.values());
        if (valuesFromMap.size() != personMap.size()) {
            System.out.println("PersonMap has duplicate First Name");
        }

    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    private static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();
        for (T element : set1) {
            if (set2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }
}
