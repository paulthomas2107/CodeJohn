package com.pault.example;

import lombok.extern.java.Log;

import java.util.Optional;

@Log
public class OptionalDemo {

    public static void main(String[] args) {

        Optional<Cat> optionalCat = findCatByName("Deckard");
        Cat myCat = optionalCat.orElse(new Cat(0, "UNKNOWN"));
        log.info(myCat.toString());

        Optional<Cat> optionalCat2 = findCatByName("Missing");
        Cat myCat2 = optionalCat2.orElse(new Cat(0, "UNKNOWN"));
        log.info(myCat2.toString());

        Optional<Cat> optionalCat3= findCatByName("Missing2");
        Cat myCat3 = optionalCat3.orElseGet(() -> new Cat(222, "ELSE GET"));
        log.info(myCat3.toString());


        Optional<Cat> optionalCat5 = findCatByName("Deckard");
        log.info(" "+optionalCat5.map(Cat::getAge).orElse(999));

        Optional<Cat> optionalCat6 = findCatByName("Doggo");
        log.info(" "+optionalCat6.map(Cat::getAge).orElse(999));

        Optional<Cat> optionalCat4= findCatByName("Missing3");
        try {
            Cat myCat4 = optionalCat4.orElseThrow(IllegalStateException::new);
            log.info(myCat4.toString());
        } catch (Exception e) {
            log.info(e.toString());
        }




    }

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = null;
        if ("Deckard".equals(name)) {
            cat = new Cat(8, "Deckard");
        }
        return Optional.ofNullable(cat);
    }
}
