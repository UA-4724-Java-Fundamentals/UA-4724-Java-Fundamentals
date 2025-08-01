package com.softserve.academy.final_project;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AccountManager accountManager = new AccountManager();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        while (true) {
            System.out.println("1. Create an account");
            System.out.println("2. Log into account");
            System.out.println("0. Exit");

            int choice = getIntInputForMenu(2);

            switch (choice) {
                case 1:
                    Account account = accountManager.createAccount();
                    System.out.println("Your card has been created");
                    System.out.println("Your card number:");
                    System.out.println(account.getCardNumber());
                    System.out.println("Your card PIN:");
                    System.out.println(account.getPin());
                    break;
                case 2:
                    String cardNumber = getValidatedInputForLength("Enter your card number:", 16);
                    String pin = getValidatedInputForLength("Enter your PIN:", 4);

                    Account foundAccount = accountManager.findAccount(cardNumber, pin);
                    if (foundAccount != null) {
                        System.out.println("You have successfully logged in!");
                        accountMenu(foundAccount);
                    } else {
                        System.out.println("Wrong card number or PIN!");
                    }
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
                default:
                    System.out.println("Unknown option. Try again.");
            }

            System.out.println();
        }
    }

    private static void accountMenu(Account account) {
        while (true) {
            System.out.println("1. Balance");
            System.out.println("2. Log out");
            System.out.println("0. Exit");

            int choice = getIntInputForMenu(2);

            switch (choice) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("You have successfully logged out!");
                    return;
                case 0:
                    System.out.println("Bye!");
                    System.exit(0);
                default:
                    System.out.println("Unknown option. Try again.");
            }
            System.out.println();
        }
    }

    private static int getIntInputForMenu(int menuOptionCount) {
        while (true) {
            System.out.print("Choose an option: ");
            String input = scanner.nextLine().trim();

            try {
                int result = Integer.parseInt(input);
                if (result < 0 || result > menuOptionCount) {
                    throw new NumberFormatException("Wrong option. Try again.");
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String getValidatedInputForLength(String prompt, int expectedLength) {
        while (true) {
            System.out.print(prompt + " ");
            String input = scanner.nextLine().trim();

            if (input.matches("\\d{" + expectedLength + "}")) {
                return input;
            } else {
                System.out.println("Please enter exactly " + expectedLength + " digits.");
            }
        }
    }
}
