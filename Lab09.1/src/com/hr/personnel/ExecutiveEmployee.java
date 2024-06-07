package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class ExecutiveEmployee extends SalariedEmployee {
    public static final double STANDARD_DEDUCTION = 100000;

    public ExecutiveEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work(){
            System.out.println(getName() + " enjoying a nice round of golf " + getHireDate());
    }

//    @Override
//    public void payTaxes() { //interface Taxpayer
//        double taxes = getSalary() * SALARIED_TAX_RATE;
//        System.out.printf("%s paid salary taxes of %s\n", getName(), taxes);
//    }

    @Override
    public void fileReturn(){
        System.out.println("Return filed electronically");
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }
}

