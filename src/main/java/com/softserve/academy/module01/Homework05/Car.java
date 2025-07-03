package com.softserve.academy.module01.Homework05;

import java.util.Scanner;

public class Car {

    private String type;
    private int volume;
    private int year;


    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] car = new Car[4];

        for (int i = 0; i < 4; ) {
            car[i] = new Car();
            System.out.println("Введіть рік випуску " + (i + 1) + " автомобіля");
            try {
                int b = sc.nextInt();
                sc.nextLine();
                if (b < 0) {
                    throw new Exception("Negative number");
                }
                car[i].setYear(b);
                i++;
            } catch (Exception e) {
                System.out.println("Invalid value " + e.getMessage());
                if (sc.hasNextLine()) {
                    sc.nextLine();
                }
            }


        }

        car[0].setType("Sedan");
        car[0].setVolume(2);

        car[1].setType("Coupe");
        car[1].setVolume(3);

        car[2].setType("Hatchback");
        car[2].setVolume(3);

        car[3].setType("SUV");
        car[3].setVolume(2);


        for (int i = 0; i < car.length - 1; i++) {
            for (int j = 0; j < car.length - 1 - i; j++) {
                if (car[j].getYear() > car[j + 1].getYear()) {
                    Car tmp = car[j];
                    car[j] = car[j + 1];
                    car[j + 1] = tmp;
                }
            }
        }

        for (Car c : car) {
            System.out.println(c.getType() + " " + c.getYear());
        }


    }
}
