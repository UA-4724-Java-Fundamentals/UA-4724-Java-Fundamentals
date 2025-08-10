package module13.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Homework2 {

    public static boolean validateDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Завдання 2: Валідація дати ---");
        System.out.println("Чи є '08.10.25' валідною датою? " + validateDate("08.10.25"));
        System.out.println("Чи є '13.10.25' валідною датою? " + validateDate("13.10.25"));
        System.out.println("Чи є '08-10-25' валідною датою? " + validateDate("08-10-25"));
    }
}