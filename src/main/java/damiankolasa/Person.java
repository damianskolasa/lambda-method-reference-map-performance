package damiankolasa;

public class Person {

  private String name;
  private City city;

  public Person(String name, City city) {
    this.name = name;
    this.city = city;
  }

  public String getName() {
    return name;
  }

  public City getCity() {
    return city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;

    Person person = (Person) o;

    if (name != null ? !name.equals(person.name) : person.name != null) return false;
    return city != null ? city.equals(person.city) : person.city == null;
  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (city != null ? city.hashCode() : 0);
    return result;
  }
}
