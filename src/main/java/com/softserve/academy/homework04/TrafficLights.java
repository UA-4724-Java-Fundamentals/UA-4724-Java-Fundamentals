package com.softserve.academy.homework04;

import java.util.List;

public class TrafficLights {
    public static void main(String[] args) {
        System.out.println(updateLight("red"));
    }

    public static String updateLight(String current) {
        List<String> colors = List.of("green", "yellow", "red");

        int index = colors.indexOf(current);

        if (index == -1) {
            System.out.println("Element not found");
        }

        return index < colors.size() - 1 ? colors.get(index + 1) : colors.getFirst();
    }
}
