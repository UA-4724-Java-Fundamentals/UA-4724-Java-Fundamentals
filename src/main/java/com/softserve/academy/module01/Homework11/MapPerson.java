package com.softserve.academy.module01.Homework11;

import java.util.HashMap;
import java.util.Map;

public class MapPerson {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Doe", "John");
        personMap.put("Smith", "Alice");
        personMap.put("Johnson", "Bob");
        personMap.put("Williams", "Emma");
        personMap.put("Brown", "Michael");
        personMap.put("Jones", "Olivia");
        personMap.put("Miller", "David");
        personMap.put("Davis", "Sophia");
        personMap.put("Wilson", "James");
        personMap.put("Taylor", "Isabella");

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("===========");
        boolean duplicate = false;
        for (String name : personMap.values()) {
            int count = 0;
            for (String name2 : personMap.values()) {
                if (name.equals(name2)) {
                    count++;
                }
            }
            if (count > 1) {
                duplicate = true;
                break;
            }
        }

        if (duplicate) {
            System.out.println("There are similar names");
        } else {
            System.out.println("There are no identical names");
        }

        System.out.println("===========");

        for (int i = 0; i < personMap.size(); i++) {
            String key = personMap.keySet().toArray()[i].toString();
            String value = personMap.get(key);
            if (value.equals("David")) {
                personMap.remove(key);
                break;
            }
        }

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
