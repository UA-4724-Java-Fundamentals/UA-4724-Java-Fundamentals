import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = scanner.nextDouble();

        double area = calculateTriangleArea(side1, side2, side3);
        System.out.println("The area of the triangle is " + area);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        int smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest number is " + smallest);
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100.0) / 100.0;
    }

    public static int findSmallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
