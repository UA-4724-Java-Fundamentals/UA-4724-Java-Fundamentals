package com.softserve.academy.homework16;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class GetFileLastModifiedDate {
    public static void main(String[] args) {
        String pathToFile = "src/main/java/com/softserve/academy/homework16/GetFileLastModifiedDate.java";
        File file = new File(pathToFile);
        long lastModified = file.lastModified();
        String formattedDate = Instant.ofEpochMilli(lastModified)
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println(formattedDate);
    }
}
