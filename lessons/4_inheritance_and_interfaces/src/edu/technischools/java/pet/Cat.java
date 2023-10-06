package edu.technischools.java.pet;

public class Cat extends Animal {

  public Cat() {
  }

  public Cat(String name, int age, double weight) {
    super(name, age, weight);
  }

  public void meow(){
    System.out.println("Meow");
  }

  @Override
  public void say() {
    meow();
  } 
  
}
