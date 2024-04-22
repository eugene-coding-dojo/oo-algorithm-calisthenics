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

    public List<Integer> joinLines(int[] lineLengths) {
        for (Person person : this.personList) {
            int shortestIndex = getShortestIndex(lineLengths);
            person.storeLineState(lineLengths[shortestIndex]);
            lineLengths[shortestIndex]++;
        }
        return this.personList.stream().map(Person::lineLength).toList();
    }

    private int getShortestIndex(int[] lineLengths) {
        int shortestIndex = 0;
        for (int i = 1; i < lineLengths.length; i++) {
            if (lineLengths[i] < lineLengths[shortestIndex]) {
                shortestIndex = i;
            }
        }
        return shortestIndex;
    }

    private class Person {
        private int lineLength;

        public void storeLineState(int lineLength) {
            this.lineLength = lineLength;
        }

        public int lineLength() {
            return this.lineLength;
        }
    }
}
