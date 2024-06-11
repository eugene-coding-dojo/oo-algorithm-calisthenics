package algorithms.workout.foodlines;

public class Algorithm {
    public static int[] solve(int n, int m, int[] lines) {
        int[] lineJoinHistory = new int[m];
        for (int i = 0; i < m; i++) {
            int shortestLineIndex = 0;
            for (int i1 = 1; i1 < lines.length; i1++) {
                if (lines[i1] < lines[shortestLineIndex]) {
                    shortestLineIndex = i1;
                }
            }
            lineJoinHistory[i] = lines[shortestLineIndex];
            lines[shortestLineIndex]++;
        }
        return lineJoinHistory;
    }

}
