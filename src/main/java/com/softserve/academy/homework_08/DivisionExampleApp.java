package com.softserve.academy.homework_08;

import java.util.Scanner;

public class DivisionExampleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      try{
          System.out.print("Enter the first number: ");
          double num1 = Double.parseDouble(scanner.nextLine());


          System.out.print("Enter the second number: ");
          double num2 = Double.parseDouble(scanner.nextLine());

          double result = DivisionExample.div(num1, num2);
          System.out.println("The result of division is: " + result);
      }
      catch (ArithmeticException e){
          System.out.println(e.getMessage());

      }
      catch (NumberFormatException e) {
          System.out.println("Input error! Please enter a valid number.");
          System.out.println("The entered value was: \"" + e.getMessage() + "\"");
      }
      catch (Exception e) {
          System.out.println("Unknown mistake!" + e.getMessage());
      }
      finally {
          scanner.close();
      }



    }
}
