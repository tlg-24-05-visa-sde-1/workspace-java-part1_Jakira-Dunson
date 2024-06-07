package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;


    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }


    public void goToWork() throws DestinationUnreachableException {
        // TODO: create an instance of Car with all three properties: vin, make, model
        /* When you instantiate an outer object inside a method in another class you have to put the arguements of the outer object in the method like it's done below and the import of the car object is above*/
        Car car1 = new Car("2546656", "BMW", "280i");

        // TODO: call moveTo() on the Car object, passing "West Seattle" for the destination

        car1.start();
        car1.moveTo("West Seattle");
        car1.stop();


    }

    // BUSINESS METHODS
//    public void goToWork() {
//        // TODO: create an instance of Car with all three properties: vin, make, model
//        /* When you instantiate an outer object inside a method in another class you have to put the arguements of the outer object in the method like it's done below and the impotr of the car object is above*/
//            Car car1 = new Car("2546656", "BMW", "280i");
//
//        // TODO: call moveTo() on the Car object, passing "West Seattle" for the destination
//       try {
//           car1.start();
//           car1.moveTo("West Seattle");
//
//       }catch (DestinationUnreachableException e){
//           System.out.println(e.getMessage());
//       }finally {
//           car1.stop();
//       }
//
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}