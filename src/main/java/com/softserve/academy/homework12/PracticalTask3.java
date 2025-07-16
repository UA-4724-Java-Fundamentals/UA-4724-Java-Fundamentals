package com.softserve.academy.homework12;

public class PracticalTask3 {

    public static void main(String[] args) {
        String[] names = new String[]{"12", "sdfgsfd", "Oleksandr", "*&(&()&&", "іпапівап"};
        isCorrectName(names);
    }

    private static void isCorrectName(String[] names) {
        for (String name : names) {
            boolean isCorrect = name.matches("^[a-zA-Z0-9_]{3,15}$");
            System.out.println("Name: " + name + ". Is correct: " + isCorrect);
        }
    }
}
