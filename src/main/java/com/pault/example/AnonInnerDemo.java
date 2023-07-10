package com.pault.example;

public class AnonInnerDemo {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        myAnimal.makeNoise();

        Animal bigfoot = new Animal() {
            @Override
            void makeNoise() {
                System.out.println("Roar");
            }
        };
        bigfoot.makeNoise();

        Runnable myAnonRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am running....");
            }
        };

        myAnonRunnable.run();
        Thread s = new Thread(myAnonRunnable);
        s.start();
    }
}

class Animal {
    void makeNoise() {
        System.out.println("Yap");
    }
}