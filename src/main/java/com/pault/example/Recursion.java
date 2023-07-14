package com.pault.example;

import lombok.extern.java.Log;

@Log
public class Recursion {
    public static void main(String[] args) {
        sayHi(3);

    }

    private static void sayHi(int count) {
        log.info("Hi, Paul !");
        if (count <= 1) {
            return;
        }
        sayHi(count -1);

    }
}
