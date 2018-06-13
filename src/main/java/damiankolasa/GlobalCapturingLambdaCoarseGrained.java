package damiankolasa;

public class GlobalCapturingLambdaCoarseGrained {

  private int bias;

  public GlobalCapturingLambdaCoarseGrained(int bias) {
    this.bias = bias;
  }

  public int work() {
    return Persons.PERSONS.stream()
            .mapToInt(person -> person.getCity().getPopulation() + bias)
            .sum();
  }

}
