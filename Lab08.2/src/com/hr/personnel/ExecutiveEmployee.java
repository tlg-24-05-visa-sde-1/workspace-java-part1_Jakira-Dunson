package com.hr.personnel;

import java.time.LocalDate;

public class ExecutiveEmployee extends SalariedEmployee {

    public ExecutiveEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work(){
            System.out.println(getName() + " enjoying a nice round of golf " + getHireDate());
    }
}
