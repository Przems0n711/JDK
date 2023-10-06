package edu.technischools.java.pet;

public class Dog extends Animal {

  public Dog() {
  }

  public Dog(String name, int age, double weight) {
    super(name, age, weight);
  }

  public void bark(){
    System.out.println("Woof, woof");
  }

  @Override
  public void say() {
    bark();
  }

  
}
