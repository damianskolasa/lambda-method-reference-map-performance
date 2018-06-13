package damiankolasa;

public class NonCapturingLambdaFineGrained {

  public int work() {
    return Persons.PERSONS.stream()
      .map(person -> person.getCity())
      .mapToInt(city -> city.getPopulation())
      .sum();
  }
}
