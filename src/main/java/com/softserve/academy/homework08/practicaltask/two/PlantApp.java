package com.softserve.academy.homework08.practicaltask.two;

import java.util.Arrays;

public class PlantApp {
    public static void main(String[] args) {
        try {
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(12, "green", "tree");
            plants[1] = new Plant(43, "white", "flower");
            plants[2] = new Plant(12, "red", "bush");
            plants[3] = new Plant(44, "yellow", "mouse");
            plants[4] = new Plant(67, "black", "grass");
            System.out.println(Arrays.toString(plants));
        } catch (ColorException | TypeException e) {
            System.out.println(e.getMessage());
        }
    }

}