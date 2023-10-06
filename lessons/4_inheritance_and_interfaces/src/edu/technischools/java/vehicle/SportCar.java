package edu.technischools.java.vehicle;

public class SportCar extends Car {


  public SportCar(String name, Double weight, Double speed, byte noOfDoors) {
    super(name, weight, speed, noOfDoors);
  }

  @Override
  public void move() {
    System.out.println("Dobra");
  }
}
