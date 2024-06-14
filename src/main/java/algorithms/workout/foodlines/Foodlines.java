package algorithms.workout.foodlines;

public class Foodlines {
    private final int[] lines;

    public Foodlines(int[] lines) {
        this.lines = lines;
    }

    public int indexOfTheShortest() {
        int shortestLineIndex = 0;
        for (int j = 1; j < this.lines.length; j++) {
            shortestLineIndex = shortestAmongTwoLines(j, shortestLineIndex);
        }
        return shortestLineIndex;
    }

    private int shortestAmongTwoLines(int j, int shortestLineIndex) {
        if (this.lines[j] < this.lines[shortestLineIndex]) {
            shortestLineIndex = j;
        }
        return shortestLineIndex;
    }
}
