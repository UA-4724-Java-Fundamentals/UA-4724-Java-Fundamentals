import java.util.Scanner;

public class FlowerBedCalculator {
    public static void main(String[] args) {
        int radius;
        double perimeter, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = input.nextInt();

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

        System.out.println("perimeter= " + perimeter + " \narea= " + area);
    }
}