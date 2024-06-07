package com.makeup.test;

import com.makeup.FentyBeauty;

public class FentyBeautyValidationTest {
    public static void main(String[] args) {
        FentyBeauty fenty = new FentyBeauty();
        fenty.setConcealerNumber(99);// Should not pass validation
        System.out.println(fenty);
        System.out.println();

        fenty.setConcealerNumber(100); // Should pass validation
        System.out.println(fenty);
        System.out.println();

        fenty.setConcealerNumber(498); // Should pass validation
        System.out.println(fenty);
        System.out.println();

        fenty.setConcealerNumber(499); // Should not pass validation
        System.out.println(fenty);
        System.out.println();

        fenty.setFoundationNumber(0); // Should not pass validation
        System.out.println(fenty);
        System.out.println();

        fenty.setFoundationNumber(1); // Should pass validation.
        System.out.println(fenty);
        System.out.println();

        fenty.setFoundationNumber(25); // Should pass validation
        System.out.println(fenty);
        System.out.println();

        fenty.setFoundationNumber(26); // Should not pass validation
        System.out.println(fenty);
        System.out.println();

        fenty.setFoundationNumber(29); // Should not pass validation
        System.out.println(fenty);
        System.out.println();
    }
}

