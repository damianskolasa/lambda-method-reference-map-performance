package damiankolasa;

public class LocalCapturingLambdaFineGrained {

  public int work(int bias) {
    return Persons.PERSONS.stream()
      .map(person -> person.getCity())
      .mapToInt(city -> city.getPopulation() + bias)
      .sum();
  }

}
