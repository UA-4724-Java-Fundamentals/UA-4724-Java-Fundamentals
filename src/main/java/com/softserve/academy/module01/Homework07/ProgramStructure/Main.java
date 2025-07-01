package com.softserve.academy.module01.Homework07.ProgramStructure;
import com.softserve.academy.module01.Homework07.ProgramStructure.FlyingVehicle.Helicopter;
import com.softserve.academy.module01.Homework07.ProgramStructure.FlyingVehicle.Plane;
import com.softserve.academy.module01.Homework07.ProgramStructure.GroundVehicle.Bus;
import com.softserve.academy.module01.Homework07.ProgramStructure.GroundVehicle.Car;
import com.softserve.academy.module01.Homework07.ProgramStructure.GroundVehicle.Motorcycle;
import com.softserve.academy.module01.Homework07.ProgramStructure.WaterVehicle.Boat;
import com.softserve.academy.module01.Homework07.ProgramStructure.WaterVehicle.Liner;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Vehicle> transport = new ArrayList<>();
       transport.add(new Boat(12,new Passengers(8){}));
       transport.add(new Liner(5,new Passengers(200){}));
       transport.add(new Plane(12,new Passengers(120){}));
       transport.add(new Helicopter(12,300, new Passengers(4){}));
       transport.add(new Bus("Lviv-Ternopil", new Passengers(60){}));
       transport.add(new Car("BMW M5", new Passengers(4){}));
       transport.add(new Motorcycle(260, new Passengers(1){}));

       for(Vehicle vehicle : transport) {
           System.out.println(vehicle.toString());
           System.out.println();
       }

    }
}
