package com.softserve.academy.homework07.practicaltask.two;

public class PersonApp {
    public static void main(String[] args) {
        Person[] persons = new Person[]{new Cleaner(), new Teacher(), new Student()};
        for (Person person : persons) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
