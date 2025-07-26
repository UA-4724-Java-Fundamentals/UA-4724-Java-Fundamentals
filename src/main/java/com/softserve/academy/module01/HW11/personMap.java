package com.softserve.academy.module01.HW11;

import java.util.*;

public class personMap {
    public static void main(String[] args) {

        Map<String, String> personMap = new HashMap<>();

        personMap.put("Smith", "John");
        personMap.put("Brown", "Alice");
        personMap.put("Taylor", "Orest");
        personMap.put("Johnson", "Emily");
        personMap.put("Daniel", "Michael");
        personMap.put("Jones", "John");
        personMap.put("Davis", "Anna");
        personMap.put("Miller", "David");
        personMap.put("Wilson", "Oleg");
        personMap.put("Moore", "Alice");

        System.out.println("Вихідна карта: ");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println( "\tПрізвище: " + entry.getKey() + ",\t Ім'я: " + entry.getValue());
        }

        Set<String> uniqueNames = new HashSet<>();
        boolean hasDuplicates = false;

        for (String name : personMap.values()) {
            if (!uniqueNames.add(name)) {
                hasDuplicates = true;
                break;
            }
        }

        System.out.println("\n=======================================");

        if (hasDuplicates) {
            System.out.println("Є хоча б дві людини з однаковим ім'ям.");
        } else {
            System.out.println("Усі імена унікальні.");
        }

        String nameToRemove = "Orest";
        String keyToRemove = null;

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals(nameToRemove)) {
                keyToRemove = entry.getKey();
                break;
            }
        }

        System.out.println("=======================================");

        if (keyToRemove != null) {
            personMap.remove(keyToRemove);
            System.out.println("\nВидалена людина з ім'ям " + nameToRemove);
        } else {
            System.out.println("Людина з ім'ям " + nameToRemove + " не знайдена.");
        }

        System.out.println("\nКарта після видалення:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println( "\tПрізвище: " + entry.getKey() + ",\t Ім'я: " + entry.getValue());
        }
    }
}

