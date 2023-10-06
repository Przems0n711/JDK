package edu.technischools.java.pet;

// klasy w Javie rozszerza się używając słowa kluczowego extends
// interfejsy implementuje się używając słowa kluczowego implements
// jeśli klasa która implementuje interfejs nie jest abstrakcyjna to musi zaimplementować metody w nim zadeklarowane
public class Eagle extends Animal implements Flyable {

  @Override
  public void fly() {
    System.out.println();
  }

  @Override
  public float getSpeed() {
    return 50;
  }

  @Override
  public void say() {
    System.out.println("Sqweek");
  }
  
}
