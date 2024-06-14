package algorithms.workout.foodlines;

import java.util.List;
import java.util.stream.IntStream;

public class People {
    private final List<Person> people;

    public People(int count) {
        this.people = IntStream.range(0, count).mapToObj(i -> new Person()).toList();
    }

    public int[] join(Foodlines foodlines) {
        return this.people.stream().map(person -> {
            person.joinTheShortestAmong(foodlines);
            return person.joinedLineLength();
        }).mapToInt(Integer::intValue).toArray();
    }
}
