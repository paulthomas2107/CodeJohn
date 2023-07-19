package com.pault.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log
class Animal {
    int age;
    String name;
    void makeNoise() {
        log.info("YAP !");
    }


}
