package com.softserve.academy.module01.Homework16.PracticalTasks.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File inputFile = new File("D:\\JAVA\\UA4724JavaFundamentals\\src\\main\\java\\com\\softserve\\academy\\module01\\Homework16\\PracticalTasks\\Task1\\mytext.txt");
        List<String> lines = new ArrayList<>();

        FileReader fr = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();

        String longestline = lines.get(0);
        String shortestline = lines.get(0);


        int i = 1;
        for (String lin : lines) {
            System.out.printf("Line %d : %d symbols \n", i++, lin.length());
            if (lin.length() > longestline.length()) {
                longestline = lin;
            }
            if (lin.length() < shortestline.length()) {
                shortestline = lin;
            }
        }
        System.out.println("\nLongest line: " + longestline);
        System.out.println("Shortest line: " + shortestline);


        System.out.println("\nLines containing \"var\":");
        for (String lin : lines) {
            if (lin.contains("var")) {
                System.out.println(lin);
            }

        }


    }
}
