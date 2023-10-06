package edu.technischools.java;

public class Student extends Person { // aby rozszerzyć klasę używamy słowa kluczowego extends, w Javie jest tylko
                                      // jednokrotne dziedziczenie, klasa nie może dziedziczyć z 2 klas jednocześnie

  private String school;

  public Student(String firstName, String lastName) { // konstruktory nie są dziedziczone! mimo że klasa Person ma
                                                      // konstruktor z 2 parametrami w tej klasie musimy go napisać
                                                      // jeszcze raz
    super(firstName, lastName); // aby odnieść się do klasy nadrzędnej używamy słowa kluczowego super,
                                // analogicznie wywołanie super konstruktora musi być pierwszą instrukcją
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((school == null) ? 0 : school.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (school == null) {
      if (other.school != null)
        return false;
    } else if (!school.equals(other.school))
      return false;
    return true;
  }

  

}
