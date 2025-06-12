package com.softserve.academy.homework_01;

// Option 1
/*
import java.util.Scanner;
public class AverageNumber {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Input first number: ");
        int number_1 = sc.nextInt();

        System.out.println("Input second number: ");
        int number_2 = sc.nextInt();

        System.out.println("Input third number: ");
        int number_3 = sc.nextInt();

        // Calculate the average number
        double avg_number = (number_1 + number_2 + number_3) / 3.0;


        // Output the average number
        System.out.println("Average is " + avg_number);

        // Close the Scanner
        sc.close();


    }

}

 */


// Option 2: Using an array and loop


import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Create an array to store 3 numbers
        int[] numbers = new int[3];

        // Initialize total sum, starting from 0 to accumulate values correctly
        int sum = 0;


        // 1. i is the index of the current element in the array
        // 2. We start from index 0, which is the first element
        // 3. Loop continues while i is less than the array length (index < 3 for 3 numbers)
        //    - This avoids going out of bounds (the highest index is always length - 1)
        //    - So we use i < numbers.length instead of i <= numbers.length
        // 4. i++ increases i by 1 in each loop iteration
        // 5. The whole expression (int i = 0; i < numbers.length; i++) is the loop condition
        // 6. The code inside { } runs once for each element in the array, from index 0 to 2
        for (int i = 0; i < numbers.length; i++) {
            // 7. This line asks the user to input a number (i + 1 shows 1, 2, 3 for user clarity)
            System.out.print("Input number " + (i + 1) + ": ");

            // 8. Scanner reads user input and saves it to numbers[i] in the array
            numbers[i] = sc.nextInt();

            // 9. Add the entered number to the total sum
            sum += numbers[i];

            // 10. Then the loop goes to the next index and repeats until all inputs are read
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Output the result
        System.out.println("Average is " + average);

        // Close the scanner
        sc.close();
    }
}


// OPTION 3: Using a separate method to calculate average

/*
import java.util.Scanner;

public class AverageNumber {

    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = sc.nextInt();

        System.out.println("Input second number: ");
        int num2 = sc.nextInt();

        System.out.println("Input third number: ");
        int num3 = sc.nextInt();

        double average = calculateAverage(num1, num2, num3);

        System.out.println("Average is " + average);

        sc.close();
    }
}
*/

