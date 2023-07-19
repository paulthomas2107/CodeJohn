package com.pault.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.java.Log;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@VeryImportant
@AllArgsConstructor
@Log
public class Cat extends Animal implements Serializable {
    private int age = 0;
    @ImportString
    private String name = null;
    private String catFoodPreference;


    @RunImmediately(times = 3)
    @Override
    public void makeNoise() {
        super.makeNoise();
        log.info("MEOW");
    }

    public void eat() {
        log.info("Munch");
    }

    private static void heyThisIsPrivate() {
        log.info("How did you call this ?");
    }

    private static void thisIsPrivateAndStaticMethod() {
        log.info("I am private and static");
    }

    public Cat() {}

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;

    }
}