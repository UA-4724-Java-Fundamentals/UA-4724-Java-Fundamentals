package com.softserve.academy.homeworkfinal;

import java.util.Scanner;

public class AppCoffeeMachine {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CoffeeMachine machine = new CoffeeMachine(scanner);
            machine.start();
        }
}

