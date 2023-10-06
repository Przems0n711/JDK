package edu.technischools.java.pet;

public class Eagle extends Animal implements Flyable {


  public Eagle(String name, int age, double weight) {
    super(name, age, weight);
  }

  @Override
  public void fly() {
    System.out.println("Flaping wings");
  }

  @Override
  public void say() {
    System.out.println("Sqweek");
  }

  @Override
  public float getSpeed() {
    return 100;
  }

  @Override
  public String toString() {
    return "Eagle [speed=" + getSpeed() + ",weight=" + getWeight()+"]";
  }

}
