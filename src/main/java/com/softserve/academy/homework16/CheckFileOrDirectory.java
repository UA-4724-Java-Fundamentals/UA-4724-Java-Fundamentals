package com.softserve.academy.homework16;

import java.io.File;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        String pathToResourse = "src/main/java/com/softserve/academy/homework16";
        File file = new File(pathToResourse);

        if (file.isFile()) {
            System.out.println("File exists");
        } else if (file.isDirectory()) {
            System.out.println("Directory exists");
        } else {
            System.out.println("Path is not a file and not a directory");
        }
    }
}
