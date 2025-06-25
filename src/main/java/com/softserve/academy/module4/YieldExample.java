package com.softserve.academy.module4;

import java.util.Scanner;

/**
 * This class demonstrates the usage of the 'yield' keyword in switch expressions in Java.
 * It provides examples of how to use yield to return values from switch expressions,
 * both with simple and complex cases.
 */
public class YieldExample {

    private final Scanner scanner;

    /**
     * Constructor that initializes the scanner.
     */
    public YieldExample() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        YieldExample example = new YieldExample();
        RolePermissionService service = new RolePermissionService();
        example.showDayActivity("Monday");
        example.checkUserPermissions(service);
    }

    /**
     * Shows how to get activity based on the day of the week using a switch expression with yield.
     *
     * @param day the day of the week to check
     */
    private void showDayActivity(String day) {
        System.out.println("\n--- Simple Yield Example (Commented Out in Original) ---");
        String activity = switch (day) {
            case "Monday" -> "Start of the week!";
            case "Friday" -> "End of the week!";
            case "Saturday", "Sunday" -> "Weekend!";
            default -> "Invalid day!";
        };
        System.out.println("Day: " + day);
        System.out.println("Activity: " + activity);
    }

    /**
     * Checks user permissions based on their role using a switch expression with yield.
     *
     * @param service the service to use for permission checking
     */
    private void checkUserPermissions(RolePermissionService service) {
        System.out.println("\n--- Role-Based Permissions Example ---");
        System.out.print("Enter your role (ADMIN, USER, GUEST): ");
        String role = scanner.nextLine().toUpperCase();
        String permission = service.getPermissionForRole(role);
        System.out.println("Permission result: " + permission);
    }
}

/**
 * Service class that handles role-based permission logic.
 * This separates the business logic from the demonstration code.
 */
class RolePermissionService {

    /**
     * Determines the permission level based on the user's role.
     * Uses a switch expression with yield to return appropriate permission messages.
     *
     * @param role the user role (ADMIN, USER, GUEST, or other)
     * @return a permission message corresponding to the role
     */
    public String getPermissionForRole(String role) {
        return switch (role) {
            case "ADMIN" -> {
                System.out.println("Admin access granted.");
                yield "You have full access.";
            }
            case "USER" -> {
                System.out.println("User access granted.");
                yield "You have limited access.";
            }
            case "GUEST" -> {
                System.out.println("Guest access granted.");
                yield "You have minimal access.";
            }
            default -> {
                System.out.println("Access denied.");
                yield "Unknown role. Please contact support.";
            }
        };
    }
}
