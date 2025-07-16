package com.softserve.academy.homework_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyCollection {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>();

        // Step 1: Fill the collection with 10 random integers in the range [-100, 100]
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(201) - 100;
            myCollection.add(number);
        }

        System.out.println("Initial collection: " + myCollection);

        // Step 2: Swap the minimum and maximum elements
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
        }

        Collections.swap(myCollection, minIndex, maxIndex);


        System.out.println("After swapping min and max: " + myCollection);

        // Step 3: Insert a random three-digit number before the first negative number
        int firstNegativeIndex = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex != -1) {
            int randomThreeDigit = random.nextInt(900) + 100;
            myCollection.add(firstNegativeIndex, randomThreeDigit);
            System.out.println("Inserted " + randomThreeDigit + " before first negative number: " + myCollection);
        } else {
            System.out.println("No negative numbers — nothing inserted.");
        }

        // Step 4: Insert a 0 between all neighboring elements with different signs
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);

            if (current * next < 0) { // opposite signs
                myCollection.add(i + 1, 0);
                i++; // skip the inserted 0 to avoid endless loop
            }
        }

        System.out.println("After inserting 0s between elements with different signs: " + myCollection);

        // Step 5: Split into two lists by k
        int k = random.nextInt(myCollection.size() + 1); // from 0 to size
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }

        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.println("Random k = " + k);
        System.out.println("List1 (first k elements): " + list1);
        System.out.println("List2 (remaining elements in reverse): " + list2);

        // Step 6: Remove the last even element
        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }

        if (lastEvenIndex != -1) {
            int removedValue = myCollection.remove(lastEvenIndex);
            System.out.println("Removed last even element: " + removedValue);
        } else {
            System.out.println("No even elements found — nothing removed.");
        }

        System.out.println("After removing last even element: " + myCollection);

        // Step 7: Remove the element after the first minimum
        int minIdx = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIdx)) {
                minIdx = i;
            }
        }

        if (minIdx < myCollection.size() - 1) {
            int removed = myCollection.remove(minIdx + 1);
            System.out.println("Removed element after the minimum (" + myCollection.get(minIdx) + "): " + removed);
        } else {
            System.out.println("Minimum element is the last one — nothing removed.");
        }

        System.out.println("Final collection: " + myCollection);
    }
}
