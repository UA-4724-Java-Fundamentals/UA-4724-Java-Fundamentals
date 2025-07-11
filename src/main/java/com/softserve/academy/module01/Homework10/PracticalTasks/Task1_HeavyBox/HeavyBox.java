package com.softserve.academy.module01.Homework10.PracticalTasks.Task1_HeavyBox;

public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public String getContents() {
        return contents;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Weight : " + getWeight() + "\nContents : " + getContents();
    }
}
