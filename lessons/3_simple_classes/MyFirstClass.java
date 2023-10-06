public class MyFirstClass { // każda klasa w Javie domyślnie dziedziczy z klasy Object, nie trzeba dodawać extends Object

  private String name;

  public MyFirstClass() { // każda klasa musi mieć konstruktor, jeśli nie napiszemy własnego, Java automatycznie doda konstruktor bezparametrowy
    System.out.println("this is no arg constructor");
  } 

  public MyFirstClass(String name){ // klasa może mieć dowolną ilość konstruktorów, różniących się parametrami
    this();   // w konstruktorze można zawołać inny konstruktor danej klasy, ale musi być to pierwsza linijka konstruktora
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
