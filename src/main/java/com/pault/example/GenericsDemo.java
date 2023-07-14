package com.pault.example;

import lombok.extern.java.Log;

import java.util.ArrayList;

@Log
public class GenericsDemo {

    public static void main(String[] args) {

        // Generics
        Printer<Integer> printer = new Printer<>(29);
        printer.print();

        Printer<Double> printer2 = new Printer<>(29.92);
        printer2.print();

        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        log.info(catList.toString());

        ArrayList<Object> objList = new ArrayList<>();
        objList.add(new Cat(1, "Paul"));

        Object what = objList.get(0);
        if  (what instanceof Cat cat) {
            log.info(cat.toString());
        }


    }
}

@Log
class Printer<T> {

    T thingToPrint;

    Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
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
