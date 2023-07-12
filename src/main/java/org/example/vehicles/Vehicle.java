package org.example.vehicles;

public class Vehicle implements Comparable<Vehicle> {
    private final int numWheels;
    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.getNumWheels(), o.getNumWheels());
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
