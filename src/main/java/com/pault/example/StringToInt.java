package com.pault.example;

import lombok.extern.java.Log;

@Log
public class StringToInt {

    public static void main(String[] args) {

        String stringInt = "5";
        log.info(stringInt + 6);

        int total = Integer.parseInt(stringInt) + 6;
        log.info(String.valueOf(total));

        String poss = "-x";
        try {
            int myInt = Integer.parseInt(poss);
        } catch (NumberFormatException e) {
            log.severe(poss + " not a number !");
        }

    }
}
