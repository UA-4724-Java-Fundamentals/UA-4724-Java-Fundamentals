package com.softserve.academy.module01.homework04;

import java.util.Scanner;

public class Dog {

    enum Breed {
        LABRADOR("Labrador Retriever", "Friendly, energetic, and good with families."),
        BULLDOG("English Bulldog", "Calm, courageous, and excellent companion dog."),
        BEAGLE("Beagle", "Lively, curious, and friendly with children."),
        PUG("Pug", "Charming, mischievous, and affectionate."),
        GOLDEN_RETRIEVER("Golden Retriever", "Intelligent, friendly, and great with kids."),
        GERMAN_SHEPHERD("German Shepherd", "Loyal, confident, and highly intelligent."),
        SHIH_TZU("Shih Tzu", "Affectionate, outgoing, and great for apartment living."),
        BORDER_COLLIE("Border Collie", "Energetic, intelligent, and an excellent working dog."),
        DACHSHUND("Dachshund", "Curious, brave, and friendly with a distinctive long body."),
        ROTTWEILER("Rottweiler", "Confident, fearless, and great guard dogs.");

        private final String fullName;
        private final String description;

        Breed(String fullName, String description) {
            this.fullName = fullName;
            this.description = description;
        }

        public String getFullName() {
            return fullName;
        }

        public String getDescription() {
            return description;
        }
    }

    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog dog1 = createDog(scanner);
        Dog dog2 = createDog(scanner);
        Dog dog3 = createDog(scanner);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("Error: No two dogs can have the same name.");
        } else {
            Dog oldestDog = getOldestDog(dog1, dog2, dog3);
            System.out.println("The oldest dog is " + oldestDog.getName() + " of breed " + oldestDog.getBreed().getFullName() + ".");
            System.out.println("Breed Description: " + oldestDog.getBreed().getDescription());
        }

        scanner.close();
    }

    private static Dog createDog(Scanner scanner) {
        System.out.print("Enter dog's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter dog's breed (Labrador, Bulldog, Beagle, Pug, Golden Retriever, German Shepherd, Shih Tzu, Border Collie, Dachshund, Rottweiler): ");
        String breedStr = scanner.nextLine();
        Breed breed = Breed.valueOf(breedStr.toUpperCase().replace(" ", "_"));

        System.out.print("Enter dog's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        return new Dog(name, breed, age);
    }

    private static Dog getOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        if (dog1.getAge() >= dog2.getAge() && dog1.getAge() >= dog3.getAge()) {
            return dog1;
        } else if (dog2.getAge() >= dog1.getAge() && dog2.getAge() >= dog3.getAge()) {
            return dog2;
        } else {
            return dog3;
        }
    }
}