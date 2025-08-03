package com.softserve.academy.homework16;

import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        // Path of the specific directory
        String directoryPath = "./src/main/java/com/softserve/academy/homework16/";

        // Using File class create an object for specific directory
        File directory = new File(directoryPath);

        // Using listFiles method we get all the files of a directory
        // return type of listFiles is array
        File[] files = directory.listFiles();

        // Print name of the all files present in that path
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
