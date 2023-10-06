package edu.technischools.java;

import edu.technischools.java.pet.Flyable;

import java.util.Comparator;

public class FlyableComparator implements Comparator<Flyable> {

  @Override
  public int compare(Flyable o1, Flyable o2) {
    return (int)(o1.getSpeed() - o2.getSpeed());
  }

  
}
