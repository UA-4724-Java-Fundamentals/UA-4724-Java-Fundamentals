package com.softserve.academy.homework16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class WriteAndReadTextFile {
    public static void main(String[] args) throws IOException {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/temp.txt";
        File file = new File(pathToFile);

        if (!file.isFile()) {
            file.createNewFile();
        }
        if (file.canWrite()) {
            String str = "Hello World!";
            Files.writeString(file.toPath(), str + System.lineSeparator(), StandardOpenOption.APPEND);
        }
    }
}
