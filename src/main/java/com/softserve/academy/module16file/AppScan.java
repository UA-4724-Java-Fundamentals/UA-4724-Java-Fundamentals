package com.softserve.academy.module16file;

import java.io.File;
import java.util.Scanner;

public class AppScan {
    public static void main(String[] args) {
        File file = new File("./test.txt");
        //File file = new File("///C:\\Tools\\Code\\ua4724JavaFundamentals//test.txt");
        //
        System.out.println("File = " + file);
        try (Scanner sc = new Scanner(file)) {
            String s;
            while (sc.hasNextLine()) {
                s = sc.nextLine();
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} 