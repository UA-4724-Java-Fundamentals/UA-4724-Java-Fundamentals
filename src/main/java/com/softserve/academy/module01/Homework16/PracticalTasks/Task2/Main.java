package com.softserve.academy.module01.Homework16.PracticalTasks.Task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("D:\\JAVA\\UA4724JavaFundamentals\\src\\main\\java\\com\\softserve\\academy\\module01\\Homework16\\PracticalTasks\\Task2\\text.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        List<String> list = new ArrayList<>();
        List<String> words = new ArrayList<>();


        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();
        fr.close();

        for (String s : list) {
            String[] wordss = s.split("\\s+");
            for (String w : wordss) {
                w = w.replaceAll("[^a-zA-Z]", "");
                words.add(w);
                if (isVowel(w.charAt(0))) {
                    System.out.print(w + " ");
                }
            }
        }

        for (int i = 0; i < words.size() - 1; i++) {

            char last = words.get(i).charAt(words.get(i).length() - 1);
            char first = words.get(i + 1).charAt(0);
            if (Character.toLowerCase(first) == Character.toLowerCase(last)) {

                System.out.println(words.get(i) + " " + words.get(i + 1));
            }
        }

    }

}
