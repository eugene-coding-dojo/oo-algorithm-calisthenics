package algorithms.workout.foodlines;

import java.util.Arrays;
import java.util.List;

public class Foodlines {
    private final List<Foodline> foodlines;

    public Foodlines(int[] lines) {
        this.foodlines = Arrays.stream(lines).mapToObj(Foodline::new).toList();
    }

    public int indexOfTheShortest() {
        int shortestLineIndex = 0;
        for (int j = 1; j < this.foodlines.size(); j++) {
            shortestLineIndex = shortestAmongTwoLines(j, shortestLineIndex);
        }
        return shortestLineIndex;
    }

    private int shortestAmongTwoLines(int j, int shortestLineIndex) {
        if (this.foodlines.get(j).compareTo(this.foodlines.get(shortestLineIndex)) <= 0) {
            shortestLineIndex = j;
        }
        return shortestLineIndex;
    }

    public int lengthOfTheShortest() {
        return this.foodlines.get(this.indexOfTheShortest()).length();
    }

    public void incrementTheShortest() {
        this.foodlines.get(this.indexOfTheShortest()).increment();
    }
}
