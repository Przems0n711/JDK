import edu.technischools.java.FlyableComparator;
import edu.technischools.java.PaperPlane;
import edu.technischools.java.pet.Eagle;
import edu.technischools.java.pet.Flyable;

import java.util.Arrays;
import java.util.Comparator;

public class InterfaceTest {

  public static void main(String[] args) {
    // 1. Stworzyć 2 obiekty implementujące interfejs Flyable
    // + Eagle,
    // + wasza klasa
    Flyable eagle = new Eagle();
    Flyable plane = new PaperPlane();

    // 2. Stworzyć 2 elementową tablicę typy Flyable
    // i dodać do niej 2 oba obiekty

    Flyable[] items = new Flyable[] { eagle, plane };

    // 3. Przeiterować po tablicy wywołując metodę fly na
    // każdym obiekcie

    for (int i = 0; i < items.length; i++) {
      items[i].fly();
    }

    // 4. dodać do interfejsu Flyable metodę zwracającą prędkość lotu

    // 5. zaimplementować nowo dodaną metodę w klasach implementujących interfejs

    // 6. Zaimplementować interfejs Compoarator dla typu Flyable

    // 7. Posortować tablicę items

    System.out.println(Arrays.toString(items));

    // Możemy używać klas anonimowych - implmentowanych adhoc
    // Arrays.sort(items, new Comparator<Flyable>() {
    // @Override
    // public int compare(Flyable o1, Flyable o2) {
    // return (int)(o1.getSpeed() - o2.getSpeed());
    // }
    // });
    // wywołanie metody sort,spowoduje użycie metody compareTo z interfejsu
    // Comparable
    Arrays.sort(items);

    System.out.println(Arrays.toString(items));

    // 8. zaimplementować interfej comparable w klasie PaperPlane i Eagle

    // 9. Dodać do klasy FlyableComparator możliwość określenia kierunku sortowania
    // int DESC = -1;
    // int ASC = 1;
    Arrays.sort(items, new FlyableComparator(FlyableComparator.DIRECTION.DESC));
    Arrays.sort(items, new FlyableComparator());


    Arrays.sort(items, new Comparator<Flyable>() {
      @Override
      public int compare(Flyable o1, Flyable o2) {
        return (int) (o1.getMaxAlt() - o2.getMaxAlt());
      }
    });



    System.out.println(TEST_ENUM.ZERO.ordinal()); // wartość int, kolejność deklaracji w enumie
    System.out.println(TEST_ENUM.ONE.ordinal());
    System.out.println(TEST_ENUM.valueOf("TWO").ordinal());
    // System.out.println(TEST_ENUM.valueOf("THREE").ordinal()); ->
    // java.lang.IllegalArgumentException
  }

  public enum TEST_ENUM {
    ZERO,
    ONE,
    TWO;
  }
}
