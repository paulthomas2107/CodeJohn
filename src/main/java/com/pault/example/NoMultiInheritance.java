package com.pault.example;

import lombok.extern.java.Log;

@Log
public class NoMultiInheritance {

    public static void main(String[] args) {

        Cat myCat = new Cat(1, "Boo");
        myCat.makeNoise();
        myCat.setName("xx");

        Cog myCog = new Cog();
        myCog.fetch();
    }
}
