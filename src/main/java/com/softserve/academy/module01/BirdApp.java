package com.softserve.academy.module01;

import java.util.Scanner;

abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    public void displayInfo() {
        System.out.println("Feathers: " + feathers);
        System.out.println("Lays eggs: " + layEggs);
    }
}

abstract class FlyingBird extends Bird {
    public FlyingBird() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}

abstract class NonFlyingBird extends Bird {
    public NonFlyingBird() {
        super(true, true);
    }

    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}

class Eagle extends FlyingBird {
    @Override
    public void displayInfo() {
        System.out.println("Eagle:");
        super.displayInfo();
        fly();
        System.out.println();
    }
}

class Swallow extends FlyingBird {
    @Override
    public void displayInfo() {
        System.out.println("Swallow:");
        super.displayInfo();
        fly();
        System.out.println();
    }
}

class Penguin extends NonFlyingBird {
    @Override
    public void displayInfo() {
        System.out.println("Penguin:");
        super.displayInfo();
        fly();
        System.out.println();
    }
}

class Kiwi extends NonFlyingBird {
    @Override
    public void displayInfo() {
        System.out.println("Kiwi:");
        super.displayInfo();
        fly();
        System.out.println();
    }
}
public class BirdApp {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];

        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.displayInfo();
        }
    }
}
