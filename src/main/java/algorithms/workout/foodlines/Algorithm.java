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
        for (int i = 1; i < lines.length; i++) {
            if (lines[i] < lines[shortestLineIndex]) {
                shortestLineIndex = i;
            }
        }
        return shortestLineIndex;
    }
}
