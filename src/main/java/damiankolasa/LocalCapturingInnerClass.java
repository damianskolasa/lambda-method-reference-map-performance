package damiankolasa;

import java.util.function.ToIntFunction;

public class LocalCapturingInnerClass {

    public int work(int bias) {
        return Persons.PERSONS.stream()
                .mapToInt(new ToIntFunction<Person>() {
                    @Override
                    public int applyAsInt(Person person) {
                        return person.getCity().getPopulation() + bias;
                    }
                }).sum();
    }
}
