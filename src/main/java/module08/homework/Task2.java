package module08.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

public class Task2 {

    public static int readNumber(Scanner scanner, int start, int end) throws NumberOutOfRangeException {
        System.out.printf("Введіть число в діапазоні (%d...%d): ", start, end);
        int number = scanner.nextInt();

        if (number <= start || number >= end) {
            throw new NumberOutOfRangeException("Введене число " + number + " виходить за межі діапазону.");
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int lowerBound = 1;
        final int upperBound = 100;

        System.out.printf("Введіть 10 чисел (a1, a2, ...), щоб виконувалась умова: %d < a1 < ... < a10 < %d\n", lowerBound, upperBound);

        while (numbers.size() < 10) {
            try {
                int number = readNumber(scanner, lowerBound, upperBound);
                numbers.add(number);
                lowerBound = number;
            } catch (InputMismatchException e) {
                System.err.println("Помилка! Будь ласка, введіть ціле число.");
                scanner.next();
            } catch (NumberOutOfRangeException e) {
                System.err.println("Помилка! " + e.getMessage());
            }
        }

        System.out.println("\nВи успішно ввели послідовність:");
        System.out.println(numbers);
        scanner.close();
    }
}
