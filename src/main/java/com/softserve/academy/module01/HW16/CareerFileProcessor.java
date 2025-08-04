package com.softserve.academy.module01.HW16;

import java.io.*;
import java.util.*;

public class CareerFileProcessor {
    public static void main(String[] args) {
        String basePath = "src/main/java/com/softserve/academy/module01/HW16/";
        String inputFile = basePath + "file1.txt";
        String outputFile = basePath + "file2.txt";
        List<String> lines = new ArrayList<>();

        System.out.println("Шукаємо вхідний файл за шляхом: " + new File(inputFile).getAbsolutePath());
        System.out.println("Записуємо у файл за шляхом: " + new File(outputFile).getAbsolutePath());

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу: " + e.getMessage());
            return;
        }

        int numberOfLines = lines.size();

        String longestLine = "";
        for (String l : lines) {
            if (l.length() > longestLine.length()) {
                longestLine = l;
            }
        }

        String name = "Харламов Данило";
        String birthday = "24.01.2007";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("Кількість стрічок: " + numberOfLines);
            bw.newLine();
            bw.write("Найдовша стрічка: " + longestLine);
            bw.newLine();
            bw.write("Ім'я: " + name);
            bw.newLine();
            bw.write("День народження: " + birthday);
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл: " + e.getMessage());
        }

        System.out.println("Обробка файлів завершена.");
    }
}
