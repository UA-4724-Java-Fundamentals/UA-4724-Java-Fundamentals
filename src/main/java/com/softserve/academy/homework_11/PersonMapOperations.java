package com.softserve.academy.homework_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonMapOperations {
    public static void main(String[] args) {
        // Step 1: Create the personMap
        Map<String, String> personMap = new HashMap<>();

        // Step 2: Add 10 surname - first name pairs
        personMap.put("Hetfield", "James");
        personMap.put("Ulrich", "Lars");
        personMap.put("Hammett", "Kirk");
        personMap.put("Trujillo", "Robert");
        personMap.put("O'riordan ", "Dolores");
        personMap.put("Mercury", "Freddie");
        personMap.put("Bennington", "Chester");
        personMap.put("Osbourne", "Ozzy");
        personMap.put("Rea", "Chris");
        personMap.put("Isaak", "Chris");


        // Step 3: Print the entire map
        System.out.println("\nInitial map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {

            System.out.println("Last name: " + entry.getKey() + ", First name: " + entry.getValue());
        }
        System.out.println("Total number of records: " + personMap.size());


        // Step 4: Check for duplicate first names
        System.out.println("\nChecking for duplicate first names:");

        Map<String, Integer> nameCount = new HashMap<>();


        for (String name : personMap.values()) {
            if (nameCount.containsKey(name)) {
                int count = nameCount.get(name);
                nameCount.put(name, count + 1);
            } else {
                nameCount.put(name, 1);
            }
        }
        boolean hasDuplicates = false;

        for (Map.Entry<String, Integer> entry : nameCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate name: " + entry.getKey() + " - " + nameCount.get(entry.getKey()) + " times");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates");
        }
        // Step 5: Remove a person with the first name "Chris"
        String nameToRemove = "Chris";
        List<String> keysToRemove = new ArrayList<>();


        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(nameToRemove)) {
                keysToRemove.add(entry.getKey());
            }
        }

        if (keysToRemove.isEmpty()) {
            System.out.println("\nName \"" + nameToRemove + "\" not found in the map.");

        } else {
            System.out.println("\nRemoving persons with a name \"" + nameToRemove + "\":");
            for (String key : keysToRemove) {
                personMap.remove(key); // Видаляємо запис за поточним ключем
                System.out.println("  Removed: Last name: " + key + ", Name: " + nameToRemove);
            }
            System.out.println("Totally removed " + keysToRemove.size() + " persons.");
        }

        // Step 6: Print the map after removal
        System.out.println("\nMap after removal:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last name: " + entry.getKey() + ", First name: " + entry.getValue());


        }
        System.out.println("\nNumber of records after removal: " + personMap.size());


    }

}
