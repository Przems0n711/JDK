# Zadanie 1

Skopiować hierarchię klas z poprzedniego zadania (umieścić w pakiecie `edu.techinischool.java.vehicle`)

```
            Vehicle (abstract)
            /     \
        Car       Plane
        /            \
    SportCar        JetFighter

``` 
                    
          
- Zaimplementować `Comparable<Vehicle>` w klasie `Vehicle` i zaimplementować metodę z tego interfejsu,
tak by porównywała prędkości (atrybut `speed`) 

- W klasie `VehicleTest` posortować tablicę z obiektami `Vehicle` używając metody `Arrays.sort`
- Wypisać posortowaną tablicę na konsolę (można użyć metody `Arrays.toString`)
               
# Zadanie 2
-
- Stworzyć klasę implementującą interfejs `Compartor<Flyable>`, która będzie porównywała obiekty, typu `Flyable` porównując wartość zwracaną przez metodę `getMaxAlitude`
- Posortować tablicę obiektów `Flyable` używając metody `Arrays.sort(T[],Comparator<T>)`
- Stworzyć `enum` z wartościami `ASCENDING` i `DESCENDING` które będą określać kierunek sortowania 
- Zmodyfikować stworzoną klasę tak by przyjmowała parametr `sortOrder` typu `enum` z poprzedniego punktu. 
- Zmodyfikować metodę `compareTo` tak by w zależności od przekazanego parametru sortowała w określonym kierunku.

- Posortować tablicę obiektów `Flyable` używając zmodyfikowanego komapratora - sprawdzić czy zmiana kierunku działa.
