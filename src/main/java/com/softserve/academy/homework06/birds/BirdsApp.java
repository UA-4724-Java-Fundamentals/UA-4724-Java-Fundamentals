package com.softserve.academy.homework06.birds;

public class BirdsApp {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle(),
                new Swallow(),
                new Penguin(),
                new Kiwi()
        };

        for (Bird bird : birds) {
            System.out.println(bird);
            bird.fly();
            System.out.println();
        }
    }
}
