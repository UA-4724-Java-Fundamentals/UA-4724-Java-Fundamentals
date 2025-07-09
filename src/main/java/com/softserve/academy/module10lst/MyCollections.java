package com.softserve.academy.module10lst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyCollections {

    public static void main(String[] args) {
        int count = 10;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println("Origin List = " + list);
        //
        /*
        int imin = 0;
        Integer min = list.get(imin);
        int imax = 0;
        Integer max = list.get(imax);
        for (int i = 0; i < count; i++) {
            if (min > list.get(i)) {
                imin = i;
                min = list.get(imin);
            }
            if (max < list.get(i)) {
                imax = i;
                max = list.get(imax);
            }
        }
        System.out.println("imin = " + imin + "   min = " + min);
        System.out.println("imax = " + imax + "   max = " + max);
        //
        list.set(imin, max);
        list.set(imax, min);
        System.out.println("Updated List = " + list);
        */
        //
        Integer min = Collections.min(list);
        int imin = list.indexOf(min);
        Integer max = Collections.max(list);
        int imax = list.indexOf(max);
        //
        System.out.println("imin = " + imin + "   min = " + min);
        System.out.println("imax = " + imax + "   max = " + max);
        //
        list.set(imin, max);
        list.set(imax, min);
        System.out.println("Updated List = " + list);
    }
}
