package com.softserve.academy.module01.Homework10.PracticalTasks.Task1_HeavyBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> heavyBox = new ArrayList<>(
                Arrays.asList(
                        new HeavyBox(2, "smth"),
                        new HeavyBox(5, "smth"),
                        new HeavyBox(1, "smth"),
                        new HeavyBox(9, "smth")
                ));

        heavyBox.forEach(System.out::println);

        heavyBox.get(0).setWeight(heavyBox.get(0).getWeight() + 1);
        heavyBox.removeLast();
        heavyBox.forEach(System.out::println);

        heavyBox.clear();
        System.out.println(heavyBox);

    }
}
