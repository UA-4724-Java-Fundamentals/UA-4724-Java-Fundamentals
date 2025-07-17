package module08.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ділення на нуль неможливе!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть перше число (ділене): ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть друге число (дільник): ");
            double num2 = scanner.nextDouble();

            double result = div(num1, num2);
            System.out.println("Результат ділення: " + result);

        } catch (InputMismatchException e) {
            System.err.println("Помилка! Введено не число.");
        } catch (ArithmeticException e) {
            System.err.println("Помилка! " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Сталася непередбачувана помилка: " + e.getMessage());
        }
    }
}
