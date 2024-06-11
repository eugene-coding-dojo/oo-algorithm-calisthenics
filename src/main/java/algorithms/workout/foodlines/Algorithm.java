package algorithms.workout.foodlines;

public class Algorithm {
    public static int[] solve(int n, int m, int[] lines) {
        int[] lineJoinHistory = new int[m];
        for (int i = 0; i < m; i++) {
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
