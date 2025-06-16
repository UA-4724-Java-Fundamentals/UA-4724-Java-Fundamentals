package module01;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scr.nextLine();

        Scanner scr2 = new Scanner(System.in);
        System.out.println("Where do you live, " + name + "?");
        String address = scr2.nextLine();

        System.out.println("Name: " + name + ", Address: " + address + ".");

    }
}
