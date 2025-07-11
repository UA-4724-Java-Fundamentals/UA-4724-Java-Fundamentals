package com.softserve.academy.homework10.practicaltask;

import java.util.ArrayList;
import java.util.List;

class CommonElementsFinderStarter {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 5, 7, 8, 10);
        List<Integer> list2 = List.of(2, 3, 4, 5, 9);

        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("CommonElements: " + commonElements);

        Integer maxValue = findMaxValue(commonElements);
        if (maxValue != null) {
            System.out.println("Max value among common elements: " + maxValue);
        } else {
            System.out.println("No common elements to determine the maximum value");
        }
    }

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();

        if (list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()) {
            return commonElements;
        }
        for (Integer integer : list1) {
            if (list2.contains(integer) && !commonElements.contains(integer)) {
                commonElements.add(integer);
            }
        }
        return commonElements;
    }

    public static Integer findMaxValue(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        Integer maxValue = list.getFirst();
        for (Integer integer : list) {
            if (maxValue < integer) {
                maxValue = integer;
            }
        }
        return maxValue;
    }
}
