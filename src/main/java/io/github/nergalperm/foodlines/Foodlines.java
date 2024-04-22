package io.github.nergalperm.foodlines;

import java.util.ArrayList;
import java.util.List;

public class Foodlines {
    private final List<Foodline> foodlineList;

    public Foodlines(int[] lineLengths) {
        foodlineList = new ArrayList<>(lineLengths.length);
        for (int lineLength : lineLengths) {
            this.foodlineList.add(new Foodline(lineLength));
        }
    }

    int joinTheShortestLine() {
        int lineLength = this.getShortestLength();
        this.increaseShortestLength();
        return lineLength;
    }

    private Foodline getShortest() {
        return this.foodlineList.stream()
                   .min(Foodline::compareTo)
                   .orElse(this.foodlineList.get(0));
    }

    private int getShortestLength() {
        return this.getShortest().length();
    }

    private void increaseShortestLength() {
        this.getShortest().join();
    }

}
