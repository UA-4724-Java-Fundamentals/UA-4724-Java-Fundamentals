package com.softserve.academy.module01.Homework04;

import java.util.Scanner;

public class Dog {
    enum breed {
        GERMANSHEPHERD, GOLDENRETRIEVER, LABRADORRETRIEVER, BULLDOG,
        POODLE, BEAGLE, ROTTWEILER, BOXER, HUSKY, DOBERMAN;
    }

    private String name;
    private breed dogbreed;
    private int age;

    public String getName() {
        return name;
    }

    public breed getBreed() {
        return dogbreed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(breed dogbreed) {
        this.dogbreed = dogbreed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void samenessOfNames(Dog[] dogs) {
        if (dogs[0].getName().equals(dogs[1].getName()) || dogs[1].getName().equals(dogs[2].getName())
                || dogs[0].getName().equals(dogs[2].getName())) {
            System.out.println("There are dogs with the same names");
        } else {
            System.out.println("No dogs have the same name");
        }
    }

    public static void oldestDog(Dog[] dogs) {
        Dog oldstDog = dogs[0];
        for (Dog d : dogs) {
            if (oldstDog.getAge() < d.getAge()) {
                oldstDog = d;
            }

        }
        System.out.println("Oldest dog:" + oldstDog.getName() +" "+ oldstDog.getAge());
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog[] dogs = new Dog[3];

        for (int i = 0; i < 3; i++) {
            dogs[i] = new Dog();
            System.out.println("Enter the name of the dog");
            dogs[i].setName(sc.nextLine());
            System.out.println("Enter the breed of the dog");
            String input = sc.nextLine().toUpperCase();
            dogs[i].setBreed(breed.valueOf(input));
            System.out.println("Enter the age of the dog");
            dogs[i].setAge(sc.nextInt());
            sc.nextLine();


        }
        samenessOfNames(dogs);
        oldestDog(dogs);
    }
}
