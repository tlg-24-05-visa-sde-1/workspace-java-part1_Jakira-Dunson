package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee  {
    public static final double STANDARD_DEDUCTION = 10000.0;
    private double salary;


    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    //business methods
    @Override
    public void pay() {
        System.out.printf("%s pay is: %s. \n", getName(), getSalary());
    }

    @Override
    public void payTaxes() { //interface Taxpayer
        double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.printf("%s paid salary taxes of %s\n", getName(), taxes);
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

//    @Override
//    public void fileReturn() {
//
//    }

    public void takeVacation(){
        System.out.printf("%s is on vacation. \n", getName());
    }



    //getters and setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString method
    @Override
    public String toString() {
        return String.format("Name = %s , Hire date = %s, Salary = %.2f",
                super.getName(), super.getHireDate(), getSalary());
    }

}
