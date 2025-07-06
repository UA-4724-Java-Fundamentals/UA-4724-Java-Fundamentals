package com.softserve.academy.homework6abstract;

public class AppBird {

    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle("Black Eagle ", true, true),
                new Swallow("White Swallow ", true, true),
                new Penguin("King Penguin ", false, true),
                new Kiwi("Little Kiwi", true, true)
        };
        for (Bird bird: birds){
            bird.fly();
            System.out.println(bird.toString());
        }
    }

}
