package com.softserve.academy.homework16;

import java.io.File;

public class CheckReadAndWritePermissions {
    public static void main(String[] args) {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/ListFilesInDirectory.java";
        String pathToDirectory = "src/main/java/com/softserve/academy/homework16";

        File file = new File(pathToDirectory);

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}
