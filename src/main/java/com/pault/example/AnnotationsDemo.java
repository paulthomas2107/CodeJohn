package com.pault.example;

import lombok.extern.java.Log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Log
public class AnnotationsDemo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Cat myCat = new Cat(4, "Paul");

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
            log.info("This class is very important !");
        } else {
            log.info("Not important !");
        }

        for (Method method : myCat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately anno = method.getAnnotation(RunImmediately.class);
                int runTimes = anno.times();
                for (int x = 0; x < runTimes; x++) {
                    method.invoke(myCat);
                }

            }
        }

        for (Field field : myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportString.class)) {
                Object obj = field.get(myCat);
                if (obj instanceof String stringValue) {
                    log.info(stringValue.toUpperCase());
                }

            }
        }
    }
}
