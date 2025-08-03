package com.softserve.academy.homework16;

import java.io.File;

public class CheckPathExists {
    public static void main(String[] args) {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/ListFilesInDirectory.java";

        File file = new File(pathToFile);

        System.out.println(file.exists());
    }
}
