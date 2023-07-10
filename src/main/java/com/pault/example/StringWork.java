package com.pault.example;

import lombok.extern.java.Log;

@Log
public class StringWork {

    public static void main(String[] args) {

        String name = "Paul";
        name = "Larry";
        String larry = "Larry";
        String newLarry = new String("Larry");
        String paul = "Paul";

        log.info(name + " " + name.hashCode());
        log.info(larry + " " + larry.hashCode());
        log.info(newLarry + " " + newLarry.hashCode());
        log.info(paul + " " + paul.hashCode());

        log.info(" "+(name.equals(newLarry)));

    }


}
