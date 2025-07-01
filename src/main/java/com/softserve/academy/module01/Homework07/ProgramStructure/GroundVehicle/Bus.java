package com.softserve.academy.module01.Homework07.ProgramStructure.GroundVehicle;

import com.softserve.academy.module01.Homework07.ProgramStructure.Passengers;

public class Bus extends GroundVehicle {
    private String route;
    private Passengers passengers;

    public Bus(String route, Passengers passengers) {
        this.route = route;
        this.passengers = passengers;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus driving " + getRoute() + "with " + passengers + " passengers");
    }

    @Override
    public String toString() {
        return "Bus [route=" + route + ", passengers=" + passengers.getPassengers() + "]";
    }

}
