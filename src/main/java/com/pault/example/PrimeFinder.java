package com.pault.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFinder {

    public static void main(String[] args) {

        System.out.println("Enter limit: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        // A whole number > 1 which is only divisible by 1 or itself
        List<Integer> primeNumbers = new ArrayList<>();

        for (int numberToCheck = 2; numberToCheck <= limit; numberToCheck++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck/2; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(numberToCheck);
            }

        }
        int diff = 0;
        int highDiff = 0;
        String message = "";
        for (int number: primeNumbers) {
            String msg = number + " " + "(" +  (number - diff) + " since " + diff + ")";
            System.out.println(msg);
            if ((number - diff) > highDiff) {
                highDiff = number - diff;
                message = msg;
            }
            diff = number;
        }
        System.out.println("\nHighest: " + message);

    }
}
