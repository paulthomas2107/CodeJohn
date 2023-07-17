package com.pault.example;

import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.Random;

@Log
public class SelectionSortDemo {

    public static void main(String[] args) {

        int[] numbers = new int[1_000];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100_000);
        }

        //log.info(Arrays.toString(numbers));
        long startTime = System.currentTimeMillis();
        selectionSort(numbers);
        long endTime = System.currentTimeMillis();
        log.info("Took: " + (endTime - startTime)+"ms");
        //log.info(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int indexOfMin = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }
            }
            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap(int[] numbers, int a, int b) {
        int temp = numbers[a];
        numbers[a] = numbers[b];
        numbers[b] = temp;
    }
}
