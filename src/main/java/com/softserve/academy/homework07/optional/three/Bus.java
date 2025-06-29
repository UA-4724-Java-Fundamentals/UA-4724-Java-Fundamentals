package com.softserve.academy.homework07.optional.three;

class Bus extends GroundVehicle {
    private String route;

    public Bus() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    void drive() {
        System.out.println("Bus driving");
    }
}
