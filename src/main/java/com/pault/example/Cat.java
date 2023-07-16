package com.pault.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.java.Log;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@VeryImportant
@Log
public class Cat extends Animal implements Serializable {
    private final int age;
    @ImportString
    private final String name;

    @RunImmediately(times = 3)
    public void makeNoise() {
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
}