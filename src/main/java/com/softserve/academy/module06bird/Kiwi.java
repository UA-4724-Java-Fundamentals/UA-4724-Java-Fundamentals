package com.softserve.academy.module06bird;

public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        super("Kiwi");
    }

    @Override
    public String getName() {
        return super.getName() + "  comment from class Kiwi";
    }
}
