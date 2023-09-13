package com.pault.example;

import lombok.extern.java.Log;

@Log
public class StaticNotStatic {

    public static void main(String[] args) {

        AnotherCat cat = new AnotherCat();
        cat.meow(); // non-static
        cat.name = "Puss";
        cat.age = 11;
        cat.livesRemaining = 7;
        log.info("Cat count: " + AnotherCat.getCatCount());
        log.info(cat.toString());

        AnotherCat cat2 = new AnotherCat();
        cat2.meow(); // non-static
        cat2.name = "Tom";
        cat2.age = 8;
        cat2.livesRemaining = 6;
        log.info("Cat count: " + AnotherCat.getCatCount());
        log.info(cat2.toString());
        log.info(String.valueOf(AnotherCat.MAX_LIVES));


    }


}

