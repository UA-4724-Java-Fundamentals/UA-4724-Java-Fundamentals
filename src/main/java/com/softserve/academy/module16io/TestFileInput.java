package com.softserve.academy.module16io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestFileInput {
    public static void main(String[] args) {
        byte[] r = new byte[20];
        String fileName = "./test.txt";
        FileInputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            System.out.println("Input file was opened.");
            int bytesAv = inFile.available(); // Bytes count
            System.out.println("Bytes count: " + bytesAv + " Bytes");
            //
            int count = inFile.read(r, 0, bytesAv);
            /*
            int count = 0;
            int temp = -1;
            while ( (temp = inFile.read()) >= 0) {
                r[count++] = (byte) temp;
            }
            */
            System.out.println("Was readed: " + count + " bytes.");
            System.out.println(r[0] + " " + r[1] + " " + r[2]);
            System.out.println((char) r[0] + " " + (char) r[1] + " " + (char) r[2]);
            //inFile.close();
            System.out.println("Input stream was closed.");
            //
            for (int i = 0; i < bytesAv; i++) {
                System.out.print((char) r[i]);
            }
        } catch (IOException e) {
            System.out.println("File Read/Write Error: " + fileName);
        } finally {
            try {
                inFile.close();
            }catch (Exception e) {
                System.out.println("Close Error");
            }
        }
        System.out.println("\nArray: " + Arrays.toString(r));
    }
}