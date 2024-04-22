package io.github.nergalperm.foodlines;

import java.util.List;

class Foodline implements Comparable<Foodline> {
    private int length;

    public Foodline(int length) {
        this.length = length;
    }

    @Override
    public int compareTo(Foodline o) {
        return Integer.compare(this.length, o.length);
    }

    public void join() {
        this.length++;
    }

    public void reportLengthTo(List<Integer> joinHistory) {
        joinHistory.add(this.length);
    }
}
