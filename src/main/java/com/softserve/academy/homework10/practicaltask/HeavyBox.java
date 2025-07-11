package com.softserve.academy.homework10.practicaltask;

import java.util.ArrayList;
import java.util.List;

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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>(List.of(
                new HeavyBox(5, "String"),
                new HeavyBox(12, "Integer"),
                new HeavyBox(122, "Double")
        ));

        for (HeavyBox heavyBox : boxes) {
            System.out.println(heavyBox.getContents());
        }

        boxes.removeLast();
        System.out.println(boxes);

        boxes.clear();
        System.out.println(boxes);
    }
}
