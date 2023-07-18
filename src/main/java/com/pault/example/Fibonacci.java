package com.pault.example;

import lombok.extern.java.Log;

@Log
public class Fibonacci {

    private static long[] fibCache;
    public static void main(String[] args) {

        int n = 500;
        fibCache = new long[n + 1];

        log.info(String.valueOf(fibonacci(n)));

    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibCache[n] != 0) {
            return fibCache[n];
        }

        long nthNo =  (fibonacci(n - 1) + fibonacci(n - 2));
        fibCache[n] = nthNo;
        return nthNo;
    }
}
