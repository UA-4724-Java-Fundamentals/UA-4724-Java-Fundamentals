package com.softserve.academy.module01.HW13;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.function.Function;
import java.util.function.Consumer;

public class Birthday {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, 7, 15);

        Function<LocalDate, String> dayOfWeekInfo = date -> {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            DayOfWeek dayAfter6Months = date.plusMonths(6).getDayOfWeek();
            DayOfWeek dayAfter12Months = date.plusMonths(12).getDayOfWeek();

            return "День тижня: " + dayOfWeek +
                    "\nДень тижня після 6 months: " + dayAfter6Months +
                    "\nДень тижня після 12 months: " + dayAfter12Months;
        };

        Consumer<String> printer = System.out::println;

        String info = dayOfWeekInfo.apply(birthday);
        printer.accept(info);
    }
}

