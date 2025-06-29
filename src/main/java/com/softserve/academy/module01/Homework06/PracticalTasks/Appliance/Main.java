package com.softserve.academy.module01.Homework06.PracticalTasks.Appliance;

public class Main {
    public static void main(String[] args) {
        Appliance wm = new WashingMachine("LG", "WM5000", 7);
        Appliance rf = new Refrigerator("Samsung", "RF28", 300);

        wm.displayInfo();
        System.out.println();
        rf.displayInfo();
    }
}