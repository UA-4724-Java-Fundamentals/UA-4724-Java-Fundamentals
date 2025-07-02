package com.softserve.academy.homework_06.Birds;

public abstract class Bird {

    private String feathers;
    private boolean layEggs;

    public Bird(String feathers, boolean layEggs) {

        this.feathers = feathers;
        this.layEggs = layEggs;
    }


    public String getFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public abstract void fly();

    public void printBirdInfo() {
        System.out.println("Feathers: " + feathers);
        System.out.println("Lays eggs: " + layEggs);
    }

}
