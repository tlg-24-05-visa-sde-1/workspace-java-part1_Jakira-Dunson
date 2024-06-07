package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

public class TelevisionClientArgs {
    public static void main(String[] args) {
        //three arguments needed
        if(args.length<3){
            String usage =
                    "Usage:   java TelevisionClientArgs <brand> <volume> <display>\n" +
                    "Example: java TelevisionClientArgs Samsung 64 PLASMA\n"+
                    "Notes:\n" +
                    " 1. Available brands are " + Arrays.toString(Television.VALID_BRANDS) + "\n"+
                    " 2. Volume must be " + Television.MIN_VOLUME + " to" + Television.MAX_VOLUME+" (inclusive)\n"+
                    " 3. Supported displays are: "+ Arrays.toString(DisplayType.values());
            System.out.println(usage);
            return;
        }
        //process arguments strings into proper types for a Television
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        //Television object
        Television tv = new Television(brand, volume, display);

        //print
        System.out.println("Thank you for your order!");
        System.out.println("Your custom television is on the way: ");
        System.out.println("\t" + tv);

    }
}
