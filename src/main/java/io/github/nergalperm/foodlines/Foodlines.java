package io.github.nergalperm.foodlines;

public class Foodlines {
    private final int[] lineLengths;

    public Foodlines(int[] lineLengths) {
        this.lineLengths = lineLengths;
    }

    private int getShortestIndex() {
        int shortestIndex = 0;
        for (int i = 1; i < this.lineLengths.length; i++) {
            if (this.lineLengths[i] < this.lineLengths[shortestIndex]) {
                shortestIndex = i;
            }
        }
        return shortestIndex;
    }

    public int getShortestLength() {
        return this.lineLengths[this.getShortestIndex()];
    }

    public void increaseShortestLength() {
        this.lineLengths[this.getShortestIndex()]++;
    }
}
