package org.example.vehicles;

public class Vehicle {
    private int numWheels;
    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public void move() {
        System.out.println("The vehicle is moving.");
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public String toString() {
        return "This is a vehicle with " + numWheels + " wheels.";
    }
}
