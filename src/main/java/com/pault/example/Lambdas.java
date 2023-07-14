package com.pault.example;

import lombok.extern.java.Log;

@Log
public class Lambdas {

    public static void main(String[] args) {


        Cat100 cat = new Cat100();
        log.info(cat.print("Hi", "....."));

        // Lambda
        Printable lambdaPrintable = (prefix, suffix) -> {
            log.info(prefix + " " + "MEOW" + suffix);
            return prefix + " " + "MEOW" + suffix;
        };
        printThing(lambdaPrintable);
    }


    static void printThing(Printable thing) {
        thing.print("Oh Hi...","!");

    }
}
