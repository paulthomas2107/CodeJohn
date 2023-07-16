package com.pault.example;

import lombok.extern.java.Log;

@Log
public class CustomExceptions {

    public static void main(String[] args) throws AgeLessThanZeroException{

        validateAge(3);
        validateAge(-1);

    }

    private static void validateAge(int age) throws AgeLessThanZeroException{

        if (age < 0) {
            throw new AgeLessThanZeroException("Age " + age + " is < 0 !", new RuntimeException());
        }
    }
}
