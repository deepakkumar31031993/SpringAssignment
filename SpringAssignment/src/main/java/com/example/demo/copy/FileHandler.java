package com.example.demo.copy;
import java.io.File;

public class FileHandler {
    public File handleFile(File input) {
        System.out.println("Copying file: " + input.getAbsolutePath());
        return input;
    }
}
