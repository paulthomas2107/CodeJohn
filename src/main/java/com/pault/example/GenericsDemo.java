package com.pault.example;

import lombok.extern.java.Log;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Log
public class GenericsDemo {

    public static void main(String[] args) {

        // Generics
        Printer<Cat, Dog> printer = new Printer<>(new Cat(12, "Paul"));
        printer.print();

        Printer<Dog, Cat> printer2 = new Printer<>(new Dog("Doberman", 12.99));
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

        shout(123, "Crap");
        shout("Shite", 222);
        shout(new Cat(88, "Old Cat"), new Dog("Big", 122.33));


        List<Animal> intList = new ArrayList<>();
        intList.add(new Cat(22, "Dob"));
        printList(intList);

        List<Dog> stringList = new ArrayList<>();
        stringList.add(new Dog("Yorkshire", 111.00));
        printList(stringList);

        Printer<Dog, Cat> dg = new Printer<>(new Dog("Smelly", 111.12), new Cat(12, "Paul"));
        dg.print();
    }

    private static <T, V> void shout(T thingToShout, V otherThingToShout) {
        log.info(" " + thingToShout + " !!!!\n" + " " + otherThingToShout + " !!! ");
    }

    private static void printList(List<? extends Animal> list) {
        log.info(" " + list);
    }
}



@Log
class Printer<T extends Animal & Serializable, V> {

    T thingToPrint;
    V otherThingToPrint;

    Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    Printer(T thingToPrint, V otherThingToPrint) {
        this.thingToPrint = thingToPrint;
        this.otherThingToPrint = otherThingToPrint;
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

