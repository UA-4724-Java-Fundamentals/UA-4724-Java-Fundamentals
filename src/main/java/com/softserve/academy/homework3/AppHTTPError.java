package com.softserve.academy.homework3;

import java.util.Scanner;

public class AppHTTPError {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter HTTPError number: ");
        int error = sc.nextInt();
        System.out.println(HTTPError.valueOf("ERROR_" + error).message);
    }
}
