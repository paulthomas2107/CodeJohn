package com.pault.example;

import lombok.extern.java.Log;

import java.util.ArrayList;

@Log
public class GenericsDemo {

    public static void main(String[] args) {

        // Generics
        Printer<Cat> printer = new Printer<>(new Cat(12, "Paul"));
        printer.print();

        Printer<Dog> printer2 = new Printer<>(new Dog("Doberman", 12.99));
        printer2.print();

        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        log.info(catList.toString());

        ArrayList<Object> objList = new ArrayList<>();
        objList.add(new Cat(1, "Paul"));
        objList.add("Hello, Paul");

        objList.forEach(o -> {
            if (o instanceof Cat cat) {
                log.info(cat.toString());
            } else {
                log.info("I am a " + o.getClass());
            }
        });


    }
}

@Log
class Printer<T extends Animal> {

    T thingToPrint;

    Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        thingToPrint.makeNoise();
        log.info("..." + thingToPrint);

    }
}

/*
@Log
static
class IntegerPrinter  {
    Integer thingToPrint;

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        log.info("..."+thingToPrint);
    }
}}
*/
