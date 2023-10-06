package edu.technischools.java.pet;

public class Eagle extends Animal implements Flyable {

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
  public int getMaxAlt() {
    return 0;
  }

  @Override
  public String toString() {
    return "Eagle [" + getSpeed() + "]";
  }

}
