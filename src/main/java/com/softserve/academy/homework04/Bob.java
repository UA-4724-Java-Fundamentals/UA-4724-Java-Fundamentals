package com.softserve.academy.homework04;

public class Bob {
    public static void main(String[] args) {
        System.out.println(enough(10, 5, 5));
    }

    public static int enough(int cap, int on, int wait) {
        int availablePlaces = cap - on;
        return availablePlaces - wait < 0 ? -(availablePlaces - wait) : 0;
    }
}
