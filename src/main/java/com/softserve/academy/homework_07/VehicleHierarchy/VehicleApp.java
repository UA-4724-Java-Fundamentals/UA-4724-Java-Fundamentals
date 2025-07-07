package com.softserve.academy.homework_07.VehicleHierarchy;

// VehicleApp2 - All data is set directly in the code (no user input)
public class VehicleApp {
    public static void main(String[] args) {
        // Liners - Large passenger ships with multiple decks
        Liner liner = new Liner(2000, 5);
        System.out.println("Liner created: Passengers = " + liner.getPassengers() +
                ", Floors = " + liner.getFloors());
        liner.isSailing();

        // Boats - Smaller water vehicles with volume characteristics
        Boat[] boats = {
                new Boat(12, 15),
                new Boat(8, 10),
                new Boat(20, 30)
        };
        for (int i = 0; i < boats.length; i++) {
            System.out.println("Boat #" + (i + 1) + ": Passengers = " + boats[i].getPassengers() +
                    ", Volume = " + boats[i].getVolume() + " cubic meters");
        }

        // Planes - Flying vehicles with max distance capabilities
        Plane plane1 = new Plane(180, 5000);
        Plane plane2 = new Plane(220, 7000);
        System.out.println("Plane 1: Passengers = " + plane1.getPassengers() +
                ", Max Distance = " + plane1.getMaxDistance() + " km");
        System.out.println("Plane 2: Passengers = " + plane2.getPassengers() +
                ", Max Distance = " + plane2.getMaxDistance() + " km");

        // Helicopters - Flying vehicles with weight and max height
        Helicopter[] helicopters = {
                new Helicopter(6, 800, 3000),
                new Helicopter(4, 700, 2800),
                new Helicopter(8, 900, 3500)
        };
        for (int i = 0; i < helicopters.length; i++) {
            System.out.println("Helicopter #" + (i + 1) + ": Passengers = " + helicopters[i].getPassengers() +
                    ", Weight = " + helicopters[i].getWeight() + " kg" +
                    ", Max Height = " + helicopters[i].getMaxHeight() + " meters");
        }

        // Buses - Ground vehicles with routes and passengers
        Bus[] buses = {
                new Bus(40, "12A"),
                new Bus(55, "7B"),
                new Bus(30, "24C")
        };
        for (int i = 0; i < buses.length; i++) {
            System.out.println("Bus #" + (i + 1) + ": Route = " + buses[i].getRoute() +
                    ", Passengers = " + buses[i].getPassengers());
        }

        // Motorcycles - Fast two-wheelers
        Motorcycle motorcycle = new Motorcycle(1, 180);
        System.out.println("Motorcycle created: Passengers = " + motorcycle.getPassengers() +
                ", Max Speed = " + motorcycle.getMaxSpeed() + " km/h");

        // Cars - Common ground vehicles with model and passengers
        Car[] cars = {
                new Car(5, "Toyota Camry"),
                new Car(4, "Honda Civic"),
                new Car(2, "Mazda MX-5")
        };
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car #" + (i + 1) + ": Model = " + cars[i].getModel() +
                    ", Passengers = " + cars[i].getPassengers());
        }
    }
}
