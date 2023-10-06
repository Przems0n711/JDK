public class MyFirstClassTest {

  public static void main(String[] args) {

    MyFirstClass myFirstClass = new MyFirstClass(); // wywołanie konstruktora bez paramatrowego


    System.out.println(myFirstClass.getName()); // -> null
//
//    MyFirstClass myFirstClassWithParam = new MyFirstClass("Test name"); // konstruktor z parametrem
//
//    System.out.println(myFirstClassWithParam.getName());
//
//    // ponieważ każda klasa dziedziczy po klasie Object, każda klasa ma dostępne publiczne metody z klasy Object
//
    myFirstClass.toString(); // -> tekstowa reprezentacja obiektu, używana np przy wywołaniu System.out.println();
//
//    myFirstClass.equals(myFirstClassWithParam); // -> porównuje obiekty, domyślna implementacja porównuje referencje
//
    myFirstClass.hashCode(); // -> hash danego obiektu, używany przy mapach i kolekcjach, implementują hashCode należy spełnić kontrakt
    // 1. Każde wywołanie hashCode na tej samej instacji obiektu powinno zwrócić tą samą wartość
    // 2. Jeśli obiekty są równe (metoda equals zwraca true) to hashCode takich obiektów powinno być równa
    // 3. Jeśli obiekty nie są równe, nie znaczy to że ich hashCode musi być różny, ale ze względów wydajnościowych powinien

    
  }
  
}
