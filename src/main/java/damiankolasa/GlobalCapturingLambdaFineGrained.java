package damiankolasa;

public class GlobalCapturingLambdaFineGrained {

  private int bias;

  public GlobalCapturingLambdaFineGrained(int bias) {
    this.bias = bias;
  }

  public int work() {
    return Persons.PERSONS.stream()
      .map(person -> person.getCity())
      .mapToInt(city -> city.getPopulation() + bias)
      .sum();
  }

}
