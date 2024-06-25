package algorithms.workout.foodlines;

import java.util.Arrays;
import java.util.List;

public class Foodlines {
    private final List<Foodline> foodlines;

    public Foodlines(int[] lines) {
        this.foodlines = Arrays.stream(lines).mapToObj(Foodline::new).toList();
    }

    public Foodline shortestLine() {
        return this.foodlines.stream().min(Foodline::compareTo).orElseThrow();
    }
}
