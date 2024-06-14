package algorithms.workout.foodlines;

public class People {
    private final int count;

    public People(int count) {
        this.count = count;
    }

    public int[] join(int[] lines, Foodlines foodlines) {
        int[] lineJoinHistory = new int[this.count];
        for (int i = 0; i < this.count; i++) {
            int shortestLineIndex = foodlines.indexOfTheShortest();
            lineJoinHistory[i] = lines[shortestLineIndex];
            lines[shortestLineIndex]++;
        }
        return lineJoinHistory;
    }
}
