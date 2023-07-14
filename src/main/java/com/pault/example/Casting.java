package com.pault.example;

import lombok.extern.java.Log;

@Log
public class Casting {

    public static void main(String[] args) {

        // Upcast
        /*
        AnimalOne myAnimal = new DogOne();
        doAnimalStuff(myAnimal);

        CatOne myCat  = new CatOne();
        doAnimalStuff(myCat);
        */
        // Downcast
        DogOne myDog = new DogOne();
        doAnimalStuff(myDog);

        CatOne myCat  = new CatOne();
        doAnimalStuff(myCat);



    }

    public static void doAnimalStuff(AnimalOne animalOne) {

        animalOne.makeNoise();


        if (animalOne instanceof DogOne myDog) {
            myDog.growl();
        }

    }
}

@Log
class AnimalOne {

    String name;
    public void makeNoise() {
        log.info("I am just an animal");
    }
}

@Log
class DogOne extends AnimalOne {
    @Override
    public void makeNoise() {
        log.info("Woof");
    }

    public void growl() {
        log.info("Grrrrrrr");
    }
}

@Log
class CatOne extends AnimalOne {
    @Override
    public void makeNoise() {
        log.info("Meow");
    }


}