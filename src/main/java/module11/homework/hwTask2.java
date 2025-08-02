package module11.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class hwTask2 {

    public static void main(String[] args) {
        // 1. Create and populate the map
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Shevchenko", "Taras");
        personMap.put("Kostenko", "Lina");
        personMap.put("Franko", "Ivan");
        personMap.put("Ukrainka", "Lesya");
        personMap.put("Skovoroda", "Hryhoriy");
        personMap.put("Stus", "Vasyl");
        personMap.put("Khmelnytsky", "Bohdan");
        personMap.put("Mazepa", "Ivan"); // Duplicate first name "Ivan"
        personMap.put("Hrushevsky", "Mykhailo");
        personMap.put("Vernadsky", "Volodymyr");

        // 2. Display the initial contents
        System.out.println("## Initial Map Contents:");
        personMap.forEach((lastName, firstName) -> System.out.println(lastName + ": " + firstName));
        System.out.println();

        // 3. Check for duplicate first names
        Collection<String> firstNames = personMap.values();
        Set<String> uniqueFirstNames = new HashSet<>(firstNames);

        if (uniqueFirstNames.size() < firstNames.size()) {
            System.out.println("Yes, there are at least two people with the same first name.");
        } else {
            System.out.println("No, all first names are unique.");
        }
        System.out.println();

        // 4. Remove a person by first name (e.g., "Ivan")
        String nameToRemove = "Ivan";
        // Use an iterator to safely remove elements while iterating
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(nameToRemove)) {
                iterator.remove();
            }
        }

        // 5. Print the resulting map
        System.out.println("## Map after removing people named '" + nameToRemove + "':");
        personMap.forEach((lastName, firstName) -> System.out.println(lastName + ": " + firstName));
    }
}
