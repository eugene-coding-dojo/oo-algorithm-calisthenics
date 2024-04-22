package io.github.nergalperm.foodlines;

import java.util.List;
import java.util.stream.IntStream;

public class People {
    private final List<Person> personList;

    public People(int count) {
        this.personList = IntStream.range(0, count)
                              .mapToObj(i -> new Person())
                              .toList();
    }

    public void joinLines(Foodlines foodlines) {
        this.personList.forEach(person -> person.joinLine(foodlines));
    }

    private static class Person {
        public void joinLine(Foodlines foodlines) {
            foodlines.joinTheShortestLine();
        }
    }
}
