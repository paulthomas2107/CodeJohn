package com.pault.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log
public class Cat100 implements Printable{

    public String name;
    public int age;


    @Override
    public String print(String prefix, String suffix) {
        return prefix + " !!!! " + suffix;
    }


}
