package com.pault.example;

import lombok.extern.java.Log;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log
public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Cat myCat = new Cat(6, "Stella");
        log.info(myCat.toString());

        Field[] catField = myCat.getClass().getDeclaredFields();

        for (Field field : catField) {
            log.info(field.getName());
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(myCat, "Porky");
            }
        }

        log.info(myCat.toString());

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method : catMethods) {
            log.info(method.getName());
            if (method.getName().equals("makeNoise")) {
                method.invoke(myCat);
            }
            if (method.getName().equals("heyThisIsPrivate")) {
                method.setAccessible(true);
                method.invoke(myCat);
            }
            if (method.getName().equals("thisIsPrivateAndStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }

        }


    }


}
