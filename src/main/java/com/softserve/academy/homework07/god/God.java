package com.softserve.academy.homework07.god;

public class God {
    public static Human[] create() {
        Man adam = new Man();
        Woman woman = new Woman();
        return new Human[]{adam, woman};
    }
}
