package module03.SmallestNumber;


import java.util.Scanner;

public class SmallestNumberApp {
    public static void main(String[] args) {

        double firstNumber = getNum("Erst number: ");
        double secondNumber = getNum("Second number: ");
        double thirdNumber = getNum("Third number: ");

        SmallestNumber smallestNumber = new SmallestNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println("Smallest number is " + smallestNumber.minValue());
    }

    public static double getNum(String mes) {
        Scanner scr = new Scanner(System.in);
        System.out.println(mes);
        return scr.nextDouble();
    }
}
