package com.softserve.academy.module01.Homework07.PracticalTasks.Person;

public class Cleaner extends Staff {

    public static final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name) {
        setName(name);
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Cleaner salary:8000");
    }

}
