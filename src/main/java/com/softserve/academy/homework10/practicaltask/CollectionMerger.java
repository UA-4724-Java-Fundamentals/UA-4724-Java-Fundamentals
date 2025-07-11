package com.softserve.academy.homework10.practicaltask;

import java.util.*;

class CollectionMerger {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana");
        List<String> list2 = List.of("banana", "cherry");

        System.out.println(mergeAndSortLists(list1, list2));
    }

    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        Set<String> resultSet = new TreeSet<>();

        if (list1 != null) {
            resultSet.addAll(list1);
        }

        if (list2 != null) {
            resultSet.addAll(list2);
        }

        return new ArrayList<>(resultSet);
    }
}
