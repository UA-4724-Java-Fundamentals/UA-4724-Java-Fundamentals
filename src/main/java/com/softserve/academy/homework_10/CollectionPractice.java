package com.softserve.academy.homework_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionPractice {
    private final List<Integer> myCollection = new ArrayList<>();
    private final Random random = new Random();


    // Fill the list with 10 random integers in range [-100, 100]
    public void fillWithRandomNumbers() {
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(201) - 100;
            myCollection.add(number);
        }
        System.out.println("Initial collection: " + myCollection);

    }

    // Find index of the minimum element in the list
    public int findMinIndex() {
        int minIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
        }
        return minIndex;

    }

    // Find index of the maximum element in the list
    public int findMaxIndex() {
        int maxIndex = 0;
        for (int i = 1; i < myCollection.size(); i++) {
            if (myCollection.get(i) > myCollection.get(maxIndex)) {
                maxIndex = i;
            }
        }
        return maxIndex;

    }

    // Swap the minimum and maximum elements in the collection
    public void swapMinMax() {
        int minIndex = findMinIndex();
        int maxIndex = findMaxIndex();

        Collections.swap(myCollection, minIndex, maxIndex);

        System.out.println("After swapping min and max: " + myCollection);

    }

    // Find the index of the first negative element
    public int findFirstNegativeIndex() {

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                return i;


            }
        }
        return -1; // Not found
    }

    // Insert a random 3-digit number before the first negative number
    public void insertRandomBeforeFirstNegative() {
        int index = findFirstNegativeIndex();

        if (index == -1) {
            System.out.println("No negative numbers found — nothing inserted.");
            return;
        }

        int randomThreeDigit = random.nextInt(900) + 100;
        myCollection.add(index, randomThreeDigit);
        System.out.println("Inserted " + randomThreeDigit + " before first negative: " + myCollection);
    }

    // Insert a 0 between all neighboring elements with different signs
    public void insertZerosBetweenDifferentSigns() {
        for (int i = 0; i < myCollection.size() - 1; i++) {
            int current = myCollection.get(i);
            int next = myCollection.get(i + 1);

            if (current * next < 0) { // different signs
                myCollection.add(i + 1, 0);
                i++; // skip the inserted zero
            }
        }
        System.out.println("After inserting zeros between elements with different signs: " + myCollection);
    }

    // Split the collection into two lists:
    // list1 — first k elements (in direct order),
    // list2 — remaining elements (in reverse order)
    public void splitIntoTwoLists() {
        int k = random.nextInt(myCollection.size() + 1);
        System.out.println("Random k value: " + k);

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < k; i++) {

            list1.add(myCollection.get(i));

        }
        System.out.println("List1 (first k elements): " + list1);

        List<Integer> list2 = new ArrayList<>();
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("List2 (remaining elements in reverse): " + list2);
    }

    // Remove the last even number in the collection, if any
    public void removeLastEven() {
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                int removed = myCollection.remove(i);
                System.out.println("Removed last even element: " + removed);
                System.out.println("Collection after removing last even: " + myCollection);
                return;
            }
        }
        System.out.println("No even elements found — nothing removed.");

    }

    // Remove the element after the minimum (if not the last element)
    public void removeAfterMin() {
        int minIndex = findMinIndex();

        if (minIndex < myCollection.size() - 1) {
            int removedValue = myCollection.remove(minIndex + 1);
            System.out.println("Removed element after the minimum (" + myCollection.get(minIndex) + "): " + removedValue);
        } else {
            System.out.println("Minimum element is the last one — nothing removed.");
        }

        System.out.println("Collection after removing element after minimum: " + myCollection);
    }

}
