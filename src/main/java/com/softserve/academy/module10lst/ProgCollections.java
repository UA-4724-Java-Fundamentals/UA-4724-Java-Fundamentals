package com.softserve.academy.module10lst;

import java.util.*;

public class ProgCollections {
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<>();
        List<String> addList = List.of("add First", "add Second");
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        list.add(0, "One more first element");
        list.addAll(2, addList);
        //list.add("First element");
        System.out.println("Original = " + list);
        //
        // removes list item or removes list element by index
        list.remove("First element");
        //list.remove(1);
        System.out.println("Removed: First element = " + list);
        //
        // removes all elements from the calling collection
        //List<String> removeElements = List.of("First element", "Fourth element");
        //list.removeAll(removeElements);
        //System.out.println("Removed: removeElements = " + list);
        //
        // removes all elements except those from the calling collection
        //List<String> retainElements = List.of("First element", "Fourth element");
        //list.retainAll(retainElements);
        //System.out.println("Removed: another = " + list);
        */
        // /*
        List<String> list = Arrays.asList("second", "third", "fourth", "first", "first");
        System.out.println("Original = " + list);
        Collections.reverse(list);
        System.out.println("Reverse = " + list);

        // sorting
        Collections.sort(list);
        System.out.println("Sorted = " + list);

        //reverse sort order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Collections.reverseOrder() = " + list);

        // uses a binary search algorithm to find a specific element;
        // returns the element number or a negative number
        Collections.sort(list);
        System.out.println("binarySearch: second = " + Collections.binarySearch(list, "second"));

        //randomly reorders elements
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);

        // max value, min value,
        System.out.println("max = " + Collections.max(list));
        System.out.println("min = " + Collections.min(list));

        //cyclically shifts the elements passed to it by distance
        // positions forward (+) or backward (-)
        Collections.rotate(list, -1);
        System.out.println("rotate -1: " + list);

        // copy collection
        //List<String> listDestination = Arrays.asList("green", "black");
        List<String> listDestination = new ArrayList<>();
        listDestination.add("one");
        listDestination.add("two");
        Collections.copy(list, listDestination);
        System.out.println("copy = " + list);

        //eturns the total number of occurrences of the
        // specified element in the list
        System.out.println("frequency: first = " + Collections.frequency(list, "first"));
        // */
    }
}