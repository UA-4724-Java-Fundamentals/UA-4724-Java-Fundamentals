package com.softserve.academy.module01.Homework16.Task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File inputfile = new File("D:\\JAVA\\UA4724JavaFundamentals\\src\\main\\java\\com\\softserve\\academy\\module01\\Homework16\\Task2\\inputfile.txt");
        File outputfile = new File("D:\\JAVA\\UA4724JavaFundamentals\\src\\main\\java\\com\\softserve\\academy\\module01\\Homework16\\Task2\\outputfile.txt");

        List<String> lines = new ArrayList<>();

        FileReader fr = new FileReader(inputfile);
        BufferedReader br = new BufferedReader(fr);

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        FileWriter fw = new FileWriter(outputfile);
        BufferedWriter bw = new BufferedWriter(fw);

        for (String lin : lines) {
            if (lin.contains("public")) {
                lin = lin.replace("public", "private");
                bw.write(lin + "\n");
            } else {
                bw.write(lin + "\n");
            }
        }
        br.close();
        bw.close();
        fw.close();

    }
}
