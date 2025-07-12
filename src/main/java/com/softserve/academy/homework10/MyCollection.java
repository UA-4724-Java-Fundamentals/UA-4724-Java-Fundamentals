package com.softserve.academy.homework10;

import java.util.*;
import java.util.stream.Collectors;

public class MyCollection {

    public static void main(String[] args) {
        List<Integer> myCollection = generateRandomList(10);
        System.out.println("Original list: " + myCollection);

        swapMinMax(myCollection);
        System.out.println("After swapping min and max: " + myCollection);

        insertBeforeFirstNegative(myCollection);
        System.out.println("After inserting random 3-digit before first negative: " + myCollection);

        insertZeroBetweenDifferentSigns(myCollection);
        System.out.println("After inserting zero between elements with different signs: " + myCollection);

        int k = 4;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        splitList(myCollection, k, list1, list2);
        System.out.println("List1 (first " + k + " elements): " + list1);
        System.out.println("List2 (remaining in reverse): " + list2);

        removeLastEven(myCollection);
        System.out.println("After removing last even element: " + myCollection);

        removeAfterFirstMin(myCollection);
        System.out.println("After removing element after first min: " + myCollection);
    }

    private static List<Integer> generateRandomList(int size) {
        Random rand = new Random();
        return rand.ints(size, -50, 50).boxed().collect(Collectors.toList());
    }

    private static void swapMinMax(List<Integer> list) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) minIndex = i;
            if (list.get(i) > list.get(maxIndex)) maxIndex = i;
        }
        Collections.swap(list, minIndex, maxIndex);
    }

    private static void insertBeforeFirstNegative(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                int random3Digit = new Random().nextInt(900) + 100;
                list.add(i, random3Digit);
                return;
            }
        }

    }

    private static void insertZeroBetweenDifferentSigns(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) * list.get(i + 1) < 0) {
                list.add(i + 1, 0);
                i++;
            }
        }
    }

    private static void splitList(List<Integer> source, int k, List<Integer> list1, List<Integer> list2) {
        list1.addAll(source.subList(0, Math.min(k, source.size())));
        for (int i = source.size() - 1; i >= k; i--) {
            list2.add(source.get(i));
        }
    }

    private static void removeLastEven(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                return;
            }
        }
        System.out.println("No even element found to remove.");
    }

    private static void removeAfterFirstMin(List<Integer> list) {
        int minIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }
        if (minIndex < list.size() - 1) {
            list.remove(minIndex + 1);
        }
    }
}
