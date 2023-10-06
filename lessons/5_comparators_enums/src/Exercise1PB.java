package edu.technischools.java;
import java.util.Arrays;
import java.util.Comparator;

class Vehicle implements Comparable<Vehicle> {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.speed, other.speed);
    }

    @Override
    public String toString() {
        return name + " (Speed: " + speed + ")";
    }
}

class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("Car", 120),
                new Vehicle("SportCar", 180),
                new Vehicle("Plane", 550),
                new Vehicle("JetFighter", 2200)
        };

        Arrays.sort(vehicles);

        System.out.println(Arrays.toString(vehicles));
    }
}