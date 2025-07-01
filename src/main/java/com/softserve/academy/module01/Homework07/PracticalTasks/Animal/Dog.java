package com.softserve.academy.module01.Homework07.PracticalTasks.Animal;

public class Dog implements Animal {

    @Override
    public void voice() {
        int count = (int)(Math.random() * 3) + 1; // випадкове число від 1 до 3
        for (int i = 0; i < count; i++) {
            System.out.print("Woof ");
        }
    }

    @Override
    public void feed() {
        System.out.println("\nThe dog is eating a bone");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
