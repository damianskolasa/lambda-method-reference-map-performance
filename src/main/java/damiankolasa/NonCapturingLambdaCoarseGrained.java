package damiankolasa;

public class NonCapturingLambdaCoarseGrained {

  public int work() {
    return Persons.PERSONS.stream()
            .mapToInt(person -> person.getCity().getPopulation())
            .sum();
  }

}
