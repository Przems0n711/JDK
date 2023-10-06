package org.technischools.java.introduction;

public class ControlStatements {

//  public void testMethod(){
//    System.out.println("Test");
//  }

  public static void main(String[] args) {

    // Język Java ma swoją składnię opartą na języku C/C++,
    // dlatego też wszystkie instrukcje sterujące wyglądają jak w C
    int i = 5;

    int j = (int) (Math.random() * 10); // losujemy liczbę od 0 do 10, funkcja Math.random() zwraca liczbę zmiennoprzecinkową w zakresie 0-1;

    /* Instrukcje warunkowe */


    if (i == j) { // warunek musi zwracać wartość logiczną, w Javie 0, null nie są wartością logiczną 'false' tak jak w C czy JavaScript
      System.out.println("Lucky number 5");
    } else if (i > j) {
      System.out.println("Less than 5");
    } else {
      System.out.println("More than 5");
    }

    /* Pętle */
    // pętla for działa tak jak w C

    // instrukcja początkowa pętli; warunek kontynuowania pętli-jeśli wartość jest true, kolejna iteracja zostanie wykonana; intrukcja wykonana po wykonaniu ciała pętli
    for (int index = 0; index < 10; index++) {
      System.out.print(index); // -> 0123456789
    }
    System.out.println();

    // pomijając drugą instrukcję możemy stworzyć pętlę nieskończoną
//     for(;;){
//       System.out.println("I'm in infinite loop"); // -> będzie w nieskończoność wypisywać tekst na konsolę
//     }

    // pętla while()
    // analogicznie jak w C - warunek pętli sprawdzany przed wejściem do pętli
    int k = 0;

    while (k < 10) { // użycie jako warunku true stworzy pętlę nieskończoną
      System.out.print(k++); // -> 0123456789
    }
    System.out.println();

    // pętla do { } while()
    // warunek sprawdzany po wykonaniu pętli, taka pętla wykona się co najmniej raz
    do {
      System.out.println("I'm executed at least once"); // -> I'm executed at least once
    } while (false); // mimo że warunek jest zawsze false, taka pętle wykona się co najmniej raz

    /* Operatory logiczne */
    // Analogicznie jak w innych językach programowania dostępne są operatory logiczne
    // && - and
    // || - or
    //  ! - not

    /* Operator warunkowy */
    // Operator ten pozwala zapisać prosty warunek logiczny bez użycia instrukcji if else
    int jj = (int) (Math.random() * 10);
    //  warunek logiczny ? wartość jeśli true : wartość jeśli false;

    String winning = jj == 5 ? "Lucky Number 5" : "I lost";

    System.out.println(winning);
  }
}
