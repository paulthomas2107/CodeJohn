package com.pault.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysVArrayList {

    public static void main(String[] args) {

        String[] names = {"Paul", "Caitlin", "Rory"};
        System.out.println(Arrays.toString(names));

        ArrayList<String> array1 = new ArrayList<>(Arrays.asList(names));
        System.out.println(array1);

        System.out.println(array1.get(0));
        System.out.println(array1);
        array1.add(0, "Kay");
        System.out.println(array1.get(0));
        System.out.println(array1);
        System.out.println(array1.remove(1));
        System.out.println(array1.remove("Rory"));
        System.out.println(array1);

    }
}
