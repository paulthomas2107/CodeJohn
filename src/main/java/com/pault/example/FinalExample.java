package com.pault.example;

public class FinalExample {

    public static void main(String[] args) {


    }
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