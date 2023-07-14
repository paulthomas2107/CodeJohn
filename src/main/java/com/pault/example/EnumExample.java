package com.pault.example;

import lombok.extern.java.Log;

@Log
public class EnumExample {

    public static void main(String[] args) {

        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        for(DaysOfTheWeek myDay: DaysOfTheWeek.values()) {
            log.info(myDay.name());
        }

        log.info(String.valueOf(DaysOfTheWeek.THURSDAY.dayLevel));
        log.info(String.valueOf(DaysOfTheWeek.THURSDAY.cost));


    }
}

