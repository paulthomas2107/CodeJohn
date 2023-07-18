package com.pault.example;

import lombok.extern.java.Log;

import java.util.*;

@Log
public class QuickSort {

    public static void main(String[] args) {

        Random rand = new Random();

        int [] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(200);
        }

        log.info(Arrays.toString(numbers));

        List<Integer> intArray = new ArrayList<>(Arrays.stream(numbers).boxed().toList());
        Collections.sort(intArray);
        log.info(String.valueOf(intArray));

        SortedSet<Integer> set = new TreeSet<>(intArray);
        log.info(String.valueOf(set));


    }

}
