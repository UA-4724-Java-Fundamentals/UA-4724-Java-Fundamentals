package com.softserve.academy.homework01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfo {
    public static void main(String[] args) throws IOException {
        String name, address;

        System.out.print("What is your name? ");
        BufferedReader bufferName = new BufferedReader(new InputStreamReader(System.in));
        name = bufferName.readLine();

        System.out.println("Where do you live, " + name + "?");
        BufferedReader bufferAddress= new BufferedReader(new InputStreamReader(System.in));
        address = bufferAddress.readLine();

        String result = String.format("Name: %s, Address: %s", name, address);
        System.out.println(result);
    }
}
