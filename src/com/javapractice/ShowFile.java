package com.javapractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        // First, confirm that filename has been specified.
        int i;

        if (args.length != 1) {
            System.out.println("Usage: File name has been specified");
            return;
        }
        // Following code uses a try-with-resourses specification to open a file and closes it automatically when it exits try
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("An IO expection occurred");
        }
    }
}
