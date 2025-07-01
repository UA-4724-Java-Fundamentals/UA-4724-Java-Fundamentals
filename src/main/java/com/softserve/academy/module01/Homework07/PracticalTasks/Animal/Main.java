package com.softserve.academy.module01.Homework07.PracticalTasks.Animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog(), new Dog(), new Cat()};
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.voice();
            animal.feed();
        }
    }
}
