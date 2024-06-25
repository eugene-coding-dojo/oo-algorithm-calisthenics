package algorithms.workout.foodlines;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class People implements Comparable<People> {
    private final List<Person> people;

    public People(int count) {
        this.people = IntStream.range(0, count)
                          .mapToObj(i -> new Person())
                          .collect(Collectors.toList());
    }

    public int[] join(Foodlines foodlines) {
        return this.people.stream()
                   .map(person -> {
                       person.joinTheShortestAmong(foodlines);
                       return person.joinedLineLength();
                   })
                   .mapToInt(Integer::intValue).toArray();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public int indexOf(Person person) {
        return this.people.indexOf(person);
    }

    @Override
    public int compareTo(People o) {
        return Integer.compare(this.size(), o.size());
    }

    private int size() {
        return this.people.size();
    }

}
