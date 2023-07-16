package com.pault.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@VeryImportant
@Log
public class Cat extends Animal implements Serializable {
    int age;
    @ImportString
    String name;

    @RunImmediately(times = 3)
    public void makeNoise() {
        log.info("MEOW");
    }

    public void eat() {
        log.info("Munch");
    }


}