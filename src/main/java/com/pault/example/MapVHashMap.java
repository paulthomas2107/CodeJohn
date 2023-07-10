package com.pault.example;

import java.util.*;


public class MapVHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> nameMap = new HashMap<>();
        nameMap.put(217, "Paul");
        nameMap.put(243, "Rory");
        nameMap.put(2010, "Caitlin");
        System.out.println(nameMap);

        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(217, "Paul");
        map2.put(243, "Rory");
        map2.put(201, "Caitlin");
        System.out.println(map2);

        System.out.println(map2.get(243));
        System.out.println(nameMap.get(2010));

        System.out.println(nameMap.containsKey(217));
        System.out.println(map2.containsValue("Caitlin"));

        map2.replace(243, "Rory T");
        System.out.println(map2);

        Set<Integer> keys  = map2.keySet();
        System.out.println(keys);




    }
}
