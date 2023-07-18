package com.pault.example;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

@Log
public class NPEDemo {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.makeNoise();

        boolean shouldPrintHello = true;

        if (shouldPrintHello) {
            log.info("Hello");
        }

        List<String> bestBuys = new ArrayList<>();
        bestBuys.forEach(thing -> {
            log.info(thing);
        });

        String test = "TEST";
        if ("TEST".equals(test)) {
            log.info(test);
        }
    }
}
