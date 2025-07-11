package com.softserve.academy.homework10.practicaltask;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class MyCollection {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>(new Random().ints(10, -10, 30).boxed().toList());

        // insertion into appropriate indexes
        insertElementsAtPositions(myCollection);
        System.out.println(myCollection);


        // new List with indexes more than 5
        List<Integer> moreThanFiveIndex = findIndexesOfElementsGreaterThanFive(myCollection);
        System.out.println("Indexes of elements > 5: " + moreThanFiveIndex);

        // remove from current myCollection
        removeElementsGreaterThanTwenty(myCollection);
        System.out.println(myCollection);

        //Sort collection
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }

    static List<Integer> findIndexesOfElementsGreaterThanFive(List<Integer> collection) {
        List<Integer> result = new ArrayList<>();
        if (collection.size() < 6) {
            return result;
        }
        result = new ArrayList<>(collection.subList(5, collection.size()));
        return result;
    }

    static void removeElementsGreaterThanTwenty(List<Integer> collection) {
        collection.removeIf(x -> x > 20);
    }

    static void insertElementsAtPositions(List<Integer> collection) {
        collection.set(2, 1);
        collection.set(8, -3);
        collection.set(5, -4);
    }
}
