package algorithms.workout.foodlines;

public class Person {
    private int joinedLineLength;

    public void joinTheShortestAmong(Foodlines foodlines) {
        this.joinedLineLength = foodlines.lengthOfTheShortest();
        foodlines.incrementTheShortest();
    }

    public int joinedLineLength() {
        return this.joinedLineLength;
    }
}
