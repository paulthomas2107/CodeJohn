package com.pault.example;

import lombok.extern.java.Log;

@Log
public class Cog extends Cat implements Fetch, Runnable, Comparable<String> {

    @Override
    public void fetch() {
        log.info("I fetch !");
    }

    @Override
    public int compareTo(String x) {
        return 0;
    }

    @Override
    public void run() {

    }
}
