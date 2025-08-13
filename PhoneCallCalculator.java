import java.util.Scanner;

public class PhoneCallCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double c1, c2, c3, t1, t2, t3;

        System.out.print("Enter cost per minute for call 1: ");
        c1 = scanner.nextDouble();
        System.out.print("Enter duration (minutes) for call 1: ");
        t1 = scanner.nextDouble();

        System.out.print("Enter cost per minute for call 2: ");
        c2 = scanner.nextDouble();
        System.out.print("Enter duration (minutes) for call 2: ");
        t2 = scanner.nextDouble();

        System.out.print("Enter cost per minute for call 3: ");
        c3 = scanner.nextDouble();
        System.out.print("Enter duration (minutes) for call 3: ");
        t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        double totalCost = cost1 + cost2 + cost3;

        System.out.println("Cost of call 1: " + cost1);
        System.out.println("Cost of call 2: " + cost2);
        System.out.println("Cost of call 3: " + cost3);
        System.out.println("Total cost: " + totalCost);
    }
}
