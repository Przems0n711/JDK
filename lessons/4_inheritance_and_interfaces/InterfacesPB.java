package edu.technischools.java.pet;

abstract class Vehicle {
    String name;
    double weight;
    double speed;

    public Vehicle(String name, double weight, double speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    abstract void move();
}

class Car extends Vehicle {
    byte noOfDoors;

    public Car(String name, double weight, double speed, byte noOfDoors) {
        super(name, weight, speed);
        this.noOfDoors = noOfDoors;
    }

    @Override
    void move() {
        System.out.println("Car is moving yay");
    }
}

interface Flyable {
    void fly();
    double getSpeed();
    double getMaxAltitude();
}

class Plane extends Vehicle implements Flyable {
    public Plane(String name, double weight, double speed) {
        super(name, weight, speed);
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying yay");
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double getMaxAltitude() {
        return 30000;
    }

    @Override
    void move() {
        System.out.println("Plane is taxing on the runway yay");
    }
}
