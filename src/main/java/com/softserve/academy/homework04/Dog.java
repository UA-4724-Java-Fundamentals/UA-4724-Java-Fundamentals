package com.softserve.academy.homework04;

import java.util.Objects;
import java.util.Scanner;

public class Dog {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Dog dog1 = new Dog("James", Breed.POODLE, 2);
        Dog dog2 = new Dog("Mike", Breed.BULLDOG, 4);
        Dog dog3 = new Dog("Mike", Breed.LABRADOR, 10);

        System.out.println(
                Objects.equals(dog1.getName(), dog2.getName()) ||
                        Objects.equals(dog1.getName(), dog3.getName()) ||
                        Objects.equals(dog2.getName(), dog3.getName())
        );

        System.out.println("Name of oldest dog: " + Dog.oldestDog.getName());
    }


    private String name;
    private int age;
    public static Dog oldestDog = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.age = age;
        updateOldestDog(this);
    }

    public enum Breed {
        LABRADOR, BULLDOG, POODLE
    }

    private static void updateOldestDog(Dog dog) {
        if (oldestDog == null || dog.age > oldestDog.age) {
            oldestDog = dog;
        }
    }
}
