/*
  1. Stworzyć publiczną klasę zwierzę w pakiecie edu.technischools.java.pet

  Klasa ma mieć 3 pola :
  - tekstowe z nazwą
  - liczbowe z wiekiem
  - zmienno przecinkowe z wagą

  Wszystkie pola prywatne z dostępem przez gettery i settery

 2. Stworzyć klasę AnimalTest z metodą main (psvm),
  w metodzie main stworzyć 2 objekty klasy Animal, ustawić im różne wartości 
  i wypisać ich nazwy na ekran 

*/
package edu.technischools.java.pet;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {

  private String name;
  private int age;
  private double weight;

  public Animal() {
  }

  public Animal(String name, int age, double weight) {
    this.name = name;
    this.age = age;
    this.weight = weight;
  }

  public abstract void say();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]";
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Animal animal)) {
      return false;
    }

    return Objects.equals(name, animal.name);
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }

  @Override
  public int compareTo(Animal o) {
    return (int) Math.ceil(this.getWeight() - o.getWeight());
  }
}
