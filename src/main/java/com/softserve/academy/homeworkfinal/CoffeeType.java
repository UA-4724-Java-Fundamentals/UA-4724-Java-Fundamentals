package com.softserve.academy.homeworkfinal;

public class CoffeeType {
    private int water;
    private int milk;
    private int beans;
    private int cost;

    CoffeeType(int water, int milk, int beans, int cost) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cost = cost;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCost() {
        return cost;
    }

    static final CoffeeType ESPRESSO = new CoffeeType(250, 0, 16, 4);
    static final CoffeeType LATTE = new CoffeeType(350, 75, 20, 7);
    static final CoffeeType CAPPUCCINO = new CoffeeType(200, 100, 12, 6);
}
