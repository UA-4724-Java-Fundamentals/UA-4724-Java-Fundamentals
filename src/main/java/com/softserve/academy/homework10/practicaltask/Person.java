package com.softserve.academy.homework10.practicaltask;

import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35)
        );

        System.out.println(PersonMerger.filterByMinimumAge(personList, 30));
    }
}

class PersonMerger {

    // TODO: Implement method to merge and sort persons by age
    public static List<Person> mergeAndSortPersons(List<Person> list1, List<Person> list2) {
        Set<Person> mergedSet = new HashSet<>();

        if (list1 != null) {
            mergedSet.addAll(list1);
        }

        if (list2 != null) {
            mergedSet.addAll(list2);
        }

        List<Person> resultList = new ArrayList<>(mergedSet);

        resultList.sort(Comparator.comparingInt(Person::getAge));

        return resultList;
    }


    // TODO: Implement method to filter persons by a minimum age
    public static List<Person> filterByMinimumAge(List<Person> persons, int minAge) {
        List<Person> result = new ArrayList<>();
        if (persons == null || persons.isEmpty()) {
            return result;
        }
        if (minAge < 0) {
            return result;
        }
        for (Person person : persons) {
            if (person.getAge() >= minAge) {
                result.add(person);
            }
        }
        return result;
    }

    // TODO: Implement method to calculate the average age of persons
    public static double calculateAverageAge(List<Person> persons) {
        int totalAge = 0;

        if (persons == null || persons.isEmpty()) {
            return totalAge;
        }

        for (Person person : persons) {
            totalAge += person.getAge();
        }
        return totalAge / (double) persons.size();
    }
}