package com.pault.example;

import java.util.*;

public class WorstSortEver {
    public static void main(String[] args) {

        Random rand = new Random();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            numberList.add(rand.nextInt(10_000));
        }

        // Sort goes here
        while (!isListSorted(numberList)) {
            Collections.shuffle(numberList);
        }

        numberList.forEach(System.out::println);

    }

    private static boolean isListSorted (List<Integer> numberList) {
        if (numberList == null) {
            return true;
        }

        int length = numberList.size();
        if (length <= 1) {
            return true;
        }

        for (int i = 0; i < length - 1; i++) {
            if (numberList.get(i) > numberList.get(i + 1)){
                return false;
            }
        }

        return true;
    }
}