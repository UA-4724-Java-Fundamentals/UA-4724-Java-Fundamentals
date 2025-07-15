package com.softserve.academy.homework11;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class PersonMap {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Kovalenko", "Julia");
        personMap.put("Petrenko", "Mariia");
        personMap.put("Kovalchuk", "Petro");
        personMap.put("Shevchenko", "Andrii");
        personMap.put("Borysenko", "Iryna");
        personMap.put("Dmytrusenko", "Julia");
        personMap.put("Kilimichuk", "Anastasiia");
        personMap.put("Kvaiser", "Inna");   // Same first name as Smith
        personMap.put("Bogdanets", "Liudmyla");
        personMap.put("Rapita", "Orest");

        System.out.println("Initial personMap:");
        personMap.forEach((lastName, firstName) -> System.out.println(lastName + " : " + firstName));

        boolean duplicateFirstName = hasDuplicateFirstName(personMap);
        System.out.println("\nAre there at least two persons with the same first name? " + duplicateFirstName);

        removeByFirstName(personMap, "Orest");

        System.out.println("\npersonMap after removing person(s) with first name 'Orest':");
        personMap.forEach((lastName, firstName) -> System.out.println(lastName + " : " + firstName));
    }

    private static boolean hasDuplicateFirstName(Map<String, String> map) {
        Map<String, Integer> firstNameCounts = new HashMap<>();
        for (String firstName : map.values()) {
            firstNameCounts.put(firstName, firstNameCounts.getOrDefault(firstName, 0) + 1);
            if (firstNameCounts.get(firstName) > 1) {
                return true;
            }
        }
        return false;
    }

    private static void removeByFirstName(Map<String, String> map, String targetFirstName) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equalsIgnoreCase(targetFirstName)) {
                iterator.remove();
            }
        }
    }
}

