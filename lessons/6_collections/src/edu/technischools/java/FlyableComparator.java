package edu.technischools.java;

import java.util.Comparator;

import edu.technischools.java.pet.Flyable;

// komparator służy do porównywania klas, w tym wypadku określamy dokładnie 
// że porównywać możemy tylko klasy Flyable, nasz komparator jest typowany (typy podajemy pomiędzy <> )
public class FlyableComparator implements Comparator<Flyable> {

  // kierunek sortowania
  private DIRECTION direction = DIRECTION.ASC;

  public FlyableComparator() {
  }

  public FlyableComparator(DIRECTION direction) {
    this.direction = direction;
  }

  // Interfejs comparator ma jedną metodę - compare, którą musimy zaimplementować
  @Override
  public int compare(Flyable o1, Flyable o2) {
    // zmienna direction określa kierunek sortowania, ponieważ sortowanie
    // wykonywane jest na podstaie wartości int (<0,=0,>0), to zmiana kierunku
    // sortowania
    // wymaga tylko zmiany znaku (pomnożenia przez -1 )
    return (int) (o1.getSpeed() - o2.getSpeed()) * direction.getValue();
  }

  // typ wyliczeniowy, pozwala na określenie typu który ma stały zbiór wartości
  public enum DIRECTION {
    ASC(1),
    DESC(-1);

    private int value;

    DIRECTION(int value) {
      this.value = value;
    };

    public int getValue() {
      return this.value;
    }
  }
}
