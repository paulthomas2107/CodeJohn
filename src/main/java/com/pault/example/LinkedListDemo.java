package com.pault.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Paul");
        namesLinkedList.add("Caitlin");
        namesLinkedList.add("Rory");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1, "Adolfo");
        System.out.println( namesLinkedList);

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("George");
        namesArrayList.add("John");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(1));
        namesArrayList.add("Lydia");
        System.out.println( namesArrayList);




    }
}
