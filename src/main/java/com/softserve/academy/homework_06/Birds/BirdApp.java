package com.softserve.academy.homework_06.Birds;

public class BirdApp {
    public static void main(String[] args) {
        Bird[] birds = {
                new Eagle(),
                new Swallow(),
                new Kiwi(),
                new Penguin()


        };

        for (Bird bird : birds) {
            bird.printBirdInfo();
            bird.fly();
            System.out.println();
        }


    }
}
