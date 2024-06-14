package algorithms.workout.foodlines;

public class Person {
    private Foodline foodline;

    public void joinTheShortestAmong(Foodlines foodlines) {
        this.foodline = foodlines.shortestLine();
        this.foodline.queue(this);
    }

    public int joinedLineLength() {
        return this.foodline.indexOf(this);
    }
}
