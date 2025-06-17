package com.softserve.academy.homework04;

import java.util.Scanner;

public class CountryContinentFinder {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter a country: ");
        String country = scanner.nextLine();
        Continent continent = switch (country.toUpperCase()) {
            case "FRANCE", "GERMANY", "UKRAINE", "ITALY", "POLAND" -> Continent.EUROPE;
            case "CHINA", "JAPAN", "INDIA", "THAILAND", "SOUTH KOREA" -> Continent.ASIA;
            case "KENYA", "EGYPT", "NIGERIA", "SOUTH AFRICA", "MOROCCO" -> Continent.AFRICA;
            case "USA", "CANADA", "MEXICO" -> Continent.NORTH_AMERICA;
            case "BRAZIL", "ARGENTINA", "CHILE", "COLOMBIA" -> Continent.SOUTH_AMERICA;
            case "AUSTRALIA", "NEW ZEALAND" -> Continent.AUSTRALIA;
            case "ANTARCTICA" -> Continent.ANTARCTICA;
            default -> throw new IllegalArgumentException("Unknown country: " + country);
        };
        System.out.println(continent);
    }

    public enum Continent {
        AFRICA,
        ASIA,
        EUROPE,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AUSTRALIA,
        ANTARCTICA
    }
}
