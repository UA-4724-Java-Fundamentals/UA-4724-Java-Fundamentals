package module03.AreaTriangle;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double fistSide = getNum("Enter first side: ");
        double secondSide = getNum("Enter second side: ");
        double thirdSide = getNum("Enter third side: ");
        AreaTriangle triangle = new AreaTriangle(fistSide, secondSide, thirdSide);
        if (triangle.triangleIsValid()) {
            System.out.println("Available values :)");

        } else {
            System.out.println("Values is not correct :(");
            return;
        }
        System.out.println(triangle.triangleCalculateArea());
    }

    public static double getNum(String mess) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(mess);
        return scanner.nextDouble();
    }
}
