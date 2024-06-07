package com.hr.client;

import com.hr.Employee;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        // TODO: create an instance of Employee
        Employee employee= new Employee("Steve");

        // TODO: call goToWork() on the Employee object

        try {
            employee.goToWork();
        } catch (DestinationUnreachableException e) {
            throw new RuntimeException(e.getMessage());
        }


    }
}