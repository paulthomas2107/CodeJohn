package com.pault.example;

import lombok.extern.java.Log;

@Log
public record EmployeeRecord(String name, int employeeNumber) implements ICloseable{

    public EmployeeRecord  {
        log.info("Built !!!");
    }

    public static final String DEFAULT = "*** DEFAULT ***";

    public String nameToUpperCase() {
        return name.toUpperCase();
    }

    public static void printHello() {
        log.info("Hello !");
    }

    @Override
    public void closeAll() {
        log.info("All Closed");
    }
}
