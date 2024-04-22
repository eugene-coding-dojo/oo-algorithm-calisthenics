package io.github.nergalperm.foodlines;

public class People {
    private final int count;

    public People(int count) {
        this.count = count;
    }

    public int[] joinLines(int[] lineLengths) {
        int[] result = new int[this.count];
        for (int i = 0; i < this.count; i++) {
            int shortestIndex = getShortestIndex(lineLengths);
            result[i] = lineLengths[shortestIndex];
            lineLengths[shortestIndex]++;
        }
        return result;
    }

    private int getShortestIndex(int[] lineLengths) {
        int shortestIndex = 0;
        for (int i = 1; i < lineLengths.length; i++) {
            if (lineLengths[i] < lineLengths[shortestIndex]) {
                shortestIndex = i;
            }
        }
        return shortestIndex;
    }
}
