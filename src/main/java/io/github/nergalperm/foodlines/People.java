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

    public int[] joinLines(int[] lineLengths) {
        int[] result = new int[this.personList.size()];
        for (int i = 0; i < this.personList.size(); i++) {
            int shortestIndex = getShortestIndex(lineLengths);
            result[i] = lineLengths[shortestIndex];
            lineLengths[shortestIndex]++;
        }
        return result;
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
    }
}
