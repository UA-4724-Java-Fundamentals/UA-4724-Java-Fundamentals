package module04;

import java.util.Scanner;

public class PrTask1 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = SCANNER.nextInt();
        int num2 = SCANNER.nextInt();
        int num3 = SCANNER.nextInt();

        int count = 0;
        if(num1 % 2 != 0) count++;

        System.out.println("There are"+ count + "odd numbers");
    }
}
