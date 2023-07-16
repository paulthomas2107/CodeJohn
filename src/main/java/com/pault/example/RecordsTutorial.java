package com.pault.example;

import lombok.extern.java.Log;

@Log
public class RecordsTutorial {

    public static void main(String[] args) {

        // Standard Java
        EmployeeClass employee = new EmployeeClass("Paul", 1234);
        log.info(employee.getName());

        // Using Record
        EmployeeRecord employeeRecord = new EmployeeRecord("Caitlin", 20101999);
        log.info(employeeRecord.name());
        log.info(employeeRecord.toString());
        log.info(String.valueOf(employeeRecord.hashCode()));
        log.info(employeeRecord.nameToUpperCase());
        EmployeeRecord.printHello();
        log.info(EmployeeRecord.DEFAULT);
        employeeRecord.closeAll();



    }
}
