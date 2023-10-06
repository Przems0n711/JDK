package edu.technischools.java.pet;

public class AnimalTest {

  public static void main(String[] args) {
    Cat animal = new Cat();

    animal.setName("Kitty");
    animal.setAge(2);
    animal.setWeight(2.5);

    Dog dog = new Dog();

    dog.setName("Pluto");
    dog.setAge(10);
    dog.setWeight(12.2);

    Cat cat = new Cat("Tom", 7, 3);

    Animal[] animals = new Animal[4];

    animals[0] = animal;
    animals[1] = dog;
    animals[2] = cat;

    // napisać pętle for iterującą po elementach tablicy
    // wypisującą na konsolę każde zwierzę
    Dog scoobyDoo = new Dog("ScoobyDoo", 15, 22.2);

    // Animal     // Dog // ponieważ objekt typu Dog jest jednocześnie typu Animal (polimorfizm) to możemy go dodać do tablicy Animal
    animals[3] = scoobyDoo;

    for (int i = 0; i < animals.length; i++) {
      System.out.println(animals[i]);
      // operator instanceof służy do sprawdzania czy dany obiekt jest danego typu - zwaraca true/false
//       if(animals[i] instanceof Dog){
//         ((Dog)animals[i]).bark();
//       }
      animals[i].say();
    }

    Dog[] dogs = new Dog[3];

    Animal[] empty = new Animal[0]; // new Animal[]{}


    // W Javie, typ przy deklaracji zmiennej określa jakie metody można wywoałać,
    // natomiast typ samej zmiennej określa jakie metody zostaną wywołane
    Flyable eagle = new Eagle();

    // dlatego na zmiennej eagle możemy wywołać tylko metody z interfejsu Flyable, a nie z klasy Eagle
    eagle.fly();

    // Jeśli chcemy wywołać metody z klasy jakego typu zmienną stworzyliśmy, musimy ją zrzutować
    // służy do tego operator (), gdzie w nawiasie podajemy typ na jaki chcemy rzutować
    ((Eagle) eagle).say();

  }

}
