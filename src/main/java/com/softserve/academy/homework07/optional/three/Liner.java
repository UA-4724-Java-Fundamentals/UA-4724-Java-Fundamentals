package com.softserve.academy.homework07.optional.three;

class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.println("Liner is sailing");
    }
}
