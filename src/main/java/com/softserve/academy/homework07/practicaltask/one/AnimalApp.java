package com.softserve.academy.homework07.practicaltask.one;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animal = new Animal[]{new Cat(), new Dog()};
        for (Animal animalChild : animal) {
            animalChild.voice();
            animalChild.feed();
        }
    }
}
