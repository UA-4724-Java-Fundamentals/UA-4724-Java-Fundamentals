package com.softserve.academy.homework_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionPracticeApp {
    public static void main(String[] args) {
        CollectionPractice collection = new CollectionPractice();

        // ───── Step 1: Fill the collection ─────
        collection.fillWithRandomNumbers();


        // ───── Step 2: Swap min and max ─────
        int minIndex = collection.findMinIndex();
        System.out.println("Min element index = " + minIndex);


        int maxIndex = collection.findMaxIndex();
        System.out.println("Max element index = " + maxIndex);


        collection.swapMinMax();


        // ───── Step 3: Insert a 3-digit number before the first negative ─────
        collection.insertRandomBeforeFirstNegative();


        // ───── Step 4: Insert zeros between elements with different signs ─────
        collection.insertZerosBetweenDifferentSigns();


        // ───── Step 5: Split collection into list1 and list2 by random k ─────
        collection.splitIntoTwoLists();

        // ───── Step 6: Remove the last even element ─────
        collection.removeLastEven();


        // ───── Step 7: Remove the element after the minimum ─────
        collection.removeAfterMin();



    }
}
