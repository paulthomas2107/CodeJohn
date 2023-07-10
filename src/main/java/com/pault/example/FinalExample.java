package com.pault.example;

public class FinalExample {

    public static void main(String[] args) {


    }
}

final class Dog {
    private String breed;
    private double price;
}

// Cant inherit from final class
class Pooch /*extends Dog */{

}

class DoStuff {
    final void eat() {
        System.out.println("Eat");
    }
}

class Hello extends DoStuff {
    //void eat() {

   // }
}