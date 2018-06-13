package damiankolasa;

public class City {

  private int population;

  public City(int population) {
    this.population = population;
  }

  public int getPopulation() {
    return population;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof City)) return false;

    City city = (City) o;

    return population == city.population;
  }

  @Override
  public int hashCode() {
    return population;
  }

  @Override
  public String toString() {
    return "City{" +
      "population=" + population +
      '}';
  }
}
