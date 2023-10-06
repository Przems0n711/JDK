package edu.technischools.java.vehicle;

public abstract class Vehicle {

  private String name;
  private Double weight;
  private Double speed;

  public Vehicle(String name, Double weight, Double speed) {
    this.name = name;
    this.weight = weight;
    this.speed = speed;
  }

  public abstract void move();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Double getSpeed() {
    return speed;
  }

  public void setSpeed(Double speed) {
    this.speed = speed;
  }
}
