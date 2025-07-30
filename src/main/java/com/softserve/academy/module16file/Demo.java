package com.softserve.academy.module16file;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/usr", "local", "bin");
        System.out.println(path);
    }
}