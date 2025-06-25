package com.softserve.academy.homework_04;
import java.util.Scanner;

public class DogApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many dogs do you want to enter?");
        int count = scanner.nextInt();
        scanner.nextLine();

        Dog[] dogs = new Dog[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter dog " + (i + 1) + " name:");
            String name = scanner.nextLine();

            System.out.println("Enter dog " + (i + 1) + " age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter dog " + (i + 1) + " breed (CORGI, SHEPHERD, LABRADOR):");
            String breedInput = scanner.nextLine().toUpperCase();

            Dog.Breed breed;
            try {
                breed = Dog.Breed.valueOf(breedInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid breed. Setting to CORGI by default.");
                breed = Dog.Breed.CORGI;
            }

            dogs[i] = new Dog(name, age, breed);
        }


        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    System.out.println("Dog " + (i + 1) + " and Dog " + (j + 1) + " have the same name: " + dogs[i].getName());
                }
            }
        }


        int maxAge = dogs[0].getAge();
        for (int i = 1; i < count; i++) {
            if (dogs[i].getAge() > maxAge) {
                maxAge = dogs[i].getAge();
            }
        }


        System.out.println("Oldest dog(s) with age " + maxAge + ":");
        for (int i = 0; i < count; i++) {
            if (dogs[i].getAge() == maxAge) {
                System.out.println("- " + dogs[i].getName() + ", Breed: " + dogs[i].getBreed());
            }
        }
    }
}
