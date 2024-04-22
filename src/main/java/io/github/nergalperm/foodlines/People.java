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

    public List<Integer> joinLines(Foodlines foodlines) {
        return this.personList.stream()
                   .map(person -> person.joinLine(foodlines))
                   .toList();
    }

    private static class Person {
        public int joinLine(Foodlines foodlines) {
            return foodlines.joinTheShortestLine();
        }
    }
}
