/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;
import java.time.Month;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24),2500.00));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 75.00, 20.5));

        dept.addEmployee(new ExecutiveEmployee("Kira",LocalDate.of(2012, Month.AUGUST, 27), 250000.50));


        //correct way to write usung the reference above

        dept.addEmployee(new SalariedEmployee("Andrew", LocalDate.of(2023, Month.JUNE, 1),
                80000.00));
        dept.addEmployee(new HourlyEmployee("Jakira", LocalDate.of(2024, Month.MAY, 7),
                33.66, 43.50));


        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nPay all employees\n");
        dept.payEmployees();

        System.out.println("\nHolidayBreak\n");
        dept.holidayBreak();

        System.out.println("\nExecutive Employees\n");
        //dept.


        /*


        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jakira", LocalDate.of(2024, Month.MAY, 7),
                33.66, 43.50);
        System.out.println(hourlyEmployee);

        SalariedEmployee salariedEmployee = new SalariedEmployee("Andrew", LocalDate.of(2023, Month.JUNE, 1),
                80000.00);

         */


    }
}