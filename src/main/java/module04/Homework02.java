package module04;

import java.util.Scanner;

public class Homework02 {
    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, num3, maxNum , minNum;

        System.out.println("Enter 1st number");
        num1 = SCANNER.nextInt();
        System.out.println("Enter 2nd number");
        num2 = SCANNER.nextInt();
        System.out.println("Enter 3rd number");
        num3 = SCANNER.nextInt();

        maxNum = num1;
        minNum = num1;

        if (num2 > maxNum){
            maxNum = num2;
        }
        if  (num2 < minNum){
            minNum = num2;
        }
        if (num3 > maxNum){
            maxNum = num3;
        }
        if (num3 < minNum){
            minNum = num3;
        }


        System.out.println("Maximun namber: \n" + maxNum );
        System.out.println("Minimun namber: \n" + minNum );

        SCANNER.close();
    }


}
