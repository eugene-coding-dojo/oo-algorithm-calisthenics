package io.github.nergalperm.foodlines;

import java.util.ArrayList;
import java.util.List;

public class Foodlines {
    private final List<Foodline> foodlineList;

    private final List<Integer> joinHistory;

    public Foodlines(int[] lineLengths) {
        foodlineList = new ArrayList<>(lineLengths.length);
        for (int lineLength : lineLengths) {
            this.foodlineList.add(new Foodline(lineLength));
        }
        joinHistory = new ArrayList<>();
    }

    void joinTheShortestLine() {
        final Foodline shortestLine = this.getShortest();
        shortestLine.reportLengthTo(this.joinHistory);
        shortestLine.join();
    }

    private Foodline getShortest() {
        return this.foodlineList.stream()
                   .min(Foodline::compareTo)
                   .orElse(this.foodlineList.get(0));
    }

    public List<Integer> reportHistory() {
        return this.joinHistory;
    }
}
