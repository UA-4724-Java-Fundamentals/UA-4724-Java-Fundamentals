package com.softserve.academy.homework10colection;
import java.util.*;

public class MyCollections {
    public static void main(String[] args) {
        int count = 10;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(199) - 99);
        }
        System.out.println("Origin List = " + list);
        Integer min = Collections.min(list);
        int imin = list.indexOf(min);
        Integer max = Collections.max(list);
        int imax = list.indexOf(max);

        System.out.println("1.1 Index min = " + imin + "   Value min = " + min);
        System.out.println("1.2 Index max = " + imax + "   Value max = " + max);

        list.set(imin, max);
        list.set(imax, min);
        System.out.println("1. Swapping min and max on the list = " + list);

        int threeDigit = random.nextInt(900) + 100;
        boolean inserted = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.add(i, threeDigit);
                inserted = true;
                break;
            }
        }
        if (!inserted) {
            list.add(threeDigit);
        }
        System.out.println("2. Inserting three-digit number: " + list);

        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i);
            int b = list.get(i + 1);
            if ((a >= 0 && b < 0) || (a < 0 && b >= 0)) {
                list.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("3. Inserting zero between different signs: " + list);

        int k = 5;
        List<Integer> list1 = new ArrayList<>(list.subList(0, k - 1));
        list.removeAll(list1);
        List<Integer> list2 = new ArrayList<>(list.reversed());

        System.out.println("4.1 Copy the first k elements to list 1 = " + list1);

        System.out.println("4.2 Copy the rest k elements toList 2 = " + list2);

        boolean foundEven = false;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                foundEven = true;
                break;
            }
        }
        if (!foundEven) {
            System.out.println("5. No even elements found.");
        } else {
            System.out.println("5. Removing last even: " + list);
        }

        int minVal = Collections.min(list);
        int minPos = list.indexOf(minVal);
        if (minPos < list.size() - 1) {
            list.remove(minPos + 1);
            System.out.println("6. Removing element after first min: " + list);
        } else {
            System.out.println("Min is the last element. Nothing removed.");
        }
    }
}
