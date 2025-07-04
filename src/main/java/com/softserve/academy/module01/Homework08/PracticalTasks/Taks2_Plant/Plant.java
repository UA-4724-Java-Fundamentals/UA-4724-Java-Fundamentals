package com.softserve.academy.module01.Homework08.PracticalTasks.Taks2_Plant;

public class Plant {

    private int size;
    private Color color;
    private Type type;


    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

}
