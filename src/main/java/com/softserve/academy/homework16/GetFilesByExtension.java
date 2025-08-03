package com.softserve.academy.homework16;

import java.io.File;

public class GetFilesByExtension {
    public static void main(String[] args) {
        String directoryPath = "./src/main/java/com/softserve/academy/homework16/";

        // Using File class create an object for specific directory
        File directory = new File(directoryPath);

        // Using listFiles method we get all the files of a directory
        // return type of listFiles is array
        File[] files = directory.listFiles();

        // Print name of the all files present in that path
        if (files != null) {
            for (File file : files) {
                if (file.getName().endsWith(".java")) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
