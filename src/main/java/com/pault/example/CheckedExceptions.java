package com.pault.example;

import lombok.extern.java.Log;

import java.io.FileNotFoundException;
import java.io.FileReader;

@SuppressWarnings("ALL")
@Log
public class CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        //run1();
        run2();

    }

    private static void readFile()  {
        try {
            new FileReader("myFile.txt");
        } catch (FileNotFoundException e) {
            log.severe(e.toString());
        }
    }

    private static void readFile2(String fileName) throws FileNotFoundException {

        FileReader reader = new FileReader(fileName);

    }

    private static void readFile3(String fileName) throws FileNotFoundException {

        FileReader reader = new FileReader(fileName);

    }

    private static void run1() throws FileNotFoundException {
        readFile();

        try {
            readFile2("myFile2.txt");
        } catch (FileNotFoundException e) {
            log.severe(e.toString());
        }

        readFile3("cat.txt");
    }

    private static void run2() {

        String name = "Paul Caitlin Rory";
        printLength(name);

        name = null;
        printLength(name);

    }

    private static void printLength(String myString) {
        try {
            log.info(""+myString.length());
        } catch(NullPointerException e) {
            log.severe(e.toString());
        }


    }
}
