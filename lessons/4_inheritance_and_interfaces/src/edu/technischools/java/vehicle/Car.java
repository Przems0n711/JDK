package edu.technischools.java.vehicle;

public class Car extends Vehicle {

  private byte noOfDoors;

  public Car(String name, Double weight, Double speed, byte noOfDoors) {
    super(name, weight, speed);
    this.noOfDoors = noOfDoors;
  }

  @Override
  public void move() {
    System.out.println("dobra");
  }

  public byte getNoOfDoors() {
    return noOfDoors;
  }

  public void setNoOfDoors(byte noOfDoors) {
    this.noOfDoors = noOfDoors;
  }
}
