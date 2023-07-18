package com.pault.example;

import lombok.extern.java.Log;

@Log
public class ExceptionHandling {

    public static void main(String[] args) {

        int myInt;

        try {
            myInt = Integer.parseInt("pants");
            log.info(String.valueOf(myInt));
        } catch (NumberFormatException | NullPointerException e) {
            log.severe(e.toString());
        } finally {
            log.info("I always do this !");
        }

    }
}
