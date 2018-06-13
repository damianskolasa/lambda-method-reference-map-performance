package damiankolasa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Persons {

    public static List<Person> PERSONS = new ArrayList<>(1000);

    static {
        IntStream.range(0, 1000)
                .forEach(value -> PERSONS.add(new Person("Person " + value, new City(value))));
    }

}
