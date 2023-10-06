package edu.technischools.java;
// w Javie istnieje kilka modyfikatorów dostępu - private, default (private-package), protected, public

class Person { // brak modyfikatora oznacza dostęp domyślny, tzn. tylko klasy z danego pakietu
               // mają dostęp do danej klasy/metody
  private String firstName; // modyfikator private oznacza że dana klasa/metoda/pole jest widczne tylko w
                            // klasie je deklarujące
  private String lastName;

  protected Person() { // modyfikator protected oznacza że dana klasa/metoda/pole jest dostępna tylko
                       // dla klas rozszerzających daną klasę oraz klas z tego samego pakietu
  }

  protected Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() { // modyfikator public oznacza że dana klasa/metoda/pole jest dostępna w innych
                                 // klasach
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  

}