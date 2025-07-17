package com.softserve.academy.homework12;

public class HomeWork2 {
    public static void main(String[] args) {
        String sourceString = "I  am  learning  Java  Fundamental";

        String[] arrString = sourceString.trim().split("\\s+");
        String result = String.join(" ", arrString);

        System.out.println(result);
    }
}
