package com.pault.example;

import lombok.Data;
import lombok.Getter;
import lombok.extern.java.Log;

@Log
@Data
public class AnotherCat {
    public static final int MAX_LIVES = 9;
    @Getter
    private static int catCount = 0;
    String name;
    int age;
    int livesRemaining;
    public void meow() {
        log.info("Meow");
    }
    public AnotherCat() {
        catCount++;
    }

}