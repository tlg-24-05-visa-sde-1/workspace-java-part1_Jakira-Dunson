package com.entertainment;

import java.util.Arrays;

public class Television {
    //static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};
    private static int instanceCount = 0;
    //Television has a tuner where all task related to channel changing
    private Tuner tuner = new Tuner(); //instantiated internally not exposed

    //static method
    public static int getInstanceCount() {
        //boolean isConnected = verifyInternetConnection();
        //static methods cannot call instance methods
        return instanceCount;
    }

    // properties or attributes ... called instance variables/ fields
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;
    private boolean isMuted;
    private int oldVolume;

    //constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();  //delegates to the no arg constructor for the increment
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // regular methods
    public void mute() {
        if (!isMuted) {
            oldVolume = volume;
            setVolume(0);
            isMuted = true;
        }
        this.volume = oldVolume;
        isMuted = false;
    }

    private int unMute() {
        return this.getVolume();
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    private boolean isMuted() {
        return isMuted;
    }

    public int oldVolume() {
        int oldVolume = volume;
        return oldVolume;
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + brand + " to " + volume + ".");
    }

    public void turnOff() {
        System.out.println("Turning off your " + brand + " because the volume is " + volume + " and that is loud.");
    }

    public void changeChannel(String channel) {
        tuner.setChannel(channel); //delegated to the Tuner object for the actual work
    }

    //getters and setters go under your methods

    private String getCurrentChannel() {
        return tuner.getChannel(); //delegates to Tuner object for the actual work
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        boolean isValid = false;

        for (String validBrand : VALID_BRANDS) {
            if (brand.equals(validBrand)) {
                this.brand = validBrand;
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.printf("Invalid brand: %s. Must be one of %s\n", brand, Arrays.toString(VALID_BRANDS));
        }

        /*
        switch (brand) {
            case "Samsung":
            case "Sony":
            case "LG":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println(brand + " is an invalid brand.");
        }

 */
/*
        if (brand.equals("Samsung") || brand.equals("LG") || brand.equals ("Sony") || brand.equals("Toshiba") ){
            this.brand = brand;
        } else {
            System.out.println(brand + " is not a valid brand.");
        }

 */
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.printf("Invalid volume : %s. Must be between %s and %s. \n",
                    volume, MIN_VOLUME, MAX_VOLUME);

            // System.out.println("The volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    public static void setInstanceCount(int instanceCount) {
        Television.instanceCount = instanceCount;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public int getOldVolume() {
        return oldVolume;
    }

    public void setOldVolume(int oldVolume) {
        this.oldVolume = oldVolume;
    }

    //toString, generally already set by default BUT you can override it to say what you want it to say
    @Override
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return String.format("Televison:  brand = %s, volume = %s, display = %s, channel = %s",
                getBrand(), volumeString, getBrand(), getCurrentChannel());

        /*return "Television: " +
                "brand = '" + getBrand() + '\'' + "display type: " + getDisplay() +
                ", volume = " + getVolume() + volumeString;

         */
    }


}




