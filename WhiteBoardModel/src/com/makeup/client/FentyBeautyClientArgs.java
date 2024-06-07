package com.makeup.client;

import com.makeup.ConcealerType;
import com.makeup.FentyBeauty;
import com.makeup.FoundationType;

import java.util.Arrays;

public class FentyBeautyClientArgs {
    public static void main(String[] args) {
        //Ensure enough arguments
        if (args.length < 7) {
            String display = String.format(
                    "Usage:    %-10s <foundation> <foundationNumber> <concealer> <concealerNumber> <primer> <mascara> <blush>\n" +
                            "Example:  %-10s PRO_FILTR, 14, PRO_FILTR_INSTANT, 112, Silk, Hella_Thicc_Mascara, Cheeks_Out\n" +
                            "Notes:\n" +
                            " 1. Available foundations are %s\n" +
                            " 2. Available concealers are %s\n",
                    "com.makeup.client.FentyBeautyClientArgs:",
                    "com.makeup.client.FentyBeautyClientArgs:",
                    Arrays.toString(FoundationType.values()),
                    Arrays.toString(ConcealerType.values())
            );

            System.out.println(display);
            return;
        }
        //Process argument strings into proper types for com.makeup.FentyBeauty
        String primer = args[0];
        FoundationType foundation = FoundationType.valueOf(args[1]);
        int foundationNumber = Integer.parseInt(args[2]);
        ConcealerType concealer = ConcealerType.valueOf(args[3]);
        int concealerNumber = Integer.parseInt(args[4]);
        String mascara = args[5];
        String blush = args[6];

        //Create com.makeup.FentyBeauty object
        FentyBeauty fb = new FentyBeauty(primer, foundation,foundationNumber, concealer, concealerNumber, mascara, blush);

        //Print
        System.out.println("Thank you for your order!");
        System.out.println("Your custom Fenty Beauty set is on the way: ");
        System.out.println(fb);
    }
}