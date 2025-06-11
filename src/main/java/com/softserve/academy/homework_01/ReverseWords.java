package com.softserve.academy.homework_1;

/* import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner (System.in);

        // Prompt the user to enter 3 words, each from new line
        System.out.println("Enter the first word:");
        String word_1 = sc.nextLine();

        System.out.println("Enter the second word:");
        String word_2 = sc.nextLine();

        System.out.println("Enter the third word:");
        String word_3 = sc.nextLine();

        // Output the entered 3 words in reversed order
        System.out.println("Words in reverse order:");
        System.out.println(word_3);
        System.out.println(word_2);
        System.out.println(word_1);

        // Close the scanner
        sc.close();


    }
}
*/

 import java.util.Scanner;

 public class ReverseWords {
     public static void main(String[] args) {

         // Create a Scanner object to read input from the console
         Scanner sc = new Scanner(System.in);

         // Create the array of 3 words
         String[] words = new String[3];

         // Prompt the user to enter 3 words, each from new line
         System.out.println("Enter the first word:");
         words[0] = sc.nextLine();

         System.out.println("Enter the second word:");
         words[1] = sc.nextLine();

         System.out.println("Enter the third word:");
         words[2] = sc.nextLine();

         // Output the words in the reverse order
         for (int i = words.length-1; i>=0; i--)
                {
                    System.out.println(words[i]);
                }

         // Close the scanner
         sc.close();

     }

}

