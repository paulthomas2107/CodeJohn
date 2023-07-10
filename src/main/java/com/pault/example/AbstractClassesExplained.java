package com.pault.example;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.java.Log;

@Log
public class AbstractClassesExplained {
    public static void main(String[] args) {

        Cat2 cat = new Cat2();
        cat.age = 12;
        cat.name = "paul";
        log.info(cat.makeNoise());

        Cat3 cat3 = new Cat3();
        cat3.poop();

        Cat4 cat4 = new Cat4();
        cat4.poop();
        cat4.genusType();
        log.info(" "+cat.age);


    }
}

@Log
class Cat4 extends Cat3 implements AnimalStuff, GenusStuff {
    @Override
    public void poop() {
        log.info("Pooped4");
    }

    @Override
    public String genusType() {
        log.info("BIGCat");
        return "BIG CAT";
    }
}

@Log
class Cat3 implements AnimalStuff {

    @Override
    public void poop() {
        log.info("Pooped");
    }
}
@Data
abstract class Animal2{
    int age;
    String name;
    abstract String makeNoise();
}


@EqualsAndHashCode(callSuper = true)
@Data
class Cat2 extends Animal2 {

    @Override
    String makeNoise() {
        return "Meow";
    }
}