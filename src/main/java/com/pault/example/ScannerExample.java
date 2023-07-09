package com.pault.example;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        float shoeSize;

        System.out.println("Please Enter Your Name: ");
        name = scanner.nextLine();

        System.out.println("Please Enter Your Age: ");
        age = scanner.nextInt();

        System.out.println("Please Enter Your Shoe Size: ");
        shoeSize = scanner.nextFloat();

        System.out.println(name + "\n" + age  +"\n" + shoeSize );

        scanner.close();
    }
}
