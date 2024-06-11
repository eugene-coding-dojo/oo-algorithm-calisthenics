package algorithms.workout.foodlines;

public class People {
    private int count;

    public People(int count) {
        this.count = count;
    }

    public int[] join(int[] lines) {
        int[] lineJoinHistory = new int[this.count];
        for (int i = 0; i < this.count; i++) {
            int shortestLineIndex = shortestLineIndex(lines);
            lineJoinHistory[i] = lines[shortestLineIndex];
            lines[shortestLineIndex]++;
        }
        return lineJoinHistory;
    }

    private static int shortestLineIndex(int[] lines) {
        int shortestLineIndex = 0;
        for (int j = 1; j < lines.length; j++) {
            shortestLineIndex = shortestAmongTwoLines(lines, j, shortestLineIndex);
        }
        return shortestLineIndex;
    }

    private static int shortestAmongTwoLines(int[] lines, int j, int shortestLineIndex) {
        if (lines[j] < lines[shortestLineIndex]) {
            shortestLineIndex = j;
        }
        return shortestLineIndex;
    }

}
