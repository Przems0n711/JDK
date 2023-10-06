import java.util.Arrays;

public class JavaArrays {
  public static void main(String[] args) {
    // W Javie jak w każdym języku programowania można tworzyć tablicę
    // do stworzenia tablicy używamy operatora [], tablica musi mieć określony
    // rozmiar w momencie tworzenia

    int[] arr = new int[5]; // tablica typu int o rozmiarze 5, tablica jak wszystko w Javie jest klasą, 
                            // więc wymaga stworzenia przy pomcy new

    System.out.println(arr[0]); // -> 0, dostęp do tablicy realizowany jest po przez operator []
    // System.out.println(arr[5]); // można wyjść z indeksem poza tablicę, ale wtedy zostanie rzucony wyjątek 
    // java.lang.ArrayIndexOutOfBoundsException

    // tablicę można zainicjować w momencie deklaracji, wówczas nie podajemy
    // rozmiaru
    int[] arrayOfInts = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

    System.out.println(arrayOfInts); // -> ?? zostanie wypisany adres (referencja) do objektu tablicy, nie zawartość!
    
    for (int index = 0; index < arrayOfInts.length; index++) { // długość tablicy dostępna jest jako właściwość length
      System.out.println(arrayOfInts[index]);
    }

    // Java ma klasę Arrays zmwierającą statyczne metody pomocnicze do operacji na tablicach
    int threeIndex = Arrays.binarySearch(arrayOfInts, 3);
    System.out.println(threeIndex); // -> 2 , Java indeksuje wszystko od 0

    int[] unsortedArray = new int[] { 5, 8, 1, 4, 9, 4, 3, 7, 2, 6 };
    System.out.println(Arrays.toString(unsortedArray)); // -> [5, 8, 1, 4, 9, 4, 3, 7, 2, 6]

    Arrays.sort(unsortedArray);

    System.out.println(Arrays.toString(unsortedArray)); // -> [1, 2, 3, 4, 5, 6, 7, 8, 9]
    // wszystkie metody można sprawdzić w dokumentacji https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Arrays.html

    //Tablica może być dowolnego typu (obiekt lub prymityw)
    String[] names = new String[3];
    names[0] = "Ala";
    names[1] = "ma";
    names[2] = "kota";

    Object[] objects = new Object[3];

    objects[0] = "ala";
    objects[1]  = names;


    System.out.println(Arrays.toString(names)); // -> [Ala, ma, kota]
  }

}
