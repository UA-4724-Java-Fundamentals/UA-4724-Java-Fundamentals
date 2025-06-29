package com.softserve.academy.homework07.optional.three;

class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.println("Boat is sailing");
    }
}
