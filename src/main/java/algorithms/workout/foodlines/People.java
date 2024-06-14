package algorithms.workout.foodlines;

public class People {
    private final int[] lineJoinHistory;

    public People(int count) {
        this.lineJoinHistory = new int[count];
    }

    public int[] join(Foodlines foodlines) {
        for (int i = 0; i < this.lineJoinHistory.length; i++) {
            lineJoinHistory[i] = foodlines.lengthOfTheShortest();
            foodlines.incrementTheShortest();
        }
        return lineJoinHistory;
    }
}
