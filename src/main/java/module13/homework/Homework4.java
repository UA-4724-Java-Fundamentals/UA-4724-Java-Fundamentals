package module13.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Homework4 {

    public static void analyzeBirthday(LocalDate birthday) {
        DayOfWeek birthDayOfWeek = birthday.getDayOfWeek();
        System.out.println("Ви народилися в: " + birthDayOfWeek);

        LocalDate after6Months = birthday.plusMonths(6);
        DayOfWeek dayAfter6Months = after6Months.getDayOfWeek();
        System.out.println("Через 6 місяців був: " + dayAfter6Months);

        LocalDate after12Months = birthday.plusMonths(12);
        DayOfWeek dayAfter12Months = after12Months.getDayOfWeek();
        System.out.println("Через 12 місяців був: " + dayAfter12Months);
    }

    public static void main(String[] args) {
        System.out.println("--- Завдання 4: Аналіз дня народження ---");
        LocalDate myBirthday = LocalDate.of(1996, 5, 7);
        analyzeBirthday(myBirthday);
    }
}