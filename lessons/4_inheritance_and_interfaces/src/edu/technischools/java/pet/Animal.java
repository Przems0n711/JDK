package edu.technischools.java.pet;

// Klasa abstrakcyjna nie może zostać zainstancjonowane ( nie da się wywołać konstruktora)
// służy jako "szablon" dla konkretnych klas z niej dziedziczących
public abstract class Animal {

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

  // tylko klasy abstrakcyjne mogą mieć metody abstrakcyjne
  // abstarkcyjna metoda nie ma ciała - tylko deklarację, 
  // każda klasa która dziedziczy z klasy abstrakcyjnej i nie jest klasą abstarkcyjną musi implementować metody abstrakcyjne
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
}
