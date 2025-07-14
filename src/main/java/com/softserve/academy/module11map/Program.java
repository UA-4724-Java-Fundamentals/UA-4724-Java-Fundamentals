package com.softserve.academy.module11map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mike");
        hashMap.put(2, "Nick");
        hashMap.put(3, "Sara");
        System.out.println("1. hashMap = " + hashMap);
        //
        hashMap.put(1, "Alex");
        hashMap.put(4, null); // Ok
        hashMap.put(5, null); // OK
        hashMap.put(null, "11"); // Ok 11 by null key
        System.out.println("2. hashMap = " + hashMap);
        //
        hashMap.put(null, "Simon"); // Ok Simon by null key
        System.out.println("3. hashMap = " + hashMap); // hashMap.toString();
        //
        System.out.println("4. hashMap:");
        for (Map.Entry<Integer, String> m : hashMap.entrySet()) {
            System.out.println("Key = " + m.getKey() + "   value = " + m.getValue());
        }
        System.out.println();
        //
        //get object by key 2
        String element = hashMap.get(2);
        System.out.println("Element by key 2: " + element);

        //returns a Set containing all map values
        Set<Integer> keys = hashMap.keySet();
        System.out.println("keySet(): " + keys);

        // get a set of all values
        Collection<String> values = hashMap.values();
        System.out.println("values(): " + values);

        //replace element
        hashMap.replace(3, "Alex");
        System.out.println("replace values: " + values);

        // deleting element by key 1
        hashMap.remove(1);

        // iterate through elements
        for (Integer key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }

    }
} 