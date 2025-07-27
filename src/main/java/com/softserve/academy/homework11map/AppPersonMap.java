package com.softserve.academy.homework11map;

import java.util.*;

public class AppPersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "John");
        personMap.put("White", "Mike");
        personMap.put("Schevchenko", "Taras");
        personMap.put("Miller", "Anna");
        personMap.put("Wilson", "John");
        personMap.put("Taylor", "Ivan");
        personMap.put("Anderson", "Orest");
        personMap.put("Thomas", "Orest");
        personMap.put("Jackson", "Petro");
        personMap.put("Green", "Olivia");

        System.out.println("Original personMap:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last name: " + entry.getKey() + ", First name: " + entry.getValue());
        }
        Collection<String> firstNames = personMap.values();
        Set<String> seen = new HashSet<>();
        boolean hasDuplicate = false;
        for (String name : firstNames) {
            if (!seen.add(name)) {
                hasDuplicate = true;
                break;
            }
        }

        System.out.println("\nAre there at least two people with the same first name? " +
                (hasDuplicate ? "Yes" : "No"));

        String targetName = "Orest";
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(targetName));

        System.out.println("\nMap after removing first name \"" + targetName + "\":");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last name: " + entry.getKey() + ", First name: " + entry.getValue());
        }
    }
}
