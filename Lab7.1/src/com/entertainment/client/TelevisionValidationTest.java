package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0);
        tv.setBrand("Samsung");
        System.out.println(tv);

        Television tv1 = new Television();
        tv.setVolume(110);
        tv.setBrand("Apple");
        System.out.println(tv1);

        Television tv2 = new Television();
        tv2.setVolume(60);
        tv2.setBrand("Toshiba");
        System.out.println(tv2);

    }

}