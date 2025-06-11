package com.softserve.academy.homework03;

public class Dinglemouse {

    public static void main(String[] args) {
        Dinglemouse.INST.plus100(23);
    }

    private static int ONE_HUNDRED = 100;

    public static final Dinglemouse INST = new Dinglemouse();

    private int value;

    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }
}