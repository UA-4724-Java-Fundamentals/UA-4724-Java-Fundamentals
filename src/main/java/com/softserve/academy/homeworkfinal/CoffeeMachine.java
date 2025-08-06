package com.softserve.academy.homeworkfinal;

import java.util.Scanner;

public class CoffeeMachine {
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cups = 9;
    private int money = 550;
    private int cupsMade = 0;
    private final int CLEANING_THRESHOLD = 10;
    private boolean needsCleaning = false;

    private final Scanner scanner;

    CoffeeMachine(Scanner scanner) {
        this.scanner = scanner;
    }
    public void start() {
        while (true) {
            System.out.println("Write action (buy, fill, take, clean, remaining, exit):" );
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printState();
                    break;
                case "clean":
                    clean();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Unknown action.");
            }
        }
    }
    private void printState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    private void buy() {
        if (needsCleaning) {
            System.out.println("I need cleaning!");
            return;
        }

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();
        if (choice.equals("back")) {
            return;
        }

        CoffeeType coffee;
        switch (choice) {
            case "1":
                coffee = CoffeeType.ESPRESSO;
                break;
            case "2":
                coffee = CoffeeType.LATTE;
                break;
            case "3":
                coffee = CoffeeType.CAPPUCCINO;
                break;
            default:
                System.out.println("Unknown selection.");
                return;
        }
        if (!hasEnoughResources(coffee)) return;

        System.out.println("I have enough resources, making you a coffee!");
        water -= coffee.getWater();
        milk -= coffee.getMilk();
        beans -= coffee.getBeans();
        cups--;
        money += coffee.getCost();
        cupsMade++;

        if (cupsMade >= CLEANING_THRESHOLD) {
            needsCleaning = true;
        }
    }
    private boolean hasEnoughResources(CoffeeType coffee) {
        if (water < coffee.getWater()) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (milk < coffee.getMilk()) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (beans < coffee.getBeans()) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        } else if (cups < 1) {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }
        return true;
    }
    private void fill() {
        System.out.println("Write how many ml of water you want to add:");
        water += Integer.parseInt(scanner.nextLine());

        System.out.println("Write how many ml of milk you want to add:");
        milk += Integer.parseInt(scanner.nextLine());

        System.out.println("Write how many grams of coffee beans you want to add:");
        beans += Integer.parseInt(scanner.nextLine());

        System.out.println("Write how many disposable cups you want to add:");
        cups += Integer.parseInt(scanner.nextLine());
    }

    private void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    private void clean() {
        if (needsCleaning) {
            cupsMade = 10;
            needsCleaning = false;
            System.out.println("I have been cleaned!");
        } else {
            System.out.println("No need to clean yet.");
        }
    }
}
