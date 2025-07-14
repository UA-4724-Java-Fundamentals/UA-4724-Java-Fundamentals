package com.softserve.academy.module10lst;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ProgramIter {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Sara");
        list.add("Mike");
        list.add("Nick");
        list.add("Jack");
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        list.listIterator(list.size());
        System.out.println();
        // reverse order
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + "  ");
        }
    }
}   