package com.softserve.academy.module01.Homework10.PracticalTasks.Task2_Numbers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        String line = sc.nextLine();
        String[] numbers = line.split(" ");
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            numberList.add(Integer.parseInt(numbers[i]));
        }

        numberList=new ArrayList<>(new LinkedHashSet<>(numberList));

        for (Integer number : numberList) {
            System.out.print(number+" ");
        }
    }
}
