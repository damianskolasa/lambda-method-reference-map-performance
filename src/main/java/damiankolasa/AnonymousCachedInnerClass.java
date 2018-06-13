package damiankolasa;

import java.util.function.ToIntFunction;

public class AnonymousCachedInnerClass {

    private static final ToIntFunction<Person> PERSON_TO_INT_FUNCTION =
            new ToIntFunction<Person>() {
                @Override
                public int applyAsInt(Person person) {
                    return person.getCity().getPopulation();
                }
            };


    public int work() {
        return Persons.PERSONS.stream()
                .mapToInt(PERSON_TO_INT_FUNCTION)
                .sum();
    }
}
