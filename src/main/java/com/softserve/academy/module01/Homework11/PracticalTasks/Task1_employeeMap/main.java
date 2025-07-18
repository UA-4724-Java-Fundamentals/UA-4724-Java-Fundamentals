package com.softserve.academy.module01.Homework11.PracticalTasks.Task1_employeeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();

        System.out.println("Enter number of employees: ");
        int num = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter employee name №" + i + ": ");
            String name = sc.nextLine();
            if (employeeMap.containsValue(name)) {
                System.out.println("This name already exists");
                i--;
                continue;
            }
            employeeMap.put(i, name);
        }

        for (Integer key : employeeMap.keySet()) {
            System.out.println(employeeMap.get(key));
        }
        System.out.println("Enter the employee ID: : ");
        int id = Integer.parseInt(sc.nextLine());

        if (employeeMap.containsKey(id)) {
            System.out.println("Name: " + employeeMap.get(id));
        } else {
            System.out.println("Not found");
        }

        System.out.println("Enter the name of employee : ");
        String name = sc.nextLine();

        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("ID: " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Not found");
        }
    }
}

