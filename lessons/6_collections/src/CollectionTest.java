import edu.technischools.java.pet.Animal;
import edu.technischools.java.pet.Cat;
import edu.technischools.java.pet.Dog;
import edu.technischools.java.pet.Eagle;

import java.util.*;

public class CollectionTest {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Dog dog = new Dog("Pluto", 10, 25);
    Cat cat = new Cat("Tom", 4, 8);
    Eagle eagle = new Eagle("Bielik", 10, 12);

    // Do tej pory poznaliśmy tablice, jako obiekty pozwalające przechowywać inne obiekty.
    // Tablice jednak mają stały rozmiar- nie można w trakcie działania aplikacji zmienić ich rozmiaru.
    Animal[] animals = new Animal[]{
        dog,
        cat,
        eagle
    };

    // Rozwiązaniem tego problemu są kolekcje, obiekty(kontenery) pozwalające przechowywać inne obiekty
    // Do najważniejszych typów kolekcji należą:
    // - listy - implementują interfejs List<T>
    // - zbiory - implementują interfejs Set<T>
    // - mapy - implementują interfejs Map<K,V>

    // # Listy - uporządkowany zbiór elementów, w którym iteracja będzie zawsze w kolejności dodawania elementów

    // ArrayList - lista, która pod spodem kryję tablicę (stąd 'Array')

    System.out.println("ArrayList");
    List<Animal> list = new ArrayList<>();

    list.add(cat);
    list.addAll(Arrays.asList(animals));
    System.out.println(list.get(0));
    System.out.println(list.size());
    list.remove(2);

    System.out.println(list);

    //LinkedList-dwukierunkowa lista, która jest szybka w dodawaniu i przeglądaniu elementów,
    // ale "wolna" w dostępie do konkretnego indeksu-wewnętrznie lista musi przejść od początku do danego elementu
    List<Animal> linkedList = new LinkedList<>();

    System.out.println("LinkedList");
    linkedList.addAll(Arrays.asList(animals));
    linkedList.add(cat);
    System.out.println(linkedList.get(3));
    for (Animal a : linkedList) {
      System.out.println(a);
    }


    // # Zbiory - zbiór elementów (uporządkowany, bądź nie) bez duplikatów, w przypadku nieuporządkowanego zbioru,
    // kolejność w jakiej iterujemy jest "losowa" - kolejność dodawania elementów nie ma znaczenia.

    // HashSet, TreeSet, LinkedHashSet
    System.out.println("HashSet");
    Set<Animal> animalSet = new HashSet<>();
    animalSet.addAll(Arrays.asList(animals));
    System.out.println(animalSet.size());
    animalSet.add(dog);
    System.out.println(animalSet.size());

    for (Animal animal : animalSet) {
      System.out.println(animal);
    }

    System.out.println("TreeSet");
    Set<Animal> animalsTreeSet = new TreeSet<>();

    animalsTreeSet.addAll(Arrays.asList(animals));
    animalsTreeSet.add(cat);
    for (Animal animal : animalSet) {
      System.out.println(animal);
    }

    // # Mapy

    // HashMap, LinkedHashMap, TreeMap
    System.out.println("HashMap");
    Map<String, Animal> animalMap = new HashMap<>();
    animalMap.put("cat", cat);
    animalMap.put("dog", dog);
    animalMap.put("inaczej", eagle);

    System.out.println(animalMap.get("dog"));
    animalMap.get("dog").setName("Alfred");
//    animalMap.put("dog", null);

    System.out.println(animalMap.get("dog"));
    animalMap.put(null, cat);

    for (String key : animalMap.keySet()) {
      System.out.println(key + " => " + animalMap.get(key));
    }

    for (Map.Entry<String, Animal> entry : animalMap.entrySet()) {
      System.out.println(entry.getKey() + " ==> " + entry.getValue());
    }
    System.out.println("TreeMap");
    Map<String, Animal> animalTreeMap = new TreeMap<>();
    animalTreeMap.put("dog", dog);
    animalTreeMap.put("cat", cat);
    animalTreeMap.put("albo inaczej", eagle);


    for (String key : animalTreeMap.keySet()) {
      System.out.println(key + " => " + animalTreeMap.get(key));
    }

    // # Iteratory


//    for (Animal animal : list) {
//      if (animal.getAge() == 4) {
//        list.remove(animal);
//      }
//    }

    Iterator<Animal> it = list.iterator();

    while (it.hasNext()) {
      Animal next = it.next();
      if (next.getAge() == 4) {
        it.remove();
      }
    }
    System.out.println(list);
    //
    //    for(Iterator<Animal> iterator = list.iterator();iterator.hasNext(); ){
    //      Animal a = iterator.next();
    //      if(a.getAge() == 4){
    //        iterator.remove();
    //      }
    //    }


  }

}
