package com.softserve.academy.module4;

/**
 * This class demonstrates the usage of switch expressions in Java.
 * It shows how to use the arrow syntax for concise switch expressions.
 */
public class SwitchExample {

    public static void main(String[] args) {
        DayMessageService service = new DayMessageService();
        SwitchExample example = new SwitchExample();
        example.showDayMessage(service, "fgbrg");
        example.showDayMessage(service, "Monday");
    }

    /**
     * Shows the message for a specific day.
     *
     * @param service the service to use for getting day messages
     * @param day     the day to get a message for
     */
    private void showDayMessage(DayMessageService service, String day) {
        String message = service.getDayMessage(day);
        System.out.println("Message for " + day + ": " + message);
    }
}

/**
 * Service class that provides day-specific messages.
 * This separates the business logic from the demonstration code.
 */
class DayMessageService {

    /**
     * Returns a message specific to the given day of the week.
     * Uses a switch expression with arrow syntax to determine the appropriate message.
     *
     * @param day the day of the week
     * @return a message corresponding to the day
     */
    public String getDayMessage(String day) {
        return switch (day) {
            case "Monday" -> "Start of the work week!";
            case "Tuesday" -> "It's Tuesday, keep going!";
            case "Wednesday" -> "Midweek already!";
            case "Thursday" -> "Almost there!";
            case "Friday" -> "It's Friday, weekend is near!";
            case "Saturday" -> "Enjoy your weekend!";
            case "Sunday" -> "Rest and prepare for the week ahead.";
            default -> "Invalid day!";
        };
    }
}
