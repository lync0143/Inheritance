package org.example.vehicles;

public class Car extends Vehicle {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        super(4);
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void move() {
        System.out.println("The car is driving.");
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void honk() {
        System.out.println("Honk, honk.");
    }
}
