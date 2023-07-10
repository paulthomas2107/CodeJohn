package com.pault.example;

import lombok.extern.java.Log;

@Log
public class UseLombok {

    public static void main(String[] args) {

        NoMoreGetSet noMoreGetSet = new NoMoreGetSet();
        noMoreGetSet.setAge(12);
        noMoreGetSet.setName("Paul");
        noMoreGetSet.setWeight(100.12F);

        log.info(noMoreGetSet.toString());

    }
}
