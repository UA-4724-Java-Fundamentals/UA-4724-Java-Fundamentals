package com.softserve.academy.module01.Homework07.PracticalTasks.Person;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Teacher("Alex");
        persons[1] = new Cleaner("Anna");
        persons[2] = new Student("Sofia");

        for (Person person : persons) {
            System.out.println(person);
            if(person instanceof Staff){
                ((Staff)person).salary();
            }
        }
    }
}
