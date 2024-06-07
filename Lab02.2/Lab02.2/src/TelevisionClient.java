

public class TelevisionClient {
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();

        //object 1 created 
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(32);

        //object 2 created 
        Television tv2 = new Television("LG" , Television.MAX_VOLUME);  //set it as loud as possible
        tv2.setBrand("LG");
        tv2.setVolume(150);
        System.out.println(tv2);

        //object 3 created
        Television tv3 = new Television("Apple TV");

        //object 4 created
        Television tv4 = new Television("TLC", 85);

        Television tv5 = new Television("LG", 50, DisplayType.PLASMA);
        System.out.println(tv5);

        //function call
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();
        tv4.turnOn();
        tv5.turnOn();
        System.out.println();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();
        tv4.turnOff();
        tv5.turnOff();
        System.out.println(); //toString is automatically called when you write out



        System.out.println(Television.getInstanceCount() + " instances have been created");


    }
}
