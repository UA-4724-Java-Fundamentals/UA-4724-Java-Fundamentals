package com.softserve.academy.module16io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutput {
    public static void main(String[] args) {
        byte[] w = {48, 49, 50}; // 0x30 = 3*16+0 = 48, 0x31, 0x32
        String fileName = "./test.txt";
        FileOutputStream outFile = null;
        try {
            outFile = new FileOutputStream(fileName);
            System.out.println("Output file was opened.");
            outFile.write(w);
            System.out.println("Saved: " + w.length + " bytes.");
            //outFile.close();
            System.out.println("Output stream was closed.");
        } catch (IOException e) {
            System.out.println("File Write Error: " + fileName);
            e.printStackTrace();
        } finally {
            try {
                outFile.close();
            }catch (Exception e) {
                System.out.println("Close Error");
            }
        }
    }
}     