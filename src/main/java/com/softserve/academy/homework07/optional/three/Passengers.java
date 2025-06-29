package com.softserve.academy.homework07.optional.three;

abstract class Passengers {
    private int passengers; //red cross in uml, but private better

    public Passengers() {
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
