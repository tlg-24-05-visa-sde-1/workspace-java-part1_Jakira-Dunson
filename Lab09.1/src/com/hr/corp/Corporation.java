/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements TaxPayer {
    public static final double STANDARD_DEDUCTION = 1000000.0;
    private String name;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    @Override
    public double getStandardDeduction() {
        return STANDARD_DEDUCTION;
    }

    @Override
    public void fileReturn() {
        System.out.println("The return was/ was not filed. Who knows");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}