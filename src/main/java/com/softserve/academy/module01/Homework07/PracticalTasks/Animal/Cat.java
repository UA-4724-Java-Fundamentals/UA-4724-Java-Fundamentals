package com.softserve.academy.module01.Homework07.PracticalTasks.Animal;

public class Cat implements Animal {

    @Override
    public void voice() {
        int count = (int) (Math.random() * 3) + 1; // випадкове число від 1 до 3
        for (int i = 0; i < count; i++) {
            System.out.print("Meow ");
        }
    }

    @Override
    public void feed() {
        System.out.println("\nThe cat is eating fish");
    }

    @Override
    public String toString() {
        return "Cat";
    }

}
