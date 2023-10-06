import edu.technischools.java.*; // importy pozwalają na używanie klas z innych pakietów

public class StudentsTest {
  public static void main(String[] args) {
    // Person p = new Person() //nie możemy użyć tej klasy, ponieważ ma ona domyślny
    // modyfikator dostępu a jesteśmy w innym pakiecie!

    Student s = new Student("Jan", "Kowalski"); // ale klasa student ma już dostęp publiczny, więc nic nie stoi na
                                                // przeszkodzie żeby ją stworzyć

    System.out.println(s.getFirstName() + " " + s.getLastName()); // ponieważ klasa Student rozszerza klasę Person,
                                                                  // wszystkie widoczne metody z klasy Person są
                                                                  // dostępne w klasie Student

    s.setSchool("TechniSchools");
    System.out.println(s.getSchool()); 
  }

}
