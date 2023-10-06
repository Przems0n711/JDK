package edu.technischools.java.vehicle;

// interfejs w Javie, określa funkcjonalność (najczęściej jest przymiotnikiem, Runnable, Comparable, Serializable, etc)
// wszystkie metody w interfejsie są domyślnie publiczne
// interfejs tylko deklaruje metody bez ich definicji - podobnie jak metody abstrakcyjne w klasie abstrakcyjnej
public interface Flyable {

  public void fly();

  double getMaxSpeed();

  double getMaxAltitude();
}
