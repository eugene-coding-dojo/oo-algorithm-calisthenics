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
        Foodlines foodlines = new Foodlines(lineLengths);
        for (Person person : this.personList) {
            person.storeLineState(foodlines.getShortestLength());
            foodlines.increaseShortestLength();
        }
        return this.personList.stream().map(Person::lineLength).toList();
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

    private class Foodlines {
        private final int[] lineLengths;

        public Foodlines(int[] lineLengths) {
            this.lineLengths = lineLengths;
        }

        private int getShortestIndex() {
            int shortestIndex = 0;
            for (int i = 1; i < this.lineLengths.length; i++) {
                if (this.lineLengths[i] < this.lineLengths[shortestIndex]) {
                    shortestIndex = i;
                }
            }
            return shortestIndex;
        }

        public int getShortestLength() {
            return this.lineLengths[this.getShortestIndex()];
        }

        public void increaseShortestLength() {
            this.lineLengths[this.getShortestIndex()]++;
        }
    }
}
