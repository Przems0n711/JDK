package edu.technischools.java;

import edu.technischools.java.pet.Flyable;

// interfejs Comparable określa że nasz klasa jest "prównywalna",
// dzięki temu można sortować tablice lub kolekcje z tym typem,
// deklarujemy nasz interfejst jako typowany - mówimy że nasza klasa może być
// porównywana tylko z innymi klasami typu Flyable
public class PaperPlane implements Flyable, Comparable<Flyable> {

  @Override
  public void fly() {
    System.out.println("Flying thru the classroom");
  }

  @Override
  public float getSpeed() {
    return 10;
  }

  // metoda z interfejsu Comparable<Flyable>
  // porównuje nasz obiekt (this) z innym obiektem (other)
  @Override
  public int compareTo(Flyable other) {
    return (int) (this.getSpeed() - other.getSpeed());
  }

  @Override
  public String toString() {
    return "PaperPlane [" + getSpeed() + "]";
  }

}
