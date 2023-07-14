package com.pault.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    int age;
    String name;
    public void makeNoise() {
        System.out.println("MEOW");
    }


}