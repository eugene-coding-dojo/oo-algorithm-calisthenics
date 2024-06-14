package algorithms.workout.foodlines;

public class People {
    private final int count;

    public People(int count) {
        this.count = count;
    }

    public int[] join(Foodlines foodlines) {
        int[] lineJoinHistory = new int[this.count];
        for (int i = 0; i < this.count; i++) {
            lineJoinHistory[i] = foodlines.lengthOfTheShortest();
            foodlines.incrementTheShortest();
        }
        return lineJoinHistory;
    }
}
