package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }
    //business methods

    @Override
    public void pay() {
        System.out.printf("%s hourly wage is: %s they have worked: %s. \n", getName(), getRate(), getHours() );
    }

    //getters and setters
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    //toString method
    @Override
    public String toString() {
        return String.format("Name = %s , Hire date = %s, rate = %.2f, hours worked = %.2f ", super.getName(),
                super.getHireDate(), getRate(), getHours());


    }
}
