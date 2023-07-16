package com.pault.example;

import lombok.extern.java.Log;

import java.util.*;

@Log
public class SetAndHashSetsDemo {

    public static void main(String[] args) {

        Set<String> namesSet = new HashSet<>();
        log.info(String.valueOf(namesSet.isEmpty()));

        namesSet.add("Paul");
        namesSet.add("Rory");
        namesSet.add("Caitlin");
        namesSet.add("Frank");

        log.info(String.valueOf(namesSet));

        namesSet.remove("Frank");

        log.info(String.valueOf(namesSet));
        log.info(String.valueOf(namesSet.size()));
        log.info(String.valueOf(namesSet.contains("Rory")));
        log.info(String.valueOf(namesSet.contains("Doris")));
        log.info(String.valueOf(namesSet.isEmpty()));

        namesSet.clear();
        log.info(String.valueOf(namesSet));
        log.info(String.valueOf(namesSet.isEmpty()));

        namesSet.add("Paul");
        namesSet.add("Rory");
        namesSet.add("Caitlin");
        namesSet.add("Frank");

        for (String name: namesSet) {
            log.info(name);
        }

        // namesSet.forEach(System.out::println);
        namesSet.forEach(log::info);

        for (String s : namesSet) {
            log.info(s);
        }

        List<Integer> numberListWithDupes = new ArrayList<>();
        numberListWithDupes.add(100);
        numberListWithDupes.add(200);
        numberListWithDupes.add(300);
        numberListWithDupes.add(100);
        numberListWithDupes.add(200);
        numberListWithDupes.add(400);
        log.info(String.valueOf(numberListWithDupes));

        Set<Integer> set2 = new HashSet<>(numberListWithDupes);
        log.info(String.valueOf(set2));

        TreeSet<Integer> treeSet = new TreeSet<>(set2);
        log.info(String.valueOf(treeSet));

        namesSet = new TreeSet<>();
        namesSet.add("Paul");
        namesSet.add("Rory");
        namesSet.add("Caitlin");
        namesSet.add("Frank");
        log.info(String.valueOf(namesSet));

        namesSet = new LinkedHashSet<>(namesSet);
        log.info(String.valueOf(namesSet));


    }
}
