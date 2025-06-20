package com.softserve.academy.homework05;

public class HowGoodAreYouReally {
    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 5));
    }

    static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sumClassPoints = 0;
        for (int i : classPoints) {
            sumClassPoints += i;
        }
        return (sumClassPoints / classPoints.length < yourPoints);
    }
}
