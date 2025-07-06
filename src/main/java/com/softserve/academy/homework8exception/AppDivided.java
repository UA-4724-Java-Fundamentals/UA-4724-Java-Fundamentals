package com.softserve.academy.homework8exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppDivided {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("a = ");
            double a = Double.parseDouble(br.readLine());
            System.out.print("b = ");
            double b = Double.parseDouble(br.readLine());
            if(b == 0.0f) {
                throw new IllegalArgumentException("b cannot be zero");
            }
            System.out.println(Divided.div(a, b));
        } catch (IOException  e) {
            System.out.println("This is IOException: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Incorrect entered value, please enter valid parameter:" + e.getMessage());
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}