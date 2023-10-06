package edu.technischools.java.vehicle;

public class Plane extends Vehicle implements Flyable {
  

  public Plane(String name, Double weight, Double speed) {
    super(name, weight, speed);
  }

  @Override
  public void move() {
    System.out.println("Plane is moving");
  }

  @Override
  public void fly() {
    System.out.println("Latam");
  }

  @Override
  public double getMaxSpeed() {
    return 50;
  }

  @Override
  public double getMaxAltitude() {
    return 1000;
  }
}
