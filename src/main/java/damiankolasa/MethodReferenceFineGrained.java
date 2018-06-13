package damiankolasa;

public class MethodReferenceFineGrained {

  public int work() {
    return Persons.PERSONS.stream()
      .map(Person::getCity)
      .mapToInt(City::getPopulation)
      .sum();
  }
}

