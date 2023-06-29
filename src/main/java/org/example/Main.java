package org.example;

import org.example.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car("Honda", "Civic", 2012); // This works. (subclass to superclass)
        vehicle.move(); // Q: What will be printed out?
                        // A: "The car is driving."
                        // Why not "The vehicle is moving." ?
                        // Vehicle defines the *interface* (what you can do)
                        // Car defines the *implementation* (how you do it)
        Car car = (Car)vehicle;  // This requires a cast (superclass to subclass)
        System.out.println("The vehicle and car variables refer to the same instance: " + (vehicle == car));
    }
}