package com.pault.example;

import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.Random;

@Log
public class InsertionSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[1_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10_000);
        }

        log.info(Arrays.toString(numbers));
        insertionSort(numbers);
        log.info(Arrays.toString(numbers));

    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }


}
