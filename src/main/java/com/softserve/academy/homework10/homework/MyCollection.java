package com.softserve.academy.homework10.homework;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(new Random().ints(10, -10, 30).boxed().toList());

        System.out.println("Randow 10 Numbers collection: " + myCollection);

        System.out.println("Swap Max and Min: " + swapMaxAndMin(myCollection));

        System.out.println("Insert elements at First Negative Position: " + insertElementsAtFirstNegativePosition(myCollection));

        System.out.println("Insert Zero Between different signs numbers :" + insertZeroBetweenModuleNumbers(myCollection));

        copyEndReverseList(myCollection, 5);

        System.out.println("Remove last event element: " + removeLastEventElement(myCollection));

        System.out.println("Remove first minimum: " + removeFirstMinimum(myCollection));
    }

    static List<Integer> removeFirstMinimum(List<Integer> collection) {
        Integer minValue = Collections.min(collection);
        int indexMin = collection.indexOf(minValue);
        if (collection.size() - 1 != indexMin) {
            collection.remove(indexMin + 1);
        }
        return collection;
    }

    static List<Integer> removeLastEventElement(List<Integer> collection) {
        for (int i = collection.size() - 1; i > 0; i--) {
            if (collection.get(i) % 2 == 0) {
                collection.remove(i);
                return collection;
            }
        }
        System.out.println("Collection doesn't have even elements");
        return collection;
    }

    static void copyEndReverseList(List<Integer> collection, int k) {
        List<Integer> list1 = new ArrayList<>(collection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(collection.subList(k, collection.size()).reversed());
        System.out.println("first K elements: " + list1);
        System.out.println("Last elements from K and reverse: " + list2);
    }

    static List<Integer> insertZeroBetweenModuleNumbers(List<Integer> collection) {
        for (int i = collection.size() - 1; i > 0; i--) {
            int current = collection.get(i);
            int previous = collection.get(i - 1);
            if (Math.abs(previous) == Math.abs(current) && current != previous) {
                collection.add(i, 0);
            }
        }
        return collection;
    }

    static List<Integer> swapMaxAndMin(List<Integer> collection) {
        Integer minValue = Collections.min(collection);
        int minIndex = collection.indexOf(minValue);

        Integer maxValue = Collections.max(collection);
        int maxIndex = collection.indexOf(maxValue);

        collection.set(minIndex, maxValue);
        collection.set(maxIndex, minValue);

        return collection;
    }

    static List<Integer> insertElementsAtFirstNegativePosition(List<Integer> collection) {
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                int minIndex = collection.indexOf(collection.get(i));
                List<Integer> threeDigits = new ArrayList<>(new Random().ints(3, -10, 30).boxed().toList());
                collection.addAll(minIndex == 0 ? 0 : minIndex - 1, threeDigits);
                return collection;
            }
        }
        return collection;
    }
}
