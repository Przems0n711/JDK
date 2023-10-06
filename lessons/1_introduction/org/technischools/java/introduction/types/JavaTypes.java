package org.technischools.java.introduction.types;

public class JavaTypes {

  public static void main(String[] args) throws Exception {

    /* Typy liczbowe */

    // W Javie wszystko jest obiektem, ale jest kilka typów-tzw. typy prymitywne,
    // które mają też swoje reprezentacje w postaci klas
    // typy całkowite

    byte b = 0; // typ całkowity 1B - 0 - 255, <-128 +127>
    short s = 1; // typ całkowity 2B
    int i = 2; // typ całkowity 4B
    long l = 3; // typ całkowity 8B

    // Każdy z nich ma opowiadającą klasę
    Byte bb = 0;
    Short ss = 1;
    Integer ii = 2;
    Long ll = 3L; // L na końcu to wskazówka dla Javy żeby tą wartość traktował jako typ long - domyślnie wszystkie liczby w javie to inty.

    // Tworząc obiekty jednej z powyższych klas, nie musimy używać Konstruktorów (new Byte(),....)
    // Java sama potrafi stworzyć obiekt klasy z typu prymitywnego
    // Analogicznie, potrafi zamienić automatycznie typ prymitywny na obiekt i vice
    // versa-nazywa się to auto-boxing, auto-unboxing (box od pakowania)

    System.out.println(i == ii); // obiekt ii zostanie automatycznie rozpakowany do typu prymitywnego i dzięki temu możemy porównać prymityw z klasą
    // Dzieki temu możemy wykonywać operację na zmiennych, które są prymitywami i
    // objektami używając zwykłych operatorów matematycznych, bez konieczności
    // używania metod
    System.out.println((i + ii) * 2);

    // Analogicznie mamy typy zmienno przecinkowe
    float f = 0.2F; // F na końcu to wskazówka dla Javy żeby tą wartość tarktował jako typ float,  domyślnie wszystkie liczby zmienno przecinkowe w Javie to double
    double d = 0.5;

    // I odpowiadające klasy
    Float ff = 0.2F;
    Double dd = 0.5;

    /* Typy logiczne */
    boolean bool = true; // wartość logiczna przyjmuje wartość true|false
    Boolean boolObject = false; // ponieważ jest to objekt może przyjąć wartość true|false|null

    /*  Typy znakowe     */
    
    // Poza typami liczbowymi mamy typy znakowe
    char c = 'a'; // pojedynczy znak umieszczany w ' ', przechowuje znaki w formacie UTF
    // i odpowiadający objekt
    Character cc = 'c';

    // UWAGA - typ char jest również typem liczbowym (2B), można na nim wykonywać
    // operacje matematyczne - wartość numeryczne odpowiada liczbie w kodzie ASCII -> https://www.asciitable.com/
    // np.
    char distance = (char) ('A' - 'a'); // odległość między dużą a małą literą w kodzie ASCII
    char bigC = (char) ('c' + distance);

    System.out.println(bigC); // -> 'C'
    System.out.println((short)bigC); // -> 67 - kod ASCII dla C

    // Typ String pozwla na przechowywanie ciągów znaków, nie jest wymagane użycie konstruktora żeby przypisać mu wartość
    String str = "Hello World";
    String newStr = new String("Hello World");

    System.out.println(str); // -> Hello World
    System.out.println(newStr); // -> Hello World

    // Ponieważ w Javie wszystko jest obiektem (poza prymitywami) operator == będzie porównywał referencję obiektów (ich adresy w pamięci)
    // np.
    Integer k = new Integer(123456);
    Integer j = new Integer(123456);

    int m = 123456;

    System.out.println(k == j); // -> false , ponieważ mamy dwa różne objekty

    // do powrównać w Javie służy metoda .equals która jest dostępna w klasie Object, z tej klasy dziedziczą wszystkie inne klasy w Javie
    System.out.println(k.equals(j)); // -> true

    System.out.println(k == m); // -> true

    //analogicznie dla Stringów
    System.out.println(str == newStr); // -> false ,różne obiekty
    System.out.println(str.equals(newStr)); // -> true
    
    /* typ void */
    printHelloWorld();

  }
  // jeśli metoda ma nie zwracać żadnej wartości należy użyć typu void
  public static void printHelloWorld(){
    System.out.println("Hello world");
  }

}
