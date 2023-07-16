package com.pault.example;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

@Log
public class VectorsDemo {

    public static void main(String[] args) throws InterruptedException {

        int size = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        log.info("Added to arraylist " + size + " in " + (end - start) + "ms");

        List<Integer> vector = new Vector<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            vector.add(i);
        }
        end = System.currentTimeMillis();
        log.info("Added to vector " + size + " in " + (end - start) + "ms");

        List<Integer> multiThreadList = Collections.synchronizedList(new ArrayList<>());
        start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadList.add(i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        end = System.currentTimeMillis();
        log.info("Thread add to arrayList " + size + " in " + (end - start) + "ms");
        log.info("ArrayList Size " + multiThreadList.size());

        List<Integer> multiThreadVector =  new Vector<>();
        start = System.currentTimeMillis();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadVector.add(i);
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                multiThreadVector.add(i);
            }
        });

        t3.start();
        t4.start();
        t3.join();
        t4.join();

        end = System.currentTimeMillis();
        log.info("Thread add to vector " + size + " in " + (end - start) + "ms");
        log.info("Vector Size " + multiThreadVector.size());

    }
}
