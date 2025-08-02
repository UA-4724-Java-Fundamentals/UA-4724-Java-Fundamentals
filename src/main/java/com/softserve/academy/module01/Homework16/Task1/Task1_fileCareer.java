package com.softserve.academy.module01.Homework16.Task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1_fileCareer {
    public static void main(String[] args) throws IOException {

        File inputfile = new File("D:\\JAVA\\UA4724JavaFundamentals\\src\\main\\java\\com\\softserve\\academy\\module01\\Homework16\\Task1\\file1.txt");
        File outputfile = new File("D:\\JAVA\\UA4724JavaFundamentals\\src\\main\\java\\com\\softserve\\academy\\module01\\Homework16\\Task1\\file2.txt");

        List<String> lines = new ArrayList<>();

        FileReader fr = new FileReader(inputfile);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();
        fr.close();


        FileWriter fw = new FileWriter(outputfile);
        BufferedWriter bw = new BufferedWriter(fw);

        int count = lines.size();
        bw.write("Lines:" + count + "\n");

        String longestline = lines.get(0);
        for (String l : lines) {
            if (l.length() > longestline.length()) {
                longestline = l;
            }
        }
        bw.write(longestline + "\n");
        bw.write("Oleksandr Rezunenko|21.05.0000");

        bw.close();
        fw.close();

        System.out.println("Done");

    }
}
