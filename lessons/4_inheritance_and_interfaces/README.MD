# Zadanie 1

- Stworzyć drzewo dziedziczenia jak na "rysunku" poniżej

```
            Vehicle (abstract)
            /     \
        Car       Plane
        /            \
    SportCar        JetFighter

``` 

- Dodać do klasy `Vehicle` pola:
  - `name` typu `String`
  - `weight` typu `double`
  - `speed` typu `double`
- Dodać do klasy `Vehicle` abstrakcyją metodę `void move()`
- Zaimplementować metodę `move` we wszystkich klasach
- Dodać do klasy `Car` pole `noOfDoors` typu `byte`
- Stworzyć interfejs `Flyable` z metodami 
  - `void fly()`
  - `double getSpeed()`
  - `double getMaxAltitude()`
- Dodać stworzony interfejs do klasy `Plane`
- Nadpisać metody z interfejsu `Flyable` w klasie `JetFighter`


# Zadanie 2

- Stworzyć klasę `VehicleTest`, dodać do niej metodę `public static void main(String[] args)`
- Instrukcje poniżej dodać do metody `main`
- Stworzyć tablicę 4 elementową typu `Vehicle`
- Stworzyć po jednym obiekcie każdego typu (`Car`, `SportCar`, `Plane`, `JetFighter`)
- Dodać stworzone instancję do tablicy
- Stworzyć tablicę 2 elementową typu `Flyable`
- Przeiterować (w dowolny sposób) tablicę typu `Vehicle`
- Sprawdzić, czy dany element jest typu `Flyable`, jeśli tak to dodać go do tablicy typu `Flyable`
- Przeiterować po tablicy z elementami `Flyable` i wywołać na każdym metodę `fly`
