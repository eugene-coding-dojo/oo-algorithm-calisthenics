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
        this.personList.forEach(person -> person.joinLine(foodlines));
        return this.personList.stream().map(Person::lineLength).toList();
    }

    private static class Person {
        private int lineLength;

        public int lineLength() {
            return this.lineLength;
        }

        public void joinLine(Foodlines foodlines) {
            this.lineLength = foodlines.getShortestLength();
            foodlines.increaseShortestLength();
        }
    }
}
