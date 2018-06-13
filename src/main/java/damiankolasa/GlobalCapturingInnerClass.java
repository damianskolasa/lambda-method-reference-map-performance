package damiankolasa;

import java.util.function.ToIntFunction;

public class GlobalCapturingInnerClass {

    private int bias;

    public GlobalCapturingInnerClass(int bias) {
        this.bias = bias;
    }

    public int work() {
        return Persons.PERSONS.stream()
                .mapToInt(new ToIntFunction<Person>() {
                    @Override
                    public int applyAsInt(Person person) {
                        return person.getCity().getPopulation() + bias;
                    }
                }).sum();
    }
}
