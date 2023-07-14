package com.pault.example;

import lombok.extern.java.Log;

@Log
public class Lambdas {

    public static void main(String[] args) {
        Cat100 myCat = new Cat100();
        printThing(myCat);

        // Lambda
        Printable lambdaPrintable = () -> log.info("Lambda MEOW");
        printThing(lambdaPrintable);
    }


    static void printThing(Printable thing) {
        thing.print();

    }
}
