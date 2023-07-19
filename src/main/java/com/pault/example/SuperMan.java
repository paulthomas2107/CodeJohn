package com.pault.example;

import lombok.extern.java.Log;

@Log
public class SuperMan {

    public static void main(String[] args) {

        Cat myCat = new Cat(9, "Sooty", "Whiskas");
        myCat.makeNoise();
        myCat.eat();

        log.info(String.valueOf(myCat));
    }
}
