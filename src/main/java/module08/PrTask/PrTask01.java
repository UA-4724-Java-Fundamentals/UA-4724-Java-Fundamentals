package module08.PrTask;

import java.util.Scanner;

public class PrTask01 {
    public static void main(String[] args) {

        while (true) {

         try {

            int a = readInt("Enter side a : ");
            int b = readInt("Enter side b : ");

            int area = rectangleArea(a,b);
            System.out.println("Area is " + area);
            break;
         } catch (IllegalArgumentException e) {
             System.out.println(e.getMessage());
         }
        }
    }

    private static int readInt(String prompt) {
        var scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input , need number ");
            }
        }
    }

    public static int rectangleArea(int a, int b){
        if(a<0|b<0){
            throw new IllegalArgumentException(
                    "The sides should non negative "
            );
        }
        return a*b;
    }
}
