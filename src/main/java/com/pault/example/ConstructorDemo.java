package com.pault.example;

import lombok.Data;
import lombok.extern.java.Log;

@Log
public class ConstructorDemo {
    public static void main(String[] args) {

        Frog myFrog = new Frog("Frog", 12);
        log.info(myFrog.toString());

        Frog myFrog2 = new Frog("Frog2");
        log.info(myFrog2.toString());

        Frog frog3 = new Frog();
        log.info(frog3.toString());

        Frog frog4 = new Frog(ConstantAnimals.GENUS, 9);
        log.info(frog4.toString());

    }
}

@Data
class Frog {
    String name;
    int age;

    Frog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Frog(String name) {
        this(name, 99);
    }

    Frog() {
        this("DEFAULT", 0);
    }


}