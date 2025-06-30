package com.softserve.academy.module06bird;

public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super("Kiwi");
    }

    public String getName() {
        return super.getName() + "  comment from class Kiwi";
    }
}
