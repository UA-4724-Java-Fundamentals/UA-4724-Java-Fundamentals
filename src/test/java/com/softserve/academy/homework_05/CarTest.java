package com.softserve.academy.homework_05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarConstructorAndGetters() {
        Car car = new Car("Crossover", 2020, 1.6);
        assertEquals("Crossover", car.getType());
        assertEquals(2020, car.getYearOfProduction());
        assertEquals(1.6, car.getEngineCapacity());
    }

    @Test
    public void testToString() {
        Car car = new Car("SUV", 2022, 3.5);
        String expected = "Car{type='SUV', yearOfProduction=2022, engineCapacity=3.5}";
        assertEquals(expected, car.toString());


    }

    @Test
    public void testCarSortingByYear() {
        Car[] cars = {
                new Car("Crossover", 2020, 1.6),
                new Car("Coupe", 1999, 1.9),
                new Car("SUV", 1984, 2.0),
                new Car("Sedan", 2021, 0.8)
        };
        Arrays.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));

        assertEquals(1984, cars[0].getYearOfProduction());
        assertEquals(1999, cars[1].getYearOfProduction());
        assertEquals(2020, cars[2].getYearOfProduction());
        assertEquals( 2021, cars[3].getYearOfProduction());
    }

}
