package module04;
import java.util.Scanner;


enum Continent{
    ASIA,EUROPE,AMERICA,AFRICA;

    @Override
    public String toString() {
        String name = name();
        return name.charAt(0) + name.substring(1).toLowerCase();
    }

    public static Continent getForContinent(String country){
        return switch (country.toUpperCase()) {
        case "UKRAINE","GERMANY", "FRANCE" -> EUROPE;
        case "USA", "CANADA" -> AMERICA;
        case "JAPAN", "CHINA" -> ASIA;
        case "SOMALI", "UGANDA" -> AFRICA;
        default -> throw new IllegalArgumentException(
                "Unknown country" +
                        country);
        };
    }
}

public class PrTask03 {
    private static Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter county name ");
        String country = SCANNER.nextLine();
        Continent continent = Continent.getForContinent(country);
        System.out.println(
                "Country named '" + country + " belongs to " + continent);
    }
}