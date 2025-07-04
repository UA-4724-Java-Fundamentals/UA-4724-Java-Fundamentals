package com.softserve.academy.module01.Homework08.PracticalTasks.Taks2_Plant;

import java.util.Scanner;

public class Main {
    public static class ColorException extends Exception {
        public ColorException(String message) {
            super(message);
        }
    }

    public static class TypeException extends Exception {
        public TypeException(String message) {
            super(message);
        }
    }

    public static Color parseColor(String color) throws ColorException {
        try {
            return Color.valueOf(color);
        } catch (IllegalArgumentException e) {
            throw new ColorException("Illegal color: " + color);
        }
    }

    public static Type parseType(String type) throws TypeException {
        try {
            return Type.valueOf(type);
        } catch (IllegalArgumentException e) {
            throw new TypeException("Illegal type: " + type);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Plant[] plants = new Plant[5];

        for (int i = 0; i < plants.length; ) {
            int size = 0;
            Color colorEnum = null;
            Type typeEnum = null;

            try {
                System.out.println("Enter size of plant №" + (i + 1) + ":");
                size = Integer.parseInt(sc.nextLine());
                if (size <= 0) {
                    System.out.println("Size must be greater than 0");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            while (true) {
                try {
                    System.out.println("Enter color of plant №" + (i + 1) + ":");
                    String color = sc.nextLine().toUpperCase();
                    colorEnum = parseColor(color);
                    break;
                } catch (ColorException e) {
                    System.out.println(e.getMessage() + ". Try again.");
                }
            }

            while (true) {
                try {
                    System.out.println("Enter type of plant №" + (i + 1) + ":");
                    String type = sc.nextLine().toUpperCase();
                    typeEnum = parseType(type);
                    break;
                } catch (TypeException e) {
                    System.out.println(e.getMessage() + ". Try again.");
                }
            }

            plants[i] = new Plant(size, colorEnum, typeEnum);
            System.out.println("Plant created: " + plants[i]);
            System.out.println();

            i++;
        }
    }
}
