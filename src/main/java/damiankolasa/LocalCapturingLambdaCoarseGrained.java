package damiankolasa;

public class LocalCapturingLambdaCoarseGrained {

  public int work(int bias) {
    return Persons.PERSONS.stream()
            .mapToInt(person -> person.getCity().getPopulation() + bias)
            .sum();
  }

}
