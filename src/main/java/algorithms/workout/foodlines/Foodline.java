package algorithms.workout.foodlines;

public class Foodline implements Comparable<Foodline> {
    private int length;

    public Foodline(int length) {
        this.length = length;
    }

    @Override
    public int compareTo(Foodline o) {
        return Integer.compare(this.length, o.length);
    }

    public void increment() {
        this.length++;
    }

    public int length() {
        return this.length;
    }
}
