package com.softserve.academy.homework16;

import java.io.File;

public class GetFileSize {
    public static void main(String[] args) {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/GetFileLastModifiedDate.java";
        File file = new File(pathToFile);
        if (file.isFile()) {
            System.out.printf("File size: %.2f KB%n", file.length() / 1024.0);
        }
    }
}
