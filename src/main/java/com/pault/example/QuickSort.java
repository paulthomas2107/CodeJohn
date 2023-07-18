package com.pault.example;

import lombok.extern.java.Log;

import java.util.*;
import java.util.stream.Collectors;

@Log
public class QuickSort {

    public static void main(String[] args) {

        int [] numbers = new int[20];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(200);
        }

        log.info(String.valueOf(new TreeSet<>(new ArrayList<>(Arrays.stream(numbers).boxed().collect(Collectors.toSet())))));

    }

}
