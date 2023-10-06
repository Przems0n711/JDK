package edu.technischools.java;

//Klasa Vehicle
class Vehicle {
    private final String type;
    private final Double maxSpeed;
    private final Integer weight;
    private String Type;

    public Vehicle(Double maxSpeed, Integer weight, String type) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.type = type;

    }

    @Override
    public String toString() {
        return "Vehicle [maxSpeed=" + maxSpeed + ", weight=" + weight + ", type=" + type + "]";
    }
}

class Plane extends Vehicle {
    private Integer maxAltitude;
    private String engineType;


    public Plane(Double maxSpeed, Integer weight, String type) {
        super(maxSpeed, weight, type);
        this.maxAltitude = maxAltitude;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "This is a plane with engine " + engineType;
    }

    //Klasa VehicleTest
    public static class VehicleTest {
        public static void main(String[] args) {
            Plane plane1 = new Plane(900.0, 5000, "Passenger", 35000, "Jet");
            Plane plane2 = new Plane(800.0, 6000, "Cargo", 30000, "Propeller");

            System.out.println(plane1);
            System.out.println(plane2);
        }
    }
}