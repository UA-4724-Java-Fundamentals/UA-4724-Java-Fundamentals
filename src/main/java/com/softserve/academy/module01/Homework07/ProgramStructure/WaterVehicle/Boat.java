package com.softserve.academy.module01.Homework07.ProgramStructure.WaterVehicle;

import com.softserve.academy.module01.Homework07.ProgramStructure.Passengers;

public class Boat extends WaterVehicle {
    private int volume;
    private Passengers passengers;

    public Boat(int volume, Passengers passengers) {
        this.volume = volume;
        this.passengers = passengers;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Sailing transport");
    }

    @Override
    public String toString() {
        isSailing();
        return "Boat [volume=" + volume + ", passengers=" + passengers.getPassengers() + "]";
    }

}
