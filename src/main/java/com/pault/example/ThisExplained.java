package com.pault.example;

import lombok.Data;
import lombok.extern.java.Log;

@Log
public class ThisExplained {

    public static void main(String[] args) {

        DogThis dog = new DogThis();
        dog.setName("Doggo");
        dog.setAge(2);
        log.info(dog.toString());




    }
}

@Data
class DogThis {
    private String name;
    private int age;

    public String bark() {
        return "Woof";
    }

    public void setName(String name) {
        this.name = name;
    }

    public DogThis(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public DogThis(String name) {
        this(name, 0);
    }

    public DogThis() {
        this("", 0);
    }
}