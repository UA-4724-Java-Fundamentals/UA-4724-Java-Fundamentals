package com.softserve.academy.module07inter;

public interface Volumetric {
    double PI = 3.14; // public static final

    double getVolume(); // public abstract

    static double getPI() { // From JDK 1.8
        return Volumetric.PI;
    }

    default String info() { // public From JDK 1.8
        return definition() +
                "1 litre = (10 cm)^3 = 1000 cubic centimetres = 0.001 cubic metres";
    }

    private String definition() { // From JDK 9
        return "Volume is the quantity of three-dimensional space" +
                "enclosed by a closed surface.\n";
    }

}
