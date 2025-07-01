package com.softserve.academy.module01.Homework07.ProgramStructure;

public abstract class Passengers {
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    @Override
    public String toString() {
        return String.valueOf(passengers);
    }

}
