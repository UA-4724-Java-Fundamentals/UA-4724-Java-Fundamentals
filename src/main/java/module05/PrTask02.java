package module05;

import java.util.Scanner;

public class PrTask02 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number = SCANNER.nextInt();
        if(isPrime(number)){
            System.out.println("The number " +  number + " is a prime number");
        }else {
            System.out.println("The number " +  number + " is not a prime number");
        }

    }

    public static boolean isPrime(int number) {
        if(number<0) number =-number;
        if(number==1) return false;
        for(int i = 2; i <= number - 1; i++ ){
            if(number % i == 0) return false;
        }

//        for( int i = 2; i<= number - 1; i++ ){
//            if(number % i == 0){
//                return false;
//            }
//        }

        return true;

    }
}
