import java.util.Scanner;

public class ThreeTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.print("Enter first double: ");
        double d1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double d2 = scanner.nextDouble();
        System.out.print("Enter third double: ");
        double d3 = scanner.nextDouble();

        if (inRange(d1) && inRange(d2) && inRange(d3)) {
            System.out.println("All numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }

        // Task 2
        System.out.print("Enter first integer: ");
        int i1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int i2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int i3 = scanner.nextInt();

        int max = Math.max(i1, Math.max(i2, i3));
        int min = Math.min(i1, Math.min(i2, i3));

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Task 3
        System.out.print("Enter HTTP error code: ");
        int code = scanner.nextInt();

        try {
            HTTPError error = HTTPError.valueOf("E" + code);
            System.out.println("HTTP Error: " + error.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown HTTP error code");
        }
    }

    public static boolean inRange(double num) {
        return num >= -5 && num <= 5;
    }

    enum HTTPError {
        E400("Bad Request"),
        E401("Unauthorized"),
        E402("Payment Required"),
        E403("Forbidden"),
        E404("Not Found"),
        E500("Internal Server Error"),
        E502("Bad Gateway"),
        E503("Service Unavailable");

        private final String message;

        HTTPError(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}
