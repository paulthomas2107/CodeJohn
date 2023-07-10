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
    }
}

class Animal {
    void makeNoise() {
        System.out.println("Yap");
    }
}