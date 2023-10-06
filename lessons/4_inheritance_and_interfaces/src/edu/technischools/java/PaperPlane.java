package edu.technischools.java;

import edu.technischools.java.pet.Flyable;

public class PaperPlane implements Flyable {

  @Override
  public void fly() {
    System.out.println("Flying thru the classroom"); 
  }

  @Override
  public float getSpeed() {
    return 10;
  }
}
