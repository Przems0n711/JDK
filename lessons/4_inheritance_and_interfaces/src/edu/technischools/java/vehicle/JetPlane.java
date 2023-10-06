package edu.technischools.java.vehicle;

public class JetPlane extends Plane {

  public JetPlane(String name, Double weight, Double speed) {
    super(name, weight, speed);
  }

  @Override
  public void fly() {
    System.out.println("Latam szybko");
  }

  @Override
  public double getMaxSpeed() {
    return 500;
  }

  @Override
  public double getMaxAltitude() {
    return 1000;
  }
}
